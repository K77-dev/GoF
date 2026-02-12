package _02_factory_method;

public class Car implements Vehicle {
    @Override
    public void deliver() {
        System.out.println("🚗 Entregando por carro (capacidade: 500kg)");
    }
}
