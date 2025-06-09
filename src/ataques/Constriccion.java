package ataques;

import efectos.DanioRecurrente;
import enumeradores.Tipo;
import enumeradores.TipoEstado;
import enumeradores.TipoValor;

public class Constriccion extends Ataque {

	public Constriccion() {
		super("Constriccion", Tipo.NORMAL, 20, 5, 85, new DanioRecurrente(100, 2, 5, TipoEstado.NINGUNO, TipoValor.FIJO, 20, 20));
	}
} 