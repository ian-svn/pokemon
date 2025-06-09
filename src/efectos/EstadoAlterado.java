package efectos;

import enumeradores.TipoEstado;
import pokemons.Pokemon;

public class EstadoAlterado extends EfectoSecundario{

	private TipoEstado tipoAlterado;
	private int porcentajeMin;
	private int porcentajeMax;
	
	public EstadoAlterado(int probabilidad, int turnosMin, int turnosMax,
			TipoEstado tipoAlterado, int porcentajeMin, int porcentajeMax) {
		super(probabilidad, turnosMin, turnosMax);
		this.tipoAlterado = tipoAlterado;
		this.porcentajeMin = porcentajeMin;
		this.porcentajeMax = porcentajeMax;
	}

	@Override
	public void aplicarEfecto(Pokemon pokemon) {
		pokemon.aplicarEstado(this.tipoAlterado, this.turnosActuales);
	}

	@Override
	public void mostrar() {
		System.out.println("| "+ this.tipoAlterado + " | ");
	}
	
}
