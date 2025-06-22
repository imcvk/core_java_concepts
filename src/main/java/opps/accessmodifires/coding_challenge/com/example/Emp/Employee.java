package opps.accessmodifires.coding_challenge.com.example.Emp;

public class Employee {
    private String name;
    private int age;
    private int sal;

    public Employee(String name, int age, int sal) {
        this.name = name;
        this.age = age;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }
   public void getEmployeeDetails(){
       System.out.println("Name: " + name);
       System.out.println("Age: " + age);
       System.out.println("Salary: " + sal);
    }
}
