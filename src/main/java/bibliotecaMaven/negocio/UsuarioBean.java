package bibliotecaMaven.negocio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
public class UsuarioBean {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column
	private long codigo;
	
	@Column
	private String nombre;
	
	@Column
	private String direccion;
	
	@Column
	private String telefono;

	
	/**************************************
	 * RELACIONES ENTRE TABLAS
	 **************************************/
	
	/**************************************
	 * GETTERS AND SETTERS
	 **************************************/
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}	
}
