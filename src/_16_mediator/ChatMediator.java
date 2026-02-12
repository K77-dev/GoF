package _16_mediator;

/**
 * MEDIATOR - Padrão Comportamental
 * Define um objeto que encapsula como objetos interagem entre si.
 * 
 * Exemplo: Sala de chat onde usuários se comunicam através de um mediador.
 */
public interface ChatMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}
