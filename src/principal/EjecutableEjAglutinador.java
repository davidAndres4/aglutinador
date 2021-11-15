package principal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EjecutableEjAglutinador {

	public static void main(String[] args) {
		estableceConexionBBDD();
		leerScript();
	
	}
	
	static Connection connection;
	static Statement statement;
	static Scanner sn;


	public static void estableceConexionBBDD() {
		try{
			// create a database connection
			connection = DriverManager.getConnection("jdbc:hsqldb:file:bbdd/examen/examen");
			statement = connection.createStatement();
			
		}catch(SQLException e){
			// if the error message is "out of memory",
			// it probably means no database file is found
			System.err.println(e.getMessage());
		}
	}
	
	public static void leerScript() {
		
		File archivo = new File("script_examen.sql");
		StringBuilder script = new StringBuilder();
		String linea="";
		BufferedReader bf;
		try {

			bf = new BufferedReader(new FileReader(archivo));
			while((linea = bf.readLine()) != null) {

				script.append(linea + "\n");
			}

			System.out.println(script.toString());

			statement.executeUpdate(script.toString());

			bf.close();
		} catch (IOException | SQLException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
