package Aula3.Exercicios.e3;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva seu nome");
        String nome = scanner.nextLine();
        for (int i = 0; i < 10; i++)
        {
            System.out.println(nome);
        }
        scanner.close();
    }
}
