package _02_factory_method;

public class App {
    public static void main(String[] args) {
        System.out.println("=== FACTORY METHOD PATTERN ===\n");
        
        Logistics logistics = new RoadLogistics();
        logistics.planDelivery();
        
        System.out.println();
        
        logistics = new SeaLogistics();
        logistics.planDelivery();
    }
}
