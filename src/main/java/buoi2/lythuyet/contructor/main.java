package buoi2.lythuyet.contructor;

public class main {
    public static void main(String[] args) {
//        Employee e = new Employee();
//        System.out.println(e.toString());
//        Employee e1 = new Employee("2", "Mary");
//        System.out.println(e1.toString());
//        Employee e2 = new Employee("3", "abc", 28);
//        System.out.println(e2.toString());
//        Employee e3 = new Employee("4", "xyz", 21, "Hp");
//        System.out.println(e3.toString());
        Database db = Database.getInstance();
        Database db1 = Database.getInstance();
        System.out.println(db);
        System.out.println(db1);
    }
}
