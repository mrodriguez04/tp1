package ar.fiuba.tecnicas.tp1;

public class Logger {
	private Logueo logueo;
	
	public Logger(Logueo level1){
		logueo = level1;
	}

	public void debug(String log){
		logueo.debug(log);
	}
	
	public void info(String log){
		logueo.info(log);
	}
	
	public void fatal(String log){
		logueo.fatal(log);
	}
	
}
