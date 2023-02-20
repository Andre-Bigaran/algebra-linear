
public class operacaoMatrizes {

    static void printMatriz(int M[][],
                            int linha,
                            int coluna) {

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++)
                System.out.print(M[i][j] + " ");

            System.out.println();
        }
    }

    static void multiMatriz(int lin1,
                            int col1,
                            int A[][],
                            int lin2,
                            int col2,
                            int B[][]) {
        int i, j, k;

        System.out.println("\nMatriz A:");
        printMatriz(A, lin1, col1);
        System.out.println("\nMatriz B:");
        printMatriz(B, lin2, col2);


        int C[][] = new int[lin1][col2];


        for (i = 0; i < lin1; i++) {
            for (j = 0; j < col2; j++) {
                for (k = 0; k < lin2; k++)
                    C[i][j] += A[i][k] * B[k][j];
            }
        }

        System.out.println("\nResultado Matriz:");
        printMatriz(C, lin1, col2);
    }

    public static void main(String[] args) {

        int lin1 = 2, col1 = 3, lin2 = 3, col2 = 2;

        int A[][] = {{3, 1, 3}, {6, 5, 5}};

        int B[][] = {{100, 50}, {50, 100}, {50, 50}};

        multiMatriz(lin1, col1, A, lin2, col2, B);
    }

}