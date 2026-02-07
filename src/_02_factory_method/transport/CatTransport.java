package _02_factory_method.transport;

import _02_factory_method.vehicles.Car;
import _02_factory_method.vehicles.IVehicle;

public class CatTransport extends Transport{
    @Override
    public IVehicle createVehicle() {
        return new Car();
    }
}
