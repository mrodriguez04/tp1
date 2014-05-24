package ar.fiuba.tecnicas.tp1;
import ar.fiuba.tecnicas.tp1.registro.*;

public class Info extends Registrador{
	OperadorDeDispositivos reg;
	Formateo fr;
	
	public Info(OperadorDeDispositivos registro, Formateo formato){
		super(registro, formato);
	}
	
	public void debug (String log){
		// No hago nada
	}
}
