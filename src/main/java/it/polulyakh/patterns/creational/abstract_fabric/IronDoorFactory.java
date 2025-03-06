package it.polulyakh.patterns.creational.abstract_fabric;

public class IronDoorFactory implements DoorFactory {
    @Override
    public Door createDoor() {
        return new IronDoor();
    }

    @Override
    public DoorFittingExpert createFittingExpert() {
        return new Welder();
    }
}
