package AgentesTIA;

import java.util.Scanner;

public class Main {

	public static void mostrarAgentesSueldo(double sueldo, Agente vAgentes[]) {
		
		for (Agente a : vAgentes) {
			if (a.getSalario()>sueldo) {
				System.out.println(a.toString());
			}
		}
		
	}
	
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
		Agente vAgente[] = new Agente[10];
		vAgente[0] = new Jefazo("Luis Suarez", 34, "C/Neptuno nº 9", 3500, 10);
		vAgente[1] = new Espionaje("Vinicius JR", 20, "C/Cibeles nº 20", 950);
		vAgente[2] = new OO7("Haaland", 20, "C/Dortmund nº 9", 1500, 25);
		vAgente[3] = new OO7("Braithwaite", 29, "C/Barcelona nº 9", 800, 5);
		
		
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
