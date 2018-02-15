package calculadora;

public class Pila {
	
	private  NodoPila arriba;	
	
	
	public Pila(){
		arriba = null;
	}
	
	public NodoPila getArriba() {
		return arriba;
	}

	public void setArriba(NodoPila arriba) {
		this.arriba = arriba;
	}

	public void pushPila(double nuevo_dato) {
		NodoPila nuevo_nodo = new NodoPila(nuevo_dato, arriba);
		arriba = nuevo_nodo;
	}
	
	public double popPila() {
		double dato_arriba = arriba.dato;
		arriba = arriba.abajo;
		return dato_arriba;
	}

}
