import entity.Pessoa;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.Hibernateutil;

import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        Pessoa pessoa = new Pessoa("Giovanni","Zorzetto","zorzetto.oliveira@aluno.ifsp.edu.br");
        Pessoa pessoa1 = new Pessoa("Giovanni","Foliene","giovannibanibani@gmail.com");
        Pessoa pessoa2 = new Pessoa("Gabriel","Rocha","gmrgabriel1@gmail.com");
        Pessoa pessoa3 = new Pessoa("Davi","Gomes","davigsousa13@gmail.com");

        Session session = Hibernateutil.getSessionFactory().openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(pessoa);
        session.persist(pessoa1);
        session.persist(pessoa2);
        session.persist(pessoa3);

        transaction.commit();

        List<Pessoa> pessoas = session.createQuery("from Pessoa", Pessoa.class).list();

        pessoas.forEach(p -> System.out.println(p.toString()));
    }
}
