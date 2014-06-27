package ar.fiuba.tecnicas.tp1.logger;

import ar.fiuba.tecnicas.tp1.registro.Formateo;
import ar.fiuba.tecnicas.tp1.registro.OperadorDeDispositivos;


public abstract class Registrador {
	
	

	OperadorDeDispositivos oper;
	Formateo fr;
	
	public Registrador(OperadorDeDispositivos registro, Formateo formato){
		oper = registro;
		fr = formato;
	}
	public void  trace(String log){
		oper.Imprimir(fr.armar(log, "TRACE"));
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
	public void excepcion(Throwable e){
		oper.ImprimirExcepcion(e.getMessage());
		StackTraceElement[] stack = e.getStackTrace();
		for( int i = 0; i < stack.length; i++){
			oper.ImprimirExcepcion(stack[i].toString());
		}
		
	}
	
}
