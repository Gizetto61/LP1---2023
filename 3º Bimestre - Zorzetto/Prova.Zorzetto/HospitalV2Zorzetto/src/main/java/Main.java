import entity.Cirurgia;
import entity.Instrumento;
import entity.Medico;
import entity.Paciente;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        Paciente paciente1 = new Paciente(16,"Giovanni");
        Paciente paciente2 = new Paciente(17,"Davi");
        Paciente paciente3 = new Paciente(16,"Gabriel");
        Paciente paciente4 = new Paciente(16,"Fernando");
        Paciente paciente5 = new Paciente(19,"Tadeo");

        Medico medico1 = new Medico("23-54-98","Igor",2000.00);
        Medico medico2 = new Medico("28-19-00","Luk",1000.00);
        Medico medico3 = new Medico("25-97-14","Motta",1500.00);
        Medico medico4 = new Medico("20-74-22","Ugo",1500.00);
        Medico medico5 = new Medico("27-20-55","Renatinho",3000.00);

        Instrumento instrumento1 = new Instrumento("Pinca",10.00,"cirurgica");
        Instrumento instrumento2 = new Instrumento("Bisturi",150.00,"eletrico");
        Instrumento instrumento3 = new Instrumento("Tesoura",35.00,"cirurgica");
        Instrumento instrumento4 = new Instrumento("Lilha",9.00,"cirurgica");

        Cirurgia cirurgia = new Cirurgia(5000.00);

        cirurgia.setPaciente(paciente1);
        cirurgia.setMedico(medico1);
        cirurgia.setInstrumentos(List.of(instrumento1, instrumento3, instrumento4));

        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(cirurgia);

        transaction.commit();

        Cirurgia cirurgia2 = new Cirurgia(10000.00);

        cirurgia2.setPaciente(paciente2);
        cirurgia.setMedico(medico2);
        cirurgia.setInstrumentos(List.of(instrumento1, instrumento2));

        Session session2 = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction2 = session2.beginTransaction();

        session2.persist(cirurgia2);

        transaction2.commit();

        Cirurgia cirurgia3 = new Cirurgia(8000.00);

        cirurgia3.setPaciente(paciente3);
        cirurgia3.setMedico(medico3);
        cirurgia3.setInstrumentos(List.of(instrumento2, instrumento4));

        Session session3 = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction3 = session3.beginTransaction();

        session3.persist(cirurgia3);

        transaction3.commit();

        Cirurgia cirurgia4 = new Cirurgia(20000.00);

        cirurgia4.setPaciente(paciente4);
        cirurgia4.setMedico(medico4);
        cirurgia4.setInstrumentos(List.of(instrumento1, instrumento2, instrumento3, instrumento4));

        Session session4 = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction4 = session4.beginTransaction();

        session4.persist(cirurgia4);

        transaction4.commit();

        Cirurgia cirurgia5 = new Cirurgia(11000.00);

        cirurgia5.setPaciente(paciente5);
        cirurgia5.setMedico(medico5);
        cirurgia5.setInstrumentos(List.of(instrumento1, instrumento2));

        Session session5 = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction5 = session5.beginTransaction();

        session5.persist(cirurgia5);

        transaction5.commit();

        List<Cirurgia> cirurgias = session.createQuery("from.Cirurgia", Cirurgia.class).list();

        cirurgias.forEach(v -> System.out.println(v));

        System.out.println(cirurgias.get(0));
    }
}
