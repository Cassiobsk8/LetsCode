package Aula3.Exercicios.e7;

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
            n += scanner.nextInt();
        }
        System.out.println("A média das idades é: " + (n/rep));
        scanner.close();
    }
}
