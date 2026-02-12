package _01_singleton;

/**
 * SINGLETON - Padrão Criacional
 * Garante que uma classe tenha apenas uma instância e fornece um ponto global de acesso a ela.
 * 
 * Exemplo: Conexão com banco de dados - queremos apenas uma instância ativa.
 */
public class DatabaseConnection {
    private static DatabaseConnection instance;
    private String connectionString;
    
    // Construtor privado impede instanciação direta
    private DatabaseConnection() {
        this.connectionString = "jdbc:mysql://localhost:3306/mydb";
        System.out.println("Conexão com banco de dados criada!");
    }
    
    // Método estático para obter a única instância
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
    
    public void executeQuery(String query) {
        System.out.println("Executando query: " + query);
    }
}
