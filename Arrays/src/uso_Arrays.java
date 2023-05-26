
public class uso_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int[]mi_matriz=new int[5];
		
		mi_matriz[0]=5;
		mi_matriz[1]=38;
		mi_matriz[2]=-15;
		mi_matriz[3]=92;
		mi_matriz[4]=71;*/
		
		int[] mi_matriz= {5, 38, -15, 92, 71, 98, 67, 6, -16, 85, 24, 56, 70, 92};
	
		for(int i=0; i<mi_matriz.length; i++) {//esta es la manera de poder poner que calcule hasta la última posición
											//de arrays, porque no puedo saber cuantos hay, al ser muy numerosos
	
		System.out.println("Valor del indice" + i + "=" +mi_matriz[i]);
}
	}
}
