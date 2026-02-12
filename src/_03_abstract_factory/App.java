package _03_abstract_factory;

public class App {
    public static void main(String[] args) {
        System.out.println("=== ABSTRACT FACTORY PATTERN ===\n");
        
        // Criar UI para Windows
        GUIFactory factory = new WindowsFactory();
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();
        
        button.paint();
        checkbox.paint();
        
        System.out.println();
        
        // Criar UI para Mac
        factory = new MacFactory();
        button = factory.createButton();
        checkbox = factory.createCheckbox();
        
        button.paint();
        checkbox.paint();
    }
}
