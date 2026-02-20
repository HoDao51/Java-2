package buoi4.baitap.bai3;

public class MoveableCircle implements Moveable{
    private int radius;
    private MoveablePoint center;

    public MoveableCircle(int radius, MoveablePoint moveablePoint) {
        this.radius = radius;
        this.center = center;
    }

    @Override
    public String toString() {
        return "MoveableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }
}
