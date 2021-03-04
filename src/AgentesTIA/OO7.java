package AgentesTIA;

import java.util.ArrayList;
import java.util.Arrays;
import IODatos.IODatos;

public class OO7 extends Agente {
	
	private int contador_bajas;
	private String[] vArmas;
	
	public OO7(String nombre, int edad, String direccion, double salario, int contador_bajas) {
		super(nombre, edad, direccion, salario);
		this.contador_bajas = contador_bajas;
		this.vArmas = IODatos.cargarDatosTexto("Armas.txt");
	}

	public int getContador_bajas() {
		return contador_bajas;
	}

	public void setContador_bajas(int contador_bajas) {
		this.contador_bajas = contador_bajas;
	}

	public String[] getArmas() {
		return vArmas;
	}


	@Override
	public String toString() {
		String armas="";
		for (String s : vArmas) {
			if (s!=null)
				armas+=s + " ";
		}
		return "OO7 " + super.toString() + ", contador_bajas=" + contador_bajas + ", armas=" + armas;
	}
	
	
	
}
