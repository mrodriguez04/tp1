package ar.fiuba.tecnicas.tp1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class Config {

	private String path;
	private InputStream input;
	Properties prop = new Properties();
	
	public Config(String lugar){
		this.path = lugar;
		
		try {
			 
			input = new FileInputStream(this.path);
	 
			// load a properties file
			prop.load(input);
	 
			// get the property value and print it out
			// System.out.println(prop.getProperty("database"));
			// System.out.println(prop.getProperty("dbuser"));
			// System.out.println(prop.getProperty("dbpassword"));
	 
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	String get_LogLevel(){
		return prop.getProperty("logLevel");
	}
	
	String get_ArchivoLog(){
		return prop.getProperty("archivo");
	}
	
	String get_Aplicacion(){
		return prop.getProperty("aplicacion");
	}
	
	
}
