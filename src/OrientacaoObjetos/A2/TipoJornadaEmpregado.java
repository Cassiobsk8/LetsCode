package OrientacaoObjetos.A2;

public enum TipoJornadaEmpregado
{
    PERIODO_COMPLETO("Periodo Completo"), MEIO_PERIODO("Meio Periodo");

    private String descricao;

    TipoJornadaEmpregado(String descricao)
    {
        this.descricao = descricao;
    }

    public String getDescricao()
    {
        return descricao;
    }
}
