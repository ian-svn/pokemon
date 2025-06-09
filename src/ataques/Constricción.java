package ataques;

import efectos.DanioRecurrente;
import enumeradores.Tipo;
import enumeradores.TipoEstado;
import enumeradores.TipoValor;
/* Es un movimiento de tipo normal. Constricción causa 20 de daño durante 2 a 5 turnos
con una precisión de acierto del 85%. Se puede utilizar 5 veces.*/

public class Constricción extends Ataque {

	public Constricción() {
		super("Constriccion", Tipo.NORMAL, 20, 5, 85,  new DanioRecurrente(100, 2, 5, TipoEstado.NINGUNO, TipoValor.FIJO, 20, 20));
	}
	
}
