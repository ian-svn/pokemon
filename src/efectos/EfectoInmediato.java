package efectos;

import enumeradores.TipoEstado;
import pokemons.Pokemon;
import utilidades.Aleatorio;

public class EfectoInmediato extends EfectoSecundario{

	private TipoEstado tipoEstado;
	private int valorMin;
	private int valorMax;
	
	public EfectoInmediato(int probabilidad, TipoEstado tipoEstado, int valorMin, int valorMax) {
		//                tmin tmax
		super(probabilidad, 1, 1);
		this.valorMin = valorMin;
		this.valorMax = valorMax;
	}
	
	@Override
	public void aplicarEfecto(Pokemon pokemon) {
		final int DANIO = (pokemon.getHP() * Aleatorio.generarEntero(valorMin, valorMax)) / 100;
		pokemon.recibirDanio(DANIO);
	}
	
	
}
