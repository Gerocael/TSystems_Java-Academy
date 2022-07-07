/*
  TODO: Expected output from the program for size = 10
             *
            ***
           *****
          *******
         *********
        ***********
       *************
      ***************
     *****************
    *******************
*/
public class PrintReverseTriangle {
    public static void main(String[] args) {
        int size = 10;
        int i = 0;

        while (i < size) {
            printChars(i + 1 + size, ' ');
            printChars((size - i), '*');
            printChars(size - i - 1, '*');
            System.out.println();
            i++;
        }
    }

    private static final void printChars(int length, char c) {
        for (int i = 0; i < length; i++) {
            System.out.print(c);
        }
    }
}

