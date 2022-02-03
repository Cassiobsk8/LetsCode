package Aula3.Exercicios.e8;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int rep = 20;
        for (int i = 0; i < rep; i++)
        {
            if (i==0) System.out.println("Digite uma idade");
            else System.out.println("Digite mais uma idade");
            int x = scanner.nextInt();
            if (x >= 18) n++;
        }
        System.out.println("Das " + rep + " pessoas, " + n + " são maiores de idade");
        scanner.close();
    }
}
