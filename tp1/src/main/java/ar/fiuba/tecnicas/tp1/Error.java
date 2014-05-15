package ar.fiuba.tecnicas.tp1;

import ar.fiuba.tecnicas.tp1.registro.*;

public class Error {
	Registra reg;
	Formateo fr;
	
	public Error (Registra registro, Formateo formato){
		// Hay que implementar todos esto metodos
		reg = registro;
		fr = formato;
	}
	public void error(String log){
		reg.Imprimir(fr.formateo(log, "ERROR"));
	}
	public void fatal(String log){
		reg.Imprimir(fr.formateo(log, "FATAL"));
	}

}
