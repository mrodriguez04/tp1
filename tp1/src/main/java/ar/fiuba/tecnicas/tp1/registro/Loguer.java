package ar.fiuba.tecnicas.tp1.registro;

public class Loguer implements Forma {
	
	String loguer;
	Formateo format;
	
	public Loguer (String nombreDato, Formateo n){
		loguer = nombreDato;
		format = n;
		
	}
	
	public StringBuilder concatena (StringBuilder dato){
		dato.append(loguer);
		return dato;
	}
	
		
	
}
