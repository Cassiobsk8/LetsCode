package Matrizes;

public class E7
{
    public static void main(String[] args)
    {
        int[][] m = new int[10][10];

        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                if (i < j) m[i][j] = 2 * i + 7 * j - 2;
                else if (i == j) m[i][j] = (int) (3 * Math.pow(i, 2) - 1);
                else m[i][j] = (int) (4 * Math.pow(i, 3) - 5 * Math.pow(j, 2) + 1);
                System.out.print(m[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
