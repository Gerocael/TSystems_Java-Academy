package shapes;

public class Square extends Shape{

    private final int size;

    public Square(char color, int size) {
        super(color);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Square "
        + super.toString()
                + ", size :" + size;
    }
}
