package algoritmos_de_ordenacion;

public class Test_Cocktail_Sort {

	private int[] array;
	private final int POS = 10;

	public void cargar() {
		array=new int[POS];
		for(int f=0;f<POS;f++) {
			array[f]=(int)(Math.random()*100);}
	}
	public void ordena_cocktail() {
		int i=0;
		int j = array.length-1;
		while (i<j){
			for (int k = i; k<j; k++) // direccion -->
				if (array[k] > array[k+1]) {
					int temp = array[k];
					array[k] = array [k+1];
					array[k+1] = temp;
				}
			j--;
			for (int k = j; k>i; k--) // direccion <--
				if (array[k] < array[k-1]) {
					int temp = array[k];
					array[k] = array [k-1];
					array[k-1] = temp;
				}
			i++;
		}
	}
	public void imprimir() {
		System.out.println("Vector ordenado por método Cocktail Sort.");
		for(int f=0;f<array.length;f++) {
			System.out.println(array[f]);
		}
	}
	public static void main(String[] ar) {
		Test_Cocktail_Sort pv=new Test_Cocktail_Sort();
		pv.cargar();
		pv.ordena_cocktail();
		pv.imprimir();
	}
}
