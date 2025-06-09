package personajes;

import pokemons.Pokemon;

public abstract class Personaje {
	
	private String nombre;
	private final int CANT_POKEMON_MAX = 3;
	private Pokemon[] pokemon = new Pokemon[CANT_POKEMON_MAX];
	private int indicePokemonActivo = 0;
	
	public Personaje(String nombre) {
		this.nombre = nombre;
	}
	
	public void ordenarAtaque() {
		
	}

	public abstract void ordenarAtaque(Pokemon pokemon);
	
	
	
}
