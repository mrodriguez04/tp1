package ar.fiuba.tecnicas.tp1.registro;
import java.util.*;

public class Formateo{
	String var[];
	StringBuilder linea;
	ArrayList <Forma> lf;
	Forma fecha;
	Forma thread;
	Forma nivel;
	String tipo;
	public Formateo(String variables, String nivelLog){
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
				nivel = new Nivel(nivelLog, this);
				lf.add(nivel);
			}
			
		} 
		
	}
	
	public String formateo(String log, String tipo){
		String retorno;
		this.tipo = tipo;
		linea = new StringBuilder();
		for (Forma v : lf){
			v.concatena(linea);
			linea.append(" ");
		}
		retorno = linea.append(log).toString();
		return retorno;
	}
	
	public String nivel(Forma tipoNivel){
		return this.tipo;
	}

}
