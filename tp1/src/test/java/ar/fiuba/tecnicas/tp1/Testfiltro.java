package ar.fiuba.tecnicas.tp1;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.fiuba.tecnicas.tp1.filtro.FiltroBasico;

public class Testfiltro {

		
	@Test
	public void testStringContenidoFiltro(){
		
		String mensaje = "Hola Perro";
		FiltroBasico filtroBasico = new FiltroBasico("P");
		assertEquals(filtroBasico.estaContenido(mensaje), true);
	}
	

}
