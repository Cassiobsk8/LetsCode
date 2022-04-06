package logica.Aula3.Exercicios.e14;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int zerocem = 0;
        int cemduzentos = 0;
        int maiores  = 0;
        int rep = 20;
        for (int i = 0; i < rep; i++)
        {
            if (i==0) System.out.println("Digite um numero");
            else System.out.println("Digite mais um numero");
            int x = scanner.nextInt();
            if (x >= 0 && x <= 100) zerocem++;
            else if (x >= 101 && x <= 200) cemduzentos++;
            else if (x > 200) maiores++;
        }
        System.out.println("Dos " + rep + " numeros, " + zerocem + " estão entre 0 e 100, " +
                cemduzentos + " estão entre 101 e 200 e " + maiores + " são maiores que 200");
        scanner.close();
    }
}
