package Matrizes;

public class E9
{
    public static void main(String[] args)
    {
        int[][] m = {{1, 2, 3}, {5, 6, 7}, {9, 10, 11}};
        int sum = 0;

        int temp = 0;
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                if (j < temp) sum += m[i][j];
            }
            temp++;
        }
        System.out.println(sum);
    }
}
