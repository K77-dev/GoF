package _19_state;

public class App {
    public static void main(String[] args) {
        System.out.println("=== STATE PATTERN ===\n");
        
        Document doc = new Document();
        
        doc.publish(); // Rascunho → Moderação
        doc.publish(); // Moderação → Publicado
        doc.publish(); // Já publicado
    }
}
