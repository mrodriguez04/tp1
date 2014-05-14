package ar.fiuba.tecnicas.tp1;

public class Logger {
	private Level level;
	
	public Logger(Level level1){
		level = level1;
	}

	public void debug(String log){
		level.debug(log);
	}
	
	public void info(String log){
		level.info(log);
	}
	
	public void fatal(String log){
		level.fatal(log);
	}
	
}
