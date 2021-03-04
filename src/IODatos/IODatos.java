package IODatos;

	import java.io.DataInputStream;
	import java.io.DataOutputStream;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
	import java.io.ObjectInputStream;
	import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.print.attribute.HashPrintRequestAttributeSet;

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
				int numero;
				String localidad;
				String calle;
				//Si es arma - pregunto por el arma y la escribo
				//Sino pregunto piso y lo escribo
				
				if (rutaFichero.equalsIgnoreCase("Armas.txt")) {
					Scanner leer_arma = new Scanner(System.in);
					System.out.println("dime el arma que quieres guardar");
					String arma = leer_arma.nextLine();
					escribir.println(arma);
				} else {
					//localidad, calle numero x
					Scanner leer_piso = new Scanner(System.in);
					Scanner leer_num = new Scanner(System.in);
					System.out.println("dime la localidad");
					localidad = leer_piso.nextLine();
					System.out.println("dime la calle");
					calle = leer_piso.nextLine();
					try {
						System.out.println("dime el numero de la casa");
						numero = leer_num.nextInt();
						Integer.toString(numero);
					} catch (Exception e) {
						System.out.println("Escriba un numero porfavor");
					   numero = leer_num.nextInt();
						Integer.toString(numero);
					}
					escribir.println(localidad + ", " + calle + " numero " + numero);
				}
					
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
		}

		public static String[] cargarDatosTexto(String rutaFichero) {
			String vArma[] = new String[10];
			String vPiso[] = new String[10];
			String vDatos[] = new String[10];
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
			
			try (FileReader fr = new FileReader(f);
				Scanner leer = new Scanner(fr)){
				
				while (leer.hasNext()) {
					vDatos[cont] = leer.nextLine();
					cont++;
				}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				System.out.println("Fin de lectrua del fichero");
			}
			
			return vDatos;
		}
				
	}
	

