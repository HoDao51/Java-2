package buoi4.lythuyet.implementation;

public class Bird implements Flyable {
    private String name;
    public Bird(String name){
        this.name = name;
    }
    @Override
    public void fly(){
        System.out.println("Bird can fly");
    }
}
