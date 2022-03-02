package OrientacaoObjetos.A2.Interface;

public enum LampadaType
{
    FLUORESCENTE, INCANDESCENTE;

    public String toString()
    {
        switch (this)
        {
            case FLUORESCENTE:
                return "Fluorescente";
            case INCANDESCENTE:
                return "Incandescente";
            default:
                return "";
        }
    }
}
