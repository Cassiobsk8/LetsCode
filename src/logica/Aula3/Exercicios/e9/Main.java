package logica.Aula3.Exercicios.e9;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int menorIdade = 0;
        String[] nomes = new String[10];
        int[] idades = new int[10];
        for (int i = 0; i < 10; i++)
        {
            if (i==0) System.out.println("Digite um nome");
            else System.out.println("Digite mais um nome");
            nomes[i] = scanner.nextLine();
            System.out.println("Digite a idade");
            idades[i] = scanner.nextInt();
            if (idades[i] < menorIdade || i == 0)
            {
                n = i;
                menorIdade = idades[i];
            }
        }
        System.out.println("A pessoa mais jovem se chama: " + nomes[n]);
        scanner.close();
    }
}
