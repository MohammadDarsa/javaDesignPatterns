package designpatterns.bridge.withbridge.car;

import designpatterns.bridge.withbridge.Vehicle;
import designpatterns.bridge.withbridge.workshop.Workshop;

public class Car implements Vehicle {
    private Workshop workshop;

    public Car(Workshop workshop) {
        this.workshop = workshop;
    }

    @Override
    public void manufacture() {
        System.out.printf("Car ");
        workshop.work();
    }
}
