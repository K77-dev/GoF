package _17_memento;

public class Editor {
    private String content = "";
    
    public void write(String text) {
        content += text;
        System.out.println("✍️ Conteúdo: " + content);
    }
    
    public EditorMemento save() {
        System.out.println("💾 Salvando estado...");
        return new EditorMemento(content);
    }
    
    public void restore(EditorMemento memento) {
        content = memento.getContent();
        System.out.println("⏪ Restaurando: " + content);
    }
}
