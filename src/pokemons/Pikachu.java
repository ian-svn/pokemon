package pokemons;

import ataques.Ataque;
import ataques.Grunido;
import ataques.Impactrueno;
import ataques.Latigo;
import ataques.OndaTrueno;
import enumeradores.Tipo;

public class Pikachu extends Pokemon{

	public Pikachu() {
		super("Pikachu",800, new Tipo[] {Tipo.ELECTRICO}, new Ataque[] {new Latigo(), new Impactrueno(), new Grunido(), new OndaTrueno()});
	}

}
