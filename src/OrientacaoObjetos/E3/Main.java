package OrientacaoObjetos.E3;

public class Main
{
    public static void main(String[] args)
    {
        Veiculo carro = new Veiculo();
        carro.setModelo("Civic");
        carro.setMarca("Honda");
        carro.setAno(2007);
        carro.setVelocidadeMaxima(240);
        carro.setCor("Cinza");
        carro.setValorFIPE(35000f);

        carro.imprimirInfo();

        carro.adicionarVelocidade(100);

        carro.adicionarVelocidade(250);

        carro.frear();
    }
}
