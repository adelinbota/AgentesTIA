package Utilidades;

import java.util.Scanner;

import AgentesTIA.Agente;
import AgentesTIA.Espionaje;
import AgentesTIA.OO7;
import IODatos.IODatos_encriptar;

public class Utilidades {
	public static void crearMenu() {
		Scanner leer = new Scanner(System.in);
		int opcion=0;
			System.out.println("1. Ver todos los agentes con su información");
			System.out.println("2. Ver los agentes que ganen más de una cantidad X");
			System.out.println("3. Dar de alta un nuevo piso");
			System.out.println("4. Dar de alta una nueva arma");
			System.out.println("5. Dar de alta un nuevo agente");
			System.out.println("6. Entcriptar toda la información");
			System.out.println("7. Desencriptar toda la información");
			System.out.println("8. Salir");	
	}
	public static void mostrarListaAgentes(Agente vAgentes[]) {
		for (Agente a : vAgentes) {
			if (a!=null) {
				System.out.println(a.toString());
			}		
		}
		
		
	}
	public static void mostrarAgentesSueldo(double sueldo, Agente vAgentes[]) {
		
		for (Agente a : vAgentes) {
			if (a!=null && a.getSalario()>sueldo) {
				System.out.println(a.toString());
			}
		}
		
	}
	public static void altaAgente(Agente vAgente[]) {
		System.out.println("Introduciremos un nuevo agente");
		int menu=0;
		Scanner leer_int = new Scanner(System.in);
		Scanner leer_string = new Scanner(System.in);
		Scanner leer_double = new Scanner(System.in);
		for (Agente a : vAgente) {
			Scanner leer_menu = new Scanner(System.in);
			int cont=0;
			if (a == null) {
				System.out.println("para crear un agente de espionaje pulse : 1");
				System.out.println("para crear un agente de 007 pulse : 2");
				menu = leer_menu.nextInt();
				switch (menu) {
				case 1:
					String nombreEs, direccionEs;
					int edadEs;
					double salarioEs;
					System.out.println("Dime el nombre");
					nombreEs = leer_string.nextLine();
					System.out.println("Dime la edad");
					edadEs = leer_int.nextInt();
					System.out.println("Dime la direccion");
					direccionEs = leer_string.nextLine();
					System.out.println("Dime el salario");
					salarioEs = leer_double.nextDouble();
					vAgente[cont] = new Espionaje(nombreEs, edadEs, direccionEs, salarioEs);
					break;
				case 2:
					String nombreOO7, direccionOO7;
					int edadOO7, contador_bajasOO7;
					double salarioOO7;
					System.out.println("Dime el nombre");
					nombreOO7 = leer_string.nextLine();
					System.out.println("Dime la edad");
					edadOO7 = leer_int.nextInt();
					System.out.println("Dime la direccion");
					direccionOO7 = leer_string.nextLine();
					System.out.println("Dime el salario");
					salarioOO7 = leer_double.nextDouble();
					System.out.println("Dime las bajas que ha causado");
					contador_bajasOO7 = leer_int.nextInt();
					vAgente[cont] = new OO7(nombreOO7, edadOO7, direccionOO7, salarioOO7, contador_bajasOO7);
					break;

				default:
					System.out.println("escriba un numero valido");
					menu = leer_menu.nextInt();
					break;
				}cont++;
				break;
			}
			
		}
	}

}






