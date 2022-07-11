package shapes;

public class Triangle extends Shape{

    private final int height;

    public Triangle(char color, int height) {
        super(color);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
    @Override
    public String toString() {
        return "Triangle "
                + super.toString()
                + ", height  " + height;
    }
}