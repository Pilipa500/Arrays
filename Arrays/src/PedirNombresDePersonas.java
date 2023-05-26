import java.util.Scanner;

public class PedirNombresDePersonas {

	private static Scanner nombre;

	public static void main(String[] args) {
		//Hacer un programa que pida por teclado 3 nombres de personas
		//guardarlo en array y posteriormente imprimirlos por consola
		String []nombres=new String[3];
		
		nombre = new Scanner(System.in);
		System.out.println("Introduzca su nombre");
		nombres [0]=nombre.nextLine();
		System.out.println("Introduzca su nombre");
		nombres [1]=nombre.nextLine();
		System.out.println("Introduzca su nombre");
		nombres [2]=nombre.nextLine();
		
		
	System.out.println("Los nombres son: "+ nombres [0]+ " "+ nombres [1]+ " "+ nombres [2]);

	}
	

}
