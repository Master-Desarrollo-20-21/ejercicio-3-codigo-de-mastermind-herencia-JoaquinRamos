package mastermind;

import java.util.Random;

public class Combinacion {

	protected static int longitudCombinacion = Propiedades.LONGITUD_COMBINACION;
	protected ColorCombinacion[] colores = new ColorCombinacion[longitudCombinacion];
	
	private Console consola = new Console();
	
	public Combinacion() {
		colores = new ColorCombinacion[longitudCombinacion];
	}	
	
	public String toString() {
		assert colores[longitudCombinacion]!= null;
		String combinacion = "";
		for (int i = 0; i < colores.length; i++) {
			combinacion += colores[i].getClave();
		}
		return combinacion;
	}
	
	public void imprimir() {
		assert colores[longitudCombinacion]!= null;
		for (int i = 0; i < colores.length; i++) {
				consola.write(colores[i].getClave());
		}
		consola.write("\n")  ;
	}

	public void leer() {
		String leido;
		String error;
		do {
			leido= consola.readString(Propiedades.MENSAJE_INTRODUZCA_COMBINACION);
			error = chequeaError(leido);
		}while (error != null);
		colores = new ColorCombinacion[longitudCombinacion];
		for (int i = 0; i < longitudCombinacion; i++) {
			 colores[i] = ColorCombinacion.obtenerColor(leido.charAt(i));
		}
	}
	
	private String chequeaError(String texto) {
		if (texto.length() != longitudCombinacion) {
				consola.write(Propiedades.ERROR_LONGITUD);
				return Propiedades.ERROR_LONGITUD;
		}
		for (int i = 0; i < texto.length(); i++) {
			String todosColoresPosibles = ColorCombinacion.getTodasClaves();
			if ( !todosColoresPosibles.contains(texto.substring(i, i+1))) {
				consola.write(Propiedades.ERROR_COLORES_ERRONEOS);
				return Propiedades.ERROR_COLORES_ERRONEOS;
			}
			for (int j = 0; j < i; j++) {
				if (texto.charAt(j) == texto.charAt(i)) {
					consola.write(Propiedades.ERROR_COLORES_DUPLICADOS);
					return Propiedades.ERROR_COLORES_DUPLICADOS;
				}
			}
		}
		return null;
	}
	
	protected void setCombinacionAleatoria() {
		colores = new ColorCombinacion[longitudCombinacion];
        Random random = new Random();
        for (int i = 0; i < longitudCombinacion; i++) {
            int indice;
            do {
            	indice = random.nextInt(ColorCombinacion.values().length);
            } 
            while (contieneIndice(indice));
            colores[i] = ColorCombinacion.obtenerColor(ColorCombinacion.getClaveEnIndice(indice));
        }
    }
	
	protected boolean contieneIndice(int indice){
        for (int i = 0; i < longitudCombinacion; i++) {
        	if(colores[i]!= null && ColorCombinacion.getClaveEnIndice(indice) == colores[i].getClave()) {
        		return true;
        	}
        }
        return false;
    }
	
	protected boolean equals(Combinacion cc){
		assert colores!= null;
		assert cc.toString()!= null;
		return this.toString().equals(cc.toString());
    }
	
	public Resultado comparar(Combinacion cc){
		assert colores[longitudCombinacion]!= null;
		assert cc!= null;
		int blancos = 0;
		int negros = 0;
        for (int i = 0; i < longitudCombinacion; i++) {
        	for (int j = 0; j < colores.length; j++) {
				if(cc.colores[i] == colores[j]  ) {
					if (i==j) negros ++;
					else blancos ++;
				}
        	}
        }
        return new Resultado(blancos, negros);
    }
}
