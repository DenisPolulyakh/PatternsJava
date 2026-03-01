package it.polulyakh.patterns.deepseek.abstract_factory;

public class MacOSButton implements Button{
    @Override
    public void render() {
        System.out.println("[MacOS] Рендерим кнопку в стиле Aqua");
    }
}
