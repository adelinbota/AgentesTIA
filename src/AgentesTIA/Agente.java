package AgentesTIA;

import java.io.Serializable;

//clase padre de Jefazo, Espionaje y 007
/**
 * Clase padre llamada Agente
 * @author adelinfaced
 *
 */
public class Agente implements Serializable{

	protected String nombre;
	protected int edad;
	protected String direccion;
	protected double salario;
	
	public Agente(String nombre, int edad, String direccion, double salario) {
		this.nombre = nombre;
		this.edad = edad;
		this.direccion = direccion;
		this.salario = salario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "nombre=" + nombre + ", edad=" + edad + ", direccion=" + direccion + ", salario=" + salario;
	}

	
}
