package ejercicio03;

import java.util.Scanner;

public class EJ03 {

	public static void main(String[] args) {
		
		// Escribir una aplicación que pida el año 
		// actual y el año de nacimiento del usuario. 
		// Debe calcular su edad.

		// Creamos scanner 
		Scanner reader = new Scanner(System.in);
		
		// Creamos variable para almacenar el año actual, el año de nacimiento y la edad que tendría el usuario
		Integer currentYear; 
		Integer yearOfBirth;
		Integer year;
		
		// Pedimos al usuario el año actual y el año de nacimiento
		System.out.println("Introduce el año en el que te encuentras: ");
		currentYear = reader.nextInt(); 
		
		System.out.println("Introduce el año de tu nacimiento: ");
		yearOfBirth = reader.nextInt(); 
		
		// Calculamos la edad del usuario
		year = currentYear -  yearOfBirth; 
		
		// Mostramos por pantalla la edad del usuario
		System.out.println("Tu edad es: " + year);
		
		// Cerramos scanner
		reader.close();
	}

}
