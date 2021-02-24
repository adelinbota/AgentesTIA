package AgentesTIA;

import java.util.Arrays;

public class OO7 extends Agente {
	
	private int contador_bajas;
	private String armas[];
	
	public OO7(String nombre, int edad, String direccion, double salario, int contador_bajas) {
		super(nombre, edad, direccion, salario);
		this.contador_bajas = contador_bajas;
	//	this.armas = armas;
	}

	public int getContador_bajas() {
		return contador_bajas;
	}

	public void setContador_bajas(int contador_bajas) {
		this.contador_bajas = contador_bajas;
	}

	public String[] getArmas() {
		return armas;
	}

	public void setArmas(String[] armas) {
		this.armas = armas;
	}

	@Override
	public String toString() {
		return "OO7 [ " + super.toString() + ", contador_bajas=" + contador_bajas + ", armas=" + Arrays.toString(armas) + "]";
	}
	
	
	
}
