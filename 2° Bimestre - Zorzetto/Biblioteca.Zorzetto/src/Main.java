public class Main
{
    public static void main(String[] args)
    {
        Biblioteca biblioteca = new Biblioteca("Library", new Dono("Zorzetto  ", 547130988), new Livros("O Pequeno Príncipe  ","Antoine de Saint-Exupéry  ", 1945), new Livros("Senhor dos Anéis  ", "J. R. R. Tolkien  ", 1937), new Funcionarios("João  ", 298555851), new Funcionarios("Luk  ", 123546458));
        System.out.println(biblioteca.getNome());

        biblioteca.addLivros(new Livros("Mobi Dick  ", "Herman Melville  ", 1851));
        biblioteca.addLivros(new Livros("O Pequeno Príncipe  ","Antoine de Saint-Exupéry  ", 1945));
        biblioteca.addFuncionarios(new Funcionarios("João  ", 298555851));
        biblioteca.addFuncionarios(new Funcionarios("Luk  ", 123546458));

        System.out.println(biblioteca.getNome());

        System.out.println("Dono: " + biblioteca.getDono().getNome() + biblioteca.getDono().getCPF());

        biblioteca.Mostra_Livros();

        for (Funcionarios funcionarios: biblioteca.getfuncionarios())
        {
            System.out.println("Funcionário: " + funcionarios.getNome() + funcionarios.getCPF());
        }
    }
}
