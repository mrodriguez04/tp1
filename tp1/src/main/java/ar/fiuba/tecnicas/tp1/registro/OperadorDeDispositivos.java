package ar.fiuba.tecnicas.tp1.registro;
import java.util.*;

import ar.fiuba.tecnicas.tp1.filtro.FiltroBasico;

public class OperadorDeDispositivos {
	ArrayList<Dispositivo> ld;
	FiltroBasico filtro;
	
	public OperadorDeDispositivos (){
		ld = new ArrayList<Dispositivo>();
		filtro= new FiltroBasico();
	}
		public OperadorDeDispositivos (FiltroBasico filtro){
		ld = new ArrayList<Dispositivo>();
		this.filtro= filtro;
	}
	
	public void agregarDispositivo (Dispositivo disp){
		ld.add(disp);
	}
	
	public void Imprimir(String dato){
		for ( Dispositivo ds : ld ) {
			imprimirDispositivo(ds,dato);
		
		}
	}
	public void ImprimirExcepcion(String dato){
		for ( Dispositivo ds : ld ) {
			ds.Imprimir(dato);
		
		}
	}
	
	public void agregarFiltro(FiltroBasico filtro){
		this.filtro=filtro;
		
	}
	
	private void imprimirDispositivo(Dispositivo ds,String mensaje){
		if 	(filtro.esExcluido(mensaje))
			ds.Imprimir(mensaje);
		
	}
	
	
	
	
}
