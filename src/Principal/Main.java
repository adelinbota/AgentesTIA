package Principal;

import java.util.Scanner;
import AgentesTIA.*;
import IODatos.IODatos_encriptar;
import Utilidades.Utilidades;
import IODatos.*;

public class Main {

	
	public static void encriptarCodigo(Agente[] vAgente) {
		IODatos_encriptar.guardarDatos("Agentes_Encriptados.dat", vAgente);
		System.out.println("TOP SECRET");
	}
	
	
	public static void desencriptarCodigo(Agente[] vAgente) {
		IODatos_encriptar.cargarDatos("Agentes_Encriptados.dat");
		System.out.println("NO SECRET");
	}
	
	public static void main(String[] args) {
/**
 * 
 * @author daw-B
 * @version 04/03/2021/A
 * 
 */
		int menu = 0;
		Scanner leer_menu = new Scanner(System.in);
		System.out.println("BIENVENIDOS A LA GESTIÓN DE ESPIONAJE ADELIN_FACED");
		System.out.println("Aquí te presentamos un menú para que elijas la opción que quieras");
		/*Agente vAgente[] = new Agente[10];
		vAgente[0] = new Jefazo("Luis Suarez", 34, "C/Neptuno nº 9", 3500, 10);
		vAgente[1] = new Espionaje("Vinicius JR", 20, "C/Cibeles nº 20", 950);
		vAgente[2] = new OO7("Haaland", 20, "C/Dortmund nº 9", 1500, 25);
		vAgente[3] = new OO7("Braithwaite", 29, "C/Barcelona nº 9", 800, 5);*/
		Agente vAgente[] = IODatos_encriptar.cargarDatos("Agentes_Encriptados.dat");
		Utilidades.crearMenu();
		menu = leer_menu.nextInt();
		while (menu != 8) {
			
			switch (menu) {
			case 1:
				Utilidades.mostrarListaAgentes(vAgente);
				Utilidades.crearMenu();
				menu = leer_menu.nextInt();
				break;
			case 2:
				double sueldo_buscar;
				System.out.println("dime un sueldo y te mostrare los agentes que lo superen");
				Scanner leer_sueldo = new Scanner(System.in);
				sueldo_buscar = leer_sueldo.nextDouble();
				Utilidades.mostrarAgentesSueldo(sueldo_buscar, vAgente);
				Utilidades.crearMenu();
				menu = leer_menu.nextInt();
				break;
			case 3:
				IODatos.guardarDatosTexto("Pisos.txt");
				Utilidades.crearMenu();
				menu = leer_menu.nextInt();
				break;
			case 4:
				IODatos.guardarDatosTexto("Armas.txt");
				Utilidades.crearMenu();
				menu = leer_menu.nextInt();
				break;
			case 5:
				Utilidades.altaAgente(vAgente);
				Utilidades.crearMenu();
				menu = leer_menu.nextInt();
				break;
			case 6:
				encriptarCodigo(vAgente);
				IODatos_encriptar.encriptarDatosTexto("Agentes_Encriptados.dat", "Agentes_Encriptados.dat");
				Utilidades.crearMenu();
				menu = leer_menu.nextInt();
				break;
			case 7:
				desencriptarCodigo(vAgente);
				Utilidades.crearMenu();
				menu = leer_menu.nextInt();
				break;
			default:
				System.out.println("escriba un numero valido");
				Utilidades.crearMenu();
				menu = leer_menu.nextInt();
				break;
			}
		}
			
		}
		

	

}
<<<<<<< HEAD
//Este es un comentario para comenzar la documentación con Ángel

=======
>>>>>>> main
