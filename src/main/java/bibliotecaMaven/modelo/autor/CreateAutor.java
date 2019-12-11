package bibliotecaMaven.modelo.autor;

import javax.persistence.EntityManager;

import bibliotecaMaven.negocio.AutorBean;
import bibliotecaMaven.util.ConnectionEntityManagerFactory;

public class CreateAutor {
	public void create(AutorBean autor) {
	EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(autor);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
}
