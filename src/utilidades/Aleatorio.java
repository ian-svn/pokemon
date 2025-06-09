package utilidades;

import java.util.Random;

public final class Aleatorio {
	
	public static Random r = new Random();
	
	private Aleatorio() {
		
	}
	
	public static int generarEntero(int MAX) {
		return r.nextInt(MAX)+1;
	}
	
	public static int generarEntero(int MIN, int MAX) {
		return r.nextInt(MAX-MIN)+MIN+1;
	}
	
	public static boolean calcularProbabilidad(final int PROBABILIDAD) {
		int num = generarEntero(100);
		return num <= PROBABILIDAD;
	}
	
	public static int generarEnteroHasta100() {
		return generarEntero(100);
	}

}
