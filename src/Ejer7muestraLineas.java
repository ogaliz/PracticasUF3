import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
* Exercici 7. Delimitar lectura
Demaneu a l'usuari quantes línies vol veure. Només mostreu aquestes.
On està el fitxer? /home/profe/poesia.txt
Quantes línies vols veure? 1
El fitxer conté:
Topant de cap en una i altra soca,
* */
public class Ejer7muestraLineas {

    public String obtenRutaFichero(){

        JFileChooser ruta = new JFileChooser();

        ruta.showOpenDialog(ruta);

        String path = ruta.getSelectedFile().getAbsolutePath();

        return path;
    }

    public void leerLineas(File archivo){

        archivo = new File(obtenRutaFichero());
        Scanner lectura = null;
        Scanner teclado = null;

        try {
            lectura = new Scanner(archivo);
            teclado = new Scanner(System.in);

            System.out.println("Cuantas lineas quieres mostrar?");
            int lineas = teclado.nextInt();

            for(int i = 0; i < lineas; i++){

                    System.out.println(lectura.nextLine());
            }

        } catch (FileNotFoundException e) {
            System.out.println("El archivo no ha sido correctamente cargado.");
            e.printStackTrace();

        }finally {
            lectura.close();
            teclado.close();
        }

    }


    public static void main(String[] args) {

        Ejer7muestraLineas archivo1 = new Ejer7muestraLineas();
        File miDocumento = null;

        archivo1.leerLineas(miDocumento);

    }

}
