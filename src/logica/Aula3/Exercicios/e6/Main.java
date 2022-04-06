package logica.Aula3.Exercicios.e6;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        for (int i = 0; i < 20; i++)
        {
            if (i==0) System.out.println("Digite uma idade");
            else System.out.println("Digite mais uma idade");
            n += scanner.nextInt();
        }
        System.out.println("A soma das idades é: " + n);
        scanner.close();
    }
}
