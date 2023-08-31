package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "medico_tb")
public class Medico
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column
    private String CRM;
    @Column
    private String Nome;
    @Column
    private Double Custo;

    public Medico(String CRM, String nome, Double custo)
    {
        this.CRM = CRM;
        Nome = nome;
        Custo = custo;
    }

    public Long getId()
    {
        return Id;
    }

    public void setId(Long id)
    {
        Id = id;
    }

    public String getCRM()
    {
        return CRM;
    }

    public void setCRM(String CRM)
    {
        this.CRM = CRM;
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

    @Override
    public String toString()
    {
        return "Medico{" +
                "Id=" + Id +
                ", CRM='" + CRM + '\'' +
                ", Nome='" + Nome + '\'' +
                ", Custo=" + Custo +
                '}';
    }
}
