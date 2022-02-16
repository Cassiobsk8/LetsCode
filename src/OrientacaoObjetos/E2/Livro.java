package OrientacaoObjetos.E2;

public class Livro
{
    String titulo;
    String leitor;
    int paginas;
    int lidas;

    Livro()
    {
    }

    void mostrarProgresso()
    {
        int percentage = (lidas * 100) / paginas;
        System.out.println(leitor + " já leu " + percentage + "% do livro " + titulo);
    }
}
