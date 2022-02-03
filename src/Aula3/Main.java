package Aula3;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        boolean denovo;
        do
        {
            System.out.println("Informe o valor de X: ");
            float x = scanner.nextInt();
            System.out.println("Informe o valor de Y: ");
            float y = scanner.nextInt();

            //Aula2.Main.metodoIf(scanner, x, y); //diagrama
            Aula2.Main.metodoSwitch(scanner, x, y);
            System.out.println("Efetuar nova conta?");
            denovo = scanner.nextBoolean();
        }
        while(denovo);

        scanner.close();
    }
}
