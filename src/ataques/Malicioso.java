package ataques;

import efectos.ModificacionEstadistica;
import enumeradores.Tipo;
import enumeradores.TipoEstadistica;

/*Es un movimiento de tipo normal. Malicioso causa que los ataques causen de un 5% a un
40% más con una probabilidad de acierto del 65%. Se puede utilizar 10 veces.*/

public class Malicioso extends Ataque {

	public Malicioso() {
		super("Malicioso", Tipo.NORMAL, 0, 10, 65, new ModificacionEstadistica(100, 1, 15, TipoEstadistica.ATAQUE, 5, 40));
	}

}
