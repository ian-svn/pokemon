package ataques;

import enumeradores.Tipo;

/*: Es un movimiento de tipo planta. Causa 45 puntos de daño con una precisión de 100%.
Se puede utilizar 15 veces.*/

public class LatigoCepa extends Ataque {

	public LatigoCepa() {
		super("Latigo Cepa", Tipo.PLANTA, 45, 15, 100);
	}

}
