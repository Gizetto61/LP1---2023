public class Fixo extends Gastos
{
    public Fixo(String nome, double valor)
    {
        super(nome, valor);
    }

    public static void addNome(String nome)
    {
        addNome("Fixo");
    }

    public static void addValor(double valor)
    {
        addValor(1000);
    }
}
