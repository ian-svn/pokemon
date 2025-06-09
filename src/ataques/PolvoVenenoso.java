package ataques;

import efectos.EstadoAlterado;
import enumeradores.Tipo;
import enumeradores.TipoEstado;

/* Es un movimiento de tipo veneno. Polvo veneno envenena al objetivo reduciendo
entre un 1% y un 5% su vida por turno durante un rango de 1 a 10 turnos. Tiene una precisión del
70%. Se puede utilizar 4 veces.*/

public class PolvoVenenoso extends Ataque{

	public PolvoVenenoso() {
		super("PolvoVenenoso", Tipo.VENENO, 0, 4, 70, new EstadoAlterado(100, 1, 10, TipoEstado.ENVENENADO, 1, 5));
	}

}
