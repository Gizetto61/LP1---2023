public class Item
{
    private static long IdBase = 0;
    private long Id;
    private String Nome;
    private double Preco;

    public Item(long id, String nome, double preco)
    {
        this.Id = id;
        this.Nome = nome;
        this.Preco = preco;
    }

    public String toString()
    {
        return toString();
    }

    public static long getIdBase()
    {
        return IdBase;
    }

    public static void setIdBase(long idBase)
    {
        IdBase = idBase;
    }

    public long getId()
    {
        return Id;
    }

    public void setId(long id)
    {
        this.Id = id;
    }

    public String getNome()
    {
        return Nome;
    }

    public void setNome(String nome)
    {
        this.Nome = nome;
    }

    public double getPreco()
    {
        return Preco;
    }

    public void setPreco(double preco)
    {
        this.Preco = preco;
    }
}
