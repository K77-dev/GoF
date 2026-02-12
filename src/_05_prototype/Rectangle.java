package _05_prototype;

public class Rectangle extends Shape {
    private int width;
    private int height;
    
    public Rectangle(String color, int x, int y, int width, int height) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    
    @Override
    public void draw() {
        System.out.println("🟦 Retângulo " + color + " em (" + x + "," + y + ") " + width + "x" + height);
    }
}
