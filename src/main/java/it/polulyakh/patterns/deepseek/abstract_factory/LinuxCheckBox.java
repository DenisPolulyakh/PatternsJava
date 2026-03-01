package it.polulyakh.patterns.deepseek.abstract_factory;

public class LinuxCheckBox implements CheckBox {
    @Override
    public void render() {
        System.out.println("[Linux] Рендерим чекбокс в стиле QT");
    }
}
