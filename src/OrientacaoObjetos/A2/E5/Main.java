package OrientacaoObjetos.A2.E5;

import OrientacaoObjetos.A2.TipoJornadaEmpregado;

public class Main
{
    public static void main(String[] args)
    {
        Operario operario = new Operario("João", 123, 1000f, 10, 2000f, 10, TipoJornadaEmpregado.PERIODO_COMPLETO);

        System.out.println(operario.toString());
    }
}
