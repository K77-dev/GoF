package _17_memento;

/**
 * MEMENTO - Padrão Comportamental
 * Permite salvar e restaurar o estado anterior de um objeto.
 * 
 * Exemplo: Sistema de salvamento de estado de um editor.
 */
public class EditorMemento {
    private final String content;
    
    public EditorMemento(String content) {
        this.content = content;
    }
    
    public String getContent() {
        return content;
    }
}
