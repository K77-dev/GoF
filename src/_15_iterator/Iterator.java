package _15_iterator;

/**
 * ITERATOR - Padrão Comportamental
 * Permite percorrer elementos de uma coleção sem expor sua representação interna.
 * 
 * Exemplo: Iterar sobre uma lista de nomes.
 */
public interface Iterator<T> {
    boolean hasNext();
    T next();
}
