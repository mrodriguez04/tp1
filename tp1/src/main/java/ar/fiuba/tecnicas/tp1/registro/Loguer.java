package ar.fiuba.tecnicas.tp1.registro;

public class Loguer implements Forma {
	
	String loguer;
	Formateo format;
	boolean titulo;
	public Loguer (String nombreDato, Formateo n, boolean titulo){
		this.loguer = nombreDato;
		this.format = n;
		this.titulo = titulo;
		
	}
	
	public StringBuilder concatena (StringBuilder dato){
		if(titulo) dato.append("Nombre Log: ");
		dato.append(loguer);
		return dato;
	}
	
		
	
}
