package _02_factory_method.transport;

import _02_factory_method.vehicles.IVehicle;

public abstract class Transport {
    public abstract IVehicle createVehicle();
    public void deliver() {
        IVehicle vehicle = createVehicle();
        vehicle.startRoute();
        vehicle.getCargo();
    }
}
