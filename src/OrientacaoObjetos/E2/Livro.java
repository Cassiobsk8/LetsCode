package OrientacaoObjetos.E2;

public class Livro
{
    private String titulo;
    private String leitor;
    private int paginas;
    private int lidas;

    Livro()
    {
    }

    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    public void setLeitor(String leitor)
    {
        this.leitor = leitor;
    }

    public void setPaginas(int paginas)
    {
        this.paginas = paginas;
    }

    public void setLidas(int lidas)
    {
        this.lidas = lidas;
    }

    void mostrarProgresso()
    {
        int percentage = (lidas * 100) / paginas;
        System.out.println(leitor + " já leu " + percentage + "% do livro " + titulo);
    }
}
