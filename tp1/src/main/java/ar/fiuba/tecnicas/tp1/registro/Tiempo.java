package ar.fiuba.tecnicas.tp1.registro;
import java.util.*;
import java.text.*;

public class Tiempo implements Forma {
	DateFormat dateFormat;
    Date date;
    
    public Tiempo(){
    	dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    }
    
	
	public String concatena(String dato){
		date = new Date();
		dato.concat(dateFormat.format(date));
		return dato;
	
	
	}

}
