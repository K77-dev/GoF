package _19_state;

/**
 * STATE - Padrão Comportamental
 * Permite um objeto alterar seu comportamento quando seu estado interno muda.
 * 
 * Exemplo: Documento com diferentes estados (rascunho, moderação, publicado).
 */
public interface State {
    void publish(Document document);
}
