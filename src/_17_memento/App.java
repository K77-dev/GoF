package _17_memento;

public class App {
    public static void main(String[] args) {
        System.out.println("=== MEMENTO PATTERN ===\n");
        
        Editor editor = new Editor();
        History history = new History();
        
        editor.write("Olá ");
        history.push(editor.save());
        
        editor.write("Mundo!");
        history.push(editor.save());
        
        editor.write(" Java é legal!");
        
        System.out.println();
        editor.restore(history.pop());
        editor.restore(history.pop());
    }
}
