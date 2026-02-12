package _10_facade;

public class App {
    public static void main(String[] args) {
        System.out.println("=== FACADE PATTERN ===\n");
        
        // Interface simples que esconde a complexidade
        ComputerFacade computer = new ComputerFacade();
        computer.start();
    }
}
