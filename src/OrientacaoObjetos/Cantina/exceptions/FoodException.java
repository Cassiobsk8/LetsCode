package OrientacaoObjetos.Cantina.exceptions;

public class FoodException extends Exception
{
    public FoodException(String message)
    {
        super(message);
    }

    @Override
    public String getMessage()
    {
        return "FoodException: " + super.getMessage();
    }
}
