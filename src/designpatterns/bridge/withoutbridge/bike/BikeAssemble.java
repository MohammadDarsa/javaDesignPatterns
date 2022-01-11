package designpatterns.bridge.withoutbridge.bike;

public class BikeAssemble extends Bike{
    @Override
    public void manufacture() {
        System.out.println("Bike Assembled!");
    }
}
