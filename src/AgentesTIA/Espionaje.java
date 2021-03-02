package AgentesTIA;
import java.util.ArrayList;

import IODatos.IODatos;

public class Espionaje extends Agente{

	private ArrayList<String> vPisos = new ArrayList<String>();

	public Espionaje(String nombre, int edad, String direccion, double salario) {
		super((String) nombre, edad, direccion, salario);
		this.vPisos = IODatos.cargarDatosTexto("Pisos.txt");
	}

	public ArrayList<String> getPiso() {
		return vPisos;
	}
	
	@Override

	public String toString() {
		String pisos="";
		for (String s : vPisos) {
			if (s!=null)
				pisos+=s + " ";
		}
		return "Espionaje " + super.toString() + ", piso=" + pisos;
	}
	
	
	
}
