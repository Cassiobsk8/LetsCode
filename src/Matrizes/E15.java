package Matrizes;

/*
Leia uma matriz 5 x 10 que se refere respostas de 10 questoes de m ˜ ultipla escolha, ´
referentes a 5 alunos. Leia tambem um vetor de 10 posic¸ ´ oes contendo o gabarito de ˜
respostas que podem ser a, b, c ou d. Seu programa devera comparar as respostas ´
de cada candidato com o gabarito e emitir um vetor denominado resultado, contendo a
pontuac¸ao correspondente a cada aluno.
 */

import java.util.ArrayList;
import java.util.Random;

public class E15
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
