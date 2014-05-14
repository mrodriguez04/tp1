package ar.fiuba.tecnicas.tp1.registro;

public class Hilo extends Thread implements Forma {
	
	public String concatena (String dato){
		dato.concat(getName());
		return dato;
	}

}
