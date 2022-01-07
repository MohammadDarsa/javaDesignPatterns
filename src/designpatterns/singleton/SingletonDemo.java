package designpatterns.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.setName("hello");
        System.out.println(singleton.getName());


        SingletonTest singletonTest = new SingletonTest();

        //this will print the name inside the singleton
        singletonTest.printName();

        //change singleton name will be applied to the singleton hence everywhere in the program
        singletonTest.changeName("test");

        //this will print test cus singletonTest changed the name in the singleton
        System.out.println(singleton.getName());
        singletonTest.printName();
    }
}
