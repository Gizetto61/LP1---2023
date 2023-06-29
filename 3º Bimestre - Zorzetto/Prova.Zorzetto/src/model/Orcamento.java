package model;

import repository.ExibirInterface;

import java.util.List;

public class Orcamento implements ExibirInterface
{
    private static Long IdBase;
    private Long Id;
    private List<ItemPedido> Itens;
    private Double ValorTotal;

    public Orcamento()
    {
        IdBase++;
        Id = IdBase;
    }

    public static Long getIdBase()
    {
        return IdBase;
    }

    public Long getId()
    {
        return Id;
    }

    public List<ItemPedido> getItens()
    {
        return Itens;
    }

    public Double getValorTotal()
    {
        return ValorTotal;
    }

    @Override
    public void exibir(Boolean completo)
    {
            
    }
}

