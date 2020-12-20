package mastermind;

public enum ColorResultado {
	Blanco('b'),
	Negro('n');

    private char clave;

    ColorResultado(char clave) {
        this.clave = clave;
    }

    public static ColorResultado obtenerColor(char caracter) {
        for (ColorResultado color : ColorResultado.values()) {
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
		for(ColorResultado color : ColorResultado.values()) {
			result += color.getClave();
		}
		return result;
	}
}	