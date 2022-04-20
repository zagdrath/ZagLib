/* Copyright (c) 2022 Cody Wellman. All rights reserved. */
/* This work is licensed under the terms of the MIT license */
/* found in the root directory of this project. */

package xyz.zagdrath.zaglib.control;

// CTRE imports
import com.ctre.phoenix.sensors.BasePigeon;
import com.ctre.phoenix.sensors.PigeonIMU_StatusFrame;

/**
 * This class provides a method to optimize the CAN frames of a Pigeon gyro.
 * 
 * @author Cody Wellman (zagdrath@member.fsf.org)
 */
public class GyroCAN {

    /**
     * Optimizes all of the CAN frames on a specific Pigeon gyro.
     * 
     * @param gyro The gyro in which you want to optimize
     */
    public static void setGyroCAN(BasePigeon gyro) {
        gyro.setStatusFramePeriod(PigeonIMU_StatusFrame.CondStatus_11_GyroAccum, 20);
        gyro.setStatusFramePeriod(PigeonIMU_StatusFrame.CondStatus_10_SixDeg_Quat, 20);
        gyro.setStatusFramePeriod(PigeonIMU_StatusFrame.CondStatus_9_SixDeg_YPR, 20);
        gyro.setStatusFramePeriod(PigeonIMU_StatusFrame.CondStatus_6_SensorFusion, 20);
        gyro.setStatusFramePeriod(PigeonIMU_StatusFrame.BiasedStatus_6_Accel, 20);
        gyro.setStatusFramePeriod(PigeonIMU_StatusFrame.BiasedStatus_4_Mag, 20);
        gyro.setStatusFramePeriod(PigeonIMU_StatusFrame.RawStatus_4_Mag, 20);
        gyro.setStatusFramePeriod(PigeonIMU_StatusFrame.CondStatus_3_GeneralAccel, 20);
        gyro.setStatusFramePeriod(PigeonIMU_StatusFrame.CondStatus_2_GeneralCompass, 20);
        gyro.setStatusFramePeriod(PigeonIMU_StatusFrame.BiasedStatus_2_Gyro, 20);
        gyro.setStatusFramePeriod(PigeonIMU_StatusFrame.CondStatus_1_General, 20);
    }

}
