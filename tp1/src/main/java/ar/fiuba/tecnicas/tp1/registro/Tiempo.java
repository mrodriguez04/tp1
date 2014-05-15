package ar.fiuba.tecnicas.tp1.registro;
import java.util.*;
import java.text.*;

public class Tiempo implements Forma {
	DateFormat dateFormat;
    Date date;
    
    public Tiempo(){
    	dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    }
    
	
	public StringBuilder concatena(StringBuilder dato){
		date = new Date();
		dato.append(dateFormat.format(date));
		return dato;
	
	
	}

}
