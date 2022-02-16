package OrientacaoObjetos.E3;

public class Veiculo
{
    String modelo;
    String marca;
    int ano;
    int velocidadeMaxima;
    String cor;
    float valorFIPE;

    Veiculo()
    {
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
