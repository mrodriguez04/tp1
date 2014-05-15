package ar.fiuba.tecnicas.tp1;
import ar.fiuba.tecnicas.tp1.registro.*;

public class Info extends Level{
	Registra reg;
	Formateo fr;
	
	Info(Registra registro, Formateo formato){
		reg = registro;
		fr = formato;
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
