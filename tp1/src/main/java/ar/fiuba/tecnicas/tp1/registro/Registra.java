package ar.fiuba.tecnicas.tp1.registro;
import java.util.*;

public class Registra {
	ArrayList<Dispositivo> ld;
	
	public Registra (){
		ld = new ArrayList<Dispositivo>();
	}
	
	public void agregarDispositivo (Dispositivo disp){
		ld.add(disp);
	}
	
	public void Imprimir(String dato){
		for ( Dispositivo ds : ld ) {
			ds.Imprimir(dato);
		}
	}
	
	
	
	
}
