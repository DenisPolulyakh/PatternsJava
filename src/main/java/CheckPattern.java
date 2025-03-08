import it.polulyakh.patterns.creational.builder.Robot;
import it.polulyakh.patterns.creational.builder.enums.RobotBrain;
import it.polulyakh.patterns.creational.builder.enums.RobotWeapon;
import it.polulyakh.patterns.creational.builder.enums.RobotChassisType;

public class CheckPattern {
    public static void main(String[] args) {
        //Builder
        Robot robot = Robot.newBuilder().addChassi(RobotChassisType.FOOT).addWeapon(RobotWeapon.GUN).addWeapon(RobotWeapon.GUN).addWeapon(RobotWeapon.ROCKET).addWeapon(RobotWeapon.ROCKET).addWeapon(RobotWeapon.ROCKET).addBrain(RobotBrain.AI).buid();
        System.out.println(robot);
        Robot robot1 = Robot.newBuilder().addChassi(RobotChassisType.ANTIGRAV).addBrain(RobotBrain.PROCESSOR_2GHZ).buid();
        System.out.println(robot1);

    }
}
