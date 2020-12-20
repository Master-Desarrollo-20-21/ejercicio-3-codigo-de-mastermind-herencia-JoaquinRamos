package mastermind;

public class CombinacionSecreta extends Combinacion{
	
	private static Console consola = new Console();
	
	public CombinacionSecreta() {
		super();
		this.setCombinacionAleatoria();
	}

	@Override
	public void imprimir() {
		assert colores[longitudCombinacion]!= null;
		for (int i = 0; i < colores.length; i++) {
				//consola.write(Mensajes.ASTERISCO);
				consola.write(colores[i].getClave());
		}
		consola.write("\n")  ;
	}
}
