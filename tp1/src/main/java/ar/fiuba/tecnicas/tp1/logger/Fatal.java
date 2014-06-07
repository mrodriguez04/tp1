package ar.fiuba.tecnicas.tp1.logger;

import ar.fiuba.tecnicas.tp1.registro.Formateo;
import ar.fiuba.tecnicas.tp1.registro.OperadorDeDispositivos;


public class Fatal extends Registrador {
	
	public Fatal(OperadorDeDispositivos registro, Formateo formato){
		// Hay que implementar todos esto metodos
		super(registro, formato);
	}
	public void trace (String log){
		// No hago nada
	}
	
	public void debug (String log){
		// No hago nada
	}
	public void info(String log){
		// No hago nada
		
	}
	public void warn(String log){
		// No hago nada
	}
	public void error(String log){
		// No hago nada
	}
	public void fatal(String log){
		super.fatal(log);
	}
	
}
