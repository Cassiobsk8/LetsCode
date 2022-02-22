package OrientacaoObjetos.A2.E2;

public class Main
{
    public static void main(String[] args)
    {
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setNome("Fornecedor");
        fornecedor.setValorCredito(5000);
        fornecedor.setValorDivida(1000);
        System.out.println(fornecedor.obterSaldo());
    }
}
