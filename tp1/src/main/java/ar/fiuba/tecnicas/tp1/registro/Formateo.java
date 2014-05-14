package ar.fiuba.tecnicas.tp1.registro;
import java.util.*;

public class Formateo{
	String var[];
	String linea;
	ArrayList <Forma> lf;
	Forma fecha;
	Forma thread;
	public Formateo(String variables){
		lf = new ArrayList<Forma>();
		var = variables.split("%");
		for (String v : var){
			if ( v.equals("d")){
				fecha = new Tiempo();
				lf.add(fecha);
			}else if ( v.equals("t")) {
				thread = new Hilo();
				lf.add(thread);
			}
		} 
		
	}
	
	public String formateo(String log){
		linea = new String();
		for (Forma v : lf){
			v.concatena(linea);
		}
		linea.concat(log);
		return linea;
	}
	

}
