package Aula3.Exercicios.e15;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;

        while (true)
        {
            System.out.println("digite um numero: ");
            int digitado = scanner.nextInt();
            if (digitado < 0) break;
            soma += digitado;
        }
        System.out.println("A soma dos valores digitados é: " + soma);

        scanner.close();
    }
}
