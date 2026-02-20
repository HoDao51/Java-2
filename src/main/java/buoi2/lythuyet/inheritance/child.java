package buoi2.lythuyet.inheritance;

public class child extends Parent{
    public child(String house, String car){
        super(house, car);
    }

    @Override
    public void display(){
        System.out.println("Child: car = " + super.car);
    }
}
