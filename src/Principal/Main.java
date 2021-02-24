package Principal;

import java.util.Scanner;
import AgentesTIA.*;


public class Main {

	
	
	public static void main(String[] args) {

		System.out.println("BIENVENIDOS A LA GESTIÓN DE ESPIONAJE ADELIN_FACED");
		System.out.println("Aquí te presentamos un menú para que elijas la opción que quieras");
		Agente vAgente[] = new Agente[10];
		vAgente[0] = new Jefazo("Luis Suarez", 34, "C/Neptuno nº 9", 3500, 10);
		vAgente[1] = new Espionaje("Vinicius JR", 20, "C/Cibeles nº 20", 950);
		vAgente[2] = new OO7("Haaland", 20, "C/Dortmund nº 9", 1500, 25);
		vAgente[3] = new OO7("Braithwaite", 29, "C/Barcelona nº 9", 800, 5);
		
		
		switch (Utilidades.Utilidades.crearMenu()) {
		case 1:
			Utilidades.Utilidades.mostrarListaAgentes(vAgente);
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
