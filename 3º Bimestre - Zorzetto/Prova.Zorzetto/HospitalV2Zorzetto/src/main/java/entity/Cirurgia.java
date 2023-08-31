package entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "cirurgia_tb")
public class Cirurgia
{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long Id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "medico_id")
    private Medico medico;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn (name = "Instrumento_id")
    private List<Instrumento> instrumentos;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn (name = "Paciente_id")
    private Paciente paciente;
    @Column
    private Double Custo;

    public Cirurgia(Double custo)
    {
        Custo = custo;
        this.instrumentos = new ArrayList<>();
    }

    public Long getId()
    {
        return Id;
    }

    public void setId(Long id)
    {
        Id = id;
    }

    public Medico getMedico()
    {
        return medico;
    }

    public void setMedico(Medico medico)
    {
        this.medico = medico;
    }

    public List<Instrumento> getInstrumentos()
    {
        return instrumentos;
    }

    public void setInstrumentos(List<Instrumento> instrumentos)
    {
        this.instrumentos = instrumentos;
    }

    public Paciente getPaciente()
    {
        return paciente;
    }

    public void setPaciente(Paciente paciente)
    {
        this.paciente = paciente;
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
        return "Cirurgia{" +
                "Id=" + Id +
                ", medico=" + medico +
                ", instrumentos=" + instrumentos +
                ", paciente=" + paciente +
                ", Custo=" + Custo +
                '}';
    }
}
