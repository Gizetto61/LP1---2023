package entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "turma")
public class Turma
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Professor_id")
    private Professor professor;
    @Column
    private Integer Horario;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "Aluno_id")
    private List<Aluno> alunos;
    @Column
    private String Codigo;

    public Turma(Integer horario, String codigo)
    {
        Horario = horario;
        Codigo = codigo;
        this.alunos = new ArrayList<>();
    }

    public Long getId()
    {
        return Id;
    }

    public void setId(Long id)
    {
        Id = id;
    }

    public Professor getProfessor()
    {
        return professor;
    }

    public void setProfessor(Professor professor)
    {
        this.professor = professor;
    }

    public Integer getHorario()
    {
        return Horario;
    }

    public void setHorario(Integer horario)
    {
        Horario = horario;
    }

    public List<Aluno> getAlunos()
    {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos)
    {
        this.alunos = alunos;
    }

    public String getCodigo()
    {
        return Codigo;
    }

    public void setCodigo(String codigo)
    {
        Codigo = codigo;
    }

    @Override
    public String toString()
    {
        return "Turma{" +
                "Id=" + Id +
                ", professor=" + professor +
                ", Horario=" + Horario +
                ", alunos=" + alunos +
                ", Codigo='" + Codigo + '\'' +
                '}';
    }
}
