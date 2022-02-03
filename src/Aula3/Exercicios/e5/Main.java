package Aula3.Exercicios.e5;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        for (int i = 0; i < 10; i++)
        {
            if (i==0) System.out.println("Digite um numero");
            else System.out.println("Digite mais um numero");
            n += scanner.nextInt();
        }
        System.out.println("A soma dos valores digitados é: " + n);
        scanner.close();
    }
}
