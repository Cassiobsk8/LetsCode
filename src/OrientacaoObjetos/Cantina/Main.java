package OrientacaoObjetos.Cantina;

public class Main
{
    public static void main(String[] args)
    {
        Order order = new Order();
        System.out.println("Seja bem Vindo à Cantina Codifichiamo");
        System.out.println("--------------------------------------");
        Front.printMainMenu(order);
    }
}
