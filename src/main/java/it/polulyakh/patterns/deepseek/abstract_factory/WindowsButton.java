package it.polulyakh.patterns.deepseek.abstract_factory;

public class WindowsButton implements Button{
    @Override
    public void render() {
        System.out.println("[Windows] Рендерим кнопку в классическом стиле");
    }
}
