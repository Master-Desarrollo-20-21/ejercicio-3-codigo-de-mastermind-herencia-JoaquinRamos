package mastermind;

public class Intento {
	
	private Combinacion combinacionPropuesta;
	private CombinacionSecreta combinacionSecreta;
	private Resultado resultado;
	private String estadoJugador = "Jugando";
	
	public Intento(CombinacionSecreta combinacionSecreta){
		this.combinacionSecreta = combinacionSecreta;
		this.combinacionPropuesta = new Combinacion();    
		this.combinacionPropuesta.leer();
		if (this.combinacionSecreta.equals(this.combinacionPropuesta)) {
			estadoJugador = "Ganador";
		}
		this.resultado = this.combinacionSecreta.comparar(this.combinacionPropuesta);	
		this.resultado.imprimirResumenResultado();
		this.resultado.imprimir();
	}

	public String getEstadoJugador() {
		return estadoJugador;
	}

	public void setEstadoJugador(String estadoJugador) {
		this.estadoJugador = estadoJugador;
	}
}
