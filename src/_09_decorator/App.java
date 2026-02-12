package _09_decorator;

public class App {
    public static void main(String[] args) {
        System.out.println("=== DECORATOR PATTERN ===\n");
        
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " → R$ " + coffee.getCost());
        
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " → R$ " + coffee.getCost());
        
        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " → R$ " + coffee.getCost());
    }
}
