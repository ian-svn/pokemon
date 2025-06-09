package efectos;

import enumeradores.TipoEstadistica;
import pokemons.Pokemon;
import utilidades.Aleatorio;

public class ModificacionEstadistica extends EfectoSecundario{

	private TipoEstadistica tipoEstadistica;
	private int porcentajeMin, porcentajeMax;
	private int porcentajeActual;

	public ModificacionEstadistica(int probabilidad, int turnosMin, int turnosMax, 
			TipoEstadistica tipoEstadistica,int porcentajeMin, int porcentajeMax) {
		super(probabilidad, turnosMin, turnosMax);
		this.tipoEstadistica = tipoEstadistica;
		this.porcentajeMin = porcentajeMin;
		this.porcentajeMax = porcentajeMax;
		this.porcentajeActual = Aleatorio.generarEntero(porcentajeMin, porcentajeMax);
	}
	
	
	@Override
	public void aplicarEfecto(Pokemon pokemon) {
		switch(tipoEstadistica) {
			case ATAQUE:
				pokemon.setIndiceAtaque(porcentajeActual);
				break;
			case DEFENSA:
				pokemon.setIndiceDefensa(porcentajeActual);
				break;
			case PRESICION:
				pokemon.setIndicePrecision(porcentajeActual);
				break;
		}
	}


	@Override
	public void mostrar() {
		
	}
	
}
