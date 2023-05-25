public class Gastos
{
    private String Nome;
    public double Valor;

    public Gastos(String nome, double valor)
    {
        Nome = nome;
        Valor = valor;
    }

    public static void MudarValor() {
    }

    public String getNome()
    {
        return Nome;
    }

    public void setNome(String nome)
    {
        Nome = nome;
    }

    public double getValor()
    {
        return Valor;
    }

    public void setValor(double valor)
    {
        Valor = valor;
    }

    public static void addNome(String nome)
    {
        addNome("Estudos");
    }

    public static void addValor(double valor)
    {
        addValor(200);
    }
}
