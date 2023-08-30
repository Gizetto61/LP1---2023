package entity;


import jakarta.persistence.*;

@Entity
@Table(name = "professor")
public class Professor
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column
    private String Senha;
    @Column
    private String CPF;
    @Column
    private String Nome;
    @Column
    private String Prontuario;

    public Professor(String senha, String CPF, String nome, String prontuario)
    {
        Senha = senha;
        this.CPF = CPF;
        Nome = nome;
        Prontuario = prontuario;
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

    public String getCPF()
    {
        return CPF;
    }

    public void setCPF(String CPF)
    {
        this.CPF = CPF;
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

    @Override
    public String toString()
    {
        return "Professor{" +
                "Id=" + Id +
                ", Senha='" + Senha + '\'' +
                ", CPF='" + CPF + '\'' +
                ", Nome='" + Nome + '\'' +
                ", Prontuario='" + Prontuario + '\'' +
                '}';
    }
}
