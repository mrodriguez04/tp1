package ar.fiuba.tecnicas.tp1;

import ar.fiuba.tecnicas.tp1.registro.Formateo;
import ar.fiuba.tecnicas.tp1.registro.OperadorDeDispositivos;


public abstract class Registrador {
	

	OperadorDeDispositivos oper;
	Formateo fr;
	
	public Registrador(OperadorDeDispositivos registro, Formateo formato){
		oper = registro;
		fr = formato;
	}
	public void debug(String log){
		oper.Imprimir(fr.armar(log, "DEBUG"));
	}

	public void info(String log){
		// Hay que implementar estos metodos
	    oper.Imprimir(fr.armar(log, "INFO"));
	}
	public void warn(String log){
		oper.Imprimir(fr.armar(log, "WARN"));
	}
	public void error(String log){
		oper.Imprimir(fr.armar(log, "ERROR"));
	}
	public void fatal(String log){
		oper.Imprimir(fr.armar(log, "FATAL"));
	}
}
