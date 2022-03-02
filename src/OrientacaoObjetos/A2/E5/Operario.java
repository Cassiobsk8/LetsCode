package OrientacaoObjetos.A2.E5;

import OrientacaoObjetos.A2.E3.Empregado;
import OrientacaoObjetos.A2.TipoJornadaEmpregado;

public class Operario extends Empregado
{
    float valorProducao;
    int comissao;

    public Operario(String nome, int codigoSetor, float salarioBase, float imposto, float valorProducao, int comissao, TipoJornadaEmpregado tipoJornada)
    {
        super(nome, codigoSetor, salarioBase, imposto, tipoJornada);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    @Override
    public float calcularSalario()
    {
        return super.calcularSalario() + (valorProducao * ((float) comissao / 100));
    }

    @Override
    public String toString()
    {
        return super.toString() + "Valor producao: " + valorProducao + "\nComissao: " + comissao + "%";
    }
}
