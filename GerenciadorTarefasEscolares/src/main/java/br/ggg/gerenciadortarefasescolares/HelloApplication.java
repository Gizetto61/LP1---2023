package br.ggg.gerenciadortarefasescolares;

import br.ggg.gerenciadortarefasescolares.entity.Disciplinas;
import br.ggg.gerenciadortarefasescolares.entity.Login;
import br.ggg.gerenciadortarefasescolares.entity.Tarefas;
import br.ggg.gerenciadortarefasescolares.util.HibernateUtil;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.IOException;
import java.util.List;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args)
    {
        launch();

        Login login0 = new Login(null, null, null, null, null, null);
        Tarefas tarefa0 = new Tarefas(null, null, null, null);
        Disciplinas disciplina0 = new Disciplinas(null, null, null, null, null);

        disciplina0.setTarefas(tarefa0);

        Session session1 = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction1 = session1.beginTransaction();


        session1.persist(disciplina0);

        transaction1.commit();

        List<Disciplinas> disciplinas = session1.createQuery("from Disciplinas", Disciplinas.class).list();

    }
}