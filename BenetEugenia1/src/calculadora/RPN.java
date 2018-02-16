package calculadora;
/** Calculadora de notación inversa polaca que utiliza una pila.
Reverse Polish notation (RPN) Notación Polaca inversa, por ejemplo
la expresión: 4 * 5 - 7 / 2 % 3 nos da 1,5 respetando la prioridad de
los operadores en notación RPN seria: 4 5 * 7 2 / - 3 % 
*/
public class RPN {
	
	private String commando;	
	private Pila objPila;

	
	/** Contructor de la clase RPN
	 * 
	 * @param commando Expresión a calcular
	 */
	public RPN(String commando) {
		
		objPila = new Pila();		
		this.commando = commando;
	}			

	/** Calcula a partir de expresión RPN el resultado del cálculo mediante una pila
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