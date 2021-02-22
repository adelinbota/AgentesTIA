package AgentesTIA;

import java.util.Scanner;

public class Main {

	public static void crearMenu() {
		Scanner leer = new Scanner(System.in);
		int opcion;
		do {
			System.out.println("1. Ver todos los agentes con su información");
			System.out.println("2. Ver los agentes que ganen más de una cantidad X");
			System.out.println("3. Dar de alta un nuevo piso");
			System.out.println("4. Dar de alta una nueva arma");
			System.out.println("5. Dar de alta un nuevo agente");
			System.out.println("6. Entcriptar toda la información");
			System.out.println("7. Desencriptar toda la información");
			System.out.println("8. Salir");
			
			opcion = leer.nextInt();
			
		} while (opcion>0 || opcion<9);
		
		if (opcion<1 || opcion>8) {
			System.out.println("Error, introduce un número correcto de la lista");
		}
	}
	
	public static void main(String[] args) {
		

	}

}
