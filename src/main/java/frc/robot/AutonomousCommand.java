package frc.robot;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveSubsystem;

public class AutonomousCommand extends CommandBase{
    private final DriveSubsystem drive = new DriveSubsystem();

    private double driveSpeed;

    public AutonomousCommand(double driveSpeed) {
        this.driveSpeed = driveSpeed;

        addRequirements(drive);

    }

@Override
public void initialize(){

}

@Override
public void execute(){
    drive.arcadeDrive(driveSpeed,0);

}

@Override
public boolean isFinished(){
    return false;

}

@Override
public void end(boolean interrupted){
    drive.arcadeDrive(0,0);

}

}