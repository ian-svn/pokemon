package ataques;

import efectos.ModificacionEstadistica;
import enumeradores.Tipo;
import enumeradores.TipoEstadistica;

/*: Es un movimiento de tipo agua. Rayo burbuja causa 60 de daño y tiene una
probabilidad del 10% de bajar la precisión del oponente entre un 5% y 15% con una precisión de
acierto del 80%, haciendo que el efecto dure entre 1 y 3 turnos. Se puede utilizar 8 veces.*/

public class RayoBurbuja extends Ataque{

	public RayoBurbuja() {
		super("Rayo Burbuja", Tipo.AGUA, 60, 8, 80, new ModificacionEstadistica(10, 1, 3, TipoEstadistica.PRESICION, 5, 15));
	}

}
