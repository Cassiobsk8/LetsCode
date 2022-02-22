package OrientacaoObjetos.A2.E2;

import OrientacaoObjetos.A2.E1.Pessoa;

public class Fornecedor extends Pessoa
{
    int valorCredito = 0;
    int valorDivida = 0;

    public Fornecedor()
    {
        super();
    }

    public void setValorCredito(int valorCredito)
    {
        this.valorCredito = valorCredito;
    }

    public int getValorCredito()
    {
        return valorCredito;
    }

    public void setValorDivida(int valorDivida)
    {
        this.valorDivida = valorDivida;
    }

    public int getValorDivida()
    {
        return valorDivida;
    }

    public int obterSaldo()
    {
        return valorCredito - valorDivida;
    }
}
