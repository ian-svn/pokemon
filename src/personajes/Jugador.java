package personajes;

import pokemons.Charmander;
import pokemons.Pikachu;
import pokemons.Pokemon;
import pokemons.Squirtle;
import utilidades.Consola;

public class Jugador extends Personaje{

	public Jugador(String nombre) {
		super(nombre);
		super.agregarPokemon(new Pikachu());
		super.agregarPokemon(new Charmander());
		super.agregarPokemon(new Squirtle());
	}

	@Override
	public void ordenarAtaque(Pokemon oponente) {
		super.pokemons[super.indicePokemonActivo].mostrarAtaques();
		System.out.println("Ingrese que ataque quiere realizar: ");
		int indice = Consola.ingresarEntero(4);
		super.pokemons[super.indicePokemonActivo].realizarAtaque(oponente,
				super.pokemons[super.indicePokemonActivo].getAtaques().length);
	}

}
