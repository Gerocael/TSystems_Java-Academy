package shapes;

public class Parallelogram extends Shape{

    private final int height;

    public Parallelogram(char color, int height) {
        super(color);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
    @Override
    public String toString() {
        return "Parallelogram "
                + super.toString()
                + ", height  " + height;
    }
}