public class PrintReverseRightTriangle {
    public static void main(String[] args) {
        int size = 10;
        int i = 0;

        while (i < size) {
            printChars((size - 1), '*');
            printChars((i), '*');
            System.out.println();
            size--;
        }
    }

    private static final void printChars(int length, char c) {
        for (int i = 0; i < length; i++) {
            System.out.print(c);
        }
    }
}


