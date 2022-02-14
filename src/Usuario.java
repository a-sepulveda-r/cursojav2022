
public class Usuario extends Persona{  // extends se usa para heredar los atributos de una clase padre
	private int telefono ;
	private String ciudad ;
	
	public Usuario(int rut, String nombre, int telefono, String ciudad ) { // constructor
		super (rut, nombre);  // super se usa para especificar los nombres de los atributos recibidos(heredados)   
		this.telefono = telefono ;
		this.ciudad = ciudad ;
		
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	

}
