public class Variável extends Gastos
{
    private double Tempomeses;

    public Variável(String nome, double valor, double tempomeses) {
        super(nome, valor);
        Tempomeses = tempomeses;
    }

    public double getTempomeses()
    {
        return Tempomeses;
    }

    public void setTempomeses(double tempomeses)
    {
        Tempomeses = tempomeses;
    }

    public static void addNome(String nome)
    {
        addNome("variável");
    }

    public static void addValor(double valor)
    {
        addValor(900);
    }

    public static void addTempomeses(double tempomeses)
    {
        addTempomeses(10);
    }
}
