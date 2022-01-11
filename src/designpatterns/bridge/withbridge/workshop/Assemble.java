package designpatterns.bridge.withbridge.workshop;

public class Assemble implements Workshop{
    @Override
    public void work() {
        System.out.println("Assembled!");
    }
}
