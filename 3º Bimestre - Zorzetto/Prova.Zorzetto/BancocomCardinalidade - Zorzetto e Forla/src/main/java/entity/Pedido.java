package entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Pedido
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @OneToMany
    @JoinColumn
    private Pessoa pessoa;
    @ManyToMany
    @JoinColumn
    private List<Produtos> produtos;

    public Pedido(Pessoa pessoa, List<Produtos> produtos)
    {
        this.pessoa = pessoa;
        this.produtos = produtos;
    }

    public int getId()
    {
        return Id;
    }

    public void setId(int id)
    {
        Id = id;
    }

    public Pessoa getPessoa()
    {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa)
    {
        this.pessoa = pessoa;
    }

    public List<Produtos> getProdutos()
    {
        return produtos;
    }

    public void setProdutos(List<Produtos> produtos)
    {
        this.produtos = produtos;
    }

    @Override
    public String toString()
    {
        return "Pedido{" +
                "Id=" + Id +
                ", pessoa=" + pessoa +
                ", produtos=" + produtos +
                '}';
    }
}
