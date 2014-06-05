package ar.fiuba.tecnicas.tp1.propiedades;

public abstract class Propiedades {

	public String get_LogLevel(){
		return "INFO";
	}
	public String get_ArchivoLog(){
		return "default";
	}
	public String get_Aplicacion(){
		return "Sin Configurar";
	}
	public String get_Formateo(){
		return "%d%p%t%g";
	}
	public String get_Loguer(){
		return "MECHA";
	}
}
