package OrientacaoObjetos.A2.E3;

import OrientacaoObjetos.A2.E1.Pessoa;

public class Empregado extends Pessoa
{
    int codigoSetor;
    float salarioBase;
    float imposto;

    public Empregado(String nome, int codigoSetor, float salarioBase, float imposto)
    {
        super(nome);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public float calcularSalario()
    {
        return salarioBase - (salarioBase * (imposto / 100));
    }

    public String toString()
    {
        return "Nome: " + nome + "\n" + "Codigo do Setor: " + codigoSetor + "\n" + "Salario Base: " + salarioBase + "\n" + "Imposto: " + imposto + "\n" + "Salario Liquido: " + calcularSalario();
    }
}
