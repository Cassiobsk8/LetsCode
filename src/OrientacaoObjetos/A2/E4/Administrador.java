package OrientacaoObjetos.A2.E4;

import OrientacaoObjetos.A2.E3.Empregado;
import OrientacaoObjetos.A2.TipoJornadaEmpregado;

public class Administrador extends Empregado
{
    float ajudaDeCusto;

    public Administrador(String nome, int codigoSetor, float salarioBase, float imposto, float ajudaDeCusto, TipoJornadaEmpregado tipoJornada)
    {
        super(nome, codigoSetor, salarioBase, imposto, tipoJornada);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public float calcularSalario()
    {
        return super.calcularSalario() + ajudaDeCusto;
    }

    @Override
    public String toString()
    {
        return "Administrador: " + super.toString() + "Ajuda de custo: " + ajudaDeCusto;
    }
}
