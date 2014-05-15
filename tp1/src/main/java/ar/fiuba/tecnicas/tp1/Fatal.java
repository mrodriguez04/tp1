package ar.fiuba.tecnicas.tp1;

import ar.fiuba.tecnicas.tp1.registro.Formateo;
import ar.fiuba.tecnicas.tp1.registro.Registra;

public class Fatal extends Level {
	Registra reg;
	Formateo fr;
	public Fatal(Registra registro, Formateo formato){
		// Hay que implementar todos esto metodos
		reg = registro;
		fr = formato;
	}
	
	public void fatal(String log){
		reg.Imprimir(fr.formateo(log, "FATAL"));
	}
	
}
