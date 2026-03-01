package it.polulyakh.patterns.deepseek.structured.decorator;

public class MargheritaPizza implements Pizza {
    @Override
    public double getCost() {
        return 300;
    }

    @Override
    public String getDescription() {
        return "\uD83C\uDF55 Маргарита";
    }
}
