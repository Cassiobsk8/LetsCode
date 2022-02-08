package Matrizes;

public class E12
{
    public static void main(String[] args)
    {
        int[][] m = {{1, 2, 3}, {5, 6, 7}, {9, 10, 11}};

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.print(m[j][i] + " ");
            }
            System.out.println("");
        }
    }
}
