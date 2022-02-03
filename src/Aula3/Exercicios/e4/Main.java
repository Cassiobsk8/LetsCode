package Aula3.Exercicios.e4;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva seu nome");
        String nome = scanner.nextLine();
        System.out.println("Digite um numero");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++)
        {
            System.out.println(nome);
        }
        scanner.close();
    }
}
