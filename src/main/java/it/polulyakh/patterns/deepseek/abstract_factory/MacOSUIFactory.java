package it.polulyakh.patterns.deepseek.abstract_factory;

public class MacOSUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new MacOSCheckBox();
    }
}
