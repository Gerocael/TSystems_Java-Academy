package shapes;

public class Rectangle extends Shape{

    private final int width;
    private final int height;

    public Rectangle(char color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
    @Override
    public String toString() {
        return "Rectangle "
                + super.toString()
                + ", width-height  " + width + height;
    }
}