package OrientacaoObjetos.Cantina;

import OrientacaoObjetos.Cantina.enums.FoodType;

import java.util.HashMap;

public class Menu
{
    public static HashMap<String, Item> MENU = new HashMap<>();
    static final Item burger = new Item("Burger", 30f, FoodType.LANCHES);
    static final Item pizza = new Item("Pizza", 45f, FoodType.LANCHES);
    static final Item fogazza = new Item("Fogazza", 20f, FoodType.LANCHES);
    static final Item pasta = new Item("Pasta", 30f, FoodType.COMIDA);
    static final Item lasanha = new Item("Lasanha", 70f, FoodType.COMIDA);
    static final Item polpetone = new Item("Polpetone", 50f, FoodType.COMIDA);
    static final Item refrigerante = new Item("Refrigerante", 5f, FoodType.BEBIDAS);
    static final Item suco = new Item("Suco", 7f, FoodType.BEBIDAS);
    static final Item vinho = new Item("Vinho", 50f, FoodType.BEBIDAS);

    static
    {
        MENU.put(burger.getName(), burger);
        MENU.put(pizza.getName(), pizza);
        MENU.put(fogazza.getName(), fogazza);
        MENU.put(pasta.getName(), pasta);
        MENU.put(lasanha.getName(), lasanha);
        MENU.put(polpetone.getName(), polpetone);
        MENU.put(refrigerante.getName(), refrigerante);
        MENU.put(suco.getName(), suco);
        MENU.put(vinho.getName(), vinho);
    }

    static void printMenu()
    {
        for (FoodType foodType : FoodType.values())
        {
            System.out.println(foodType.getName() + " :");
            for (Item item : MENU.values())
            {
                if (item.getFoodType() == foodType)
                {
                    System.out.print("- ");
                    item.printItem();
                }
            }
        }
    }
}
