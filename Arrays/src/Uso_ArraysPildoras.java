
public class Uso_ArraysPildoras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			int[]matriz_aleatorios=new int[150];
			
			for(int i=0; i<matriz_aleatorios.length; i++) {
				
				matriz_aleatorios[i]=(int)Math.round(Math.random()*100);//con Math.round lo que hacemos es redondear los 
																		//numeros y Math.random buscar aleatorios entre 0 y 100
				}
			for(int numeros: matriz_aleatorios) {
				System.out.print(numeros+ " ");//en el syso le he quitado ln de println para que salgan todos los numeros un
												//a continuacion de otros y no salieran todos seguidos uno bajo otro.
			}
	}

}
