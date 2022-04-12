/* Copyright (c) 2022 Cody Wellman. All rights reserved. */
/* This work is licensed under the terms of the MIT license */
/* found in the root directory of this project. */

package xyz.zagdrath.zaglib.math;

public class TargetDistance {

    private TargetDistance() {
    }

    public static double getTargetDistance(double cameraAngle, double cameraHeight, double targetAngle,
            double targetHeight) {
        double goalAngle = Math.toRadians(cameraAngle + targetAngle);

        return (targetHeight - cameraHeight) / Math.tan(goalAngle);
    }

}
