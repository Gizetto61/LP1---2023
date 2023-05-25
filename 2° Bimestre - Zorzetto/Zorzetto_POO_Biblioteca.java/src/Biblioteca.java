import java.util.ArrayList;
import java.util.List;
public class Biblioteca
{
    private String Nome;
    private Dono dono;
    private List<Livros> livros = new ArrayList<>();
    private List<Funcionarios> funcionarios = new ArrayList<>();

    public Biblioteca(String nome, Dono dono, Livros livros, Livros o_pequeno_príncipe, Funcionarios joão, Funcionarios luk)
    {
        this.Nome = nome;
        this.dono = dono;
    }

    public String getNome()
    {
        return Nome;
    }

    public List<Livros> getlivros()
    {
        return livros;
    }

    public void setlivros(List<Livros> livros)
    {
        this.livros = livros;
    }

    public void addLivros(Livros livros)
    {
        this.livros.add(livros);
    }

    public List<Funcionarios> getfuncionarios()
    {
        return funcionarios;
    }

    public void setfuncionarios(List<Funcionarios> funcionarios)
    {
        this.funcionarios = funcionarios;
    }

    public void addFuncionarios(Funcionarios funcionarios)
    {
        this.funcionarios.add(funcionarios);
    }


    public Dono getDono()
    {
        return dono;
    }

    public void setDono(Dono dono)
    {
        this.dono = dono;
    }

    public void Mostra_Livros()
    {
        for (Livros livros: this.livros)
        {
            System.out.println("Livro: " + livros.getNome() + livros.getAutor() + livros.getAno());
        }
    }

}
