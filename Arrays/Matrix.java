package arrays;

public class Matrix {
    public static void main(String[] args) {
        //int[][] aMatrix = new int[4][];
        int[][] aMatrix = {{1, 2, 3, 4},{1, 2, 3, 4, 5}};
        int[][] bMatrix = {{1, 2, 3, 4},{1, 2, 3, 4, 5}};
        //{null, ..., null}
        //{{0, 0, 0, 0, 0}, ..., {0, 0, 0, 0, 0}}

        int[][] addition = addMatrices(aMatrix, bMatrix);
        int[][] transposed = transpose(aMatrix);
        int[][] multiplied = multiply(aMatrix, bMatrix);

        //print matrix
        printMatrix(aMatrix);
        printMatrix(bMatrix);
    }

    private static int[][] addMatrices(int[][] aMatrix, int[][] bMatrix) {
        int[][] cMatrix = new int[4][5];
        //sucet matic - kazdy prvok s kazdym prvkom
        for (int i = 0; i < aMatrix.length; i++) {
            for (int j = 0; j < bMatrix.length; j++) {
                cMatrix[i][j] = aMatrix[i][j] + bMatrix[i][j];
            }

        }
        //vysledok bude v matrixC
        printMatrix(cMatrix);
        return cMatrix;
    }

    private static int[][] transpose(int[][] matrix) {
        int[][] transposed = new int[4][5];
        //https://cs.wikipedia.org/wiki/Transpozice_matice
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                transposed[i][j] = matrix [j][i];

            }

        }
        //vysledok bude v matrixC
        printMatrix(transposed);
        return transposed;
    }

    private static int[][] multiply(int[][] aMatrix, int[][] bMatrix) {
        int[][] cMatrix = new int[4][5];
        for (int i = 0; i < aMatrix.length; i++) {
            for (int j = 0; j < bMatrix.length; j++) {
                cMatrix[i][j] = aMatrix[i][j] * bMatrix[i][j];
            }

        }
        printMatrix(cMatrix);
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
}