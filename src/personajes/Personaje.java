package personajes;

import pokemons.Pokemon;

public abstract class Personaje {
	
	private String nombre;
	private final int CANT_POKEMON_MAX = 3;
	protected Pokemon[] pokemons = new Pokemon[CANT_POKEMON_MAX];
	private int cantPokemons = 0;
	protected int indicePokemonActivo = 0;
	
	public Personaje(String nombre) {
		this.nombre = nombre;
	}
	
	public void agregarPokemon(Pokemon pokemon) {
		pokemons[cantPokemons] = pokemon;
		cantPokemons++;
	}

	public abstract void ordenarAtaque(Pokemon oponente);
	
}
