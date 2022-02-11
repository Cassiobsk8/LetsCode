package Matrizes;

public class E13
{
    public static void main(String[] args)
    {
        int[][] m = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[][] n = new int[4][4];

        int temp = 0;
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                if (j > temp) n[i][j] = 0;
                else n[i][j] = m[i][j];
            }
            temp++;
        }
        System.out.println("Matrix original: ");
        printMatrix(m);
        System.out.println("Matrix modificada: ");
        printMatrix(n);
    }

    private static void printMatrix(int[][] mat)
    {
        for (int[] ints : mat)
        {
            for (int j = 0; j < mat.length; j++)
            {
                System.out.print(ints[j] + " ");
            }
            System.out.println("");
        }
    }
}
