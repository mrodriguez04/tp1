package ar.fiuba.tecnicas.tp1.registro;
import java.util.*;

public class Formateo{
	String var[];
	StringBuilder linea;
	ArrayList <Forma> lf;
	Forma fecha;
	Forma thread;
	Forma nivel;
	public Formateo(String variables, String tipo){
		lf = new ArrayList<Forma>();
		var = variables.split("%");
		for (String v : var){
			if ( v.equals("d")){
				fecha = new Tiempo();
				lf.add(fecha);
			}else if ( v.equals("t")) {
				thread = new Hilo();
				lf.add(thread);
			}else if ( v.equals("p")){
				nivel = new Nivel(tipo);
				lf.add(nivel);
				
				
			}
			
		} 
		
	}
	
	public String formateo(String log){
		String retorno;
		linea = new StringBuilder();
		for (Forma v : lf){
			
			v.concatena(linea);
			linea.append(" ");
		}
		retorno = linea.append(log).toString();
		return retorno;
	}
	

}
