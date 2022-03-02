package OrientacaoObjetos.A2.E6;

import OrientacaoObjetos.A2.TipoJornadaEmpregado;

public class Main
{
    public static void main(String[] args)
    {
        Vendedor vendedor = new Vendedor("João", 123, 1000f, 10, 2000f, 10, TipoJornadaEmpregado.MEIO_PERIODO);

        System.out.println(vendedor.toString());
    }
}
