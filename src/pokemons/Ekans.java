package pokemons;

import ataques.Ataque;
import ataques.Constricción;
import ataques.Malicioso;
import ataques.Mordisco;
import ataques.PolvoVenenoso;
import enumeradores.Tipo;

public class Ekans extends Pokemon{

	public Ekans() {
		super("Ekans", 770, new Tipo[] {Tipo.VENENO}, new Ataque[] {new Constricción(), new Malicioso(), new PolvoVenenoso(), new Mordisco()});
	}

}
