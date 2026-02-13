package _05_prototype;

public class App {
    public static void main(String[] args) {
        System.out.println("=== PROTOTYPE PATTERN ===\n");
        
        Circle circle1 = new Circle("vermelho", 10, 20, 5);
        circle1.draw();
        
        // Clonar círculo
        Circle circle2 = (Circle) circle1.clone();
        circle2.x = 50;
        circle2.draw();
        
        System.out.println("\nObjetos diferentes? " + (circle1 != circle2));

        System.out.println("\n======");

        Rectangle rect1 = new Rectangle("azul", 30, 40, 10, 20);
        rect1.draw();

        // Clonar retângulo
        Rectangle rect2 = (Rectangle) rect1.clone();
        rect2.y = 60;
        rect2.draw();   

        System.out.println("\nObjetos diferentes? " + (rect1 != rect2));

    }
}
