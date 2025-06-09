package ataques;

import efectos.ModificacionEstadistica;
import enumeradores.Tipo;
import enumeradores.TipoEstadistica;

/* Es un movimiento de tipo normal. Baja entre un 1% y un 30% la precisión del
oponente, el efecto puede durar entre 1 y 5 turnos. El ataque tiene una precisión del 60%. Se puede
utilizar 4 veces.*/

public class PantallaDeHumo extends Ataque{

	public PantallaDeHumo() {
		super("Pantalla de Humo", Tipo.NORMAL, 0, 4, 100, new ModificacionEstadistica(100, 1, 5, TipoEstadistica.PRESICION, 1, 30));
	}

}
