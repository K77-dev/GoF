package _22_visitor;

/**
 * VISITOR - Padrão Comportamental
 * Permite adicionar novas operações a objetos sem modificar suas classes.
 * 
 * Exemplo: Calcular área e perímetro de diferentes formas geométricas.
 */
public interface ShapeVisitor {
    void visit(Circle circle);
    void visit(Rectangle rectangle);
}
