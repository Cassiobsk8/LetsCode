package OrientacaoObjetos.A2.E6;

import OrientacaoObjetos.A2.E3.Empregado;
import OrientacaoObjetos.A2.TipoJornadaEmpregado;

public class Vendedor extends Empregado
{
    float valorVendas;
    float comissao;

    public Vendedor(String nome, int codigoSetor, float salarioBase, float imposto, float valorVendas, float comissao, TipoJornadaEmpregado tipoJornada)
    {
        super(nome, codigoSetor, salarioBase, imposto, tipoJornada);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    @Override
    public float calcularSalario()
    {
        return super.calcularSalario() + (valorVendas * (comissao / 100));
    }

    @Override
    public String toString()
    {
        return super.toString() + "\nValor das vendas: " + valorVendas + "\nComissão: " + comissao + "%";
    }
}
