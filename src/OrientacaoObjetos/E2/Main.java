package OrientacaoObjetos.E2;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Cadastre o Livre para ver o progresso:");
        Livro livro = new Livro();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome do livro:");
        livro.titulo = scanner.nextLine();
        System.out.println("Nome do leitor:");
        livro.leitor = scanner.nextLine();
        System.out.println("Numero de páginas:");
        livro.paginas = scanner.nextInt();
        System.out.println("Paginas lidas:");
        livro.lidas = scanner.nextInt();

        livro.mostrarProgresso();
    }
}
