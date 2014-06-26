package ar.fiuba.tecnicas.tp1.registro;

public class Hilo extends Thread implements Forma {
	
	boolean titulo;
	public Hilo(boolean titulo){
		this.titulo = titulo;
	}
	
	public StringBuilder concatena (StringBuilder dato){
		if(titulo) dato.append("Nro de Thread: ");
		dato.append(getName());
		return dato;
	}

}
