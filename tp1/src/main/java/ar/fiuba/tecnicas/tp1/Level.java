package ar.fiuba.tecnicas.tp1;

import ar.fiuba.tecnicas.tp1.registro.Formateo;
import ar.fiuba.tecnicas.tp1.registro.Registra;

public abstract class Level {
	
/*	public void debug(String log){
		
	}
	public void info(String log){
		
	}
	public void warn(String log){
		
	}
	public void error(String log){
		
	}
	public void fatal(String log){
		
	}*/
	
	Registra reg;
	Formateo fr;
	
	public Level(Registra registro, Formateo formato){
		reg = registro;
		fr = formato;
	}
	public void debug(String log){
		reg.Imprimir(fr.formateo(log, "DEBUG"));
	}

	public void info(String log){
		// Hay que implementar estos metodos
	    reg.Imprimir(fr.formateo(log, "INFO"));
	}
	public void warn(String log){
		reg.Imprimir(fr.formateo(log, "WARN"));
	}
	public void error(String log){
		reg.Imprimir(fr.formateo(log, "ERROR"));
	}
	public void fatal(String log){
		reg.Imprimir(fr.formateo(log, "FATAL"));
	}
}
