package shapes;

public class Square extends Shape {

    private int size;

    public Square(char color, int size) {
        super(color);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        int x = getSize();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < x; j++) {
                sb.append(" ");
                for (int k = 0; k < x; k++) {
                    sb.append(super.color).append("*");
                    sb.append("\n");
                }
            }
        }
        return sb.toString();
    }
}
