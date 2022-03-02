package OrientacaoObjetos.A2.Interface;

public class Lampada implements ILampada
{
    boolean estaLigada;
    LampadaType tipo;

    Lampada(LampadaType tipo)
    {
        this.tipo = tipo;
    }

    @Override
    public void liga()
    {
        if (estaLigada)
        {
            System.out.println("Lampada " + tipo.toString() + " já está ligada");
            return;
        }
        estaLigada = true;
        System.out.println("Lampada " + tipo.toString() + " ligada");
    }

    @Override
    public void desliga()
    {
        if (!estaLigada)
        {
            System.out.println("Lampada " + tipo.toString() + " já está desligada");
            return;
        }
        estaLigada = false;
        System.out.println("Lampada " + tipo.toString() + " Desligada");
    }
}
