package ar.fiuba.tecnicas.tp1.registro;

public class Nivel implements Forma {
	
	String nivel;
	Formateo format;
	public Nivel (String nivelDato, Formateo n){
		nivel = nivelDato;
		format = n;
		
	}
	
	public StringBuilder concatena (StringBuilder dato){
		String level = format.nivel(this);
		dato.append(level);
		return dato;
	}
	
		
	
}
