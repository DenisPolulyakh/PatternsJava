package it.polulyakh.patterns.deepseek.abstract_factory;

public class LinuxUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new LinuxCheckBox();
    }
}
