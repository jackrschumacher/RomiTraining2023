package frc.robot.subsystems;

import edu.wpi.first.wpilibj.BuiltInAccelerometer;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveSubsystem extends SubsystemBase{
    private final double COUNTS_PER_REVOLUTION = 1440.0;
    private final double WHEEL_DIAMETER = 2.75591;

    private final double distancePerRotation = (Math.PI*WHEEL_DIAMETER)/COUNTS_PER_REVOLUTION;

    private final Spark SparkL = new Spark(0); 
    private final Spark SparkR = new Spark(1);

    private final Encoder EncoderL = new Encoder(4,5);
    private final Encoder EncoderR = new Encoder(6,7);

    private final DifferentialDrive diffDrive = new DifferentialDrive(SparkL, SparkR);

    private final BuiltInAccelerometer accelerometer = new BuiltInAccelerometer();

    public DriveSubsystem() {
        SparkR.setInverted(true);
        EncoderL.reset();
        EncoderR.reset();
    }

    public void arcadeDrive(double XAxisApeed, double YAxisSpeed){
        diffDrive.arcadeDrive(YAxisSpeed, YAxisSpeed);
        

    }


}