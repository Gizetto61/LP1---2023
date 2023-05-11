public class Dono
{
    private String Nome;
    private long CPF;

    public Dono(String nome, long CPF)
    {
        this.Nome = nome;
        this.CPF = CPF;
    }

    public String getNome()
    {
        return Nome;
    }

    public void setNome(String nome)
    {
        Nome = nome;
    }

    public long getCPF()
    {
        return CPF;
    }

    public void setCPF(long CPF)
    {
        this.CPF = CPF;
    }
}
