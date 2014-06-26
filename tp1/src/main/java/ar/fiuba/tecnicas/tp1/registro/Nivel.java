package ar.fiuba.tecnicas.tp1.registro;

public class Nivel implements Forma {
	
	String nivel;
	Formateo format;
	boolean titulo;
	public Nivel (String nivelDato, Formateo n, boolean titulo){
		nivel = nivelDato;
		format = n;
		this.titulo = titulo;
	}
	
	
	public StringBuilder concatena (StringBuilder dato){
		String level = format.nivel(this);
		if (titulo) dato.append("Level: ");
		dato.append(level);
		return dato;
	}
	
		
	
}
