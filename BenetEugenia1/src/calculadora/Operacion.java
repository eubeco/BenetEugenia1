package calculadora;
/** Operación básica entre dos operandos */

public class Operacion {
	
	char signo;
	double a, b;
	

	/** Constructor de la clase Operacion
	 * 
	 * @param signo: Define el tipo de operación
	 * @param a Operador 1	  
	 * @param b Operador 2
	 */
	public Operacion(char signo, double a, double b){
		this.signo = signo;
		this.a = a;
		this.b = b;
	}

	/** Realiza la operación básica entre los dos operandos
	 * 
	 * @return Resultado de la operación 
	 * @throws IllegalArgumentException si el signo de la operación no es válido
	 */
	public double operar() {

		double Rtdo;

		switch (signo) {
		case '+':
			Rtdo = a + b;
			break;
		case '-':
			Rtdo = a - b;
			break;
		case '*':
			Rtdo = a * b;
			break;
		case '/':
			Rtdo = a / b;
			break;
		case '%':
			Rtdo = a % b;
			break;
		case '^':
			Rtdo = Math.pow(a, b);
			break;		
		default:
			throw new IllegalArgumentException( );			
		}		
		return Rtdo;
	}

}
