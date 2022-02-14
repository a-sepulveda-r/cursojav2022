
public class Vehiculo {
	
	private String marca ;
	private String modelo ;
	private String color ;
	private int anio ; // anio = año, no utilizar tildes ni ñ en java
	private String patente ;
	
	public Vehiculo(String marca, String modelo, String color, int anio, String patente) {
		// se puede hacer el constructor automaticamente seleccionando el nombre del constructor
		// click derecho source y generate conductor

		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.anio = anio;
		this.patente = patente;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}
	
	
	

}
