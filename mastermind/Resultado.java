package mastermind;

public class Resultado {

	private int blancos;
	private int negros;
	protected static int longitudResultado = Propiedades.LONGITUD_COMBINACION;
	protected ColorResultado[] colores = new ColorResultado[longitudResultado];
	
	private Console consola = new Console();
	
	public Resultado(int blancos, int negros) {
		colores = new ColorResultado[longitudResultado];
		this.blancos = blancos;
		this.negros = negros;
		for (int i=0; i<negros;i++) {
			colores[i] = ColorResultado.obtenerColor('n');
		}
		for (int i=negros; i<blancos+negros;i++) {
			colores[i] = ColorResultado.obtenerColor('b');
		}
	}	
	
	public void imprimir() {
		assert colores[longitudResultado]!= null;
		for (int i = 0; i < colores.length; i++) {
				if (colores[i]!=null) { 
					consola.write(colores[i].getClave());
				}
		}
		consola.write("\n")  ;
	}
	public void imprimirResumenResultado() {
		consola.write("Resultado = " + negros + " Negros y " + blancos + " Blancos.\n");
	}
	
}
