package designpatterns.bridge;


import designpatterns.bridge.withbridge.bike.Bike;
import designpatterns.bridge.withbridge.car.Car;
import designpatterns.bridge.withbridge.workshop.Assemble;
import designpatterns.bridge.withbridge.workshop.Khabesa;
import designpatterns.bridge.withbridge.workshop.Produce;
import designpatterns.bridge.withbridge.workshop.Workshop;

public class Demo {
    public static void main(String[] args) {
        Workshop assemble = new Assemble();
        Workshop produce = new Produce();
        Workshop khabesa = new Khabesa();

        Car c1 = new Car(assemble);
        Car c2 = new Car(khabesa);

        Bike b1 = new Bike(assemble);
        Bike b2 = new Bike(produce);

        c1.manufacture();
        c2.manufacture();

        b1.manufacture();
        b2.manufacture();
    }
}
