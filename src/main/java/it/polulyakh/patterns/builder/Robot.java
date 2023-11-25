package it.polulyakh.patterns.builder;

import it.polulyakh.patterns.builder.enums.RobotBrain;
import it.polulyakh.patterns.builder.enums.RobotWeapon;
import it.polulyakh.patterns.builder.enums.RobotСhassisType;

import java.util.Arrays;

public class Robot {

    private final static int MAX_WEAPON = 4;
    //Шасси
    private RobotСhassisType chassi;
    //Оружие
    private RobotWeapon[] weapons = new RobotWeapon[MAX_WEAPON];
    //Процессор
    private RobotBrain brain;

    private int countWeapon = 0;

    private Robot() {
    }


    public RobotСhassisType getChassi() {
        return chassi;
    }

    public RobotWeapon[] getWeapons() {
        return weapons;
    }

    public RobotBrain getBrain() {
        return brain;
    }

    public boolean autoCheck() {
        //Проверяем что элементы робота не пустые
        return (chassi != null && weapons != null && weapons.length > 0 &&  Arrays.stream(weapons).filter(w -> w != null).count()>0L && brain != null);

    }


    @Override
    public String toString() {
        if (autoCheck()) {
            return "Robot{" +
                    "chassi=" + chassi.name() +
                    ", weapons=" + Arrays.toString(weapons) +
                    ", brain=" + brain.name() +
                    ", countWeapon=" + countWeapon +
                    '}';
        } else {
            return "Fail construct robot";
        }
    }

    public static Robot.RobotBuilder newBuilder() {
        return new Robot().new RobotBuilder();
    }

    /**
     * Класс Builder встроен в сам класс Robot
     */
    public class RobotBuilder {
        private RobotBuilder() {
        }

        public RobotBuilder addChassi(RobotСhassisType chassi) {
            Robot.this.chassi = chassi;
            return this;
        }

        public RobotBuilder addWeapon(RobotWeapon weapon) {
            if (Robot.this.countWeapon == MAX_WEAPON) {
                return this;
            }
            Robot.this.weapons[countWeapon] = weapon;
            Robot.this.countWeapon = Robot.this.countWeapon + 1;
            return this;
        }

        public RobotBuilder addBrain(RobotBrain brain) {
            Robot.this.brain = brain;
            return this;
        }

        public Robot buid() {
            return Robot.this;
        }
    }
}
