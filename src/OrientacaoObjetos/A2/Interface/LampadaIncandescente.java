package OrientacaoObjetos.A2.Interface;

public class LampadaIncandescente implements ILampada
{
    @Override
    public void liga()
    {
        System.out.println("Lampada Incandescente ligada");
    }

    @Override
    public void desliga()
    {
        System.out.println("Lampada Incandescente desligada");
    }
}
