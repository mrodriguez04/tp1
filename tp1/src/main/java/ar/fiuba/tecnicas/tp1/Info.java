package ar.fiuba.tecnicas.tp1;


public class Info extends Level{
	public void info(String log){
		// Hay que implementar estos metodos
		System.out.println(log);
	}
	public void warn(String log){
		System.out.println(log);
	}
	public void error(String log){
		
	}
	public void fatal(String log){
		System.out.println(log);
	}
	
	

}
