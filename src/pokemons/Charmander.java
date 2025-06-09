package pokemons;

import ataques.Araniazo;
import ataques.Ascuas;
import ataques.Ataque;
import ataques.Grunido;
import ataques.PantallaDeHumo;	 
import enumeradores.Tipo;

public class Charmander extends Pokemon{
	public Charmander() {
		super("Charmander",750, new Tipo[] {Tipo.FUEGO}, new Ataque[] {new Araniazo(), new Grunido(), new Ascuas(), new PantallaDeHumo()});
	}
}
