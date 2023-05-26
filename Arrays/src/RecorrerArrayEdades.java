
public class RecorrerArrayEdades {

	public static void main(String[] args) {
		int[]edades= {27,34,1,12,5};
		int[]edades2=edades;
		edades2[3]=7;
		mostrarArray(edades);
		cambiarPrimero(edades);
	}

	private static void cambiarPrimero(int[] array) {
		array[0]=5;
		
	}
	//mostrarArray(numeros);


private static void mostrarArray(int[] numeros) {
	System.out.println("{");
	for(int i=0;i<numeros.length-1;i++) {
	System.out.println(numeros[i]+",");
	}	
	System.out.println(numeros[numeros.length-1]+"}");
}

@SuppressWarnings("unused")
private static int generarNumeroAleatorio() {
	return (int) Math.round(Math.random()*100);
	
}
}


