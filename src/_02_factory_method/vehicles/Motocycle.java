package _02_factory_method.vehicles;

public class Motocycle implements IVehicle{
    @Override
    public void startRoute() {
        System.out.println("Driving a motocycle");
    }

    @Override
    public void getCargo() {
        System.out.println("Motocycle is getting cargo");
    }
}
