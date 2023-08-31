package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "paciente_tb")
public class Paciente
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column
    private Integer Idade;
    @Column
    private String Nome;

    public Paciente(Integer idade, String nome)
    {
        Idade = idade;
        Nome = nome;
    }

    public Long getId()
    {
        return Id;
    }

    public void setId(Long id)
    {
        Id = id;
    }

    public Integer getIdade()
    {
        return Idade;
    }

    public void setIdade(Integer idade)
    {
        Idade = idade;
    }

    public String getNome()
    {
        return Nome;
    }

    public void setNome(String nome)
    {
        Nome = nome;
    }

    @Override
    public String toString()
    {
        return "Paciente{" +
                "Id=" + Id +
                ", Idade=" + Idade +
                ", Nome='" + Nome + '\'' +
                '}';
    }
}
