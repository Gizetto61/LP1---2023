package calendar;

import java.util.Scanner;

public class Evento
{
    private int Ano;
    private int Mes;
    private int Dia;
    private String Horario;
    private String Nome;

    public Evento(int ano, int mes, int dia, String horario, String nome)
    {
        this.Ano = ano;
        this.Mes = mes;
        this.Dia = dia;
        this.Horario = horario;
        this.Nome = nome;
    }

    public int getAno()
    {
        return Ano;
    }

    public void setAno(int ano)
    {
        Ano = ano;
    }

    public int getMes()
    {
        return Mes;
    }

    public void setMes(int mes)
    {
        Mes = mes;
    }

    public int getDia()
    {
        return Dia;
    }

    public void setDia(int dia)
    {
        Dia = dia;
    }

    public String getHorario()
    {
        return Horario;
    }

    public void setHorario(String horario)
    {
        Horario = horario;
    }

    public String getNome()
    {
        return Nome;
    }

    public void setNome(String nome)
    {
        Nome = nome;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "Ano=" + Ano +
                ", Mes=" + Mes +
                ", Dia=" + Dia +
                ", Horario='" + Horario + '\'' +
                ", Nome='" + Nome + '\'' +
                '}';
    }

    public static void PerguntarEvento(int ano, int mes, int dia, String horario, String nome)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo a sua Agenda!!!");
        System.out.println("Gostaria de agendar um EVENTO? Digite 1 para Sim e 0 para Não");
        int i = scanner.nextInt();
        if (i == 1)
        {
            int j;
            System.out.println("Qual é o ano do seu evento? ");
            ano = scanner.nextInt();
            System.out.println("Qual é o mês do seu evento? ");
            mes = scanner.nextInt();
            System.out.println("Qual é o dia do seu evento? ");
            dia = scanner.nextInt();
            System.out.println("Qual é o horario do seu evento? ");
            horario = scanner.nextLine();
            System.out.println("Qual é o nome do seu evento? ");
            nome = scanner.nextLine();
            Evento evento;
            do {
                evento = new Evento(ano, mes, dia, horario, nome);
                System.out.println("Deseja continuar? Digite 1 para Sim e 0 para Não");
                j = scanner.nextInt();
            } while (j == 1);

            System.out.println(evento);
        }
        else
        {
            System.out.println("Obrigado!!!");
        }
    }
}
