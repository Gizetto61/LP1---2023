import calendar.Evento;
import calendar.Lembrete;
import calendar.Tarefa;

public class Main
{
    public static void main(String[] args)
    {
        Evento.PerguntarEvento(2000,12,3,"20:30","reunião");
        Tarefa.PerguntarTarefa(2000,12,3,"20:30","reunião");
        Lembrete.PerguntarLembrete(2000,12,3,"20:30","reunião");
    }
}