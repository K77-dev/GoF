package _18_observer;

/**
 * OBSERVER - Padrão Comportamental
 * Define uma dependência um-para-muitos entre objetos.
 * 
 * Exemplo: Sistema de notificações onde múltiplos observadores são notificados de mudanças.
 */
public interface Observer {
    void update(String message);
}
