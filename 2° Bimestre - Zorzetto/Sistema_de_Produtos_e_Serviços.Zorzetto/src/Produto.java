public class Produto extends Item
{
    private int Estoque;

    public Produto(long id, String nome, double preco, int estoque)
    {
        super(id, nome, preco);
        this.Estoque = estoque;
    }

    public int getEstoque()
    {
        return Estoque;
    }

    public void setEstoque(int estoque)
    {
        this.Estoque = estoque;
    }

    @Override
    public String toString()
    {
        return "Produto{" +
                "Estoque=" + Estoque +
                '}';
    }

    void comercializa(int Estoque)
    {
        if (Estoque == 0)
        {
            new ComercializarException();
        } else {
            Estoque -= 1;
        }
    }
}
