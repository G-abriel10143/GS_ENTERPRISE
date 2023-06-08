import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;
package org.globalsolution.repositories;

public class DistribuicaoDAO {
    private EntityManager em;

    public DistribuicaoDAO(EntityManager em) {
        this.em = em;
    }

    public List<Distribuicao> buscarDistribuicoesPorLocal(String local) {
        TypedQuery<Distribuicao> query = em.createQuery("SELECT d FROM Distribuicao d WHERE d.local = :local", Distribuicao.class);
        query.setParameter("local", local);
        return query.getResultList();
    }
}