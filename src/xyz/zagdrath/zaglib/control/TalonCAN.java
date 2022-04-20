/* Copyright (c) 2022 Cody Wellman. All rights reserved. */
/* This work is licensed under the terms of the MIT license */
/* found in the root directory of this project. */

package xyz.zagdrath.zaglib.control;

// CTRE imports
import com.ctre.phoenix.motorcontrol.can.BaseTalon;
import com.ctre.phoenix.motorcontrol.StatusFrameEnhanced;

/**
 * This class provides a method to optimize the CAN frames of a Talon motor
 * controller.
 * 
 * @author Cody Wellman (zagdrath@member.fsf.org)
 */
public class TalonCAN {

    /**
     * Optimizes all of the CAN frames on a specific Talon motor controller.
     * 
     * @param motorController The motor controller in which you want to optimize
     */
    public static void setTalonCAN(BaseTalon motorController) {
        motorController.setStatusFramePeriod(StatusFrameEnhanced.Status_21_FeedbackIntegrated, 251);
        motorController.setStatusFramePeriod(StatusFrameEnhanced.Status_15_FirmwareApiStatus, 229);
        motorController.setStatusFramePeriod(StatusFrameEnhanced.Status_14_Turn_PIDF1, 223);
        motorController.setStatusFramePeriod(StatusFrameEnhanced.Status_13_Base_PIDF0, 193);
        motorController.setStatusFramePeriod(StatusFrameEnhanced.Status_12_Feedback1, 181);
        motorController.setStatusFramePeriod(StatusFrameEnhanced.Status_11_UartGadgeteer, 173);
        motorController.setStatusFramePeriod(StatusFrameEnhanced.Status_10_Targets, 163);
        motorController.setStatusFramePeriod(StatusFrameEnhanced.Status_9_MotProfBuffer, 139);
        motorController.setStatusFramePeriod(StatusFrameEnhanced.Status_8_PulseWidth, 131);
        motorController.setStatusFramePeriod(StatusFrameEnhanced.Status_7_CommStatus, 113);
        motorController.setStatusFramePeriod(StatusFrameEnhanced.Status_6_Misc, 107);
        motorController.setStatusFramePeriod(StatusFrameEnhanced.Status_4_AinTempVbat, 89);
        motorController.setStatusFramePeriod(StatusFrameEnhanced.Status_3_Quadrature, 79);
        motorController.setStatusFramePeriod(StatusFrameEnhanced.Status_2_Feedback0, 71);
        motorController.setStatusFramePeriod(StatusFrameEnhanced.Status_1_General, 61);
        motorController.setStatusFramePeriod(StatusFrameEnhanced.Status_Brushless_Current, 43);
    }

}
