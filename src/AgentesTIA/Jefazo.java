package AgentesTIA;

import java.util.Scanner;

public class Jefazo extends Agente {

	private int años_mandato;

	public Jefazo(String nombre, int edad, String direccion, double salario, int años_mandato) {
		super(nombre, edad, direccion, salario);
		this.años_mandato = años_mandato;
	}

	public int getAños_mandato() {
		return años_mandato;
	}

	public void setAños_mandato(int años_mandato) {
		this.años_mandato = años_mandato;
	}

	@Override
	public String toString() {
		return  "************************************************"+
				"Nombre : " + super.getNombre() + 
				"Edad : " + super.getEdad() +
				"Direccion : " + super.getDireccion() +
				"Salario : " + super.getSalario() +
				"Años Mandato : " + años_mandato +
				"************************************************";
	}
	
	public void buscarAgentePrecio() {
		
		if Jefazo.
		
	}
	
}
