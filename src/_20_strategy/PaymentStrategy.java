package _20_strategy;

/**
 * STRATEGY - Padrão Comportamental
 * Define uma família de algoritmos e os torna intercambiáveis.
 * 
 * Exemplo: Diferentes métodos de pagamento.
 */
public interface PaymentStrategy {
    void pay(double amount);
}
