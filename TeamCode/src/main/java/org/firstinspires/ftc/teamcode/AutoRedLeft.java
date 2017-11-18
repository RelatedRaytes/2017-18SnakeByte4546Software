package org.firstinspires.ftc.teamcode;

/**
 * Created by raymo on 11/18/2017.
 */

public class AutoRedLeft extends AutoOpMode{
    @Override
    public void runOpMode() throws InterruptedException {
        initialize();
        telemetry.addData("Red", "Ready");
        waitForStart();
        setAlliance('r');
        //grabGlyph();
        lowerJewel();
        sleep(2400);
        hitJewel();
        sleep(1000);
        //Forward probably needs to be less, strafe perhaps more?
        moveForwardPID(250);
        sleep(1000);
        turnRightPID(90);
        setZero();
        //releaseGlyph();
        sleep(1000);
        moveToColumn();
        setZero();
        sleep(1000);
        moveForwardPID(300);
    }
}
