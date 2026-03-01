package it.polulyakh.patterns.deepseek.abstract_factory;

public class MacOSCheckBox implements CheckBox {
    @Override
    public void render() {
        System.out.println("[MacOS] Рендерим круглый чекбокс");
    }
}
