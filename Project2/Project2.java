package Project2;

import javax.swing.*;
import java.io.*;
import java.util.Date;

class Project2 {

	// CONST.
	public static final String SEPARATOR = ",";
	public static final String PCOMA = "; \n";
	public static final String ENDL = "\n";
	public static final String TAB = "\t";
	public static final char COMA = '"';

	static String csv_name = null;
	static String sql_name = null;

	public static void main(String [] arg) throws IOException {

		log("Opening files");

		while(true){
			try{
				// GET FILES. in: file.csv - out: file.sql
				get_files("in");
				get_files("out");
				
				BufferedReader csv_file = null;
				BufferedWriter sql_file = null;
				
				csv_file = new BufferedReader( new FileReader( new File(csv_name)));
				sql_file = new BufferedWriter( new FileWriter( new File(sql_name+".sql")));

				log("Files opened correctly");
				write_sql(csv_name, sql_name, csv_file, sql_file);
				break;
				
			}catch (Exception e){
					System.out.println(e);
					log("ERROR invalid files or extensions");
			}
		}
	}// MAIN -----
	
	// METHOD GET FILES - both: input & output
	public static void get_files (String inout) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		JFileChooser path = new JFileChooser();

		try{
			if(inout == "in") {
				path.showOpenDialog(path);
				csv_name = path.getSelectedFile().getAbsolutePath();

			} else if(inout == "out") {
				System.out.print("Introduzca la ruta para el archivo generado, sin extensión de archivo: ");
				sql_name = reader.readLine();

			}
		} catch (Exception e){
			System.out.println("Warning! " + e);
			log("ERROR invalid value");

		} finally {
			log("File successfully created.");
		}
	}
	
	// LOG FILE - log record
	public static void log (String message) throws IOException {

		BufferedWriter log_file = null;
		Date date = new Date();

		try{

			log_file = new BufferedWriter( new FileWriter( new File("csv_to_sql.log"), true));
			log_file.write(date + " " + message + ENDL);

		} catch (IOException e) {
			log("ERROR: " + e.getMessage());

		} finally {
			log_file.close();
		}
	}
	
	// SQL FILE Generate
	public static void write_sql (String csv_name, String sql_name, BufferedReader csv_file, BufferedWriter sql_file) throws IOException {
		try{
			log("Starting conversion");
			String line = null;
			int rows = 0;
			
			while((line=csv_file.readLine()) != null){

				/* Converting the .csv line in an array of Strings */
				String[] fields = line.split(SEPARATOR);
				
				// .SQL WRITING CREATES
				if(rows == 0){
					sql_file.write("CREATE DATABASE IF NOT EXISTS `database`" + PCOMA + "USE `database`" + PCOMA + ENDL);
					sql_file.write("DROP TABLE IF EXISTS `table`" + PCOMA + ENDL);
					sql_file.write("CREATE TABLE `table` (" + ENDL);
					
					for(int i=0; i < fields.length; i++){
						if(i + 1 != fields.length){
							sql_file.write(TAB + "`" + fields[i] + "`" + " VARCHAR(50)," + ENDL);

						}else{
							sql_file.write(TAB + "`" + fields[i] + "`" + " VARCHAR(50)" + ")" + PCOMA + ENDL);
						}
					}
					rows++;

				// .SQL WRITING INSERTS
				}else{
					sql_file.write("INSERT INTO `table` VALUES (");
					rows++;

					for(int i=0; i < fields.length; i++){

						if(i + 1 != fields.length){
							sql_file.write(COMA + fields[i] + COMA + ",");

						}else{
							sql_file.write(COMA + fields[i] + COMA + ")" + PCOMA);
						}
					}
				}
			}
			log("Conversion finished");
			log(rows + " insert rows created");

		}catch(Exception e){
			System.out.println("ERROR Writing the sql");

		}finally{
			try{
				csv_file.close();
				sql_file.close();
				System.out.println("Execution finished!");

			}catch (Exception e2){
				System.out.println("ERROR Files couldn't close");
			}
		}
	}
}// CLASS -----
