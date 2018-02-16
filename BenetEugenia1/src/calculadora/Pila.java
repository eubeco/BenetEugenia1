package calculadora;
/** Implementación Pila */

public class Pila {
	
	private  NodoPila arriba;
	
	
	/** Constructor de la clase Pila*/
	public Pila(){
		arriba = null;
	}
	
	/** Obtiene el nodo de arriba de la pila
	 * 
	 * @return Devuelve el nodo de arriba de la pila
	 */
	public NodoPila getArriba() {
		return arriba;
	}

	/** Inicializa el nodo de arriba de la pila 
	 * 
	 * @param arriba Nodo con el que se inicializa el nodo de arriba de la pila
	 */
	public void setArriba(NodoPila arriba) {
		this.arriba = arriba;
	}

	/** Pone un elemento en la parte superior del objeto pila
	 * 
	 * @param nuevo_dato Elemento que se pone en la parte superior de la pila
	 */
	public void pushPila(double nuevo_dato) {
		NodoPila nuevo_nodo = new NodoPila(nuevo_dato, arriba);
		arriba = nuevo_nodo;
	}
	
	/** Obtiene el elemento de superior de la pila
	 * 
	 * @return Devuelve el elemento superior de la pila
	 */
	public double popPila() {
		double dato_arriba = arriba.dato;
		arriba = arriba.abajo;
		return dato_arriba;
	}

}
