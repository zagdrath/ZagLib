/* Copyright (c) 2022 Cody Wellman. All rights reserved. */
/* This work is licensed under the terms of the MIT license */
/* found in the root directory of this project. */

package xyz.zagdrath.zaglib.math;

/**
 * This class provides methods to assist in mathematics.
 * 
 * @author Cody Wellman (zagdrath@member.fsf.org)
 */
public class ZagMath {

    /**
     * Limits an input between a given range.
     * 
     * @param value
     * @param min
     * @param max
     * @return The limited value
     */
    public static double clamp(double value, double min, double max) {
        if (value < min) {
            return min;
        }
        if (value > max) {
            return max;
        }
        return value;
    }

}
