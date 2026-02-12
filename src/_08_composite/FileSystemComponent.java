package _08_composite;

/**
 * COMPOSITE - Padrão Estrutural
 * Permite compor objetos em estruturas de árvore para representar hierarquias parte-todo.
 * 
 * Exemplo: Sistema de arquivos com pastas e arquivos.
 */
public interface FileSystemComponent {
    void showDetails(String indent);
}
