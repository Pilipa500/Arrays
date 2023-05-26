import java.util.Arrays;

public class buscarEnUnArray {

	public static void main(String[] args) {
		//me declaro un array de 5 nombres desordenados
		String[]nombres= {"Pepe","Elena","Antonio", "Raquel","Pilar"};
		//llamo a método sort pra que ordene en orden ascendente
		Arrays.sort(nombres);
		//busco el nombre Carmen en el array
		int indice=Arrays.binarySearch(nombres,"Pilar");
		//imprimo la posicion en la que está Carmen
		System.out.println("Pilar está en la posicion: "+indice);

	}

}
