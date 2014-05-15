package ar.fiuba.tecnicas.tp1;

import ar.fiuba.tecnicas.tp1.registro.Formateo;
import ar.fiuba.tecnicas.tp1.registro.Registra;

public class Debug extends Level {
	Registra reg;
	Formateo fr;
	
	public Debug(Registra registro, Formateo formato){
		// Hay que implementar todos esto metodos
		reg = registro;
		fr = formato;
	}
	public void debug(String log){
		reg.Imprimir(fr.formateo(log, "DEBUG"));
	}
	public void info(String log){
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
