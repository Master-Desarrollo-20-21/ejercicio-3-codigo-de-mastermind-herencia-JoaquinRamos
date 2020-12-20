package mastermind;

public class Tablero {
	
	private int numIntentosMaximos;
	private int numIntento;
	private CombinacionSecreta combinacionSecreta;
	private Intento[] intentos;
	
	private Console consola = new Console();
	
	public Tablero(){
		combinacionSecreta = new CombinacionSecreta();
		combinacionSecreta.imprimir();
		numIntentosMaximos = Propiedades.MAXIMO_INTENTOS;
		numIntento = 0;
		intentos = new Intento[Propiedades.MAXIMO_INTENTOS];
	}
	
	public void jugar() {
		boolean haGanado = false;
		do {
			intentos[numIntento] = new Intento(combinacionSecreta);
			haGanado = intentos[numIntento].getEstadoJugador().equalsIgnoreCase("Ganador");
			numIntento++;
		} while (!haGanado  && numIntento<numIntentosMaximos);
		if (haGanado) {
			consola.write(Propiedades.MENSAJE_GANADOR);
			
		}
		else {
			consola.write(Propiedades.MENSAJE_PERDEDOR)  ;
		}
	}
}
