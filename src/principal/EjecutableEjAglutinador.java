package principal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import clasesJAXB.ObjectFactory;
import clasesJAXB.TipoAutor;
import clasesJAXB.TipoAutores;
import clasesJAXB.TipoExamen;
import clasesJAXB.TipoPregunta;
import clasesJAXB.TipoPreguntas;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

public class EjecutableEjAglutinador {
	
	static Connection connection;
	static Statement statement;
	static Scanner sn;

	public static void main(String[] args) throws JAXBException, SQLException, FileNotFoundException {
		estableceConexionBBDD();
		ejecutaScript();
		leeXML();
		
		
		
		ResultSet rs;
		try {
			rs = statement.executeQuery("select * from autor");
			while(rs.next()){
				// read the result set
				System.out.println(rs.getString(1) + "\t" + rs.getString(2) + " (" + rs.getString(3) + ")");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		connection.close();
		
		
	
	}

	public static void estableceConexionBBDD() {
		try{
			// create a database connection
			connection = DriverManager.getConnection("jdbc:hsqldb:file:bbdd/examen/examenAglutinador");
			statement = connection.createStatement();
			
		}catch(SQLException e){
			System.err.println(e.getMessage());
		}
	}
	
	public static void ejecutaScript() {
		
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
	
	public static void leeXML() throws JAXBException, SQLException, FileNotFoundException {
		
		// De XML a objetos Java
        //Instanciamos el contexto JAXB indicando la clase que sería el RootElement
        JAXBContext jC = JAXBContext.newInstance(ObjectFactory.class);
        //Creamos un UnMarshaller en el contexto de la clase Examen
        Unmarshaller jUnmarshaller = jC.createUnmarshaller();
        
        JAXBElement <TipoExamen> jaxbElement = (JAXBElement <TipoExamen>) jUnmarshaller.unmarshal(new FileInputStream("xml/examen.xml"));
        
        //Utilizamos el metodo unmarshall para obtener datos de un fichero (Reader)
        TipoExamen miExamen = (TipoExamen) jaxbElement.getValue(); 
        		
        TipoAutores autores = miExamen.getAutores();
        
        List<TipoAutor> listaAutores=autores.getAutor();
        
        //Insert
        String insertAutor = "INSERT INTO autor values(?,?,?,?,?,?)";
        PreparedStatement sentencia = connection.prepareStatement(insertAutor);
        
        for(int i=0; i<listaAutores.size(); i++) {
        	sentencia.setString(1, listaAutores.get(i).getId());
        	sentencia.setString(2, listaAutores.get(i).getNombre());
        	sentencia.setString(3, listaAutores.get(i).getApellido1());
        	sentencia.setString(4, listaAutores.get(i).getApellido2());
        	sentencia.setString(5, listaAutores.get(i).getPuesto());
        	sentencia.setString(6, listaAutores.get(i).getEntidadTrabajo());
        	sentencia.executeUpdate();
        }
        
        TipoPreguntas preguntas = miExamen.getPreguntas();
        
        List<TipoPregunta> listaPreguntas=preguntas.getPregunta();
        
        //Insert
        String insertPregunta = "INSERT INTO pregunta (dificultad, enunciado, idAutor) values(?,?,?)";
        sentencia = connection.prepareStatement(insertPregunta);
        
        for(int i=0; i<listaPreguntas.size(); i++) {
        	sentencia.setString(1, listaPreguntas.get(i).getDificultad().toString());
        	sentencia.setString(2, listaPreguntas.get(i).getEnunciado());
        	sentencia.setString(3, listaPreguntas.get(i).getAutoria());
        	sentencia.executeUpdate();
        }
        
	}
	

}
