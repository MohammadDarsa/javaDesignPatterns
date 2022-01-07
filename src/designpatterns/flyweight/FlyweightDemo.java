package designpatterns.flyweight;

public class FlyweightDemo {
    public static void main(String[] args) {
        ColorFlyweight colorFlyweight = new ColorFlyweight();

        colorFlyweight.addColor("black", new Color("black", "#000000"));

        Circle c1 = new Circle(new Color("black", "#000000"), 3);
        Circle c2 = new Circle(colorFlyweight.getColor("black"), 4);
        Circle c3 = new Circle(colorFlyweight.getColor("black"), 5);
        Circle c4 = new Circle(colorFlyweight.getColor("black"), 6);

        if(c4.getColor() == c1.getColor()) {
            System.out.println("equal objects");
        } else {
            System.out.println("not the same object");
        }

        String s1 = "hello";
        String s2 = "hello";

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
