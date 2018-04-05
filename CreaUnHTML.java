package eliminar;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;

public class CreaUnHTML {

	public static void main(String[] args) {
		//Mostramos un FileChooser si el archivo existe lo seleccionamos, si no existe, escribimos el nombre del archivo a crear
		//en el cuadro File Name. 
		JFileChooser path = new JFileChooser();
		path.showOpenDialog(path);
		String ruta = path.getSelectedFile().getAbsolutePath();
		
		File archivo = new File(ruta);
		
		if(!archivo.exists()) {    //--> crea el archivo si este no existe
			
			try {
				archivo.createNewFile();
				System.out.println("El archivo ha sido creado.");
					
			} catch (IOException e) {			
				System.out.println("No se ha poido crear el archivo, revisa el path.");
			}			
		}
		
		/**Una vez creado el archivo, lo pasamos a la clase escritura y al Buffer.*/
		FileWriter escribe = null;
		BufferedWriter ram = null;
		try {
			escribe = new FileWriter(archivo);
			ram = new BufferedWriter(escribe);
			
		} catch (IOException e) {
			
			System.out.println("Revisa las clases FileWriter y BufferedReader, ha habido algun error.");
		}
		
		
		
		System.out.println(archivo.getAbsolutePath());

	}

}
