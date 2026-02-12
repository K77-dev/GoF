package _08_composite;

public class App {
    public static void main(String[] args) {
        System.out.println("=== COMPOSITE PATTERN ===\n");
        
        Folder root = new Folder("root");
        
        Folder src = new Folder("src");
        src.add(new File("Main.java", 10));
        src.add(new File("App.java", 5));
        
        Folder docs = new Folder("docs");
        docs.add(new File("README.md", 2));
        
        root.add(src);
        root.add(docs);
        root.add(new File("pom.xml", 3));
        
        root.showDetails("");
    }
}
