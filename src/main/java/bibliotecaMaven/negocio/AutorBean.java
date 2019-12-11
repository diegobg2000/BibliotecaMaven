package bibliotecaMaven.negocio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="autor")
public class AutorBean {
	@Id
	@GeneratedValue (strategy= GenerationType.AUTO)
	@Column
	private long codigo;
	
	@Column
	private String nombre;


	/********************************
	 * RELACIONES ENTRE TABLAS
	 ********************************/
	@ManyToMany(mappedBy = "autores")
	private List<LibroBean> libros = new ArrayList<LibroBean>();
	
	public void addLibro(LibroBean libro) {
		if(!libros.contains(libro)) {
			libros.add(libro);
		}
		//
		List<AutorBean> autores = libro.getAutores();
		if(!autores.contains(this)) {
			autores.add(this);
		}
	
	}
	
	
	/*********************************
	 * GETTERS AND SETTERS
	 *********************************/
	
	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public List<LibroBean> getLibros() {
		return libros;
	}


	public void setLibros(List<LibroBean> libros) {
		this.libros = libros;
	}
	
	
	
}
