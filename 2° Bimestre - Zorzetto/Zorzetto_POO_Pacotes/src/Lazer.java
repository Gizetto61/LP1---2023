public class Lazer extends Gastos
{
    private int Importante;
    public Lazer(String nome, double valor, int importante)
    {
        super(nome, valor);
        this.Importante = importante;
    }

    public void MudarValor(double Valor)
    {
        Valor = Valor * 0.05;
    }

    public int isImportante()
    {
        return Importante;
    }

    public void setImportante(int importante)
    {
        Importante = importante;
    }

    public static void addNome(String nome)
    {
        addNome("Viagem");
    }

    public static void addValor(double valor) {
        addValor(5000);
        MudarValor();
    }

    private static void addimportante(int i) 
    {
        addimportante(1);
    }
}
