package OrientacaoObjetos.Cantina;

import OrientacaoObjetos.Cantina.enums.FoodType;

public class Item
{
    private String name;
    private double price;
    private FoodType foodType;

    Item(String nome, double price, FoodType foodType)
    {
        this.name = nome;
        this.price = price;
        this.foodType = foodType;
    }

    public String getName()
    {
        return this.name;
    }

    public double getPrice()
    {
        return this.price;
    }

    public FoodType getFoodType()
    {
        return this.foodType;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public void setFoodType(FoodType type)
    {
        this.foodType = type;
    }

    public float getDeliveryPrice()
    {
        return this.foodType.getDeliveryPrice();
    }

    public void printItem()
    {
        System.out.println(this.name + " - " + this.price);
    }
}
