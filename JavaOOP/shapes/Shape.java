package shapes;

public abstract class Shape {
    private char color;

    public Shape() {

    }

    public Shape(char color) {

        this.color = color;
    }

    public int getColor() {

        return color;
    }

    public void setColor(int color) {

    }

    public String toString() {

        return ": color = " + color;
    }
}
