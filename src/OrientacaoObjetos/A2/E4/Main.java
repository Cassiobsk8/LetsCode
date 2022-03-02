package OrientacaoObjetos.A2.E4;

import OrientacaoObjetos.A2.TipoJornadaEmpregado;

public class Main
{
    public static void main(String[] args)
    {
        Administrador administrador = new Administrador("João", 123, 1000f, 10, 200f, TipoJornadaEmpregado.MEIO_PERIODO);

        System.out.println(administrador.toString());
    }
}
