package ar.fiuba.tecnicas.tp1.propiedades;


import java.io.IOException;


public class Config {

	private String pathProperties = "conf/config.properties";
	private String pathXml =        "conf/config.properties.xml";
	Propiedades prop;
	
	

	public Config(){
		
		
		try {
			prop = new ArchivoPropiedades(this.pathProperties);
	 	 
		} catch (IOException ex) {
			try {
				prop = new XMLPropiedades(this.pathXml);
			
			} catch (Exception exp){
				prop = new PropiedadesDefault();
			}
		}
		
	}
	public Config(String path){
		/**
		 * Sobrecargo el constructor para poder instanciar con un archivo
		 * @return Retorna el config que sa pasa por parametro o el default
		 * @exception No retorna excepcion ya que retorna el defalut
		 */
		if (path.contains("xml")){
			try {
				prop = new XMLPropiedades(path);
			} catch (Exception exp){
			prop = new PropiedadesDefault();
			}
		}else
			try {
				prop = new ArchivoPropiedades(path);
			} catch (Exception exp){
			prop = new PropiedadesDefault();
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
	public boolean get_tipoFiltro(){
		return prop.get_TipoFiltro();
	}
	public String get_filtro(){
		return prop.get_Filtro();
	}
	public boolean get_fjson(){
		return prop.get_fjson();
	}
	
	
}
