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
    private ZagMath() {
        throw new AssertionError("Utility Class");
    }

    /**
     * Returns a value clamped between a minimum and a maximum value.
     * 
     * @param value Value to clamp
     * @param min   Minimum value to which to clamp value.
     * @param max   Maximum value to which to clamp value.
     * @return The clamped value.
     */
    public static int clamp(int value, int min, int max) {
        return Math.max(min, Math.min(value, max));
    }

    /**
     * Returns a value clamped between a minimum and a maximum value.
     * 
     * @param value Value to clamp
     * @param min   Minimum value to which to clamp value.
     * @param max   Maximum value to which to clamp value.
     * @return The clamped value.
     */
    public static double clamp(double value, double min, double max) {
        return Math.max(min, Math.min(value, max));
    }
}
