public class Main
{
    public static void main(String[] args)
    {
        Gastos gastos = new Gastos("Estudos", 200);
        Lazer lazer = new Lazer("Viagem",5000,1);
        Fixo fixo = new Fixo("Fixo",1000);
        Variável variável = new Variável("variável",900,10);

        Gastos.addNome("Estudos");
        Gastos.addValor(200);
        Lazer.addNome("Viagem");
        Lazer.addValor(5000);
        Lazer.MudarValor();
        Fixo.addNome("Fixo");
        Fixo.addValor(1000);
        Variável.addNome("variável");
        Variável.addValor(900);
        Variável.addTempomeses(10);
    }
}
