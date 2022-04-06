package logica.Aula3.Exercicios.e10;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero para ver a tabuada de multiplicação");
        int n = scanner.nextInt();

        for (int i = 1; i <= 10; i++)
        {
            System.out.format("%d x %d = %d \n", n, i, n*i);
        }

        scanner.close();
    }
}
