package designpatterns.singleton;

public class Singleton {
    //static instance shared among the whole project
    private static Singleton instance;

    //all the fields are created with the object once and shared through the project.
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //private constructor, no one can create objects of this class outside this file
    private Singleton() {}

    //static function to retrieve the only instance of this class
    public static Singleton getInstance() {
        if(instance == null) instance = new Singleton();
        return instance;
    }

}
