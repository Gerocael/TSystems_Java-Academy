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
            String s = "";

            int x = getWidth();
            int y = getHeight();

            for (int k = 0; k < y; k++) {
                for (int i = 0; i < x; i++) {
                    s += " ";
                    for (int j = 0; j < y; j++) {
                        s += "*";
                    }
                }
                s += "\n";
            }

            return s;
        }

    @Override
    public void print() {

    }
}
