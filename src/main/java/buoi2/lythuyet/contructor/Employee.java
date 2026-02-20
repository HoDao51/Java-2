package buoi2.lythuyet.contructor;

public class Employee {
    private String id;
    private String name;
    private int age;
    private String address;

    public Employee(String id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Employee(String id, String name, int age){
        this(id, name, age, "hn");
    }

    public Employee(String id, String name){
        this(id, name, 18);
    }

    public Employee(String id){
        this(id, "Jack");
    }

    public Employee(){
        this("1");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
