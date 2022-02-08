package Matrizes;

public class E5
{
    public static void main(String[] args)
    {
        int[][] m = {{1, 2, 3, 4, 5}, {5, 6, 20, 8, 1}, {9, 10, 11, 12, 7}, {13, 14, 15, 16, 11}, {14, 5, 8, 24, 3}};
        int n = 9;
        boolean found = false;
        int c = 0;
        int l = 0;
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                if (m[i][j] == n)
                {
                    found = true;
                    c = j;
                    l = i;
                    break;
                }
            }
        }

        if (found) System.out.println("linha " + (l + 1) + " coluna " + (c + 1) + " valor " + m[l][c]);
        else System.out.println("nao encontrado");
    }
}
