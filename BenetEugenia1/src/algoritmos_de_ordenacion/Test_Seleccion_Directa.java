package algoritmos_de_ordenacion;

public class Test_Seleccion_Directa {
	private int[] array;
	private final int POS = 10;
	
	public void cargar() {
		array=new int[POS];
		for(int f=0;f<POS;f++) {
			array[f]=(int)(Math.random()*100);}
	}
	public void seleccion_directa( ) {
		int minimo, aux;
		for (int i = 0; i< POS; i++) {
			minimo = i;
			for (int j = i+1; j < POS; j++)
				if (array[j] < array[minimo])
					minimo = j;
			aux = array[minimo];
			array[minimo] = array [i];
			array[i] = aux;
		}
	}
	public void imprimir() {
		System.out.println("Vector ordenado por método de selección directa.");
		for(int f=0;f<array.length;f++) {
			System.out.println(array[f]);
		}
	}
	public static void main(String[] ar) {
		Test_Seleccion_Directa pv=new Test_Seleccion_Directa();
		pv.cargar();
		pv.seleccion_directa();
		pv.imprimir();
	}
}