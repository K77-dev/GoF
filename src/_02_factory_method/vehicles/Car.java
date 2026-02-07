package _02_factory_method.vehicles;

public class Car implements IVehicle{
    @Override
    public void startRoute() {
        System.out.println("Driving a car");
    }

    @Override
    public void getCargo() {
        System.out.println("Car is getting cargo");
    }
}
