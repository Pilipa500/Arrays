
public class ArraysforYconMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]numeros;
		numeros=new int[4000];
		
		for(int i=0; i<numeros.length; i++) {
			numeros[1]=generarNumeroAleatorio();
		}
		
		mostrarArray(numeros);
	}

	private static void mostrarArray(int[] numeros) {
		System.out.println("{");
		for(int i=0;i<numeros.length-1;i++) {
		System.out.println(numeros[i]+",");
		}	
		System.out.println(numeros[numeros.length-1]+"}");
	}

	private static int generarNumeroAleatorio() {
		return (int) Math.round(Math.random()*100);
		
	}

}
