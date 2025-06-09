package pokemons;

import ataques.Ataque;
import ataques.Grunido;
import ataques.LatigoCepa;
import ataques.Placaje;
import ataques.PolvoVenenoso;
import enumeradores.Tipo;

public class Bulbasaur extends Pokemon{

	public Bulbasaur(String nombre, Tipo[] tipos, Ataque[] ataques) {
		super("Bulbasaur", 850, new Tipo[] {Tipo.PLANTA, Tipo.VENENO}, new Ataque[] {new Placaje(), new Grunido(), new LatigoCepa(), new PolvoVenenoso()});
	}

}
