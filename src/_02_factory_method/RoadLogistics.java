package _02_factory_method;

public class RoadLogistics extends Logistics {
    @Override
    public Vehicle createVehicle() {
        return new Truck();
    }
}
