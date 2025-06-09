package ataques;

import efectos.ModificacionEstadistica;
import enumeradores.Tipo;
import enumeradores.TipoEstadistica;

/* Es un movimiento de tipo normal. Fortaleza causa que los daños recibidos se reduzcan
entre un 5% y un 40% con una precisión del 80% y el efecto dura entre 1 y 7 turnos. Se puede utilizar
4 veces.*/

public class Fortaleza extends Ataque {

	public Fortaleza() {
		super("Fortaleza", Tipo.NORMAL, 0, 4, 100, new ModificacionEstadistica(100, 1, 7, TipoEstadistica.DEFENSA, 5, 40));
	}

}
