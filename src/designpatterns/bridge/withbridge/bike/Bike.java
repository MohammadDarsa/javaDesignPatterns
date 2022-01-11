package designpatterns.bridge.withbridge.bike;

import designpatterns.bridge.withbridge.Vehicle;
import designpatterns.bridge.withbridge.workshop.Workshop;

public class Bike implements Vehicle {
    private Workshop workshop;

    public Bike(Workshop workshop) {
        this.workshop = workshop;
    }

    @Override
    public void manufacture() {
        System.out.print("Bike ");
        workshop.work();
    }
}
