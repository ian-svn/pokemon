package enumeradores;

public enum Tipo {

	NORMAL("Normal"),
	ELECTRICO("Electrico"),
	FUEGO("Fuego"), 
	AGUA("Agua"), 
	PLANTA("Planta"), 
	VENENO("Veneno");
	
	private String nombre;
	private Tipo[] efectivos;
	private Tipo[] pocoEfectivos;
	
	Tipo(String nombre) {
		this.nombre = nombre;
	}
	
	static {

		ELECTRICO.efectivos = new Tipo[] {AGUA};
		FUEGO.efectivos  = new Tipo[] {PLANTA};
		AGUA.efectivos = new Tipo[] {FUEGO};
		PLANTA.efectivos = new Tipo[] {AGUA};
		VENENO.efectivos = new Tipo[] {PLANTA};

		ELECTRICO.pocoEfectivos = new Tipo[] {ELECTRICO, PLANTA};
		FUEGO.pocoEfectivos = new Tipo[] {AGUA, FUEGO};
		AGUA.pocoEfectivos = new Tipo[] {AGUA, PLANTA};
		PLANTA.pocoEfectivos = new Tipo[] {FUEGO, PLANTA, VENENO};
		VENENO.pocoEfectivos = new Tipo[] {AGUA};
		
	}
	
	public float calcularEfectividad(Tipo tipoAtaque, Tipo[] tipoPokemon) {
		
		float multiplicadorDanio = 1f;
		
		for (int i = 0; i < tipoAtaque.efectivos.length; i++) {
			for (int j = 0; j < tipoPokemon.length; j++) {
				if(tipoAtaque.efectivos[i].equals(tipoPokemon[j])) {
					multiplicadorDanio*=2;
				}
			}
		}
		
		for (int i = 0; i < tipoAtaque.pocoEfectivos.length; i++) {
			for (int j = 0; j < tipoPokemon.length; j++) {
				if(tipoAtaque.pocoEfectivos[i].equals(tipoPokemon[j])) {
					multiplicadorDanio*=0.5f;
				}
			}
		}
		
		return multiplicadorDanio;
	}
	
}
