package shapes;

import java.sql.SQLOutput;

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
        String s = "";

        int x = getSize();

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                s+= "*";
            }
            s+= "\n";
        }
        return s;
    }
}
