package ataques;

import efectos.EstadoAlterado;
import enumeradores.Tipo;
import enumeradores.TipoEstado;

/*: Es un movimiento de tipo eléctrico. Impactrueno causa 50 de daño con una precisión
del 90% y tiene una probabilidad del 10% de paralizar al objetivo. La parálisis evitará que el oponente
pueda atacar y puede durar entre 1 y 3 turnos. Se puede utilizar 9 veces*/

public class Impactrueno extends Ataque {

	public Impactrueno() {
		super("Impactrueno", Tipo.ELECTRICO, 50, 9, 90, new EstadoAlterado(10, 1, 3, TipoEstado.PARALIZADO, 100, 100));
	}

}
