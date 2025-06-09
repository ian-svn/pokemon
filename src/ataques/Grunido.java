package ataques;

import efectos.ModificacionEstadistica;
import enumeradores.Tipo;
import enumeradores.TipoEstadistica;

/*Es un movimiento de tipo normal. Gruñido baja entre un 1% y un 15% el ataque del
oponente, y dura entre 1 y 4 turnos. Tiene una precisión del 100%. Se puede utilizar 5 veces.*/

public class Grunido extends Ataque {
	public Grunido() {
		super("Grunido", Tipo.NORMAL, 0, 5, 100, new ModificacionEstadistica(100, 1, 7, TipoEstadistica.DEFENSA, 1, 15));
	}
}
