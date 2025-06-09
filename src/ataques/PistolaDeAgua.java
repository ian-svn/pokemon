package ataques;

import enumeradores.Tipo;

/* Es un movimiento de tipo agua. Pistola agua causa 50 de daño con una precisión
del 65% y no tiene ningún efecto secundario. Se puede utilizar 5 veces.*/

public class PistolaDeAgua extends Ataque{

	public PistolaDeAgua() {
		super("PistolaDeAgua", Tipo.AGUA, 50, 5, 65);
	}

}
