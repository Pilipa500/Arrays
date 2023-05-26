
public class HacerArrayconCincoElementos {

	public static void main(String[] args) {
		// Hacer un array con cuatro elementos usando de valor 5 en todos for
		int[]cinco=new int[5];
		
		for(int i = 0;i< cinco.length;i++) {
			cinco[i]=5;
		}
		for(int numero:cinco) {
			System.out.println(""+numero);
		}
	}

}
