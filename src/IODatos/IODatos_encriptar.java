package IODatos;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import AgentesTIA.Agente;

public class IODatos_encriptar {
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
			DataOutputStream dou = new DataOutputStream(fo)){
			for (Agente agente : datos) {
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static Agente[] cargarDatos(String rutaFichero) {
		Agente[] vAg = new Agente[5];
		File f = new File(rutaFichero);
		if (!f.exists())
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		try (FileOutputStream fo = new FileOutputStream(f);
				DataOutputStream dou = new DataOutputStream(fo)){
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		return vAg;
	}
}
