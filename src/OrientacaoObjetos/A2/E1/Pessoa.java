package OrientacaoObjetos.A2.E1;

public class Pessoa
{
    public String nome;
    private String endereco;
    private String telefone;

    public Pessoa()
    {
    }

    public Pessoa(String nome, String endereco, String telefone)
    {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public Pessoa(String nome)
    {
        this.nome = nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getNome()
    {
        return nome;
    }

    public void setEndereco(String endereco)
    {
        this.endereco = endereco;
    }

    public String getEndereco()
    {
        return endereco;
    }

    public void setTelefone(String telefone)
    {
        this.telefone = telefone;
    }

    public String getTelefone()
    {
        return telefone;
    }
}
