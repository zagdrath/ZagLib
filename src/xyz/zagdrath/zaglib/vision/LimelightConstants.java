/* Copyright (c) 2022 Cody Wellman. All rights reserved. */
/* This work is licensed under the terms of the MIT license */
/* found in the root directory of this project. */

package xyz.zagdrath.zaglib.vision;

/**
 * This interface provides all of the constants for the limelight as defined in
 * the documentation. Not everything here may be used, but it is here just in
 * case.
 * 
 * @author Cody Wellman (zagdrath@member.fsf.org)
 */
public interface LimelightConstants {

    public static final double IMAGE_CAPTURE_LATENCY = 11.0;

    public static final double MIN_X_ANGLE = -29.8;
    public static final double MAX_X_ANGLE = 29.8;

    public static final double MIN_Y_ANGLE = -24.85;
    public static final double MAX_Y_ANGLE = 24.85;

    public static final double MIN_TARGET_AREA = 0.0;
    public static final double MAX_TARGET_AREA = 1.0;

    public static final double MIN_SKEW = -90.0;
    public static final double MAX_SKEW = 0.0;

    public static final double MIN_SIDE_LENGTH = 0.0;
    public static final double MAX_SIDE_LENGTH = 320.0;

}
