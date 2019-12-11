package bibliotecaMaven.negocio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="libro")
public class LibroBean {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column
	private long codigo;
	
	@Column
	private String titulo;
	
	@Column
	private String ISBN;
	
	@Column
	private String editorial;
	
	@Column
	private int nPagina;
	
	/****************************************
	 * RELACIONES ENTRE TABLAS
	 ****************************************/
	@ManyToMany
	private List<AutorBean> autores = new ArrayList<AutorBean>();
	
	@OneToMany(mappedBy = "libro")
	private List<EjemplarBean> ejemplares = new ArrayList<EjemplarBean>();
	
	public void addEjemplar(EjemplarBean ejemplar) {
		if(!ejemplares.contains(ejemplar)){
			ejemplares.add(ejemplar);
			ejemplar.setLibro(this);
		}
	}

	/****************************************
	 * GETTERS AND SETTERS
	 ****************************************/
	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public int getnPagina() {
		return nPagina;
	}

	public void setnPagina(int nPagina) {
		this.nPagina = nPagina;
	}

	public List<AutorBean> getAutores() {
		return autores;
	}

	public void setAutores(List<AutorBean> autores) {
		this.autores = autores;
	}
		
}
