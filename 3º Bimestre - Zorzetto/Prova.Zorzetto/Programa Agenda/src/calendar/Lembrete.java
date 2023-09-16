package calendar;

import java.util.Scanner;

public class Lembrete extends Evento
{
    public Lembrete(int ano, int mes, int dia, String horario, String nome)
    {
        super(ano, mes, dia, horario, nome);
    }

    public static void PerguntarLembrete(int ano, int mes, int dia, String horario, String nome)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gostaria de agendar um LEMBRETE? Digite 1 para Sim e 0 para Não");
        int i = scanner.nextInt();
        if (i == 1)
        {
            int j;
            System.out.println("Qual é o ano do seu lembrete? ");
            ano = scanner.nextInt();
            System.out.println("Qual é o mês do seu lembrete? ");
            mes = scanner.nextInt();
            System.out.println("Qual é o dia do seu lembrete? ");
            dia = scanner.nextInt();
            System.out.println("Qual é o horario do seu lembrete? ");
            horario = scanner.nextLine();
            System.out.println("Qual é o nome do seu lembrete? ");
            nome = scanner.nextLine();
            Lembrete lembrete;
            do {
                lembrete = new Lembrete(ano, mes, dia, horario, nome);
                System.out.println("Deseja continuar? Digite 1 para Sim e 0 para Não");
                j = scanner.nextInt();
            } while (j == 1);

            System.out.println(lembrete);
        }
        else
        {
            System.out.println("Obrigado!!!");
        }
    }
}
