package OrientacaoObjetos.A2.E6;

import OrientacaoObjetos.A2.E3.Empregado;

public class Vendedor extends Empregado
{
    float valorVendas;
    float comissao;

    public Vendedor(String nome, int codigoSetor, float salarioBase, float imposto, float valorVendas, float comissao)
    {
        super(nome, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    @Override
    public float calcularSalario()
    {
        return super.calcularSalario() + (valorVendas * (comissao / 100));
    }
}
