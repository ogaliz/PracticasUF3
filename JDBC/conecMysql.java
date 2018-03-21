package conectaBaseDatos;

import java.sql.*;

/*Video 200 - 201 PI
 * 1.Primero, crear un objeto de tipo conexión
 * 2.Crear un objeto de tipo Statement (esto nos permite empezar a ejecutar sentencias SQL.)
 * 3.Ejecutar sentencia SQL. 
 * 4.Lee el resultado 
 * */
public class ConectaPruebas {

	public static void main(String[] args) {
		
		try {
			
			//1. tenemos que crear un objeto de tipo connection
			Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3308/jardineria","root","");
			
			//2. Crear objeto Statement, a través del objeto Conexion. 
			Statement miStatement = miConexion.createStatement();
			
			//3. Ejecutamos la query SQL, para ello necesitamos el objeto Statement, esto nos guarda
			// una tabla virtual a modo de resultado que tenemos que recorrer.
			ResultSet miResultset = miStatement.executeQuery("SELECT Nombre, Proveedor FROM Productos");
			
			//4. Leer la informacion de la tabla que nos ha devuelto la consulta SQL.
			while(miResultset.next()) {
				//podemos utilizar el nombre o el indice del campo
				System.out.println(miResultset.getString("Nombre")+" - "+miResultset.getString("Proveedor"));
				
			}
			
		} catch (Exception e) {
			
			System.out.println("La consulta no se ha realizado correctamente.");
			e.printStackTrace();
		}
		
	}

}
