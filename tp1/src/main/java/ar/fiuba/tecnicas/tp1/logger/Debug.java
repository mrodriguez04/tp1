package ar.fiuba.tecnicas.tp1.logger;

import ar.fiuba.tecnicas.tp1.registro.Formateo;
import ar.fiuba.tecnicas.tp1.registro.OperadorDeDispositivos;


public class Debug extends Registrador {
		
	public Debug(OperadorDeDispositivos registro, Formateo formato){
		// Hay que implementar todos esto metodos
		super(registro, formato);
	}

	public void trace(String log){
		// No hago nada
	}
	
}
