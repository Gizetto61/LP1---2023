public class Lazer extends Gastos
{
    private boolean Importante;
    public Lazer(String nome, double valor, boolean importante)
    {
        super(nome, valor);
        this.Importante = importante;
    }

    public void MudarValor()
    {
        Valor =* 0.05;
    }

}
