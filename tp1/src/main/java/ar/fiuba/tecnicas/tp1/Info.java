package ar.fiuba.tecnicas.tp1;
import ar.fiuba.tecnicas.tp1.registro.*;

public class Info extends Level{
	Registra reg;
	Formateo fr;
	
	public Info(Registra registro, Formateo formato){
		super(registro, formato);
	}
	
	public void debug (String log){
		// No hago nada
	}
	public void info(String log){
		super.info(log);
		
	}
	public void warn(String log){
		super.warn(log);
	}
	public void error(String log){
		super.error(log);
	}
	public void fatal(String log){
		super.fatal(log);
	}
	
	

}
