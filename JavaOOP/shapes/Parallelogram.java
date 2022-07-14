package shapes;

public class Parallelogram extends Shape {

    private final int height;
    private final int width;

    public Parallelogram(char color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;}

        @Override
        public String toString() {
            int x = getWidth();
            int y = getHeight();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < x; i++) {
                for (int k = 0; k < i; k++) {
                    sb.append(" ");
                }
                for (int j = 0; j < y; j++) {
                    sb.append("* ");
                }
                sb.append("\n");
            }
            return sb.toString();
        }

    @Override
    public void print() {

    }
}
