package personajes;

import pokemons.Bulbasaur;
import pokemons.Ekans;
import pokemons.Pokemon;
import pokemons.Staryu;
import utilidades.Aleatorio;

public class Oponente extends Personaje{

	public Oponente(String nombre) {
		super(nombre);
		super.agregarPokemon(new Bulbasaur());
		super.agregarPokemon(new Staryu());
		super.agregarPokemon(new Ekans());
	}

	@Override
	public void ordenarAtaque(Pokemon oponente) {
		super.pokemons[super.indicePokemonActivo].realizarAtaque(oponente, 
				Aleatorio.generarEntero(super.pokemons[super.indicePokemonActivo].getAtaques().length));
	}
	
}
