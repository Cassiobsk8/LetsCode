package Matrizes;

public class E2
{
    public static void main(String[] args)
    {
        int[][] m = new int[5][5];

        int temp = 0;
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                if (j == temp) m[i][j] = 1;
                else m[i][j] = 0;
            }
            temp++;
        }
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                System.out.print(m[i][j]);
            }
            System.out.println("");
        }
    }
}
