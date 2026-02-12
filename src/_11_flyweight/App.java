package _11_flyweight;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("=== FLYWEIGHT PATTERN ===\n");
        
        List<Tree> forest = new ArrayList<>();
        
        // Criando 1000 árvores, mas apenas 3 tipos diferentes
        for (int i = 0; i < 1000; i++) {
            TreeType type;
            if (i % 3 == 0) {
                type = TreeFactory.getTreeType("Carvalho", "verde", "rugosa");
            } else if (i % 3 == 1) {
                type = TreeFactory.getTreeType("Pinheiro", "verde-escuro", "lisa");
            } else {
                type = TreeFactory.getTreeType("Cerejeira", "rosa", "macia");
            }
            forest.add(new Tree(i, i * 2, type));
        }
        
        System.out.println("\n📊 Total de árvores: " + forest.size());
        System.out.println("📊 Total de tipos únicos: " + TreeFactory.getTotalTreeTypes());
        System.out.println("💾 Memória economizada através do compartilhamento!");
    }
}
