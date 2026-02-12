package _01_singleton;

public class App {
    public static void main(String[] args) {
        System.out.println("=== SINGLETON PATTERN ===\n");
        
        // Sempre retorna a mesma instância
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();
        
        System.out.println("db1 == db2? " + (db1 == db2)); // true
        
        db1.executeQuery("SELECT * FROM users");
    }
}
