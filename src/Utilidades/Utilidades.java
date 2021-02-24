package Utilidades;

import java.util.Scanner;

import AgentesTIA.Agente;

public class Utilidades {
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
	public static void mostrarListaAgentes(Agente vAgentes[]) {
		for (Agente a : vAgentes) {
			if (!a.equals(null)) {
				System.out.println(a.toString());
			}		
		}
		
		
	}
	
	public static void mostrarAgentesSueldo(double sueldo, Agente vAgentes[]) {
		
		for (Agente a : vAgentes) {
			if (!a.equals(null) && a.getSalario()>sueldo) {
				System.out.println(a.toString());
			}
		}
		
	}
	
}