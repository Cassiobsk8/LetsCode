package logica.Aula3.Exercicios.e13;

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
            if (x >= 0 && x <= 100) n++;
        }
        System.out.println("Dos " + rep + " numeros, " + n + " estão entre 0 e 100");
        scanner.close();
    }
}
