package ataques;

import efectos.EfectoInmediato;
import enumeradores.Tipo;
import enumeradores.TipoEstado;
import pokemons.Pokemon;

/*Es un movimiento de tipo fuego. Ascuas causa daño y tiene una probabilidad del 10% de
quemar al objetivo. Si el objetivo es quemado pierde entre el 50% y el 70% del total de su vida. El
ataque causa 40 puntos de daño con una precisión de 100%. Se puede utilizar 7 veces.
*/

public class Ascuas extends Ataque {
	
	public Ascuas() {
		super("Ascuas", Tipo.FUEGO, 40, 7, 100, new EfectoInmediato(10, TipoEstado.QUEMADO, 50, 70));
	}

	@Override
	public void aplicarEfectoSecundario(Pokemon pokemon) {
		
	}

}
