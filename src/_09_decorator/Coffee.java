package _09_decorator;

/**
 * DECORATOR - Padrão Estrutural
 * Permite adicionar comportamentos a objetos colocando-os dentro de wrappers.
 * 
 * Exemplo: Café com diferentes complementos (leite, açúcar, etc).
 */
public interface Coffee {
    String getDescription();
    double getCost();
}
