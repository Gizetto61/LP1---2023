package calendar;

import java.util.Scanner;

public class Tarefa extends Evento
{
    public Tarefa(int ano, int mes, int dia, String horario, String nome)
    {
        super(ano, mes, dia, horario, nome);
    }

    public static void PerguntarTarefa(int ano, int mes, int dia, String horario, String nome)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gostaria de agendar um Tarefa? Digite 1 para Sim e 0 para Não\"");
        int i = scanner.nextInt();
        if (i == 1)
        {
            int j;
            System.out.println("Qual é o ano da sua tarefa? ");
            ano = scanner.nextInt();
            System.out.println("Qual é o mês da sua tarefa? ");
            mes = scanner.nextInt();
            System.out.println("Qual é o dia da sua tarefa? ");
            dia = scanner.nextInt();
            System.out.println("Qual é o horario da sua tarefa? ");
            horario = scanner.nextLine();
            System.out.println("Qual é o nome da sua tarefa? ");
            nome = scanner.nextLine();
            Tarefa tarefa;
            do {
                tarefa = new Tarefa(ano, mes, dia, horario, nome);
                System.out.println("Deseja continuar? Digite 1 para Sim e 0 para Não");
                j = scanner.nextInt();
            } while (j == 1);

            System.out.println(tarefa);
        }
        else
        {
            System.out.println("Obrigado!!!");
        }
    }
}
