package ar.fiuba.tecnicas.tp1.propiedades;

public class XMLPropiedades extends Propiedades {

	
	String logLevel;
	String archivoLog;
	String aplicacion;
	String formateo;
	String logger;
	String filtro;
	boolean tipoFiltro;
	
	public XMLPropiedades(String path) throws Exception {
		ParserXML parseado = new ParserXML();
		
		try {
			parseado.Inicio(path, this);
			
			
		}catch (Exception err){
			throw err;
		} 
		
		
		
	}
	
	public void set_logLevel(String log){
		this.logLevel = log;
	}
	public void set_ArchivoLog(String arch){
		this.archivoLog = arch;
	}
	public void set_Aplicacion(String aplic){
		this.aplicacion = aplic;
	}
	public void set_Formateo(String format){
		this.formateo = format;
	}
	public void set_Logger(String logger){
		this.logger = logger;
	}
	public void set_TipoFiltro(String  n){
		if(n.contains("D")){
			this.tipoFiltro = false;
		}
		else {
			this.tipoFiltro = true;
		}
	}
	public void set_Filtro(String n){
		this.filtro = n;
	}
	
	
	public String get_LogLevel(){
		return this.logLevel;
	}
	public String get_ArchivoLog(){
		return this.archivoLog;
	}
	public String get_Aplicacion(){
		return this.aplicacion;
	}
	public String get_Formateo(){
		return this.formateo;
	}
	public String get_Loguer(){
		return this.logger;
	}
	public boolean get_tipoFiltro(){
		return this.tipoFiltro;
	}
	public String get_Filtro(){
		return this.filtro;
	}
}
