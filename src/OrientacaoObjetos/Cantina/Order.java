package OrientacaoObjetos.Cantina;

import OrientacaoObjetos.Cantina.exceptions.FoodException;

import java.util.ArrayList;
import java.util.List;

public class Order
{
    List<Item> orders = new ArrayList<>();

    Order()
    {
    }

    public void add(Item item) throws FoodException
    {
        if (item == null) throw new FoodException("Item não encontrado");
        orders.add(item);
    }

    public void remove(Item item)
    {
        orders.remove(item);
    }

    public List<Item> getOrders()
    {
        return orders;
    }

    public double getTotal()
    {
        double total = 0;
        for (Item item : orders)
        {
            total += (item.getPrice() + item.getDeliveryPrice());
        }
        return total;
    }
}
