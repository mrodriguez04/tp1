package ar.fiuba.tecnicas.tp1;
import ar.fiuba.tecnicas.tp1.registro.*;

public class Info extends Logueo{
	Registra reg;
	Formateo fr;
	
	public Info(Registra registro, Formateo formato){
		super(registro, formato);
	}
	
	public void debug (String log){
		// No hago nada
	}
}
