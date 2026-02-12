package _02_factory_method;

public class Truck implements Vehicle {
    @Override
    public void deliver() {
        System.out.println("🚚 Entregando por caminhão (capacidade: 5000kg)");
    }
}
