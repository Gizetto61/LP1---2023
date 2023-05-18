public abstract class Variável extends Gastos
{
    private double Tempomeses;

    public Variável(String nome, double valor, double tempomeses)
    {
        super(nome, valor);
        Tempomeses = tempomeses;
    }
}
