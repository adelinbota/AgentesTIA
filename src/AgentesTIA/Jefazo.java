package AgentesTIA;

import java.util.Scanner;
/**
 * Esta clase es la que guarda al jefe de todos los agentes y lo muestra por pantalla
 * @author adelinfaced
 *
 */
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
		return  "************************************************\n"+
				"Nombre : " + super.getNombre() + " \n" +
				"Edad : " + super.getEdad() + " \n" +
				"Direccion : " + super.getDireccion() + " \n" +
				"Salario : " + super.getSalario() + " \n" +
				"Años Mandato : " + años_mandato + " \n" +
				"************************************************";
	}
	
}
