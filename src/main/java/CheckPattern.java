import it.polulyakh.patterns.builder.Robot;
import it.polulyakh.patterns.builder.enums.RobotBrain;
import it.polulyakh.patterns.builder.enums.RobotWeapon;
import it.polulyakh.patterns.builder.enums.RobotСhassisType;

public class CheckPattern {
    public static void main(String[] args) {
        //Builder
        Robot robot = Robot.newBuilder().addChassi(RobotСhassisType.FOOT).addWeapon(RobotWeapon.GUN).addWeapon(RobotWeapon.GUN).addWeapon(RobotWeapon.ROCKET).addWeapon(RobotWeapon.ROCKET).addWeapon(RobotWeapon.ROCKET).addBrain(RobotBrain.AI).buid();
        System.out.println(robot);
        Robot robot1 = Robot.newBuilder().addChassi(RobotСhassisType.ANTIGRAV).addBrain(RobotBrain.PROCESSOR_2GHZ).buid();
        System.out.println(robot1);

    }
}
