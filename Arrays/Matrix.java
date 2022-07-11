import static java.util.Objects.isNull;

public class Matrix {
    public static void main(String[] args) {
        //int[][] aMatrix = new int[4][];
        int[][] aMatrix = {
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5}};

        int[][] bMatrix = {
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5}};

        checkIn(aMatrix, bMatrix);

        int[][] addition = addMatrices(aMatrix, bMatrix);
        int[][] transposed = transpose(aMatrix);
        int[][] multiplied = multiply(aMatrix, bMatrix);

        //print matrix
        System.out.print("original");
        System.out.println();
        printMatrix(aMatrix);
        printMatrix(bMatrix);
    }

    private static int[][] addMatrices(int[][] aMatrix, int[][] bMatrix) {
        int[][] cMatrix = new int[aMatrix.length][bMatrix.length];
        //sucet matic - kazdy prvok s kazdym prvkom
        for (int i = 0; i < aMatrix.length; i++) {
            for (int j = 0; j < bMatrix.length; j++) {
                cMatrix[i][j] = aMatrix[i][j] + bMatrix[i][j];
            }
        }
        //vysledok bude v matrixC
        System.out.print("addMatrices");
        System.out.println();
        printMatrix(cMatrix);
        System.out.println();
        return cMatrix;
    }

    private static int[][] transpose(int[][] matrix) {
        int[][] transposed = new int[matrix.length][matrix.length];
        //https://cs.wikipedia.org/wiki/Transpozice_matice
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                transposed[i][j] = matrix[j][i];
            }
        }
        //vysledok bude v matrixC
        System.out.print("transpose");
        System.out.println();
        printMatrix(transposed);
        System.out.println();
        return transposed;
    }

    private static int[][] multiply(int[][] aMatrix, int[][] bMatrix) {
        int[][] cMatrix = new int[aMatrix.length][bMatrix.length];
        for (int i = 0; i < aMatrix.length; i++) {
            for (int j = 0; j < bMatrix.length; j++) {
                cMatrix[i][j] = aMatrix[i][j] * bMatrix[i][j];
            }
        }
        System.out.print("multiply");
        System.out.println();
        printMatrix(cMatrix);
        System.out.println();
        return cMatrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
    }
    private static boolean checkIn(int aMatrix[][], int bMatrix[][]){
        if (aMatrix.length > 5 || bMatrix.length > 5) {
            System.out.println("Error: Expected size 5x5!");
            return true;
        }

        for (int i = 0; i < aMatrix.length; i++) {
            for (int j = 0; j < aMatrix.length; j++) {
                if (isNull(aMatrix[i][j])) {
                    System.out.println("Error: Expected size 5x5!");
                    return true;
                }
                if (isNull(bMatrix[i][j])) {
                    System.out.println("Error: Expected size 5x5!");
                    return true;
                }
            };
        }
        return false;
    }
}
