package shapes;

import java.util.Arrays;

public class TestShapes {

    public static void main(String[] args) {
        Shape[] shapes = {
                new Square('*', 5)
        };

        Arrays.sort(shapes);

        Square s1 = new Square('*', 5);
        System.out.println(s1);
        Triangle s2 = new Triangle('*', 7);
        System.out.println(s2);
        Rectangle s3 = new Rectangle('*', 7, 10);
        System.out.println(s3);
        Parallelogram s4 = new Parallelogram('*', 7, 10);
        System.out.println(s4);
    }
}
