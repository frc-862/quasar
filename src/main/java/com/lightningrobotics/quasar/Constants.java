package com.lightningrobotics.quasar;

import edu.wpi.first.wpilibj.geometry.Translation2d;
import edu.wpi.first.wpilibj.util.Units;

public class Constants {

    public class RobotMap {

        // DRIVETRAIN
        public static final int LEFT_1_CAN_ID   = 1; // MASTER
        public static final int LEFT_2_CAN_ID   = 2;
        public static final int LEFT_3_CAN_ID   = 3;
        public static final int RIGHT_1_CAN_ID  = 4; // MASTER
        public static final int RIGHT_2_CAN_ID  = 5;
        public static final int RIGHT_3_CAN_ID  = 6;

        // CORE
        public static final int COMPRESSOR_ID = 20;
        public static final int PIGEON_ID = 8;

    }

    public static class DrivetrainConstants {
    }

    public static class JoystickConstants {
        // JOYSTICK PORTS
        public static final int DRIVER = 0;
        public static final int DRIVER_LEFT = 0;
        public static final int DRIVER_RIGHT = 1;
        public static final int OPERATOR = 2;
        public static final int CLIMBER = 3;

        // JOYSTICK AXIS
        public static final int THRUSTMASTER_X_AXIS = 0;
        public static final int THRUSTMASTER_Y_AXIS = 1;

        // JOYSTICK BUTTONS
        public static final int A = 1;
        public static final int B = 2;
        public static final int X = 3;
        public static final int Y = 4;
        public static final int LEFT_BUMPER = 5;
        public static final int RIGHT_BUMPER = 6;
        public static final int BACK = 7;
        public static final int START = 8;
        public static final int LEFT_STICK_BUTTON = 9;
        public static final int RIGHT_STICK_BUTTON = 10;

    }

}
