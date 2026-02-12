package _13_chain_of_responsibility;

/**
 * CHAIN OF RESPONSIBILITY - Padrão Comportamental
 * Permite passar requisições ao longo de uma cadeia de handlers.
 * 
 * Exemplo: Sistema de suporte técnico com diferentes níveis.
 */
public abstract class SupportHandler {
    protected SupportHandler nextHandler;
    
    public void setNext(SupportHandler handler) {
        this.nextHandler = handler;
    }
    
    public abstract void handleRequest(String issue, int level);
}
