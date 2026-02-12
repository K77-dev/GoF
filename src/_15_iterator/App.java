package _15_iterator;

public class App {
    public static void main(String[] args) {
        System.out.println("=== ITERATOR PATTERN ===\n");
        
        String[] names = {"Ana", "Bruno", "Carlos", "Diana"};
        NameCollection collection = new NameCollection(names);
        
        Iterator<String> iterator = collection.createIterator();
        
        while (iterator.hasNext()) {
            System.out.println("👤 " + iterator.next());
        }
    }
}
