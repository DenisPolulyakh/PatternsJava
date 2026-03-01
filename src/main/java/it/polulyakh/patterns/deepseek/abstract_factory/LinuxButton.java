package it.polulyakh.patterns.deepseek.abstract_factory;

public class LinuxButton implements Button{
    @Override
    public void render() {
        System.out.println("[Linux] Рендерим кнопку в стиле GTK");
    }
}
