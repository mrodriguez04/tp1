package ar.fiuba.tecnicas.tp1;

public class Logger {
	private Level level;
	
	public Logger(Level level1){
		level = level1;
	}

	public void Debug(String log){
		level.debug(log);
	}
	
	public void Info(String log){
		level.info(log);
	}
	
	public void Fatal(String log){
		level.fatal(log);
	}
	
}
