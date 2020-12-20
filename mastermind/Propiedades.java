package mastermind;

public class Propiedades {
	public static final int LONGITUD_COMBINACION = 4;
	public static final int MAXIMO_INTENTOS = 10;
	public static final String ASTERISCO = "*";
	
	public static final String MENSAJE_QUIERECONTINUAR = "¿Quieres otra partida S/N?\n";
	public static final String MENSAJE_INTRODUZCA_COMBINACION = "Introduzca Combinación Propuesta: ";
	public static final String MENSAJE_GANADOR = "Muy bien majete, has sido capaz de ganar, ¡¡Enhorabuena!! \n";
	public static final String MENSAJE_PERDEDOR = "Pero qué paquete eres, has agotado tus oportunidades loooser!!, \n";
	
	public static final String ERROR_LONGITUD = "Longitud Erronea\n";
	public static final String ERROR_COLORES_ERRONEOS = "Colores Erroneos, deben estar entre: " + ColorCombinacion.getTodasClaves() + " \n";
	public static final String ERROR_COLORES_DUPLICADOS = "Colores Duplicados, no seas bruto \n"; 

	

	
}
