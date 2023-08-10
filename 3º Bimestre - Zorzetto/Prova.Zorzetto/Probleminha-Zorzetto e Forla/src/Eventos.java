import java.util.Scanner;
public class Eventos
{
    private int Diastart;
    private int Diaend;
    private String Horariostart;
    private String Horarioend;

    public Eventos(int diastart, int diaend, String horariostart, String horarioend)
    {
        this.Diastart = diastart;
        this.Diaend = diaend;
        this.Horariostart = horariostart;
        this.Horarioend = horarioend;
    }

    public int getDiastart()
    {
        return Diastart;
    }

    public void setDiastart(int diastart)
    {
        Diastart = diastart;
    }

    public int getDiaend() {
        return Diaend;
    }

    public void setDiaend(int diaend)
    {
        Diaend = diaend;
    }

    public String getHorariostart()
    {
        return Horariostart;
    }

    public void setHorariostart(String horariostart)
    {
        Horariostart = horariostart;
    }

    public String getHorarioend()
    {
        return Horarioend;
    }

    public void setHorarioend(String horarioend)
    {
        Horarioend = horarioend;
    }

    public static void Pergunta(int diastart, int diaend, String horariostart, String horarioend)
    {
        
        Scanner leia = new Scanner(System.in);
        do
        {
            System.out.println("Bem Vindo a sua Agenda!!");
            System.out.println("Nesse campo vocẽ irá organizar os seus EVENTOS\n""Comece Aqui:");
            System.out.printf("Digite o Dia de INÍCIO do seu evento: ");
            diastart = leia.nextInt();
            System.out.printf("\nDigite o Dia do TÉRMINO do seu evento: ");
            diaend = leia.nextInt();
            System.out.printf("\nDigite o Horário INICIAL do seu evento: ");
            horariostart = leia.nextLine();
            System.out.printf("\nDigite o Horário FINAL do seu evento: ");
            horarioend = leia.nextLine();
        }while()
    }
}