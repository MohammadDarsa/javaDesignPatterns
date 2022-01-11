package designpatterns.bridge.withoutbridge.car;

public class CarProduce extends Car{
    @Override
    public void manufacture() {
        System.out.println("Car Produced!");
    }
}
