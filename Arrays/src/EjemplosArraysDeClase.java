import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class EjemplosArraysDeClase {

	public static void main(String[] args) {
		int[] numeros = { 1, 2, 4, 5, 8, 10 };
		int[] pares = new int[numeros.length];
		;

		rellenarNumerosPares(numeros, pares);
		mostrarArray(numeros);
		mostrarArray(pares);
	}

	private static void rellenarNumerosPares(int[] numeros, int[] pares) {
		int j = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				pares[j] = numeros[i];
				j++;
			}
		}
	}

	private static int buscarElemento(String[] ejemplo, String elemento) {
		boolean encontrado = false;
		int posicion = 0;
		for (int i = 0; i < ejemplo.length && !encontrado; i++) {
			if (ejemplo[i].equals(elemento)) {
				encontrado = true;
				posicion = i;
			}
		}
		return posicion;
	}

	public static char[] arrayAsteriscos(int tamanio) {
		char[] resultado;// Declaro la array
		resultado = new char[tamanio];// Creo la array
		for (int i = 0; i < tamanio; i++) {// Recorro la array
			resultado[i] = '*';// A cada elemento de lsa array le asigno
			// un asterisco
		}

		return resultado;

	}

	private static void cambiarPrimero(int[] array) {
		array[0] = 5;

	}

	private static void mostrarArray(char[] array) {
		System.out.print("{");

		for (int i = 0; i < array.length - 1; i++) {
			System.out.print(array[i] + ",");
		}
		System.out.println(array[array.length - 1] + "}");

	}

	private static void mostrarArray(String[] array) {
		System.out.print("{");

		for (int i = 0; i < array.length - 1; i++) {
			System.out.print(array[i] + ",");
		}
		System.out.println(array[array.length - 1] + "}");

	}

	private static void mostrarArray(int[] array) {
		System.out.print("{");

		for (int i = 0; i < array.length - 1; i++) {
			System.out.print(array[i] + ",");
		}
		System.out.println(array[array.length - 1] + "}");

	}

	public static int generarNumeroAleatorio() {
		return (int) Math.round(Math.random() * 100);
	}

}
