package loops;
import java.util.Scanner;

public class WhileLoop {
	
	public static void main(String[] args) {
		/*
		 * While, el ciclo while ejecuta continuamente un bloque de código hasta que se cumpla una condición dada.
		 * while (expresion) {
		 * bloque de código a ejecutar
		 * (contador - iterador)
		 * }
		 * */
		
		/*int cuenta = 1;
		
		while (cuenta<11) {
			System.out.println("La cuenta es de " + cuenta);
			cuenta++; 
		}*/

      int cuenta = 0;
		
		while (cuenta<10) {
			cuenta++;
			System.out.println("La cuenta es de " + cuenta);
		}
		
		
		
		/*Crear un programa que solicite al usuario un número, dicho número será tomado como el número final de una cuenta, dicha cuenta inicia en 1. Debe mostrar en consola la cuenta del 1 hasta el número proporcionado.
		 * 1. Importar un scanner e implementarlo
		 * 2. Un mensaje para darle contexto al usuario
		 * 3. Almacenar el número del usuario en una variable
		 * 4. Guardar en variable el número que inicia la cuenta (1)
		 * 5. Implementar un ciclo while
		 * 6. Mostrar en consola el resultado
		*/
		
		//1
		Scanner scanner = new Scanner (System.in);
		//2
		System.out.println("Escribe un número que servirá como un número final en una cuenta");
		//3
		int numFinal = scanner.nextInt();
		//4
		int numInicial = 1;
		//5
		while (numInicial <= numFinal) {
			System.out.println("La cuenta va en " + numInicial);
			numInicial++;
		}
	
		
		scanner.close();
		
		
	}//cierre main

}
