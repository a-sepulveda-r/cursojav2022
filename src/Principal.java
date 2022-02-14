
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Crear aplicacion");
		Aplicacion aplicacion = new Aplicacion("UBER",3) ;
		System.out.println("La aplicacion en uso es " + aplicacion.getNombre() + " version " + Integer.toString(aplicacion.getVersion()));      
		// Integer.toString convierte una variable entera a string
		System.out.println("............................");
		
		System.out.println("Crear usuario");
		Usuario usuario = new Usuario(1, "peluca", 99, "stgo");
		System.out.println("Se creo el usuario " + usuario.getNombre());
		System.out.println("............................");
		
		System.out.println("Crear conductor");
		Conductor conductor = new Conductor(2, "Tobi", 1234, new Vehiculo("Renault", "Symbol", "Gris", 2020, "AXBX20"));
	/* tambien se pueden colocar las variblaes del vehiculo instanciando la clase para usarlas en conductor
	 * Vehiculo vehiculo = new Vehiculo("Renault", "Symbol", "Gris", 2020, "AXBX20");
	 * Conductor conductor = new Conductor(2, "Tobi", 1234, vehiculo );
	 * 		  */
		System.out.println("Se creo el conductor " + conductor.getNombre());
		System.out.println("............................");
		
		System.out.println("Crear viaje");
		Viaje viaje = new Viaje(aplicacion, conductor, usuario, "Alameda 1340", "Vitacura 987", "20:24");
		System.out.println("Se creo el viaje desde " + viaje.getDireccionOrigen() + " hasta " + viaje.getDireccionDestino());    
		System.out.println("El conductor es " + viaje.getConductor().getNombre() + " y el usuario es " + viaje.getUsuario().getNombre());
		
		viaje.setTiempo(43) ;
		viaje.setTarifa(7000) ;
		
		System.out.println("El viaje termino, tuvo una duracion de " + Integer.toString(viaje.getTiempo()) + " minutos y un valor de " + Integer.toString(viaje.getTarifa()) + " pesos");
		

	

	}

}
