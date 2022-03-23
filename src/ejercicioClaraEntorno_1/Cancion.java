package ejercicioClaraEntorno_1;
/**
 * Es el metodo donde estan los constructores, los get, set y others
 * @author Marco Alvarez
 * @version 02.2022
 * {@link Cancion#finalize()}
 * {@link Cancion#isSonando()}
 * {@link Cancion#MismaCancion(Cancion)}
 * {@link Cancion#pararCancion()}
 * {@link Cancion#reproducirCancion()}
 * {@link Cancion#MayorDuracion(Cancion[])}
 * {@link Cancion#Cancion()}
 * {@link Cancion#Cancion(String, int)}
 * {@link Cancion#Cancion(String, String, int, boolean)}
 */
public class Cancion {

	private String titulo;
	private String grupo;
	private int duracion;
	private boolean sonando;

	// Definimos los constructores
	/**
	 * Es el constructor por defecto
	 */
	Cancion() // Constructor sin parámetros
	{
		this.titulo = "";
		this.duracion = 0;
		this.sonando = false;
	}
	/**
	 * Este metodo sirve para crear una cancion con titulo duracion y si esta o no sonando
	 * @param titulo, indica el titulo de la cancion
	 * @param duracion, indica la duracion de la cancion
	 */
	Cancion(String titulo, int duracion) // constructor con 2 parámetros
	{
		this.titulo = titulo;
		this.duracion = duracion;
		this.sonando = false;
	}
	/**
	 * Este metodo sirve para crear la cancion con titulo, grupo, duracion y si esta sonando
	 * @param titulo, indica el titulo de la cancion
	 * @param grupo, indica el grupo de la cancion
	 * @param duracion, indica la duracion de la cancion
	 * @param sonando, indica si esta sonando la cancion
	 */
	Cancion(String titulo, String grupo, int duracion, boolean sonando) // constructor con 4 parámetros
	{
		this.titulo = titulo;
		this.duracion = duracion;
		this.sonando = sonando;
		this.grupo = grupo;
	}
	/**
	 * Sirve para reproducir cancion
	 * @return, indica si la cancion se esta ejecutando o no para poder reproducir la siguente
	 */
	boolean reproducirCancion() {
		if (this.sonando) {
			return false;
		} else {
			this.sonando = true;
			return true;
		}
	}
	/**
	 * Sirve para parar la cancion
	 * @return, indica si la cancion esta parada si es asi no hace nada si no pues la para
	 */
	boolean pararCancion() {
		if (!this.sonando) {
			return false;
		} else {
			this.sonando = false;
			return true;
		}
	}

	// meter métodos get/set/toString()
	/**
	 * devuelce el titulo de la cancion
	 * @return
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * da el valor titulo a cancion
	 * @param titulo
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public boolean isSonando() {
		return sonando;
	}

	public void setSonando(boolean sonando) {
		this.sonando = sonando;
	}

	boolean MismaCancion(Cancion cancion) {
		if (this.titulo == cancion.titulo && this.grupo == cancion.grupo)
			return true;
		else
			return false;
	}
	/**
	 * sirve para saber la cancion mas larga
	 * @param canciones, indica la cancion
	 * @return, devuelve la cancion con mayor duracion
	 */
	public static String MayorDuracion(Cancion[] canciones) {
		int posMax = 0;
		int max = 0;
		for (int i = 0; i < canciones.length; i++) {
			if (canciones[i].duracion > max) {
				posMax = i;
				max = canciones[i].duracion;
			}
		}
		return canciones[posMax].titulo;

	}
	/**
	 * sirve para saber la siguente cancion
	 * @param canciones, indica cual es la cancion
	 * @param titulo, indica cual es el titulo de la siguente cancion
	 * @return, duevuelve el titulo de la siguiente cancion
	 */
	static String SiguienteCancion(Cancion[] canciones, String titulo) {
		int pos = 0;
		int siguiente = 0;
		for (int i = 0; i < canciones.length; i++) {
			if (titulo == canciones[i].titulo) {
				pos = i;
			}
		}
		if (pos == canciones.length - 1) {
			siguiente = 0;
		} else {
			siguiente = pos + 1;
		}
		return canciones[siguiente].titulo;
	}
	/**
	 * imprime la cancion con su titulo autor grupo duracion y si esta sonando
	 */
	@Override
	public String toString() {
		return "Datos de la canci�n [titulo=" + titulo + ", autor=" +  grupo + ", duracion=" + duracion + ", sonando=" + sonando 
				+ "]";
	}
}
