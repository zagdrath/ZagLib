/* Copyright (c) 2022 Cody Wellman. All rights reserved. */
/* This work is licensed under the terms of the MIT license */
/* found in the root directory of this project. */

package xyz.zagdrath.zaglib.math;

public class TalonUnits {

    private TalonUnits() {
    }

    public static double getTalonTicks(double rpm) {
        return rpm * 2048.0 / 600.0;
    }

    public static double getRPM(double ticks) {
        return ticks / 2048.0 * 600.0;
    }

}
