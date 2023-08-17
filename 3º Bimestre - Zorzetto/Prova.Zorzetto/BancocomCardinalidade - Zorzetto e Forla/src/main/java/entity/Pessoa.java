package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "pessoa")
public class Pessoa
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int Id;
    @Column
    private String Nome;
    @Column
    private String Sobrenome;
    @Column
    private String Email;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco id")
    private Endereco endereco;


    public Pessoa(String nome, String sobrenome, String email, Endereco endereco)
    {
        Nome = nome;
        Sobrenome = sobrenome;
        Email = email;
        this.endereco = endereco;
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

    public String getSobrenome()
    {
        return Sobrenome;
    }

    public void setSobrenome(String sobrenome)
    {
        Sobrenome = sobrenome;
    }

    public String getEmail()
    {
        return Email;
    }

    public void setEmail(String email)
    {
        Email = email;
    }

    public Endereco getEndereco()
    {
        return endereco;
    }

    public void setEndereco(Endereco endereco)
    {
        this.endereco = endereco;
    }

    @Override
    public String toString()
    {
        return "Pessoa{" +
                "Id=" + Id +
                ", Nome='" + Nome + '\'' +
                ", Sobrenome='" + Sobrenome + '\'' +
                ", Email='" + Email + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}
