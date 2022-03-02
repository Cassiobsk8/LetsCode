package OrientacaoObjetos.A2.Interface;

public class LampadaFluorescente implements ILampada
{
    @Override
    public void liga()
    {
        System.out.println("Lampada Fluorescente ligada");
    }

    @Override
    public void desliga()
    {
        System.out.println("Lampada Fluorescente desligada");
    }
}
