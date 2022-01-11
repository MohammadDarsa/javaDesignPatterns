package designpatterns.bridge.withoutbridge.bike;

public class BikeProduce extends Bike{
    @Override
    public void manufacture() {
        System.out.println("Bike Produced!");
    }
}
