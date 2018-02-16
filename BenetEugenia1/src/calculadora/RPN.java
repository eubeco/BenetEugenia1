package calculadora;
/** Calculadora de notaci�n inversa polaca que utiliza una pila.
Reverse Polish notation (RPN) Notaci�n Polaca inversa, por ejemplo
la expresi�n: 4 * 5 - 7 / 2 % 3 nos da 1,5 respetando la prioridad de
los operadores en notaci�n RPN seria: 4 5 * 7 2 / - 3 % 
*/
public class RPN {
	
	private String commando;	
	private Pila objPila;

	
	/** Contructor de la clase RPN
	 * 
	 * @param commando Expresi�n a calcular
	 */
	public RPN(String commando) {
		
		objPila = new Pila();		
		this.commando = commando;
	}			

	/** Calcula a partir de expresi�n RPN el resultado del c�lculo mediante una pila
	 * 
	 * @return Devuelve el resultado (double)
	 */
	public double resultado( ) {
		
		double a, b;
		
		for(int i = 0; i < commando.length( ); i++) {

			if(Character.isDigit(commando.charAt(i))) {
				double numero;

				// obtener un string a partir del numero
				String temp = "";
				for(int j = 0; (j < 100) && (Character.isDigit(commando.charAt(i)) || (commando.charAt(i) == '.')); j++, i++) {
					temp = temp + String.valueOf(commando.charAt(i));
				}
				
				numero = Double.parseDouble(temp);
				objPila.pushPila(numero);

			} else if (commando.charAt(i) != ' '){
				
				b = objPila.popPila();
				a = objPila.popPila();
				Operacion objOperacion = new Operacion(commando.charAt(i),a,b);
				objPila.pushPila(objOperacion.operar());				
			}
		}
		double val = objPila.popPila();
		if(objPila.getArriba() != null) {
			throw new IllegalArgumentException( );
		}
		return val;
	}
}