package frc.robot.subsystems;

import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.LimelightHelpers;
import frc.robot.Constants.LimelightConstants;

public class limelight extends SubsystemBase{
    
    NetworkTable table = NetworkTableInstance.getDefault().getTable(LimelightConstants.Name);

   // public double X;

    public double getTag_X(){
        return LimelightHelpers.getTX("");

       // x = LimelightHelpers.getTX("");
      //  return x;
    }
    public double getTag_A(){
        return LimelightHelpers.getTA("");
    }
    public double getTag_ID(){
        return LimelightHelpers.getFiducialID("");
    }
    public void periodic(){
        getTag_A();
        getTag_ID();
        getTag_X();

        SmartDashboard.putNumber("TagA", getTag_A());
        SmartDashboard.putNumber("TagID", getTag_ID());
        SmartDashboard.putNumber("TagX",getTag_X());
    }
}

