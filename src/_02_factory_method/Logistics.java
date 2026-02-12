package _02_factory_method;

public abstract class Logistics {
    // Factory Method
    public abstract Vehicle createVehicle();
    
    public void planDelivery() {
        Vehicle vehicle = createVehicle();
        System.out.println("Planejando entrega...");
        vehicle.deliver();
    }
}
