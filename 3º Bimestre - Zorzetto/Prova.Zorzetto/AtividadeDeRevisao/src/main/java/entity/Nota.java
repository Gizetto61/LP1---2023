package entity;


import jakarta.persistence.*;

@Entity
@Table(name = "nota")
public class Nota
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Turma_id")
    private Turma turma;
    @Column
    private double Nota;

    public Nota(double nota)
    {
        Nota = nota;
    }

    public Long getId()
    {
        return Id;
    }

    public void setId(Long id)
    {
        Id = id;
    }

    public Turma getTurma()
    {
        return turma;
    }

    public void setTurma(Turma turma)
    {
        this.turma = turma;
    }

    public double getNota()
    {
        return Nota;
    }

    public void setNota(double nota)
    {
        Nota = nota;
    }

    @Override
    public String toString()
    {
        return "Nota{" +
                "Id=" + Id +
                ", turma=" + turma +
                ", Nota=" + Nota +
                '}';
    }
}
