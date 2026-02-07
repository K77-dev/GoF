package _02_factory_method;

import _02_factory_method.transport.CatTransport;
import _02_factory_method.transport.MotocycleTransport;
import _02_factory_method.transport.Transport;

public class App {
    public static void main(String[] args) {
        Transport transport = new CatTransport();
        transport.deliver();

        System.out.println("-------------------");

        transport = new MotocycleTransport();
        transport.deliver();
    }
}
