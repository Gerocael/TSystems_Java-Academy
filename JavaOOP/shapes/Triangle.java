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
        String s = "";

        int x = getHeight();

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                s+=" ";
            }
            s+="*";
            for (int j = 0; j < x; j++) {
                s+="*";
            }
            s+="\n";
        }
        return s;

    }
}