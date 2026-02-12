package _11_flyweight;

/**
 * FLYWEIGHT - Padrão Estrutural
 * Compartilha objetos para economizar memória quando há muitas instâncias similares.
 * 
 * Exemplo: Floresta com milhares de árvores compartilhando tipos.
 */
public class TreeType {
    private String name;
    private String color;
    private String texture;
    
    public TreeType(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }
    
    public void draw(int x, int y) {
        System.out.println("🌳 Desenhando " + name + " (" + color + ") em (" + x + "," + y + ")");
    }
}
