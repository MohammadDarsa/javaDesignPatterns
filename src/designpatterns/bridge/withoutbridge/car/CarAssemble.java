package designpatterns.bridge.withoutbridge.car;

public class CarAssemble extends Car{
    @Override
    public void manufacture() {
        System.out.println("Car Assembled!");
    }
}
