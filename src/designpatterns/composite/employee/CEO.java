package designpatterns.composite.employee;

import java.util.ArrayList;
import java.util.List;

public class CEO extends Employee{
    List<Employee> emps;

    public CEO() {
        emps = new ArrayList<>();
    }

    public void addemp(Employee emp) {
        emps.add(emp);
    }

    public List<Employee> getemps() {
        return emps;
    }

    @Override
    public void work() {
        System.out.println("Give orders!!");
        for(Employee employee:emps) {
            System.out.println(employee);
        }
    }
}
