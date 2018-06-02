package algoritmos_de_ordenacion;

public class Test_Burbuja {
	private int[] array;
	private final int POS = 10;
	
	public void cargar() {
		array=new int[POS];
		for(int f=0;f<POS;f++) {
			array[f]=(int)(Math.random()*100);}
	}
	public void burbuja() {
		for (int i = 0; i< POS-1; i++) {
			for (int j = POS-1; j > i; j--) {
				if (array[j] < array[j-1]) {

					int aux = array[j];
					array[j] = array [j-1];
					array[j-1] = aux;
				}
			}
		}
	}
	public void imprimir() {
		System.out.println("Vector ordenado por método burbuja.");
		for(int f=0;f<array.length;f++) {
			System.out.println(array[f]);
		}
	}
	public static void main(String[] ar) {
		Test_Burbuja pv=new Test_Burbuja();
		pv.cargar();
		pv.burbuja();
		pv.imprimir();
	}
}