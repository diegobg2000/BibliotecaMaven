package bibliotecaMaven.modelo.libro;

import javax.persistence.EntityManager;

import bibliotecaMaven.negocio.LibroBean;
import bibliotecaMaven.util.ConnectionEntityManagerFactory;

public class CreateLibro {
	public void create(LibroBean libro) {
	EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(libro);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
}
