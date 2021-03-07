package IODatos;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import AgentesTIA.Agente;
/**
 * Clase dirida a encriptar los datos relacionados a los agentes
 * @author adelinfaced
 *
 */
public class IODatos_encriptar {
	/**
	 * Método que sirve para guardar los datos en un nuevo fichero
	 * @param rutaFichero. Parámetro que muestra la ruta del fichero y su extensión
	 * @param datos.
	 */
	public static void guardarDatos(String rutaFichero, Agente[] datos) {
		File f = new File(rutaFichero);
		if(!f.exists())
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		try (FileOutputStream fo = new FileOutputStream(f);
			ObjectOutputStream ou = new ObjectOutputStream(fo)){
			for (Agente a : datos) {
				ou.writeObject(a);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	/**
	 * Método que sirve para encriptar y leer el fichero.
	 * @param rutaDestino. Parámetro que designa la ruta del archivo de destino
	 * @param rutaOrigen. Parámetro que designa la ruta del archivo de origen
	 */
	public static void encriptarDatosTexto(String rutaDestino, String rutaOrigen) {
		//leer fichero texto - guardarlo en dat - borrar fichero textgo
		File f = new File(rutaDestino);
		if (!f.exists())
			try {
				f.createNewFile();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		try (FileInputStream fi = new FileInputStream(f);
				ObjectInputStream oi = new ObjectInputStream(fi)){
				oi.readUTF();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	/**
	 * Método que sirve para cargar los datos y desencriptarlos
	 * @param rutaFichero. Parámetro que muestra la ruta del fichero y su extensión
	 * @return. Devuelve los datos del vector de Agente creado
	 */
	public static Agente[] cargarDatos(String rutaFichero) {
		Agente[] vAg = new Agente[10];
		File f = new File(rutaFichero);
		int pos=0;
		if (!f.exists())
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		try (FileInputStream fi = new FileInputStream(f);
				ObjectInputStream oi = new ObjectInputStream(fi)){
			while (f.canRead()) {
				vAg[pos] = (Agente) oi.readObject();
				pos++;
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		return vAg;
	}
}
