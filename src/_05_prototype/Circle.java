package _05_prototype;

public class Circle extends Shape {
    private int radius;
    
    public Circle(String color, int x, int y, int radius) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    
    @Override
    public void draw() {
        System.out.println("🔵 Círculo " + color + " em (" + x + "," + y + ") com raio " + radius);
    }
}
