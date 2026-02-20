package buoi2.lythuyet.inheritance;

public class Parent {
    private String house;
    protected String car;

    public Parent(String house, String car) {
        this.house = house;
        this.car = car;
    }

    public void display(){
        System.out.println("Parent: house = " + house + " | car = " + car);
    }
}
