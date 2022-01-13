package designpatterns.composite;

import designpatterns.composite.employee.CEO;
import designpatterns.composite.employee.Employee;
import designpatterns.composite.employee.Manager;

public class Demo {
    public static void main(String[] args) {
        CEO ceo = new CEO();
        Manager manager = new Manager();
        ceo.addemp(manager);
        ceo.work();
        manager.work();
    }
}
