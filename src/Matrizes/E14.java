package Matrizes;

/*
Fac¸a um programa para gerar automaticamente numeros entre 0 e 99 de uma cartela de ´
bingo. Sabendo que cada cartela devera conter 5 linhas de 5 n ´ umeros, gere estes dados ´
de modo a nao ter n ˜ umeros repetidos dentro das cartelas. O programa deve exibir na ´
tela a cartela gerada.
 */

import java.util.ArrayList;
import java.util.Random;

public class E14
{
    static ArrayList<Integer> used = new ArrayList();
    static Random random = new Random();

    public static void main(String[] args)
    {
        int[][] n = new int[5][5];

        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                n[i][j] = getnextnumber();
            }
        }
        System.out.println("Cartela: ");
        E13.printMatrix(n);
    }

    private static int getnextnumber()
    {
        while (true)
        {
            int number = random.nextInt(100);
            if (!used.contains(number))
            {
                used.add(number);
                return number;
            }
        }
    }

}
