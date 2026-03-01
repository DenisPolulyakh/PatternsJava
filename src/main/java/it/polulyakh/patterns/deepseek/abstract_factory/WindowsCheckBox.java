package it.polulyakh.patterns.deepseek.abstract_factory;

public class WindowsCheckBox implements CheckBox {
    @Override
    public void render() {
        System.out.println("[Windows] Рендерим чекбокс с галочкой");
    }
}
