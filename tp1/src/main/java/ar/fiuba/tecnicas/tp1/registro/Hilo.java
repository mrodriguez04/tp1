package ar.fiuba.tecnicas.tp1.registro;

public class Hilo extends Thread implements Forma {
	
	public StringBuilder concatena (StringBuilder dato){
		dato.append(getName());
		return dato;
	}

}
