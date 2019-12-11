package bibliotecaMaven.negocio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ejemplares")
public class EjemplarBean {

		@Id
		@GeneratedValue(strategy= GenerationType.AUTO)
		@Column
		private long codigo;
		
		@Column
		private String nombre;
		
		@Column
		private String localizacion;
		
		/*********************************************
		 * RELACIONES ENTRE TABLAS
		 ************************************************/
		@ManyToOne
		private LibroBean libro;
		/******************************************
		 * GETTERS AND SETTERS
		 *********************************************/

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

		public String getLocalizacion() {
			return localizacion;
		}

		public void setLocalizacion(String localizacion) {
			this.localizacion = localizacion;
		}

		public LibroBean getLibro() {
			return libro;
		}

		public void setLibro(LibroBean libro) {
			this.libro = libro;
		}
		
		
}

