package ataques;

import enumeradores.Tipo;
import pokemons.Pokemon;

/*  Es un movimiento de tipo normal. Ataque corriente en el que el Pokemon usa sus garras
para soltar un rasguño. Arañazo causa 40 de daño con una precisión del 100% y no tiene efecto
secundario. Se puede utilizar infinitas veces.*/

public class Araniazo extends Ataque {

	public Araniazo() {
		super("Arañazo", Tipo.NORMAL, 40, -1, 100);
	}

	@Override
	public void utilizar(Pokemon pokemon) {
		pokemon.recibirDanio(super.danio);
	}
}
