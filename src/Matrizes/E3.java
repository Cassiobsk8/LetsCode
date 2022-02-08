package Matrizes;

public class E3
{
    public static void main(String[] args)
    {
        int[][] mat = new int[4][4];

        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                mat[i][j] = (i + 1) * (j + 1);
                System.out.format("%d  ", mat[i][j]);
            }
            System.out.println("\n");
        }
    }
}
