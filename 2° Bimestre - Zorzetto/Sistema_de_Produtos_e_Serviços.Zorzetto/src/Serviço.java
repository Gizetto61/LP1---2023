public class Serviço extends Item
{
    private Boolean Disponivel;

    public Serviço(long id, String nome, double preco, Boolean disponivel)
    {
        super(id, nome, preco);
        this.Disponivel = disponivel;
    }

    public void liberar()
    {

    }

    public Boolean getDisponivel()
    {
        return Disponivel;
    }

    public void setDisponivel(Boolean disponivel)
    {
        this.Disponivel = disponivel;
    }

    @Override
    public String toString()
    {
        return "Serviço{" +
                "Disponivel=" + Disponivel +
                '}';
    }

    void comercializa(boolean Disponivel)
    {
        if (Disponivel != false)
            Disponivel = true;
        else
            new ComercializarException();
    }
}
