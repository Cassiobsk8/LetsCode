package OrientacaoObjetos.A2.E4;

import OrientacaoObjetos.A2.E3.Empregado;

public class Administrador extends Empregado
{
    float ajudaDeCusto;

    public Administrador(String nome, int codigoSetor, float salarioBase, float imposto, float ajudaDeCusto)
    {
        super(nome, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public float calcularSalario()
    {
        return super.calcularSalario() + ajudaDeCusto;
    }
}
