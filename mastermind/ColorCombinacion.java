package mastermind;

public enum ColorCombinacion{
	Rojo('r'),
	Naranja('n'),
	Azul('a'),
	Violeta('v'),
	Marron('m'),
	Gris('g');

    private char clave;

    ColorCombinacion(char clave) {
        this.clave = clave;
    }

    public static ColorCombinacion obtenerColor(char caracter) {
        for (ColorCombinacion color : ColorCombinacion.values()) {
            if (color.clave == caracter) {
                return color;
            }
        }
        return null;
    }
    
    public static char getClaveEnIndice(int index) {
        return values()[index].clave;
    }

    public char getClave() {
        return this.clave;
    }
    
    public String getValor() {
        return this.toString();
    }
    
	public static String getTodasClaves() {
		String result = "";
		for(ColorCombinacion color : ColorCombinacion.values()) {
			result += color.getClave();
		}
		return result;
	}
}