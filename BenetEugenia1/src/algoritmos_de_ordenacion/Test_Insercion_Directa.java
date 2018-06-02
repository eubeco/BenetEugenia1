package algoritmos_de_ordenacion;

public class Test_Insercion_Directa {	
		private int[] array;
		private final int POS = 10;
		
		public void cargar() {
			array=new int[POS];
			for(int f=0;f<POS;f++) {
				array[f]=(int)(Math.random()*100);}
		}
		public void insercion_directa ( ) {
			int aux;
			int j;
			for (int i=1; i<=9; i++) {
				aux = array[i];
				for (j=i-1; j>=0 && array[j]>aux; j--){
					array[j+1] = array[j];
					array[j] = aux;
				}
			}
		}
		public void imprimir() {
			System.out.println("Vector ordenado por método de la inserción directa.");
			for(int f=0;f<array.length;f++) {
				System.out.println(array[f]);
			}
		}
		public static void main(String[] ar) {
			Test_Insercion_Directa pv=new Test_Insercion_Directa();
			pv.cargar();
			pv.insercion_directa();
			pv.imprimir();
		}
	}
