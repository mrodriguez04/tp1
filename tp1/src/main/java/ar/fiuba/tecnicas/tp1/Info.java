package ar.fiuba.tecnicas.tp1;
import ar.fiuba.tecnicas.tp1.registro.*;

public class Info extends Level{
	Registra reg;
	
	Info(Registra registro){
		reg = registro;
	}
	
	public void info(String log){
		// Hay que implementar estos metodos
		reg.Imprimir(log);
		
	}
	public void warn(String log){
		System.out.println(log);
	}
	public void error(String log){
		
	}
	public void fatal(String log){
		reg.Imprimir(log);
	}
	
	

}
