package logica.Aula2;

import logica.Aula1.Calculadora;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor de X: ");
        float x = scanner.nextInt();
        System.out.println("Informe o valor de Y: ");
        float y = scanner.nextInt();

        metodoIf(scanner, x, y); //diagrama
        //metodoSwitch(scanner, x, y);

        scanner.close();
    }

    public static void metodoIf(Scanner scanner, float x, float y)
    {
        float valor;
        String op;
        System.out.println("Somar?: true/false");
        if (scanner.nextBoolean())
        {
            op = "+";
            valor = Calculadora.soma(x, y);
        } else
        {
            System.out.println("subtrair?: true/false");
            if (scanner.nextBoolean())
            {
                op = "-";
                valor = Calculadora.sub(x, y);
            } else
            {
                System.out.println("multiplicar?: true/false");
                if (scanner.nextBoolean())
                {
                    op = "*";
                    valor = Calculadora.mult(x, y);
                } else
                {
                    System.out.println("dividir?: true/false");
                    if (scanner.nextBoolean())
                    {
                        op = "/";
                        valor = Calculadora.div(x, y);
                    } else
                    {
                        System.out.println("Não implementado");
                        return;
                    }
                }
            }
        }

        System.out.format("%.1f %s %.1f = %.1f", x, op, y, valor);
    }

    public static void metodoSwitch(Scanner scanner, float x, float y)
    {
        System.out.println("Selecione o modo (1 - somar, 2 - subtrair, 3 - multiplicar ou 4 - dividir): ");
        int modo = scanner.nextInt();

        float valor;
        String op;

        switch (modo)
        {
            case 1:
                op = "+";
                valor = Calculadora.soma(x, y);
                break;
            case 2:
                op = "-";
                valor = Calculadora.sub(x, y);
                break;
            case 3:
                op = "*";
                valor = Calculadora.mult(x, y);
                break;
            case 4:
                op = "/";
                valor = Calculadora.div(x, y);
                break;
            default:
                System.out.println("Não implementado");
                return;
        }

        System.out.format("%.1f %s %.1f = %.1f\n", x, op, y, valor);
    }
}
