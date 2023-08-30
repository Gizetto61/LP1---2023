package util;

import entity.Aluno;
import entity.Nota;
import entity.Professor;
import entity.Turma;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        Professor professor = new Professor("123","123-456-789","Igor","SP3099875");

        System.out.println(professor);

        Aluno aluno1 = new Aluno("321","Giovanni","SP3088341",8);
        Aluno aluno2 = new Aluno("654","Gabriel","SP3088241",9);
        Aluno aluno3 = new Aluno("987","Gustavo","SP3088141",7);

        Turma turma = new Turma(2000,"54321");

        turma.setProfessor(professor);

        turma.setAlunos(List.of(aluno1, aluno2, aluno3));

        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(turma);

        transaction.commit();

        List<Turma> turmas = session.createQuery("from.Turma", Turma.class).list();

        for (int i = 0; i < turmas.size(); i++)
        {
            System.out.println(turmas.get(i));
        }

        System.out.println(turma);

        Nota nota1 = new Nota(8);
        Nota nota2 = new Nota(9);
        Nota nota3 = new Nota(7);

        nota1.setTurma(turma);
        nota2.setTurma(turma);
        nota3.setTurma(turma);

        Session session1 = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction1 = session1.beginTransaction();

        session1.persist(nota1);
        session1.persist(nota2);
        session1.persist(nota3);

        transaction1.commit();

        List<Nota> notas = session1.createQuery("from.Nota", Nota.class).list();

        for (int i = 0; i < notas.size(); i++)
        {
            System.out.println(notas.get(i));
        }

        System.out.println(nota1);
        System.out.println(nota2);
        System.out.println(nota3);

        aluno1.setNotas(List.of(nota1, nota2, nota3));
        aluno2.setNotas(List.of(nota1, nota2, nota3));
        aluno2.setNotas(List.of(nota1, nota2, nota3));

        Session session2 = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction2 = session2.beginTransaction();

        session2.persist(aluno1);
        session2.persist(aluno2);
        session2.persist(aluno3);

        transaction2.commit();

        List<Aluno> alunos = session2.createQuery("from.Aluno", Aluno.class).list();

        for (int i = 0; i < alunos.size(); i++)
        {
            System.out.println(alunos.get(i));
        }

        System.out.println(alunos);
    }
}
