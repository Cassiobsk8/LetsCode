package OrientacaoObjetos.E3;

public class Main
{
    public static void main(String[] args)
    {
        Veiculo carro = new Veiculo();
        carro.modelo = "Civic";
        carro.marca = "Honda";
        carro.ano = 2007;
        carro.velocidadeMaxima = 240;
        carro.cor = "Cinza";
        carro.valorFIPE = 35000f;

        carro.imprimirInfo();

        carro.adicionarVelocidade(100);

        carro.adicionarVelocidade(250);

        carro.frear();
    }
}
