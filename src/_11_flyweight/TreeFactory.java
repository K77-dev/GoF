package _11_flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static Map<String, TreeType> treeTypes = new HashMap<>();
    
    public static TreeType getTreeType(String name, String color, String texture) {
        String key = name + "_" + color + "_" + texture;
        
        if (!treeTypes.containsKey(key)) {
            treeTypes.put(key, new TreeType(name, color, texture));
            System.out.println("✨ Criando novo tipo de árvore: " + name);
        }
        
        return treeTypes.get(key);
    }
    
    public static int getTotalTreeTypes() {
        return treeTypes.size();
    }
}
