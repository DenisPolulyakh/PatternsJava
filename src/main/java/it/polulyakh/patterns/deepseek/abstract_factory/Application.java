package it.polulyakh.patterns.deepseek.abstract_factory;

public class Application {
    private Button button;
    private CheckBox checkbox;
    
    public Application(UIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }
    
    public void renderUI() {
        button.render();
        checkbox.render();
    }
    
    public static void main(String[] args) {

        Application windowsApp = new Application(new WindowsUIFactory());
        windowsApp.renderUI();
        
        Application macOsApp = new Application(new MacOSUIFactory());
        macOsApp.renderUI();

        Application linuxApp = new Application(new LinuxUIFactory());
        linuxApp.renderUI();
    }
}