package AgentesTIA;

public class Espionaje extends Agente{

	private String[] vPisos;

	public Espionaje(String nombre, int edad, String direccion, double salario) {
		super(nombre, edad, direccion, salario);
		//this.vPisos = IODatos.cargarDatosTexto("Pisos.txt");
	}

	public String[] getPiso() {
		return vPisos;
	}

	@Override
	public String toString() {
		return "Espionaje [" + super.toString() + ", piso=" + vPisos + "]";
	}
	
	
	
}
