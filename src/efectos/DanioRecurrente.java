package efectos;

import enumeradores.TipoEstado;
import enumeradores.TipoValor;
import pokemons.Pokemon;
import utilidades.Aleatorio;

public class DanioRecurrente extends EfectoSecundario{

	private TipoEstado tipoEstado;
	private TipoValor tipoValor;
	private int danioMin, danioMax;
	
	public DanioRecurrente(int probabilidad, int turnosMin, int turnosMax,
			TipoEstado tipoEstado, TipoValor tipoValor, int danioMin, int danioMax) {
		super(probabilidad, turnosMin, turnosMax);
		this.tipoEstado = tipoEstado;
		this.tipoValor= tipoValor;
		this.danioMin = danioMin;
		this.danioMax = danioMax;
	}
	
	@Override
	public void aplicarEfecto(Pokemon pokemon) {
		if(tipoValor.equals(TipoValor.PORCENTUAL)) {
			final int DANIO = (pokemon.getHP() * Aleatorio.generarEntero(danioMin, danioMax)) / 100;
			pokemon.recibirDanio(DANIO);		
		} else {
			final int DANIO = Aleatorio.generarEntero(danioMin, danioMax);
			pokemon.recibirDanio(DANIO);
		}
	}
	
	
}
