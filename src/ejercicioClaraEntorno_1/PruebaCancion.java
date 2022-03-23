package ejercicioClaraEntorno_1;
/**
 * Metodo main
 * @author Marco Alvarez
 * @version 02.2022
 *
 */
public class PruebaCancion {
	/**
	 * Sirve para testear cancion, los siguentes metodos son los usados en la clase main
	 * @param args
	 * {@link PruebaCancion#mostrarCancionesyAutor(Cancion[])}
	 * {@link PruebaCancion#mostrarCancionMasLarga(Cancion[])}
	 * {@link PruebaCancion#mostrarSiguienteCancion(Cancion, Cancion[])}
	 * {@link PruebaCancion#PruebaCancion()}
	 */
	public static void main(String[] args) {
		
		Cancion cancionPrueba = new Cancion();
		System.out.println(cancionPrueba);
		
		Cancion cancionClasico = new Cancion("Sweet Home Alabama", 180);
		System.out.println(cancionClasico);
		
		Cancion primeraCancion = new Cancion("I Don't Like Mondays", "The Boomtown Rats", 390, true);
		Cancion segundaCancion = new Cancion("Don’t Stop Believin’", "Journey", 320, false);
		Cancion terceraCancion = new Cancion("Come Join The Murder", "The White Buffalo & The Forest Rangers", 420, false);
		Cancion cuartaCancion = new Cancion("I need sleep", "Balduin & Offbeat", 182, false);
		Cancion quintaCancion = new Cancion("Die Nacht Ist Nicht Allein Zum Schlafen Da", "Hans Wachsmann & Wolfgang Lohr", 197, false);

		if (primeraCancion.reproducirCancion()) {
			System.out.println(primeraCancion.getTitulo() + "está sonando");
		}
		if (primeraCancion.pararCancion()) {
			System.out.println(primeraCancion.getTitulo() + "stop");
		}
		if (primeraCancion.MismaCancion(cancionClasico)) {
			System.out.println("Parece que no son la misma canción");
		}
		Cancion nueva = new Cancion("Baba O'riley", "The Who", 310, false);
		Cancion[] canciones = { primeraCancion, segundaCancion, terceraCancion, cuartaCancion, quintaCancion, nueva };
		
		mostrarCancionesyAutor(canciones);
		mostrarCancionMasLarga(canciones);

		mostrarSiguienteCancion(primeraCancion, canciones);
		mostrarSiguienteCancion(nueva, canciones);
	}


	private static void mostrarSiguienteCancion(Cancion miCancion, Cancion[] canciones) {
		System.out.println("La canción que sonará después de " + miCancion.getTitulo() + " será "
				+ Cancion.SiguienteCancion(canciones, miCancion.getTitulo()));
	}


	private static void mostrarCancionMasLarga(Cancion[] canciones) {
		System.out.println("La canción más larga es: " + Cancion.MayorDuracion(canciones));
	}


	private static void mostrarCancionesyAutor(Cancion[] canciones) {
		for (int i = 0; i < canciones.length; i++) {
			System.out.println("La canción es " + canciones[i].getTitulo() + " de " + canciones[i].getGrupo());
		}
	}
	

}