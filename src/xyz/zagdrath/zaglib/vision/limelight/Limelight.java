/* Copyright (c) 2022 Cody Wellman. All rights reserved. */
/* This work is licensed under the terms of the MIT license */
/* found in the root directory of this project. */

package xyz.zagdrath.zaglib.vision.limelight;

// ZagLib imports
import xyz.zagdrath.zaglib.math.ZagMath;
import xyz.zagdrath.zaglib.vision.limelight.LimelightEnums.*;

/**
 * This class provides all of the functionality of the limelight and allows you
 * to interface with it and it's network table.
 * 
 * @author Cody Wellman (zagdrath@member.fsf.org)
 */
public final class Limelight {
    private final LimelightTable limelightTable;

    private static Limelight defaultInstance = null;

    /** Returns a limelight class with the default network table name. */
    public static Limelight getInstance() {
        if (defaultInstance == null) {
            defaultInstance = new Limelight();
        }
        return defaultInstance;
    }

    /** Returns a limelight class with a custom network table name. */
    public static Limelight getInstance(String tableName) {
        return new Limelight(tableName);
    }

    /********************/
    /*** Constructors ***/
    /********************/

    /** Constructs a limelight class with the default network table name. */
    private Limelight() {
        limelightTable = new LimelightTable();
    }

    /** Constructs a limelight class with the default network table name. */
    private Limelight(String tableName) {
        limelightTable = new LimelightTable(tableName);
    }

    /*****************************************/
    /*** Commonly used contour information ***/
    /*****************************************/

    /** @return Whether the limelight has any valid targets */
    public boolean getValidTarget() {
        return (limelightTable.validTarget.getDouble(0.0) > 0.5);
    }

    /**
     * @return Horizontal offset from crosshair to target (-29.8 degrees to 29.8
     *         degrees)
     */
    public double getTargetX() {
        return limelightTable.targetX.getDouble(0.0);
    }

    /**
     * @return Vertical offset from crosshair to target (-24.85 degrees to 24.85
     *         degrees)
     */
    public double getTargetY() {
        return limelightTable.targetY.getDouble(0.0);
    }

    /** @return Target area (0% of image to 100% of image) */
    public double getTargetArea() {
        return ZagMath.clamp(limelightTable.targetArea.getDouble(0.0) / 100.0, 0.0, 1.0);
    }

    /** @return Skew or rotation (-90 degrees to 0 degrees) */
    public double getTargetSkew() {
        return limelightTable.targetSkew.getDouble(0.0);
    }

    /** @return The pipeline’s latency contribution (ms) */
    public double getLatency() {
        return limelightTable.latency.getDouble(0.0) + LimelightConstants.kImageCaptureLatency;
    }

    /********************/
    /*** Side lengths ***/
    /********************/

    /** @return Shortest side length of target in pixels */
    public double getShortestSidelength() {
        return limelightTable.shortestSideLength.getDouble(0.0);
    }

    /** @return Longest side length of target in pixels */
    public double getLongestSidelength() {
        return limelightTable.longestSideLength.getDouble(0.0);
    }

    /** @return Horizontal side length of the rough bounding box */
    public double getHorizontalSidelength() {
        return limelightTable.horizontalSideLength.getDouble(0.0);
    }

    /** @return Vertical side length of the rough bounding box */
    public double getVerticalSidelength() {
        return limelightTable.verticalSideLength.getDouble(0.0);
    }

    /**********************/
    /*** Target corners ***/
    /**********************/

    /** @return Number array of corner x-coordinates */
    public double[] getTargetXCorners() {
        return limelightTable.xCorners.getDoubleArray(new double[] {});
    }

    /** @return Number array of corner y-coordinates */
    public double[] getTargetYCorners() {
        return limelightTable.yCorners.getDoubleArray(new double[] {});
    }

    /******************************/
    /*** Limelight mode control ***/
    /******************************/

    /** @param mode LED mode to set the limelight to */
    public void setLEDMode(LEDMode mode) {
        limelightTable.ledMode.setNumber(mode.getValue());
    }

    /** @param mode Camera mode to set the limelight to */
    public void setCameraMode(CameraMode mode) {
        limelightTable.cameraMode.setNumber(mode.getValue());
    }

    /** @param mode Snapshot mode to set the limelight to */
    public void setSnapshotMode(SnapshotMode mode) {
        limelightTable.snapshotMode.setNumber(mode.getValue());
    }

    /** @param stream Camera stream to set the limelight to */
    public void setCameraStream(CameraStream stream) {
        limelightTable.cameraStream.setNumber(stream.getValue());
    }

    /** @param pipeline Pipeline to set the limelight to */
    public void setPipeline(Pipeline pipeline) {
        if (!pipeline.equals(Pipeline.kInvalidPipeline)) {
            limelightTable.pipeline.setNumber(pipeline.getValue());
        }
    }

    /** @return The current pipeline the limelight is set to */
    public Pipeline getPipeline() {
        double pipelineValue = limelightTable.getPipeline.getDouble(0);
        int pipelineID = (int) (pipelineValue + 0.5);

        switch (pipelineID) {
            case 0:
                return Pipeline.kPipeline0;
            case 1:
                return Pipeline.kPipeline1;
            case 2:
                return Pipeline.kPipeline2;
            case 3:
                return Pipeline.kPipeline3;
            case 4:
                return Pipeline.kPipeline4;
            case 5:
                return Pipeline.kPipeline5;
            case 6:
                return Pipeline.kPipeline6;
            case 7:
                return Pipeline.kPipeline7;
            case 8:
                return Pipeline.kPipeline8;
            case 9:
                return Pipeline.kPipeline9;
            default:
                return Pipeline.kInvalidPipeline;
        }
    }
}
