package _22_visitor;

public class AreaCalculator implements ShapeVisitor {
    @Override
    public void visit(Circle circle) {
        double area = Math.PI * circle.getRadius() * circle.getRadius();
        System.out.println("🔵 Área do círculo: " + String.format("%.2f", area));
    }
    
    @Override
    public void visit(Rectangle rectangle) {
        double area = rectangle.getWidth() * rectangle.getHeight();
        System.out.println("🟦 Área do retângulo: " + String.format("%.2f", area));
    }
}
