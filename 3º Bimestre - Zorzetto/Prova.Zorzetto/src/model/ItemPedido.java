package model;

import repository.ExibirInterface;

public class ItemPedido implements ExibirInterface
{
    public static Long idBase;
    private Long Id;
    private String Peca;
    private String Modelo;
    private String Tamanho;
    private double Valor;

    public ItemPedido(String peca, String modelo, String tamanho, double valor, Long IdBase)
    {
        this.Peca = peca;
        this.Modelo = modelo;
        this.Tamanho = tamanho;
        this.Valor = valor;
        IdBase++;
        Id = IdBase;
    }

    public static Long getIdBase()
    {
        return idBase;
    }

    public Long getId()
    {
        return Id;
    }

    public String getPeca()
    {
        return Peca;
    }

    public String getModelo()
    {
        return Modelo;
    }

    public String getTamanho()
    {
        return Tamanho;
    }

    public double getValor()
    {
        return Valor;
    }

    public static void setIdBase(Long idBase)
    {
        ItemPedido.idBase = idBase;
    }

    public void setPeca(String peca)
    {
        Peca = peca;
    }

    public void setModelo(String modelo)
    {
        Modelo = modelo;
    }

    public void setTamanho(String tamanho)
    {
        Tamanho = tamanho;
    }

    public void setValor(double valor)
    {
        Valor = valor;
    }

    @Override
    public void exibir(Boolean completo)
    {

    }
}
