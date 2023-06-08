import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("nome-da-unidade-de-persistencia");
        EntityManager em = emf.createEntityManager();

        try {
            ProdutoDAO produtoDAO = new ProdutoDAO(em);
            DistribuicaoDAO distribuicaoDAO = new DistribuicaoDAO(em);
            RecompensaDAO recompensaDAO = new RecompensaDAO(em);
            CultivoDAO cultivoDAO = new CultivoDAO(em);

            List<Produto> produtos = produtoDAO.buscarProdutosEmEstoque();
            for (Produto produto : produtos) {
                System.out.println(produto.getNome());
            }

            List<Distribuicao> distribuicoes = distribuicaoDAO.buscarDistribuicoesPorLocal("Mercado A");
            for (Distribuicao distribuicao : distribuicoes) {
                System.out.println(distribuicao.getLocal());
            }

            List<Recompensa> recompensas = recompensaDAO.buscarRecompensasValidas();
            for (Recompensa recompensa : recompensas) {
                System.out.println(recompensa.getNome());
            }

            List<Cultivo> cultivos = cultivoDAO.buscarCultivosPorDificuldade(2);
            for (Cultivo cultivo : cultivos) {
                System.out.println(cultivo.getNomePlanta());
            }
        } finally {
            em.close();
            emf.close();
        }
    }
}
