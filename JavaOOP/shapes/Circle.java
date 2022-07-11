package shapes;

public class Circle extends Shape{

    private final int radix;

    public Circle(char color, int radix) {
        super(color);
        this.radix = radix;
    }

    public int getRadix() {
        return radix;
    }

    @Override
    public String toString() {
        return "Circle "
                + super.toString()
                + ", radix  " + radix ;
    }
}