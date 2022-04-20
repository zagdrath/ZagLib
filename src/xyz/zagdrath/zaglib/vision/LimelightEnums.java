/* Copyright (c) 2022 Cody Wellman. All rights reserved. */
/* This work is licensed under the terms of the MIT license */
/* found in the root directory of this project. */

package xyz.zagdrath.zaglib.vision;

/**
 * This class provides all of the enums for the limelight.
 * 
 * @author Cody Wellman (zagdrath@member.fsf.org)
 */
public class LimelightEnums {

    /** Limelight's LED states */
    public enum LEDMode {
        /* Use mode set in pipeline */
        PIPELINE(0),

        /* Force LEDs off */
        FORCE_OFF(1),

        /* Force LEDs to blink */
        FORCE_BLINK(2),

        /* Force LEDs on */
        FORCE_ON(3);

        private final int value;

        LEDMode(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    };

    /** Limelight's operation modes */
    public enum CameraMode {
        /* Sets to vision mode */
        VISION(0),

        /* Sets to driver mode */
        DRIVER(1);

        private final int value;

        CameraMode(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    };

    /** Snapshot modes for the limelight */
    public enum SnapshotMode {
        /* Don't take snapshots */
        STOP(0),

        /* Take two snapshots per second */
        TWO_PER_SECOND(1);

        private final int value;

        SnapshotMode(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    };

    /** Limelight's streaming modes */
    public enum CameraStream {
        /* Side-by-side streams */
        STANDARD(0),

        /* Secondary camera placed in lower-right corner */
        MAIN(1),

        /* Limelight camera placed in lower-right corner */
        SECONDARY(2);

        private final int value;

        CameraStream(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    };

    /** Limelight's current pipeline */
    public enum Pipeline {
        INVALID_PIPELINE(-1),
        PIPELINE_0(0),
        PIPELINE_1(1),
        PIPELINE_2(2),
        PIPELINE_3(3),
        PIPELINE_4(4),
        PIPELINE_5(5),
        PIPELINE_6(6),
        PIPELINE_7(7),
        PIPELINE_8(8),
        PIPELINE_9(9);

        private final int value;

        Pipeline(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    };

}
