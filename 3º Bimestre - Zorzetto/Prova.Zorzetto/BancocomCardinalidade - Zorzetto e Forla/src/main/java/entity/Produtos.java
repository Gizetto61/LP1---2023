package entity;


import jakarta.persistence.*;

@Entity
@Table
public class Produtos
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column
    private String Nome;
    @Column
    private double Preco;

    public Produtos(String nome, double preco)
    {
        Nome = nome;
        Preco = preco;
    }

    public int getId()
    {
        return Id;
    }

    public void setId(int id)
    {
        Id = id;
    }

    public String getNome()
    {
        return Nome;
    }

    public void setNome(String nome)
    {
        Nome = nome;
    }

    public double getPreco()
    {
        return Preco;
    }

    public void setPreco(double preco)
    {
        Preco = preco;
    }


    @Override
    public String toString()
    {
        return "Produtos{" +
                "Id=" + Id +
                ", Nome='" + Nome + '\'' +
                ", Preco=" + Preco +
                '}';
    }
}
