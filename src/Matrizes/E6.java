package Matrizes;

public class E6
{
    public static void main(String[] args)
    {
        int[][] m = {{1, 2, 3, 4}, {9, 10, 11, 12}, {13, 14, 15, 16}, {14, 5, 8, 24}};
        int[][] n = {{4, 1, 5, 3}, {2, 55, 64, 1}, {15, 11, 18, 99}, {11, 5, 4, 224}};
        int[][] x = new int[4][4];

        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                x[i][j] = Math.max(m[i][j], n[i][j]);
                System.out.print(x[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
