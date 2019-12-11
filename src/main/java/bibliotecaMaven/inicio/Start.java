package bibliotecaMaven.inicio;

import bibliotecaMaven.modelo.autor.CreateAutor;
import bibliotecaMaven.modelo.ejemplar.CreateEjemplar;
import bibliotecaMaven.modelo.libro.CreateLibro;
import bibliotecaMaven.modelo.usuario.CreateUsuario;
import bibliotecaMaven.negocio.AutorBean;
import bibliotecaMaven.negocio.EjemplarBean;
import bibliotecaMaven.negocio.LibroBean;
import bibliotecaMaven.negocio.UsuarioBean;

public class Start {

	public static void main(String[] args) {
		//CREAMOS LOS OBJETOS
		
		//Autores
		AutorBean autor1 = new AutorBean();
		autor1.setNombre("Autor 1");
		
		//Libros
		LibroBean libro1 = new LibroBean();
		libro1.setTitulo("Libro 1");
		libro1.setISBN("132832834HD");
		libro1.setEditorial("Planeta");
		libro1.setnPagina(334);
		
		//Ejemplares
		EjemplarBean ejemplar1 = new EjemplarBean();
		ejemplar1.setNombre("Ejemplar 1");
		ejemplar1.setLocalizacion("Loc 1");
		
		//Usuarios
		UsuarioBean usuario1 = new UsuarioBean();
		usuario1.setNombre("Usuario 1");
		usuario1.setDireccion("Direccion 1");
		usuario1.setTelefono("123456789");
		
		
		
		
		
		
		//PERSISTIMOS
		//CreateAutor
		CreateAutor createAutor = new CreateAutor();
		createAutor.create(autor1);
		autor1.addLibro(libro1);
		
		//CreateLibro
		CreateLibro createLibro = new CreateLibro();
		createLibro.create(libro1);
		//addEjemplar
		libro1.addEjemplar(ejemplar1);
		
		
		//CreateEjemplar
		CreateEjemplar createEjemplar = new CreateEjemplar();
		createEjemplar.create(ejemplar1);
		
		
		
		
		//CreateUsuario
		CreateUsuario createUsuario = new CreateUsuario();
		createUsuario.create(usuario1);
		
		
	}

}
