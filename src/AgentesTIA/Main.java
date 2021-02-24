package AgentesTIA;

import java.util.Scanner;

public class Main {


	
	public static int crearMenu() {
		Scanner leer = new Scanner(System.in);
		int opcion=0;
		do {
			System.out.println("1. Ver todos los agentes con su información");
			System.out.println("2. Ver los agentes que ganen más de una cantidad X");
			System.out.println("3. Dar de alta un nuevo piso");
			System.out.println("4. Dar de alta una nueva arma");
			System.out.println("5. Dar de alta un nuevo agente");
			System.out.println("6. Entcriptar toda la información");
			System.out.println("7. Desencriptar toda la información");
			System.out.println("8. Salir");
			
			try {
				opcion = leer.nextInt();
			} catch (Exception e) {
				System.out.println("Escribe un número de la lista de opciones");
				leer = new Scanner(System.in);
				opcion = 0;
			}	
		} while (opcion>8 || opcion<1);
		
		return opcion;
	}
	
	public static void main(String[] args) {

		System.out.println("BIENVENIDOS A LA GESTIÓN DE ESPIONAJE ADELIN_FACED");
		System.out.println("Aquí te presentamos un menú para que elijas la opción que quieras");
		
		switch (crearMenu()) {
		case 1:
			System.out.println(mostrarListaAgentes());
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
			
			break;
		case 6:
			
			break;
		case 7:
			
			break;
		case 8:
			
			break;
		default:
			break;
		}
	}

	

}
