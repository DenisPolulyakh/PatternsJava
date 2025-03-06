package it.polulyakh.patterns.creational.abstract_fabric;

public class Welder implements DoorFittingExpert {
    @Override
    public String doorFitting() {
        return "Я мастер по железным дверям";
    }
}
