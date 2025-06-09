package ataques;

import enumeradores.Tipo;

/*Es un movimiento de tipo normal. Placaje causa 35 daño con una precisión del 95% y no
tiene ningún efecto secundario. Se puede utilizar infinitas veces*/

public class Placaje extends Ataque{

	public Placaje() {
		super("Placaje", Tipo.NORMAL, 35, -1, 95);
	}
	
}
