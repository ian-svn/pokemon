package pokemons;

import java.util.ArrayList;
import java.util.List;

import ataques.Ataque;
import efectos.EfectoSecundario;
import enumeradores.Tipo;
import enumeradores.TipoEstado;

public abstract class Pokemon {
	private String nombre;
	private Tipo[] tipos;
	private Ataque[] ataques;
	private int HP;
	private int indiceAtaque = 100;
	private int indiceDefensa = 100;
	private int indicePrecision = 100;
	private int turnosActuales = 0;
	private TipoEstado tipoEstado = TipoEstado.NINGUNO;
	private ArrayList<EfectoSecundario> efectos = new ArrayList<>();
	
	public Pokemon(String nombre, int HP, Tipo[] tipos, Ataque[] ataques) {
		this.nombre = nombre;
		this.HP = HP;
		this.tipos = tipos;
		this.ataques = ataques;
	}
	
	public void realizarAtaque(Pokemon oponente, int indice) {
		this.ataques[indice].utilizar(this, oponente);
	}
	
	public void inflingirDanio(Pokemon oponente, float danio) {
		if(!tipoEstado.equals(TipoEstado.PARALIZADO)) {
			float danioFinal = (danio * indiceAtaque) / 100;
			oponente.recibirDanio(danioFinal);
		}
	}
	
	public void recibirDanio(float danio) {
		float danioFinal = (danio * indiceDefensa) / 100;
		if(danioFinal >= this.HP) {
			this.HP=0;
		}
		this.HP -= danioFinal;
	}
	
	public void actualizarTipoEstado() {
		if(turnosActuales>0) {
			turnosActuales--;
		} else {
			tipoEstado = TipoEstado.NINGUNO;
		}
	}
	
	public void actualizarEfectos() {
	    ArrayList<EfectoSecundario> efectosActivos = new ArrayList<>();
	    for (EfectoSecundario efecto : efectos) {
	        if (efecto.comprobarActividadEfecto()) {
	            efecto.aplicarEfecto(this);
	            efecto.actualizarEfecto();
	            efectosActivos.add(efecto);
	        }
	    }
	    this.efectos = efectosActivos;
	}
	
	public void mostrarAtaques() {
		for (int i = 0; i < ataques.length; i++) {
			ataques[i].mostrar();
		}
	}
	
	public void aplicarEfecto(EfectoSecundario efecto) {
		this.efectos.add(efecto);
	}
	
	public void aplicarEstado(TipoEstado tipoEstado) {
		this.tipoEstado = tipoEstado;
	}
	

	public int getIndiceAtaque() {
		return indiceAtaque;
	}

	public void setIndiceAtaque(int indiceAtaque) {
		this.indiceAtaque = indiceAtaque;
	}

	public int getIndiceDefensa() {
		return indiceDefensa;
	}

	public void setIndiceDefensa(int indiceDefensa) {
		this.indiceDefensa = indiceDefensa;
	}

	public int getIndicePrecision() {
		return indicePrecision;
	}

	public void setIndicePrecision(int indicePrecision) {
		this.indicePrecision = indicePrecision;
	}

	public int getHP() {
		return HP;
	}

	public Ataque[] getAtaques() {
		return ataques;
	}
	
	
	
	
}
