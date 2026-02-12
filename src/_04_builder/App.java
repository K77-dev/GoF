package _04_builder;

public class App {
    public static void main(String[] args) {
        System.out.println("=== BUILDER PATTERN ===\n");
        
        // Computador básico
        Computer basicPC = new Computer.Builder("Intel i3")
                .ram("8GB")
                .storage("256GB SSD")
                .build();
        
        System.out.println("PC Básico: " + basicPC);
        
        // Computador gamer
        Computer gamingPC = new Computer.Builder("Intel i9")
                .ram("32GB")
                .storage("2TB NVMe")
                .gpu("RTX 4090")
                .wifi(true)
                .build();
        
        System.out.println("PC Gamer: " + gamingPC);
    }
}
