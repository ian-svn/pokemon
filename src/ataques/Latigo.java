package ataques;

import efectos.ModificacionEstadistica;
import enumeradores.Tipo;
import enumeradores.TipoEstadistica;

/* Es un movimiento de tipo normal. Látigo consta de cuando un Pokemon sacude su cola como
mofa al oponente para que este se distraiga y baje entre un 1% y un 10% la precisión y puede durar
entre 1 y 5 turnos. El ataque tiene una precisión del 70%. Se puede utilizar 7 veces. */

public class Latigo extends Ataque {

	public Latigo() {
		super("Latigo", Tipo.NORMAL, 0, 7, 70, new ModificacionEstadistica(100, 1, 5, TipoEstadistica.PRESICION, 1, 10));
	}

}
