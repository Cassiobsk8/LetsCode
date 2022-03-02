package OrientacaoObjetos.A2.E3;

import OrientacaoObjetos.A2.TipoJornadaEmpregado;

public class Main
{
    public static void main(String[] args)
    {
        Empregado empregado = new Empregado("João", 123, 1000.0f, 10, TipoJornadaEmpregado.PERIODO_COMPLETO);

        System.out.println(empregado.toString());
    }
}
