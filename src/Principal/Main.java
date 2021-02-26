package Principal;

import java.util.Scanner;
import AgentesTIA.*;
import IODatos.IODatos_encriptar;
import Utilidades.Utilidades;


public class Main {

	
	public static void encriptarCodigo(Agente[] vAgente) {
		IODatos_encriptar.guardarDatos("Agentes_Encriptados.txt", vAgente);
	}
	
	
	public static void desencriptarCodigo(Agente[] vAgente) {
		IODatos_encriptar.cargarDatos("Agentes_Encriptados.txt");
	}
	
	public static void main(String[] args) {

		System.out.println("BIENVENIDOS A LA GESTIÓN DE ESPIONAJE ADELIN_FACED");
		System.out.println("Aquí te presentamos un menú para que elijas la opción que quieras");
		Agente vAgente[] = new Agente[10];
		vAgente[0] = new Jefazo("Luis Suarez", 34, "C/Neptuno nº 9", 3500, 10);
		vAgente[1] = new Espionaje("Vinicius JR", 20, "C/Cibeles nº 20", 950);
		vAgente[2] = new OO7("Haaland", 20, "C/Dortmund nº 9", 1500, 25);
		vAgente[3] = new OO7("Braithwaite", 29, "C/Barcelona nº 9", 800, 5);
		
		
		switch (Utilidades.crearMenu()) {
		case 1:
			Utilidades.mostrarListaAgentes(vAgente);
			Utilidades.crearMenu();
			break;
		case 2:
			double sueldo_buscar;
			System.out.println("dime un sueldo y te mostrare los agentes que lo superen");
			Scanner leer_sueldo = new Scanner(System.in);
			sueldo_buscar = leer_sueldo.nextDouble();
			Utilidades.mostrarAgentesSueldo(sueldo_buscar, vAgente);
			Utilidades.crearMenu();
			break;
		case 3:
			Utilidades.crearMenu();
			break;
		case 4:
			Utilidades.crearMenu();
			break;
		case 5:
			Utilidades.altaAgente(vAgente);
			Utilidades.crearMenu();
			break;
		case 6:
			encriptarCodigo(vAgente);
			Utilidades.crearMenu();
			break;
		case 7:
			desencriptarCodigo(vAgente);
			Utilidades.crearMenu();
			break;
		case 8:
			Utilidades.crearMenu();
			break;
		default:
			break;
		}
	}

	

}
