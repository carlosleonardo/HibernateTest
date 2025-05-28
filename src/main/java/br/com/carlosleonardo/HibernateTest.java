package br.com.carlosleonardo;

import java.util.Date;

public class HibernateTest {
    public static void main(String[] args) {
        System.out.println("Hibernate Test");
        var sessionFactory = HibernateUtils.getSessionFactory();
        try (var session = sessionFactory.openSession()) {
            session.beginTransaction();
            // Aqui você pode realizar operações com o Hibernate, como salvar, atualizar ou consultar entidades
            // Exemplo: session.save(new Cidade("Nova Cidade", 100000, null));
            var aluno = new AlunoDTO(null,
                    "Carlos",
                    "carlos.leonardo.goes@gmail.com",
                    "981234567",
                    "Rua Exemplo, 123",
                    8,
                    "AP",
                    new Date(),
                    new Date(),
                    null,
                    "");
            session.persist(aluno);
            session.getTransaction().commit();
            System.out.println("Aluno salvo com sucesso: " + aluno);
        } catch (Exception e) {
            System.out.printf("Erro ao salvar o aluno: %s%n", e.getMessage());
            if (sessionFactory.getCurrentSession().getTransaction().isActive()) {
                sessionFactory.getCurrentSession().getTransaction().rollback();
            }
        } finally {
            sessionFactory.close();
        }
    }
}
