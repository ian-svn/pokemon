package pokemons;

import ataques.Ataque;
import ataques.Fortaleza;
import ataques.PistolaDeAgua;
import ataques.Placaje;
import ataques.RayoBurbuja;
import enumeradores.Tipo;

public class Staryu extends Pokemon{

	public Staryu() {
		super("Staryu", 650, new Tipo[] {Tipo.AGUA}, new Ataque[] {
				new Placaje(), new Fortaleza(), new PistolaDeAgua(), new RayoBurbuja()});
	}

}
