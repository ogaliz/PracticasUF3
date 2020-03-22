import javax.swing.*;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
* 1. Pedir el path del fichero que queremos leer.
* 2. Dado el path y guardado el fichero en memoria, leer el contenido palabra a palabra.
* */
public class Ejer5PalabraApalabra {

    public static void main(String[] args) {

        //Obtenemos el path del archivo a leer.
        JFileChooser ruta = new JFileChooser();

        ruta.showOpenDialog(ruta);

//        String path = ruta.getSelectedFile().getAbsolutePath();

        //Procedemos a leer el archivo palabra a palabra, para ello podemos usar la clase Scanner.
        Scanner palabra = null;

        try {
            palabra = new Scanner(ruta.getSelectedFile());

            while (palabra.hasNext()){

                System.out.println(palabra.next());

            }

        } catch (FileNotFoundException e) {

            System.out.println("Parece que el archivo no se ha encontrado. Vuleva a intentarlo");

        }finally {
            palabra.close();
        }


    }//cierree del main

}
