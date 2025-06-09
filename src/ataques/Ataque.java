package ataques;

import efectos.EfectoSecundario;
import enumeradores.Tipo;
import pokemons.Pokemon;
import utilidades.Aleatorio;

public abstract class Ataque {

	protected String nombre;
	protected int danio;
	protected int cantUsos;
	protected int probabilidadAcierto;
	protected Tipo tipo;
	protected EfectoSecundario efectoSecundario;
	
	public Ataque(String nombre, Tipo tipo, int danio, int cantUsos, int probabilidadAcierto) {
		this.nombre = nombre;
		this.danio = danio;
		this.cantUsos = cantUsos;
		this.probabilidadAcierto = probabilidadAcierto;
	}
	
	public Ataque(String nombre, Tipo tipo, int danio, int cantUsos, int probabilidadAcierto, EfectoSecundario efectoSecundario) {
		this.nombre = nombre;
		this.danio = danio;
		this.cantUsos = cantUsos;
		this.probabilidadAcierto = probabilidadAcierto;
		this.efectoSecundario = efectoSecundario;
	}
	
	public void utilizar(Pokemon pokemon, Pokemon oponente) {
		pokemon.inflingirDanio(oponente, this.danio);
		aplicarEfectoSecundario(oponente);
	}
	
	public void aplicarEfectoSecundario(Pokemon oponente) {
		if(Aleatorio.calcularProbabilidad(this.efectoSecundario.getProbabilidad())) {
			oponente.aplicarEfecto(efectoSecundario);
		}
	}
	
	public void mostrar() {
		System.out.println("\r\n"
				+ "	 nombre\r\n " + this.nombre
				+ "	 danio\r\n" + this.danio
				+ "	 cantUsos\r\n" + this.cantUsos
				+ "	 probabilidadAciert\r\n" + this.probabilidadAcierto);
	}

}
