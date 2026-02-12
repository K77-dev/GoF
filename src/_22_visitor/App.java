package _22_visitor;

public class App {
    public static void main(String[] args) {
        System.out.println("=== VISITOR PATTERN ===\n");
        
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        
        ShapeVisitor areaCalculator = new AreaCalculator();
        
        circle.accept(areaCalculator);
        rectangle.accept(areaCalculator);
    }
}
