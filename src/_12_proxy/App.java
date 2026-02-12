package _12_proxy;

public class App {
    public static void main(String[] args) {
        System.out.println("=== PROXY PATTERN ===\n");
        
        Image image = new ProxyImage("photo.jpg");
        
        System.out.println("Primeira exibição:");
        image.display();
        
        System.out.println("\nSegunda exibição (já carregada):");
        image.display();
    }
}
