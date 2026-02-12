package _02_factory_method;

public class SeaLogistics extends Logistics {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
