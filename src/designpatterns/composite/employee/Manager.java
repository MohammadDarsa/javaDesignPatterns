package designpatterns.composite.employee;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee{
    List<Employee> employees;

    public Manager() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    @Override
    public void work() {
        System.out.println("I will manage my slaves");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
