package shapes;

public class Triangle extends Shape {

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
        int x = getHeight();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                sb.append(" ");
            }
            sb.append("* ");
            for (int j = 0; j < i; j++) {
                sb.append("* ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}