/* Copyright (c) 2022 Cody Wellman. All rights reserved. */
/* This work is licensed under the terms of the MIT license */
/* found in the root directory of this project. */

package xyz.zagdrath.zaglib.math;

/**
 * This class provides a method to get the distance from a camera to a target.
 * 
 * @author Cody Wellman (zagdrath@member.fsf.org)
 */
public class TargetDistance {
    private TargetDistance() {
        throw new AssertionError("Utility Class");
    }

    /**
     * Estimates distance to a target.
     * 
     * @param cameraAngle  The angle of the camera measured from the face of the
     *                     camera to vertical position.
     * @param cameraHeight The height of the camera from the ground to the center of
     *                     the camera.
     * @param targetAngle  The angle of the vertical offset from the camera to the
     *                     target.
     * @param targetHeight The height of the target from the ground to the center of
     *                     the target.
     * @return The distance from the camera to the target.
     */
    public static double getTargetDistance(double cameraAngle, double cameraHeight, double targetAngle,
            double targetHeight) {
        return (targetHeight - cameraHeight) / Math.tan(Math.toRadians(cameraAngle + targetAngle));
    }
}
