package OrientacaoObjetos.E1;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Informe o nome");
        String nome = s.nextLine();
        System.out.println("Informe o sobrenome");
        String sobrenome = s.nextLine();
        System.out.println("Informe a cidade");
        String cidade = s.nextLine();
        System.out.println("Informe o estado");
        String estado = s.nextLine();
        System.out.println("Informe o valor da hora trabalhada");
        float valor = s.nextFloat();

        Funcionario funcionario = new Funcionario(nome, sobrenome, cidade, estado, valor);

        while (true)
        {
            System.out.println("Selecione uma opção");

            System.out.println("1 - Incrementar Horas Trabalhadas");
            System.out.println("2 - Substituir o valor por hora do funcionário");
            System.out.println("3 - Calcular o salário do funcionário no final do mês");
            System.out.println("4 - Sair");

            int op = s.nextInt();

            switch (op)
            {
                case 1:
                    System.out.println("Digite a quantidade de horas para adicionar:");
                    funcionario.adicionarHorasTrabalhadas(s.nextInt());
                    break;
                case 2:
                    System.out.println("Digite o novo valor por hora");
                    funcionario.alterarValorPorHora(s.nextFloat());
                    break;
                case 3:
                    funcionario.imprimirSalario();
                    break;
                case 4:
                    System.out.println("Encerrando...");
                    return;
            }

        }

    }
}
