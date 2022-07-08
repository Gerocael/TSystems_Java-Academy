public class Matrix {
    public static void main(String[] args) {
        //int[][] aMatrix = new int[4][];
        int[][] aMatrix = {
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5}};
        int[][] bMatrix = {
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5}};

        int[][] addition = addMatrices(aMatrix, bMatrix);
        int[][] transposed = transpose(aMatrix);
        int[][] multiplied = multiply(aMatrix, bMatrix);

        //print matrix
        printMatrix(aMatrix);
        printMatrix(bMatrix);
    }

    private static int[][] addMatrices(int[][] aMatrix, int[][] bMatrix) {
        int[][] cMatrix = new int[5][4];
        //sucet matic - kazdy prvok s kazdym prvkom
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                cMatrix[i][j] = aMatrix[i][j] + bMatrix[i][j];
            }

        }
        //vysledok bude v matrixC
        printMatrix(cMatrix);
        System.out.println();
        return cMatrix;
    }

    private static int[][] transpose(int[][] matrix) {
        int[][] transposed = new int[5][4];
        //https://cs.wikipedia.org/wiki/Transpozice_matice
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                transposed[i][j] = matrix [j][i];

            }

        }
        //vysledok bude v matrixC
        printMatrix(transposed);
        System.out.println();
        return transposed;
    }

    private static int[][] multiply(int[][] aMatrix, int[][] bMatrix) {
        int[][] cMatrix = new int[5][4];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                cMatrix[i][j] = aMatrix[i][j] * bMatrix[i][j];
            }

        }
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
}