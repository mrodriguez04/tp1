package ar.fiuba.tecnicas.tp1.propiedades;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ArchivoPropiedades extends Propiedades{
	private InputStream input;
	Properties prop;
	
	public ArchivoPropiedades(String path) throws IOException {
		try {
			 
			input = new FileInputStream(path);
			prop = new Properties();
	 		prop.load(input);
	 	 
		} catch (IOException ex) {
			// ex.printStackTrace();
			throw ex;
		
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					//e.printStackTrace();
					throw e;
				}
			}
		}
		
	}
	public String get_LogLevel(){
		return prop.getProperty("logLevel");
	}
	
	public String get_ArchivoLog(){
		return prop.getProperty("archivo");
	}
	
	public String get_Aplicacion(){
		return prop.getProperty("aplicacion");
	}
	
	public String get_Formateo(){
		return prop.getProperty("formato");
	}
	public String get_Loguer(){
		return prop.getProperty("loguer");
	}
	public boolean get_tipoFiltro(){
		String fjson = prop.getProperty("TipoFiltro");
		if(fjson.contains("D")){
			return false;
		}else{
			return true;
		}
	}
	public String get_Filtro(){
		return prop.getProperty("Filtro");
	}
	public boolean get_fjson(){
		String fjson = prop.getProperty("FJSON");
		if(fjson.contains("false")){
			return false;
		}else{
			return true;
		}
	}
}
