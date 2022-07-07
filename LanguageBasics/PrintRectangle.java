public class PrintRectangle {
    public static void main(String[] args) {
        int size = 5;
        int length = 10;

        for(int i = 0; i < size; i++) {
            for(int j = 0; j < length; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
