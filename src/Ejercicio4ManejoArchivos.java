import java.io.*;
import java.util.Scanner;
/*
* 1. Crear un archivo llamado poesia
* 2. Comprobar si el archivo ya existe, si no existe le escribimos el contenido.
* 3. Lee el contenido del fichero linea a linea.
* */
public class Ejercicio4ManejoArchivos {

    public static void main(String[] args) {

        //1. Tomamos el archivo nuevo e iniciamos las clases de lectura por si el archivo no existiese.
        File poesia = new File("poesia.txt");
        FileWriter escribe = null;
        BufferedWriter ram = null;

        //2. Se comprueba si el archivo existe, si es asi, entra en el if y escribe el contenido de la poesia.
        if(!(poesia.exists())){

            try {

                poesia.createNewFile();
                escribe = new FileWriter(poesia);
                ram = new BufferedWriter(escribe);

                ram.write("Topant de cap en una i altra soca,\n" +
                            "avançant d'esma pel camí de l'aigua,\n" +
                            "se'n ve la vaca tota sola. És cega.\n");
                ram.close();
                escribe.close();

            } catch (IOException e) {
                System.out.println("El archivo no ha sido creado.");
            }

        }

        //3. Una vez es seguro que el archivo existe, leemos linea a linea.
        //(En lugar de mostrarlo directamente creo un objeto StringBuilder con cada una de las lineas)
        Scanner lectura = null;
        StringBuilder poema = null;

        try {

            lectura = new Scanner(poesia);
            poema = new StringBuilder("El poema es como sigue:\n");

            do {

                poema.append(lectura.nextLine()+"\n");

            }while (lectura.hasNextLine());

        } catch (IOException e) {

            System.out.println("El archivo al que hace referencia no existe.");

        }finally {

            lectura.close();

        }

        //Mostramos el contenido de golpe, de forma mas clara y aprovechando el añadido del StringBuilder.
        System.out.println(poema);

    }
}
