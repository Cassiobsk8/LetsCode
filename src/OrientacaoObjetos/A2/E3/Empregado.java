package OrientacaoObjetos.A2.E3;

import OrientacaoObjetos.A2.E1.Pessoa;
import OrientacaoObjetos.A2.TipoJornadaEmpregado;

public class Empregado extends Pessoa
{
    int codigoSetor;
    float salarioBase;
    float imposto;
    TipoJornadaEmpregado tipoJornada;

    public Empregado(String nome, int codigoSetor, float salarioBase, float imposto, TipoJornadaEmpregado tipoJornada)
    {
        super(nome);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
        this.tipoJornada = tipoJornada;
    }

    public float calcularSalario()
    {
        return salarioBase - (salarioBase * (imposto / 100)) + bonusPorSetor();
    }

    private float bonusPorSetor()
    {
        switch (codigoSetor)
        {
            case 1:
                return 0.05f * salarioBase;
            case 2:
                return 0.1f * salarioBase;
            case 3:
                return 0.2f * salarioBase;
            default:
                System.out.println("Codigo do setor invalido");
                return 0f;
        }
    }

    // Método que retorna os valores de cada atributo.
    @Override
    public String toString()
    {
        return "Nome: " + nome + "\n" + "Codigo do Setor: " + codigoSetor + "\n" + "Salario Base: " + salarioBase + "\n" + "Imposto: " + imposto + "\n" + "Salario Liquido: " + calcularSalario() + "\n" + "Tipo de Jornada: " + tipoJornada.getDescricao();
    }
}
