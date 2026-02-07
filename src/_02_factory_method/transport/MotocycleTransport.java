package _02_factory_method.transport;

import _02_factory_method.vehicles.IVehicle;
import _02_factory_method.vehicles.Motocycle;

public class MotocycleTransport extends Transport{
    @Override
    public IVehicle createVehicle() {
        return new Motocycle();
    }
}
