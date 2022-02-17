package OrientacaoObjetos.E3;

public class Veiculo
{
    private String modelo;
    private String marca;
    private int ano;
    private int velocidadeMaxima;
    private String cor;
    private float valorFIPE;

    Veiculo()
    {
    }

    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    public void setMarca(String marca)
    {
        this.marca = marca;
    }

    public void setAno(int ano)
    {
        this.ano = ano;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima)
    {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void setCor(String cor)
    {
        this.cor = cor;
    }

    public void setValorFIPE(float valorFIPE)
    {
        this.valorFIPE = valorFIPE;
    }

    void imprimirInfo()
    {
        System.out.println("Informações do Carro: Modelo: " + modelo + " Marca: " + marca + " Ano: " + ano);
    }

    void adicionarVelocidade(int velocidade)
    {
        if (velocidade > velocidadeMaxima) System.out.println("Velocidade acima do valor permitido para o veículo");
        else System.out.println("Estou acelerando " + velocidade + " km/h");
    }

    void frear()
    {
        System.out.println("Estou freando o veículo " + modelo);
    }
}
