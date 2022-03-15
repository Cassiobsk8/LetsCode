package OrientacaoObjetos.Cantina.enums;

public enum FoodType
{
    LANCHES("Lanches"), COMIDA("Comida"), BEBIDAS("Bebidas");

    private String name;

    FoodType(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public float getDeliveryPrice()
    {
        switch (this)
        {
            case LANCHES:
                return 1.0f;
            case COMIDA:
                return 2.0f;
            case BEBIDAS:
                return 15.0f;
            default:
                return 0.0f;
        }
    }
}
