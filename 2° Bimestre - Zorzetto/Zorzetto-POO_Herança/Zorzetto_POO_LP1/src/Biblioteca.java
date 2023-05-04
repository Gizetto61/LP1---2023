import java.util.ArrayList;
import java.util.List;
public class Biblioteca
{
    private String Nome;
    private Dono dono;
    private List<Livros> livros = new ArrayList<>();
    private List<Funcionarios> funcionarios = new ArrayList<>();

    public Biblioteca(String nome, Dono dono, Livros livros, Funcionarios funcionarios)
    {
        this.Nome = nome;
        this.dono = dono;
    }

    public List<Livros> getlivros()
    {
        return livros;
    }

    public void setlivros(List<Livros> livros)
    {
        this.livros = livros;
    }

    public List<Funcionarios> getfuncionarios()
    {
        return funcionarios;
    }

    public void setfuncionarios(List<Funcionarios> funcionarios)
    {
        this.funcionarios = funcionarios;
    }

    public Dono getDono()
    {
        return dono;
    }

    public void setDono(Dono dono)
    {
        this.dono = dono;
    }

}
