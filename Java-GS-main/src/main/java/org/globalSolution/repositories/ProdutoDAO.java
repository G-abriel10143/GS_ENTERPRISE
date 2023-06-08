import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;
package org.globalsolution.repositories;

public class ProdutoDAO {
    private EntityManager em;

    public ProdutoDAO(EntityManager em) {
        this.em = em;
    }

    public List<Produto> buscarProdutosEmEstoque() {
        TypedQuery<Produto> query = em.createQuery("SELECT p FROM Produto p WHERE p.quantidade > 0", Produto.class);
        return query.getResultList();
    }
}