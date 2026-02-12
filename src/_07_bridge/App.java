package _07_bridge;

public class App {
    public static void main(String[] args) {
        System.out.println("=== BRIDGE PATTERN ===\n");
        
        Device tv = new TV();
        Remote remote = new Remote(tv);
        remote.togglePower();
        remote.volumeUp();
        
        System.out.println();
        
        Device radio = new Radio();
        remote = new Remote(radio);
        remote.togglePower();
        remote.volumeUp();
    }
}
