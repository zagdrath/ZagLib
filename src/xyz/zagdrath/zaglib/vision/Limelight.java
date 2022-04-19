/* Copyright (c) 2022 Cody Wellman. All rights reserved. */
/* This work is licensed under the terms of the MIT license */
/* found in the root directory of this project. */

package xyz.zagdrath.zaglib.vision;

import xyz.zagdrath.zaglib.math.Clamp;

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
        return Clamp.clamp(limelightTable.targetArea.getDouble(0.0) / 100.0, 0.0, 1.0);
    }

    /** @return Skew or rotation (-90 degrees to 0 degrees) */
    public double getTargetSkew() {
        return limelightTable.targetSkew.getDouble(0.0);
    }

    /** @return The pipeline’s latency contribution (ms) */
    public double getLatency() {
        return limelightTable.latency.getDouble(0.0) + LimelightConstants.IMAGE_CAPTURE_LATENCY;
    }

    /********************/
    /*** Side lengths ***/
    /********************/

}
