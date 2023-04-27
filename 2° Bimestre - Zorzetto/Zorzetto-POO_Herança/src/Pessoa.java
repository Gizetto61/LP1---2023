import java.util.Scanner;
public class Pessoa 
{
    public String Nome;
    public String Data;
    public int Idade;
    public String Nome1;
    public String Data1;
    public int Idade1;
    
    public Pessoa(String Nome, String Data, int Idade)
    {
        System.out.println("Criou uma pessoa");
        this.Nome = Nome;
        this.Data = Data;
        this.Idade = Idade;
    }

    public void Pessoal(String Nome1, String Data1, int Idade1)
    {
        this.Nome1 = Nome1;
        this.Data1 = Data1;
        this.Idade1 = Idade1;

    }

    public void apresentar()
    {
        String Nome = "Giovanni";
        System.out.println("Olá, meu nome é: " + this.Nome + "e eu tenho " + this.Idade + "anos");    
    }
    
    public void perguntar()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Como você se chama? ");
        Nome1 = scanner.nextLine();
        System.out.println("Quando você nasceu? ");
        Data1 = scanner.nextLine();
        System.out.println("Quantos amos você tem? ");
        Idade1 = scanner.nextInt();

        System.out.println("Prazer em conhece-lo(la) " + this.Nome1 + "!");
        System.out.println("Você nasceu dia " + this.Data1 + "e tem " + this.Idade1 + "anos!");

    }
}
