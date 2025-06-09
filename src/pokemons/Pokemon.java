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
	
	public void inflingirDanio(Pokemon oponente, float danio) {
		float danioFinal = (danio * indiceAtaque) / 100;
		oponente.recibirDanio(danioFinal);
	}
	
	public void recibirDanio(float danio) {
		float danioFinal = (danio * indiceDefensa) / 100;
		if(danioFinal >= this.HP) {
			this.HP=0;
		}
		this.HP -= danioFinal;
	}

	public int getHP() {
		return HP;
	}

	
	
	public void actualizarTipoEstado() {
		if(turnosActuales>0) {
			turnosActuales--;
		} else {
			tipoEstado = TipoEstado.NINGUNO;
		}
	}
	
	public void actualizarEfectos() {
		for (int i = 0; i < efectos.size(); i++) {
			if(efectos.get(i).comprobarActividadEfecto()) {
				efectos.get(i).aplicarEfecto(this);
				efectos.get(i).actualizarEfecto();
			} else {
				efectos.remove(i);
			}
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
	
}
