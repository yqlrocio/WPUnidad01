package ejercicios_parte1;

import java.util.Scanner;

public class EJ07 {

	public static void main(String[] args) {
		
		// Escribir un programa que le pida al usuario su nombre, 
		// dirección y teléfono. Guarda cada dato en variables 
		// distintas. A continuación, muestra los datos de la 
		// siguiente forma:

		// Crear scanner
		Scanner reader = new Scanner(System.in); 
		
		// Crear una variable para almacenar el nombre del usuario
		String nombre; 
		
		// Crear una variable para almacenar la dirección del usuario
		String direccion; 
		
		// Crear una variable para almacenar el teléfono del usuario
		int telefono;
		
		// Pedir al usuario el nombre y mostrarlo por pantalla
		System.out.println("Introduzca tu nombre: ");
		nombre = reader.nextLine(); 
		
		// Pedir al usuario la dirección y mostrarlo por pantalla
		System.out.println("Introduzca tu dirección: ");
		direccion = reader.nextLine(); 
		
		// Pedir al usuario el teléfono y mostrarlo por pantalla
		System.out.println("Introduzca tu teléfono: ");
		telefono = reader.nextInt(); 
		
		// Cerrar scanner
		reader.close();
	}

}
