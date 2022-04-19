/* Copyright (c) 2022 Cody Wellman. All rights reserved. */
/* This work is licensed under the terms of the MIT license */
/* found in the root directory of this project. */

package xyz.zagdrath.zaglib.vision;

// WPILib imports
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;

/**
 * This class provides low level construction of the limelight network table. It
 * defines all of the network table entries. This is meant to be used to assist
 * other APIs.
 * 
 * @author Cody Wellman (zagdrath@member.fsf.org)
 */
public final class LimelightTable {

    /**************************/
    /*** Network table info ***/
    /**************************/

    public final NetworkTableInstance tableInstance;

    public final NetworkTable table;

    /*****************************/
    /*** Network table entries ***/
    /*****************************/

    // Whether the limelight has any valid targets (0 or 1)
    public final NetworkTableEntry validTarget;

    // Horizontal offset from crosshair to target (-29.8 degrees to 29.8 degrees)
    public final NetworkTableEntry targetX;

    // Vertical offset from crosshair to target (-24.85 degrees to 24.85 degrees)
    public final NetworkTableEntry targetY;

    // Target area (0% of image to 100% of image)
    public final NetworkTableEntry targetArea;

    // Skew or rotation (-90 degrees to 0 degrees)
    public final NetworkTableEntry targetSkew;

    // The pipeline’s latency contribution (ms) Add at least 11 ms for image capture
    // latency.
    public final NetworkTableEntry latency;

    // Shortest side length of target in pixels
    public final NetworkTableEntry shortestSideLength;

    // Longest side length of target in pixels
    public final NetworkTableEntry longestSideLength;

    // Horizontal side length of the rough bounding box
    public final NetworkTableEntry horizontalSideLength;

    // Vertical side length of the rough bounding box
    public final NetworkTableEntry verticalSideLength;

    // Corner coordinates
    public final NetworkTableEntry xCorners;
    public final NetworkTableEntry yCorners;

    // Camera control entries
    public final NetworkTableEntry solve3D;
    public final NetworkTableEntry ledMode;
    public final NetworkTableEntry cameraMode;
    public final NetworkTableEntry pipeline;
    public final NetworkTableEntry getPipeline;
    public final NetworkTableEntry cameraStream;
    public final NetworkTableEntry snapshotMode;

    // Custom Timing NetworkTableEntries
    public final NetworkTableEntry timingEntry;

    /** Create a limelight table with the default network table name. */
    public LimelightTable() {
        this("limelight");
    }

    /** Create a limelight table with a custom network table name. */
    public LimelightTable(String tableName) {
        tableInstance = NetworkTableInstance.getDefault();
        table = tableInstance.getTable(tableName);

        validTarget = table.getEntry("tv");
        targetX = table.getEntry("tx");
        targetY = table.getEntry("ty");
        targetArea = table.getEntry("ta");
        targetSkew = table.getEntry("ts");
        latency = table.getEntry("tl");

        shortestSideLength = table.getEntry("tshort");
        longestSideLength = table.getEntry("tlong");
        horizontalSideLength = table.getEntry("thor");
        verticalSideLength = table.getEntry("tvert");

        xCorners = table.getEntry("tcornx");
        yCorners = table.getEntry("tcorny");

        solve3D = table.getEntry("camtran");
        ledMode = table.getEntry("ledMode");
        cameraMode = table.getEntry("camMode");
        pipeline = table.getEntry("pipeline");
        getPipeline = table.getEntry("getpipe");
        cameraStream = table.getEntry("stream");
        snapshotMode = table.getEntry("snapshot");

        timingEntry = table.getEntry(".timing_data");
    }

    /**********************************************/
    /*** Methods to get entries not listed here ***/
    /**********************************************/

    /**
     * Gets the entry for a key.
     *
     * @param key the key name
     * @return the network table entry
     */
    public NetworkTableEntry getEntry(String key) {
        return table.getEntry(key);
    }

}
