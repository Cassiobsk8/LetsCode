package Matrizes;

public class E1
{
    public static void main(String[] args)
    {
        int[][] m = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int count = 0;
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                if (m[i][j] > 10) count++;
            }
        }
        System.out.println(count);
    }
}
