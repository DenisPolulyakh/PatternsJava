package it.polulyakh.patterns.creational.abstract_fabric;

public class Carpenter implements DoorFittingExpert {
    @Override
    public String doorFitting() {
        return "Я мастер по деревянным дверям";
    }
}
