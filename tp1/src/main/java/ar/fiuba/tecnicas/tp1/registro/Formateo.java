package ar.fiuba.tecnicas.tp1.registro;
import java.util.*;

public class Formateo{
	String var[];
	StringBuilder linea;
	ArrayList <Forma> lf;
	Forma fecha;
	Forma thread;
	Forma nivel;
	Forma nombre_loguer;
	String tipo;
	public Formateo(String variables, String nivelLog, String nombre){
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
			}else if ( v.equals("g")){
				nombre_loguer = new Loguer(nombre, this);
				lf.add(nombre_loguer);
			}else if ( v.equals("F")){
				nombre_loguer = new Loguer(nombre, this);
				lf.add(nombre_loguer);
			}
			
		}
		
	}
	
	public String armar(String log, String tipo){
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
