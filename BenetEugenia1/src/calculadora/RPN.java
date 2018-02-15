package calculadora;

public class RPN {
	
	private String commando;	
	private Pila objPila;

	
	public RPN(String commando) {
		
		objPila = new Pila();		
		this.commando = commando;
	}
	
	
	
	public double resultado( ) {
		double a, b;
		int j;
		for(int i = 0; i < commando.length( ); i++) {
			// si es un digito
			if(Character.isDigit(commando.charAt(i))) {
				double numero;
				// obtener un string a partir del numero
				String temp = "";
				for(j = 0; (j < 100) && (Character.isDigit(
						commando.charAt(i)) || (commando.charAt(i) == '.')); j++, i++) {
					temp = temp + String.valueOf(commando.
							charAt(i));
				}
				// convertir a double y añadir a la pila
				numero = Double.parseDouble(temp);
				objPila.pushPila(numero);
			} else if(commando.charAt(i) == '+') {
				b = objPila.popPila();
				a = objPila.popPila();
				objPila.pushPila(a + b);
			} else if(commando.charAt(i) == '-') {
				b = objPila.popPila();
				a = objPila.popPila();
				objPila.pushPila(a - b);
			} else if(commando.charAt(i) == '*') {
				b = objPila.popPila();
				a = objPila.popPila();
				objPila.pushPila(a * b);
			} else if(commando.charAt(i) == '/') {
				b = objPila.popPila();
				a = objPila.popPila();
				objPila.pushPila(a / b);
			}
			else if(commando.charAt(i) == '^') {
				b = objPila.popPila();
				a = objPila.popPila();
				objPila.pushPila(Math.pow(a, b));}
			else if(commando.charAt(i) == '%') {
				b = objPila.popPila();
				a = objPila.popPila();
				objPila.pushPila(a%b);
			} else if(commando.charAt(i) != ' ') {
				throw new IllegalArgumentException( );
			}
		}
		double val = objPila.popPila();
		if(objPila.getArriba() != null) {
			throw new IllegalArgumentException( );
		}
		return val;
	}
}