package Matrizes;

public class E4
{
    public static void main(String[] args)
    {
        int[][] m = {{1, 2, 3, 4}, {5, 6, 20, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int count = 0;
        int c = 0;
        int l = 0;
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                if (m[i][j] > count)
                {
                    count = m[i][j];
                    c = j;
                    l = i;
                }
            }
        }
        System.out.println("linha " + (l + 1) + " coluna " + (c + 1) + " valor " + m[l][c]);
    }
}
