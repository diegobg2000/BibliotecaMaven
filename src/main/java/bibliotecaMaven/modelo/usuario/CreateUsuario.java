package bibliotecaMaven.modelo.usuario;

import javax.persistence.EntityManager;

import bibliotecaMaven.negocio.UsuarioBean;
import bibliotecaMaven.util.ConnectionEntityManagerFactory;

public class CreateUsuario {
	
	public void create(UsuarioBean usuario) {
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		entityManager.getTransaction().commit();
		entityManager.persist(usuario);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
}
