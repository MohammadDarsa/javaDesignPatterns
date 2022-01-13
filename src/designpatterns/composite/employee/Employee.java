package designpatterns.composite.employee;

public abstract class Employee {
    String name;
    int id;

    public abstract void work();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
