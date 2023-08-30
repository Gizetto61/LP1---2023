package entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "aluno")
public class Aluno
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column
    private String Senha;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "boletim", joinColumns = @JoinColumn(name = "aluno_id"), inverseJoinColumns = @JoinColumn(name = "nota_id"))
    private List<Nota> notas;
    @Column
    private String Nome;
    @Column
    private String Prontuario;
    @Column
    private double Media;


    public Aluno(String senha, String nome, String prontuario, double media)
    {
        Senha = senha;
        this.notas = new ArrayList<>();
        Nome = nome;
        Prontuario = prontuario;
        Media = media;
    }

    public Long getId()
    {
        return Id;
    }

    public void setId(Long id)
    {
        Id = id;
    }

    public String getSenha()
    {
        return Senha;
    }

    public void setSenha(String senha)
    {
        Senha = senha;
    }

    public List<Nota> getNotas()
    {
        return notas;
    }

    public void setNotas(List<Nota> notas)
    {
        this.notas = notas;
    }

    public String getNome()
    {
        return Nome;
    }

    public void setNome(String nome)
    {
        Nome = nome;
    }

    public String getProntuario()
    {
        return Prontuario;
    }

    public void setProntuario(String prontuario)
    {
        Prontuario = prontuario;
    }

    public double getMedia()
    {
        return Media;
    }

    public void setMedia(double media)
    {
        Media = media;
    }

    @Override
    public String toString()
    {
        return "Aluno{" +
                "Id=" + Id +
                ", Senha='" + Senha + '\'' +
                ", notas=" + notas +
                ", Nome='" + Nome + '\'' +
                ", Prontuario='" + Prontuario + '\'' +
                ", Media=" + Media +
                '}';
    }
}
