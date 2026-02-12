package _13_chain_of_responsibility;

public class App {
    public static void main(String[] args) {
        System.out.println("=== CHAIN OF RESPONSIBILITY PATTERN ===\n");
        
        // Configurar cadeia
        SupportHandler level1 = new Level1Support();
        SupportHandler level2 = new Level2Support();
        SupportHandler level3 = new Level3Support();
        
        level1.setNext(level2);
        level2.setNext(level3);
        
        // Testar requisições
        level1.handleRequest("Resetar senha", 1);
        level1.handleRequest("Erro no servidor", 2);
        level1.handleRequest("Sistema fora do ar", 3);
    }
}
