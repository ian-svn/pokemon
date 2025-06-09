package ataques;

import enumeradores.Tipo;

/*Es un movimiento de tipo normal. Mordisco causa 35 puntos de daño con una
probabilidad de acierto del 95%. Se puede utilizar 15 veces.*/

public class Mordisco extends Ataque {

	public Mordisco() {
		super("Mordisco", Tipo.NORMAL, 35, 15, 95);
	}

}
