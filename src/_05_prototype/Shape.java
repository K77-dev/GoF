package _05_prototype;

/**
 * PROTOTYPE - Padrão Criacional
 * Permite copiar objetos existentes sem tornar o código dependente de suas classes.
 * 
 * Exemplo: Clonagem de formas geométricas.
 */
public abstract class Shape implements Cloneable {
    protected String color;
    protected int x;
    protected int y;
    
    public abstract void draw();
    
    @Override
    public Shape clone() {
        try {
            return (Shape) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
