import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;
package org.globalsolution.repositories;

public class RecompensaDAO {
    private EntityManager em;

    public RecompensaDAO(EntityManager em) {
        this.em = em;
    }

    public List<Recompensa> buscarRecompensasValidas() {
        TypedQuery<Recompensa> query = em.createQuery("SELECT r FROM Recompensa r WHERE r.dataExpiracao >= CURRENT_DATE", Recompensa.class);
        return query.getResultList();
    }
}
