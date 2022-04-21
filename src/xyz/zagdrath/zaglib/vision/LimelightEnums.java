/* Copyright (c) 2022 Cody Wellman. All rights reserved. */
/* This work is licensed under the terms of the MIT license */
/* found in the root directory of this project. */

package xyz.zagdrath.zaglib.vision;

/**
 * This class provides all of the mode enums for the limelight.
 * 
 * @author Cody Wellman (zagdrath@member.fsf.org)
 */
public class LimelightEnums {

    /** Limelight's LED states */
    public enum LEDMode {
        kPipeline(0),
        kOff(1),
        kBlink(2),
        kOn(3);

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
        kVision(0),
        kDriver(1);

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
        kReset(0),
        kOne(1);

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
        kStandard(0),
        kMain(1),
        kSecondary(2);

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
        kInvalidPipeline(-1),
        kPipeline0(0),
        kPipeline1(1),
        kPipeline2(2),
        kPipeline3(3),
        kPipeline4(4),
        kPipeline5(5),
        kPipeline6(6),
        kPipeline7(7),
        kPipeline8(8),
        kPipeline9(9);

        private final int value;

        Pipeline(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    };

}
