public class Main
{
    public static void main(String[] args)
    {
        Biblioteca biblioteca = new Biblioteca("Library","Zorzetto","Diversos","Todos");

        biblioteca.addLivros(new livros("Mobi Dick"));
        biblioteca.addLivros(new livros("O Pequeno Príncipe"));
    }
}
