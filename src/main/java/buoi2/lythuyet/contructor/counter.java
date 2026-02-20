package buoi2.lythuyet.contructor;

public class counter {
    private static int counter = 0;
    private int nonStaticCounter = 0;
    public counter(){
        counter++;
        nonStaticCounter++;
    }

    public int getCounter(){
        return counter;
    }

    public int getNonStaticCounter(){
        return nonStaticCounter;
    }
}
