package entity;


import jakarta.persistence.*;

@Entity
@Table(name = "endereco")
public class Endereco
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column
    private String Rua;
    @Column
    private String Cidade;

    public Endereco(String rua, String cidade)
    {

        Rua = rua;
        Cidade = cidade;
    }

    public int getId()
    {
        return Id;
    }

    public void setId(int id)
    {
        Id = id;
    }

    public String getRua()
    {
        return Rua;
    }

    public void setRua(String rua)
    {
        Rua = rua;
    }

    public String getCidade()
    {
        return Cidade;
    }

    public void setCidade(String cidade)
    {
        Cidade = cidade;
    }

    @Override
    public String toString()
    {
        return "Endereco{" +
                "Id=" + Id +
                ", Rua='" + Rua + '\'' +
                ", Cidade='" + Cidade + '\'' +
                '}';
    }
}
