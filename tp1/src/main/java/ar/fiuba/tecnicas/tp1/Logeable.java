package ar.fiuba.tecnicas.tp1;

public class Logeable {
	private Registrador registra;
	
	public Logeable(Registrador level1){
		registra = level1;
	}

	public void debug(String log){
		registra.debug(log);
	}
	
	public void info(String log){
		registra.info(log);
	}
	
	public void fatal(String log){
		registra.fatal(log);
	}
	
}
