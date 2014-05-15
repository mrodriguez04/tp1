package ar.fiuba.tecnicas.tp1;

import ar.fiuba.tecnicas.tp1.registro.*;

public class Warn extends Level {

	public Warn (Registra registro, Formateo formato){
		// Hay que implementar todos esto metodos
		super(registro, formato);
	}
	public void debug (String log){
		// No hago nada
	}
	public void info(String log){
		// No hago nada
		
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
