package arrays;

import java.util.Random;

public class ArrayCopyDemo {
    private static long startTime;
    private static long endTime;
    private static int iteration = 0;

    public static void main(String[] args) {
        Random r = new Random();
        int n = 5000;
        int[] arrayToSort = new int[n];
        for (int i = 0; i < n; i++) {
            arrayToSort[i] = r.nextInt(100);
        }
        int[] copyFrom = new int[11000];
        int[] copyTo = new int[11000];
        int[] copyFrom2 = new int[11000];
        int[] copyTo2 = new int[11000];

        //populate array
        for (int i = 0; i < 1000; i++) {
            copyFrom[i] = i + 10;
            copyTo[i] = 0;
            copyFrom[i] = i + 10;
            copyTo[i] = 0;
        }
        recordStart();
        System.arraycopy(copyFrom, 2, copyTo, 0, 10000);
        recordAndWriteEnd();

//        for(int i : copyTo) {
//            System.out.print(i + ",");
//        }
//        System.out.println();

        recordStart();
        arraycopy(copyFrom2, 2, copyTo2, 4, 10000);
        recordAndWriteEnd();

        bubbleSort(arrayToSort);
        printArray(arrayToSort);
    }

    private static boolean arraycopy(int[] source, int srcIndex,
                                     int[] dest, int destIndex, int length) {
        if (srcIndex + length >= source.length
                || destIndex + length >= dest.length) {
            return false;
        }
        String abc = "";
        for (int i = 0; i < length; i++) {
            dest[destIndex + i] = source[srcIndex + i];

            //!!! nie !!!
            //abc += dest[destIndex + 1];
            //System.out.println(dest[destIndex + 1]);
        }
        System.out.println(abc);
        return true;
    }

    private static void recordStart() {
        startTime = System.currentTimeMillis();
    }

    private static void recordAndWriteEnd() {
        endTime = System.currentTimeMillis();
        System.out.println("Loop " + ++iteration + " duration: "
                + (endTime - startTime) + " milliseconds");
    }

    private static void bubbleSort(int[] arrayToSort) {
        //zotriedit pole pomocou bubble sort
        int temp;
        long lStartTime = System.nanoTime();
        for (int j = 0; j < arrayToSort.length; j++) {
            for (int i = 0; i < arrayToSort.length - 1; i++) {
                if (arrayToSort[i] > arrayToSort[i + 1]) {
                    temp = arrayToSort[i];
                    arrayToSort[i] = arrayToSort[i + 1];
                    arrayToSort[i + 1] = temp;
                }
             }
        }
        long lEndTime = System.nanoTime();
        long output = lEndTime - lStartTime;
        System.out.println("Elapsed time in milliseconds: " + output / 1000000);
    }

    private static void printArray(int[] arrayToSort) {
        //vypisat polozky v poli
        for (int i = 0; i < arrayToSort.length; i++) {
            System.out.print(arrayToSort[i] + " ");
        }
    }
}