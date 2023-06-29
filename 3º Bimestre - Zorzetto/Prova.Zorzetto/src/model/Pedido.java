package model;

import repository.ExibirInterface;

public class Pedido extends Orcamento implements ExibirInterface
{
    private String DataEntrega;
    private Boolean Entregue = false;

    public Pedido(String dataEntrega)
    {
        this.DataEntrega = dataEntrega;
    }

    public String getDataEntrega()
    {
        return DataEntrega;
    }

    public void setDataEntrega(String dataEntrega)
    {
        DataEntrega = dataEntrega;
    }

    public Boolean getEntregue()
    {
        return Entregue;
    }

    public void setEntregue(Boolean entregue)
    {
        Entregue = entregue;
    }

    @Override
    public void exibir(Boolean completo)
    {

    }
}
