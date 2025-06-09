package pokemons;

import ataques.Ataque;
import ataques.Grunido;
import ataques.LatigoCepa;
import ataques.Placaje;
import ataques.PolvoVenenoso;
import enumeradores.Tipo;

public class Squirtle extends Pokemon{

	public Squirtle(String nombre, Tipo[] tipos, Ataque[] ataques) {
		super("Squirtle", 720, new Tipo[] {Tipo.AGUA	}, new Ataque[] {new Placaje(), new Grunido(), new LatigoCepa(), new PolvoVenenoso()});
	}

}
