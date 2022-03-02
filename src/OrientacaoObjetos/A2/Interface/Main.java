package OrientacaoObjetos.A2.Interface;

public class Main
{
    public static void main(String[] args)
    {
        //LampadaFluorescente lampadaFluorescente = new LampadaFluorescente();
        //LampadaIncandescente lampadaIncandescente = new LampadaIncandescente();
        Lampada lampadaIncandescente = new Lampada(LampadaType.INCANDESCENTE);
        Lampada lampadaFluorescente = new Lampada(LampadaType.FLUORESCENTE);

        lampadaIncandescente.liga();
        lampadaIncandescente.desliga();

        lampadaFluorescente.desliga();

    }
}
