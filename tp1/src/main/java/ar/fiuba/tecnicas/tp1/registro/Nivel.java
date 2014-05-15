package ar.fiuba.tecnicas.tp1.registro;

public class Nivel implements Forma {
	
	String nivel;
	public Nivel (String nivelDato){
		nivel = nivelDato;
	}
	
	public StringBuilder concatena (StringBuilder dato){
		dato.append(this.nivel);
		return dato;
	}
	
		
	
}
