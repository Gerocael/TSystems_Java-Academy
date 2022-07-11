public class SwapTest {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        swap(a, b);
    }

    //!NOT POSSIBLE IN JAVA - PRIMITIVE VALUE!
    public static void swap(int a, int b) {
        int temp = 0;
        temp = a;
        a = b;
        b = temp;

        System.out.println("a= "+ a);
        System.out.println("b= "+ b);
    }
}
