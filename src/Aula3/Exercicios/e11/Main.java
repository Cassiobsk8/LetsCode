package Aula3.Exercicios.e11;

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
            if (i==0) System.out.println("Digite um numero");
            else System.out.println("Digite mais um numero");
            int x = scanner.nextInt();
            if (x >= 8) n++;
        }
        System.out.println("Dos " + rep + " numeros, " + n + " são maiores que 8");
        scanner.close();
    }
}
