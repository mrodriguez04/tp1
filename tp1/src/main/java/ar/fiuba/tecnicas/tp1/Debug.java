package ar.fiuba.tecnicas.tp1;

import ar.fiuba.tecnicas.tp1.registro.Formateo;
import ar.fiuba.tecnicas.tp1.registro.Registra;

public class Debug extends Level {
		
	public Debug(Registra registro, Formateo formato){
		// Hay que implementar todos esto metodos
		super(registro, formato);
	}
	
	public void debug(String log){
		super.debug(log);
	}
	public void info(String log){
		super.info(log);
		
	}
	public void warn(String log){
		super.warn(log);
	}
	public void error(String log){
		super.error(log);
	}
	public void fatal(String log){
		super.fatal(log);
	}
	

}
