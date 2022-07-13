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
        String s = "";

        int x = getWidth();
        int y = getHeight();

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                s+= "*";
            }
            s+= "\n";
        }
        return s;
    }
}