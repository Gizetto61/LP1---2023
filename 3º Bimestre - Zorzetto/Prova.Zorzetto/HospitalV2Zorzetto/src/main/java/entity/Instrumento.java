package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "instrumento_tb")
public class Instrumento
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column
    private String Nome;
    @Column
    private Double Custo;
    @Column
    private String Tipo;

    public Instrumento(String nome, Double custo, String tipo)
    {
        Nome = nome;
        Custo = custo;
        Tipo = tipo;
    }

    public Long getId()
    {
        return Id;
    }

    public void setId(Long id)
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

    public Double getCusto()
    {
        return Custo;
    }

    public void setCusto(Double custo)
    {
        Custo = custo;
    }

    public String getTipo()
    {
        return Tipo;
    }

    public void setTipo(String tipo)
    {
        Tipo = tipo;
    }

    @Override
    public String toString()
    {
        return "Instrumento{" +
                "Id=" + Id +
                ", Nome='" + Nome + '\'' +
                ", Custo=" + Custo +
                ", Tipo='" + Tipo + '\'' +
                '}';
    }
}
