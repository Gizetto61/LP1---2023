public abstract class Gastos
{
    private String Nome;
    public double Valor;

    public Gastos(String nome, double valor)
    {
        Nome = nome;
        Valor = valor;
    }

    public abstract void MudarValor();

}
