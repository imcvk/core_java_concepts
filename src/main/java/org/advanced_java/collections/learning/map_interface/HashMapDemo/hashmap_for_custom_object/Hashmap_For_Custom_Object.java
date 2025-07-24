package org.advanced_java.collections.learning.map_interface.HashMapDemo.hashmap_for_custom_object;

import java.util.HashMap;
import java.util.Objects;

class Employee {
    int emp_id;
    String name;

    @Override
    public String toString() {
        return "Employee{" +
                "emp_id=" + emp_id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return getEmp_id() == employee.getEmp_id() && Objects.equals(getName(), employee.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmp_id(), getName());
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee() {
    }

    public Employee(int emp_id, String name) {
        this.emp_id = emp_id;
        this.name = name;
    }
}

public class Hashmap_For_Custom_Object {
    public static void main(String[] args) {
        HashMap<Employee, String> map = new HashMap<>();
        Employee e1 = new Employee(1, "John");
        Employee e2 = new Employee(2, "Jane");
        Employee e3 = new Employee(3, "Joe");
        Employee e4 = new Employee(4, "Jonny");
        Employee e5 = new Employee(5, "Joye");
        Employee e6 = new Employee(1, "John");
        map.put(e1, "Programmer");
        map.put(e2, "Programmer");
        map.put(e3, "Programmer");
        map.put(e4, "Programmer");
        map.put(e5, "Manager");
        map.put(e6, "Technical Lead");
        System.out.println(map.size());
        System.out.println(map.get(e1));
        System.out.println(map.get(e6));

    }
}
