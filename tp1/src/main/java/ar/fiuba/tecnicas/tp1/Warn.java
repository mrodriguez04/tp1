package ar.fiuba.tecnicas.tp1;

import ar.fiuba.tecnicas.tp1.registro.*;

public class Warn {

	Registra reg;
	Formateo fr;
	public Warn (Registra registro, Formateo formato){
		// Hay que implementar todos esto metodos
		reg = registro;
		fr = formato;
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
