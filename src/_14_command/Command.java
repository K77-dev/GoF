package _14_command;

/**
 * COMMAND - Padrão Comportamental
 * Encapsula uma requisição como um objeto, permitindo desfazer operações.
 * 
 * Exemplo: Editor de texto com undo/redo.
 */
public interface Command {
    void execute();
    void undo();
}
