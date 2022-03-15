package OrientacaoObjetos.Cantina;

import OrientacaoObjetos.Cantina.exceptions.FoodException;

import java.util.Random;
import java.util.Scanner;

public class Front
{
    static final Scanner scanner = new Scanner(System.in);

    public static void printMainMenu(Order order)
    {
        while (true)
        {
            System.out.println("Escolha uma opção");
            System.out.println("1 - Ver Cardápio");
            System.out.println("2 - Sair");

            System.out.println("Digite a opção desejada: ");
            int option = scanner.nextInt();
            if (option == 1)
            {
                Menu.printMenu();
                printMenuOptions(order);
                return;
            } else if (option == 2)
            {
                System.out.println("Obrigado por usar o nosso sistema!");
                return;
            }
            System.out.println("Opção inválida");
        }

    }

    public static void printMenuOptions(Order order)
    {
        while (true)
        {

            System.out.println("Digite o nome da opção desejada: ");
            String option = scanner.next();
            try
            {
                order.add(Menu.MENU.get(option));
                System.out.println(option + " Adicionado ao carrinho");
            } catch (FoodException e)
            {
                System.out.println(e.getMessage());
            }
            if (printCheckout(order)) return;

        }
    }

    public static boolean printCheckout(Order order)
    {
        while (true)
        {
            System.out.println("Deseja finalizar a compra? (S/N)");
            String option = scanner.next();
            if (option.equalsIgnoreCase("s"))
            {
                System.out.println("Obrigado pelo pedido – Conte conosco!");
                if (!order.getOrders().isEmpty())
                {
                    System.out.println("Seu pedido é: " + new Random().nextInt(1000000));
                    System.out.println("Total do pedido: " + order.getTotal());
                }
                return true;
            } else if (option.equalsIgnoreCase("n")) return false;
            else System.out.println("Opção inválida");
        }
    }
}
