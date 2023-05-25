public class Livros
{
    private String nome;
    private String Autor;
    private int Ano;

    public Livros(String nome, String Autor, int Ano)
    {
        this.nome = nome;
        this.Autor = Autor;
        this.Ano = Ano;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getAutor()
    {
        return Autor;
    }

    public void setAutor(String autor)
    {
        Autor = autor;
    }

    public int getAno()
    {
        return Ano;
    }

    public void setAno(int ano)
    {
        Ano = ano;
    }

    public void add(Livros livros) {
    }
}
