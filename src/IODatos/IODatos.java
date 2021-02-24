package IODatos;

	import java.io.DataInputStream;
	import java.io.DataOutputStream;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
	import java.io.ObjectInputStream;
	import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

import AgentesTIA.*;
	public class IODatos {

		public static void guardarDatosTexto(String rutaFichero) {
			
			File f = new File(rutaFichero);
			if (!f.exists())
				try {
					f.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
			
			try (FileWriter fw = new FileWriter(f,true);
				 PrintWriter escribir = new PrintWriter(fw)){
				
				//Si es arma - pregunto por el arma y la escribo
				//Sino pregunto piso y lo escribo
				
				if (rutaFichero.equalsIgnoreCase("Armas.txt")) {
					Scanner leer_arma = new Scanner(System.in);
					String arma = leer_arma.nextLine();
					escribir.println(arma);
				} else {
					//localidad, calle numero x
					Scanner leer_piso = new Scanner(System.in);
					String arma = leer_arma.nextLine();
					escribir.println(arma);
				}
					
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}

		public static Password[] cargarDatosTexto(String rutaFichero) {
			Password[] vPass = new Password[10];
			int cont=0;
			File f = new File(rutaFichero);
			if (!f.exists()) {
				try {
					f.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			try (FileInputStream fi = new FileInputStream(f);
				 DataInputStream leer = new DataInputStream(fi)){
				
				while (true) {
					String usuario = leer.readUTF();
					int pass = leer.readInt();
					boolean seguro = leer.readBoolean();
					vPass[cont] = new Password(usuario, pass, seguro);
					cont++;
				}
				
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				System.out.println("Fin de lectrua del fichero");
			}
			
			return vPass;
		}
		
		public static Password[] cargarObjetos(String rutaFichero) {
			Password[] vPass = new Password[10];
			int cont=0;
			File f = new File(rutaFichero);
			if (!f.exists()) {
				try {
					f.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			try (FileInputStream fi = new FileInputStream(f);
				 ObjectInputStream leer = new ObjectInputStream(fi)){
				
				while (true) {
					vPass[cont] = (Password) leer.readObject();
					cont++;
				}
				//vPass = (Password[]) leer.readObject();
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				System.out.println("Fin de lectrua del fichero");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return vPass;
		}
		
		public static void guardarObjetos(String rutaFichero, Password[] datos) {
			
			File f = new File(rutaFichero);
			if (!f.exists()) {
				try {
					f.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			try (FileOutputStream fo = new FileOutputStream(f);
				 ObjectOutputStream escribir = new ObjectOutputStream(fo)){
				
				for (Password p: datos) {
					if (p!=null) {
						escribir.writeObject(p);
					}
				}
				//escribir.writeObject(datos);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
