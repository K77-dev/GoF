package _18_observer;

public class App {
    public static void main(String[] args) {
        System.out.println("=== OBSERVER PATTERN ===");
        
        NewsAgency agency = new NewsAgency();
        
        Observer subscriber1 = new NewsSubscriber("João");
        Observer subscriber2 = new NewsSubscriber("Maria");
        Observer subscriber3 = new NewsSubscriber("Pedro");
        
        agency.attach(subscriber1);
        agency.attach(subscriber2);
        agency.attach(subscriber3);
        
        agency.notifyObservers("Novidades sobre Java 22!");
    }
}
