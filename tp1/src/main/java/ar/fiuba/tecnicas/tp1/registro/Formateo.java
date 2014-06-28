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
	Forma nombre_archivo;
	String tipo;
	boolean titulo;
	public Formateo(String variables, String nivelLog, String nombre, boolean titulo, String path){
		lf = new ArrayList<Forma>();
		this.titulo = titulo;
		var = variables.split("%");
		for (String v : var){
			if ( v.equals("d")){
				fecha = new Tiempo(titulo);
				lf.add(fecha);
			}else if ( v.equals("t")) {
				thread = new Hilo(titulo);
				lf.add(thread);
			}else if ( v.equals("p")){
				nivel = new Nivel(nivelLog, this, titulo);
				lf.add(nivel);
			}else if ( v.equals("g")){
				nombre_loguer = new Loguer(nombre, this, titulo);
				lf.add(nombre_loguer);
			}else if ( v.equals("F")){
				//nombre_archivo = new NombreArchivo(path, titulo);
				//lf.add(nombre_archivo);
			}
			
		}
		
	}
	
	public String armar(String log, String tipo){
		String retorno;
		this.tipo = tipo;
		linea = new StringBuilder();
		for (Forma v : lf){
			v.concatena(linea);
			linea.append(", ");
		}
		if (titulo) linea.append("mensaje: ");
		retorno = linea.append(log).toString();
		return retorno;
	}
	
	public String nivel(Forma tipoNivel){
		return this.tipo;
	}
	

	
}
