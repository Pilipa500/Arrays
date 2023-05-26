import java.util.Scanner;

public class SaberNotasPedidasxEscaner {

	public static void main(String[] args) {
		double[] nota = new double[4];
		System.out.println("Para calcular la nota media necesito saber la ");
		System.out.println("nota de cada uno de tus exámenes.");
		for (int i = 0; i < 4; i++) {
			System.out.print("Nota del examen numero " + (i + 1) + ": ");
			Scanner s = new Scanner(System.in);
			nota[i]=s.nextFloat();
			
		}
		System.out.println("Tus notas son: ");
		double suma = 0;
		for (int i = 0; i < 4; i++) {
			System.out.print(nota[i] + " ");
			suma += nota[i];
		}
		System.out.println("\nLa media es " + suma / 4);

	}



	public class  array {
		//definición de array y reserva de memoria en la misma linea
		int[]x=new int[5];{
		x[0]=8;
		x[1]=33;
		x[2]=200;
		x[3]=150;
		x[4]=11;
		System.out.println("El array tiene 5 elementos ¿cual quieres ver?");
		System.out.println("Introduzca un numero del 0 al 4");
		Scanner s = new Scanner(System.in);
		int indice=s.nextInt();
		System.out.println("El elemento que se encuentra en la posición "+indice);
		System.out.println("es el"+x[indice]);
		
		
	}
}}
