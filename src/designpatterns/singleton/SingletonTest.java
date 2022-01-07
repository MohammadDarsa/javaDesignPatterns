package designpatterns.singleton;

public class SingletonTest {
    private Singleton singleton;

    public SingletonTest() {
        singleton = Singleton.getInstance();
    }

    public void printName() {
        System.out.println("from SingletonTest, singleton name: " + singleton.getName());
    }

    public void changeName(String name) {
        singleton.setName(name);
    }
}
