package ataques;

import enumeradores.Tipo;
import pokemons.Pokemon;

/* Es un movimiento de tipo agua. Burbuja causa 40 de daño con una precisión del 100%. Se
puede utilizar 20 veces.*/

public class Burbuja extends Ataque {

	
	
	public Burbuja() {
		super("Burbuja", Tipo.AGUA, 40, 20, 100);
	}

	@Override
	public void utilizar(Pokemon pokemon) {
	}

	@Override
	public void aplicarEfectoSecundario(Pokemon pokemon) {
	}
	
}
