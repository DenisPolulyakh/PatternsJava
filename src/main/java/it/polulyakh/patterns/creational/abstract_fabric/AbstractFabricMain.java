package it.polulyakh.patterns.creational.abstract_fabric;

public class AbstractFabricMain {

    public static void main(String[] args) {
        DoorFactory doorFactory = new IronDoorFactory();
        System.out.println(doorFactory.createDoor().getDescription());
        System.out.println(doorFactory.createFittingExpert().doorFitting());

        doorFactory = new WoodenDoorFactory();
        System.out.println(doorFactory.createDoor().getDescription());
        System.out.println(doorFactory.createFittingExpert().doorFitting());
    }
}
