package bibliotecaMaven.modelo.ejemplar;

import javax.persistence.EntityManager;

import bibliotecaMaven.negocio.EjemplarBean;
import bibliotecaMaven.util.ConnectionEntityManagerFactory;

public class CreateEjemplar {
	
	public void create(EjemplarBean ejemplar) {
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
			
			entityManager.getTransaction().begin();
			entityManager.persist(ejemplar);
			entityManager.getTransaction().commit();
			entityManager.close();
	}
}
