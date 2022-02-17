package OrientacaoObjetos.E1;

public class Funcionario
{
    private String nome;
    private String sobrenome;
    private String cidade;
    private String estado;
    private int horasTrabalhadas;
    private float valorPorHora;

    Funcionario()
    {
    }

    Funcionario(String nome, String sobrenome, String cidade, String estado, float valorPorHora)
    {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cidade = cidade;
        this.estado = estado;
        this.valorPorHora = valorPorHora;
    }

    void exibirNomeCompleto()
    {
        System.out.println(nome + " " + sobrenome);
    }

    void adicionarHorasTrabalhadas(int horasTrabalhadas)
    {
        this.horasTrabalhadas += horasTrabalhadas;
    }

    void alterarValorPorHora(float valorPorHora)
    {
        this.valorPorHora = valorPorHora;
        System.out.println(horasTrabalhadas);
    }

    void imprimirSalario()
    {
        float sal = horasTrabalhadas * valorPorHora;

        System.out.println("Salario: " + sal);
    }

}
