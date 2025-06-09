package efectos;

import pokemons.Pokemon;
import utilidades.Aleatorio;

public abstract class EfectoSecundario {
	private int probabilidad;
	private int turnosMin, turnosMax;
	private int turnosActuales;
	
	public EfectoSecundario(int probabilidad, int turnosMin, int turnosMax) {
		this.probabilidad = probabilidad;
		this.turnosMin = turnosMin;
		this.turnosMax = turnosMax;
		this.turnosActuales = Aleatorio.generarEntero(turnosMin, turnosMax);
	}
	
	public abstract void aplicarEfecto(Pokemon pokemon);

	public int getProbabilidad() {
		return probabilidad;
	}
	
	public void actualizarEfecto() {
		if(this.turnosActuales>0) {
			this.turnosActuales--;
		}
	}
	
	public boolean comprobarActividadEfecto() {
		if(turnosActuales<=0){
			return false;
		}
		return true;
	}
	
	
	
	
}
