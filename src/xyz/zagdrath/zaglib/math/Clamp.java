/* Copyright (c) 2022 Cody Wellman. All rights reserved. */
/* This work is licensed under the terms of the MIT license */
/* found in the root directory of this project. */

package xyz.zagdrath.zaglib.math;

/**
 * This class provides methods that limit an input between a given range.
 * 
 * @author Cody Wellman (zagdrath@member.fsf.org)
 */
public class Clamp {

    private Clamp() {
    }

    /**
     * Limits an input between a given range. (doubles)
     * 
     * @param value
     * @param min
     * @param max
     * @return double
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

    /**
     * Limits an input between a given range. (ints)
     * 
     * @param value
     * @param min
     * @param max
     * @return int
     */
    public static int clamp(int value, int min, int max) {
        if (value < min) {
            return min;
        }
        if (value > max) {
            return max;
        }
        return value;
    }

}
