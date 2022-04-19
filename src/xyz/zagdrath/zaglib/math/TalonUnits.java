/* Copyright (c) 2022 Cody Wellman. All rights reserved. */
/* This work is licensed under the terms of the MIT license */
/* found in the root directory of this project. */

package xyz.zagdrath.zaglib.math;

/**
 * This class provides methods to convert RPM to talon ticks and vice versa.
 * 
 * @author Cody Wellman (zagdrath@member.fsf.org)
 */
public class TalonUnits {

    private TalonUnits() {
    }

    /**
     * Converts RPM to talon ticks.
     * 
     * @param rpm
     * @return talon ticks
     */
    public static double getTalonTicks(double rpm) {
        return rpm * 2048.0 / 600.0;
    }

    /**
     * Converts talon ticks to RPM.
     * 
     * @param ticks
     * @return RPM
     */
    public static double getRPM(double ticks) {
        return ticks / 2048.0 * 600.0;
    }

}
