package ar.fiuba.tecnicas.tp1;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.fiuba.tecnicas.tp1.filtro.FiltroBasico;

public class Testfiltro {

		
	@Test
	public void testMensajeFiltroNoExcluyente(){
		
		String mensaje = "Hola Perro";
		boolean excluyente = false;
		FiltroBasico filtroBasico = new FiltroBasico("Perro", excluyente);
		assertEquals(filtroBasico.esExcluido(mensaje), true);
	}
	
	@Test
	public void testMensajeFiltroExcluyente(){
		
		String mensaje = "Hola Perro";
		boolean excluyente = true;
		FiltroBasico filtroBasico = new FiltroBasico("Perro", excluyente);
		assertEquals(filtroBasico.esExcluido(mensaje), false);
	}
	
	@Test
	public void testEsFiltroExcluyente(){
		
		
		boolean excluyente = true;
		FiltroBasico filtroBasico = new FiltroBasico("Perro", excluyente);
		assertEquals(filtroBasico.isExcluyente(), true);
	}
	
	@Test
	public void testNoEsFiltroExcluyente(){
		
		
		boolean excluyente = false;
		FiltroBasico filtroBasico = new FiltroBasico("Perro", excluyente);
		assertEquals(filtroBasico.isExcluyente(), false);
	}
	
	@Test
	public void testPalabraFiltro(){
		
		
		boolean excluyente = false;
		FiltroBasico filtroBasico = new FiltroBasico("Perro", excluyente);
		assertEquals(filtroBasico.getFiltro(), "Perro");
	}
	
	@Test
	public void testFiltroConstructorVacio(){
		
		FiltroBasico filtroBasico = new FiltroBasico();
		assertEquals(filtroBasico.isExcluyente(), false);
	}
	
	@Test
	public void testFiltroVacioNoFiltraNada(){
		
		FiltroBasico filtroBasico = new FiltroBasico();
		assertEquals(filtroBasico.getFiltro()," ");
	}
	

}
