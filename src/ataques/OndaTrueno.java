package ataques;

import efectos.EstadoAlterado;
import enumeradores.Tipo;
import enumeradores.TipoEstado;

/*Es un movimiento de tipo eléctrico. Onda trueno no causa daño y tiene una
probabilidad de paralizar al oponente del 60%. La parálisis dura entre 1 y 5 turnos. Se puede utilizar
4 veces.*/

public class OndaTrueno extends Ataque {

	public OndaTrueno() {//60, 1, 5
		super("OndaTrueno", Tipo.ELECTRICO, 0, 4, 100, new EstadoAlterado(60, 1, 5, TipoEstado.PARALIZADO, 100, 100));
	}

}
