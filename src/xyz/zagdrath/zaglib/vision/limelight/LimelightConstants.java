/* Copyright (c) 2022 Cody Wellman. All rights reserved. */
/* This work is licensed under the terms of the MIT license */
/* found in the root directory of this project. */

package xyz.zagdrath.zaglib.vision.limelight;

/**
 * This interface provides all of the constants for the limelight as defined in
 * the documentation. Not everything here may be used, but it is here just in
 * case.
 * 
 * @author Cody Wellman (zagdrath@member.fsf.org)
 */
public interface LimelightConstants {

    public static final double kImageCaptureLatency = 11.0;

    public static final double kMinXAngle = -29.8;
    public static final double kMaxXAngle = 29.8;

    public static final double kMinYAngle = -24.85;
    public static final double kMaxYAngle = 24.85;

    public static final double kMinTargetArea = 0.0;
    public static final double kMaxTargetArea = 1.0;

    public static final double kMinSkew = -90.0;
    public static final double kMaxSkew = 0.0;

    public static final double kMinSideLength = 0.0;
    public static final double kMaxSideLength = 320.0;

}
