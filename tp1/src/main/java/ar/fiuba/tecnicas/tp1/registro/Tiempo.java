package ar.fiuba.tecnicas.tp1.registro;
import java.util.*;
import java.text.*;

public class Tiempo implements Forma {
	DateFormat dateFormat;
    Date date;
    boolean titulo;
    public Tiempo(boolean titulo){
    	dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    	this.titulo = titulo;
    }
    
	
	public StringBuilder concatena(StringBuilder dato){
		date = new Date();
		if (titulo) dato.append("datetime: ");
		dato.append(dateFormat.format(date));
		return dato;
	
	
	}

}
