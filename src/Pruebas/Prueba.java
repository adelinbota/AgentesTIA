package Pruebas;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import AgentesTIA.Agente;
import AgentesTIA.Jefazo;
import AgentesTIA.OO7;
import IODatos.IODatos;
import Utilidades.Utilidades;

class Prueba {
	static Agente hola[] =new Agente[3];
	@Before
	void cargar() {
		Agente[] vAgente = IODatos.cargarDatosTexto("Agentes_Encriptados.dat");
	}
	@BeforeEach
	void prueba() {
		ArrayList<Agente> vAAA = null;
		Jefazo j = new Jefazo("Luis Suarez", 34, "C/Neptuno nº 9", 3500, 10);
		vAAA.add(j);
	}
	
	@Test
	void test() {
		assertEquals(prueba.vAAA, Utilidades.mostrarAgentesSueldo(2000, IODatos.cargarDatosTexto("Agentes_Encriptados.dat")));
	}

}
