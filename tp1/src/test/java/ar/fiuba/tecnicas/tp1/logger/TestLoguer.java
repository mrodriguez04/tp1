package ar.fiuba.tecnicas.tp1.logger;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.fiuba.tecnicas.tp1.filtro.FiltroBasico;
import ar.fiuba.tecnicas.tp1.propiedades.Config;
import ar.fiuba.tecnicas.tp1.registro.Archivo;
import ar.fiuba.tecnicas.tp1.registro.Consola;
import ar.fiuba.tecnicas.tp1.registro.Dispositivo;
import ar.fiuba.tecnicas.tp1.registro.Formateo;
import ar.fiuba.tecnicas.tp1.registro.OperadorDeDispositivos;

public class TestLoguer {

	@Test
	public void testLoguerSinInstanciaPrevia() {
		
		Logeable loguer = Logeable.getInstance("25");
		
		assertEquals(loguer.get_Nombre(), "loguer default");
		
	}
	
	@Test
	public void testLoguerCambioDeNombre() {
		
		Logeable loguer = Logeable.getInstance("35");
		loguer.cambiar_Nombre("Juan");
		assertEquals(loguer.get_Nombre(), "Juan");
		
	}
	
	@Test
	public void testLoguerConNivelSinInstanciaPrevia() {
		
		Logeable loguer = Logeable.getInstance("85");
		Config config = new Config();
    	boolean excluyente = false;
    	FiltroBasico filtro = new FiltroBasico (" ",excluyente);
    	// Armo los dispositivos en los cuales voy a imprimir los logs
    	OperadorDeDispositivos oper = new OperadorDeDispositivos(filtro);
    	Dispositivo disp1 = new Consola();
    	Dispositivo disp2 = new Archivo(config.get_ArchivoLog());
    	oper.agregarDispositivo(disp1);
    	oper.agregarDispositivo(disp2);
    	
        Formateo format = new Formateo(config.get_Formateo(), config.get_LogLevel(), config.get_Loguer());
        Registrador nivel = new Info(oper, format);
		loguer= new Logeable(nivel);
		
		assertEquals(loguer.get_Nombre(), "loguer default");
		
	}
	
	@Test
	public void testLoguerCambioDeNombreYOtroLlamadoALaMismaInstancia() {
		
		Logeable loguer = Logeable.getInstance("75");
		loguer.cambiar_Nombre("Juan");
		Logeable logger2 = Logeable.getInstance("75");
		assertEquals(logger2.get_Nombre(), "Juan");
		
	}

}
