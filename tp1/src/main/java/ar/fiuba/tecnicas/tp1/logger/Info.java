package ar.fiuba.tecnicas.tp1.logger;
import ar.fiuba.tecnicas.tp1.registro.*;

public class Info extends Registrador{
	OperadorDeDispositivos reg;
	Formateo fr;
	
	public Info(OperadorDeDispositivos registro, Formateo formato){
		super(registro, formato);
	}
	public void trace (String log){
		// No hago nada
	}
	
	public void debug (String log){
		// No hago nada
	}
}
