package AgentesTIA;

public class Espionaje extends Agente{

	private String piso;

	public Espionaje(String nombre, int edad, String direccion, double salario, String piso) {
		super(nombre, edad, direccion, salario);
		this.piso = piso;
	}

	public String getPiso() {
		return piso;
	}

	public void setPiso(String piso) {
		this.piso = piso;
	}

	@Override
	public String toString() {
		return "Espionaje [" + super.toString() + ", piso=" + piso + "]";
	}
	
	
	
}
