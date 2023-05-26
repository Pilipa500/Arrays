import java.util.Scanner;

public class ejemploArray {

	private static Scanner sc;

	public static void main(String[] args) {
		// Conseguir saber cual de los elementos del array queremos ver con solo poner el índice
		int[] x = new int[5];
		x[0] = 8;
		x[1] = 33;
		x[2] = 200;
		x[3] = 150;
		x[4] = 11;
		System.out.println("El array x tiene 5 elementos,  cual de ellos quiere ver?");
		System.out.print("Introduzca un numero del 0 al 4: ");
		sc = new Scanner(System.in);
		int indice = sc.nextInt();
		System.out.print("El elemento que se encuentra en la posicion " + indice);
		System.out.println(" es el " + x[indice]);
		}
		}

	

