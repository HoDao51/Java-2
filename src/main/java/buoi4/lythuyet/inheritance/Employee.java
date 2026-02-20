package buoi4.lythuyet.inheritance;

public class Employee extends Person{
    private String department;
    public Employee(String name, String address, int age, String department) {
        super(name, address, age);
        this.department = department;
    }
}
