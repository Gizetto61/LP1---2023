import entity.Endereco;
import entity.Pessoa;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.Hibernateutil;

import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        Pessoa pessoa = new Pessoa("Giovanni","Zorzetto","zorzetto.oliveira@aluno.ifsp.edu.br", new Endereco("Prof Rodolfo S Tiago","São Paulo"));
        Pessoa pessoa1 = new Pessoa("Giovanni","Foliene","giovannibanibani@gmail.com", new Endereco("Pedro Vicente","São Paulo"));
        Pessoa pessoa2 = new Pessoa("Gabriel","Rocha","gmrgabriel1@gmail.com", new Endereco("Rolinhas","Monte Verde"));
        Pessoa pessoa3 = new Pessoa("Davi","Gomes","davigsousa13@gmail.com", new Endereco("Dom Pedro II","São Bernardo"));

        Session session = Hibernateutil.getSessionFactory().openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(pessoa);
        session.persist(pessoa1);
        session.persist(pessoa2);
        session.persist(pessoa3);

        transaction.commit();

        List<Pessoa> pessoas = session.createQuery("from Pessoa", Pessoa.class).list();

        pessoas.forEach(p -> System.out.println(p.toString()));



        Endereco endereco = new Endereco("Prof Rodolfo S Tiago","São Paulo");
        Endereco endereco1 = new Endereco("Pedro Vicente","São Paulo");
        Endereco endereco2 = new Endereco("Rolinhas","Monte Verde");
        Endereco endereco3 = new Endereco("Dom Pedro II","São Bernardo");

        Session session1 = Hibernateutil.getSessionFactory().openSession();

        Transaction transaction1 = session1.beginTransaction();

        session1.persist(endereco);
        session1.persist(endereco1);
        session1.persist(endereco2);
        session1.persist(endereco3);

        transaction1.commit();

        List<Endereco> enderecos = session1.createQuery("from Endereco", Endereco.class).list();

        enderecos.forEach(e -> System.out.println(e.toString()));
    }
}
