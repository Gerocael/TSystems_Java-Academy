public class PrintCircle {
    public static void main(String[] args) {
        int size = 10;

        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                printChars(size/2 - 1, " ");
            }
            System.out.println();
        }
    }
    private static final void printChars(int length, char c) {
        for (int i = 0; i < length; i++) {
            System.out.print(c);
        }
    }
}