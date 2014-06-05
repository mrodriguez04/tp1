package ar.fiuba.tecnicas.tp1.propiedades;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class Config {

	private String pathProperties = "conf/config.properties";
//	private String pathXml = "conf/config.properties.xml";
	Propiedades prop;
	

	public Config(){
		
		
		try {
			 
			prop = new ArchivoPropiedades(this.pathProperties);
	 	 
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
	}

	public String get_LogLevel(){
		return prop.get_LogLevel();
	}
	
	public String get_ArchivoLog(){
		return prop.get_ArchivoLog();
	}
	
	public String get_Aplicacion(){
		return prop.get_Aplicacion();
	}
	
	public String get_Formateo(){
		return prop.get_Formateo();
	}
	public String get_Loguer(){
		return prop.get_Loguer();
	}
	
	
}
