package ar.fiuba.tecnicas.tp1.registro;


import ar.fiuba.tecnicas.tp1.Config;
import junit.framework.TestCase;

public class TestRegistro extends TestCase {
	

	public void testNivelesDiferentesMismoFormato() {

			
			Formateo n = new Formateo( "p", "INFO");
			
			Nivel nivel = new Nivel("INFO",n);
			Nivel otroNivel = new Nivel("INFO",n);
			
			StringBuilder dato = new StringBuilder("INFO");
									
			assertEquals (nivel.concatena(dato) ,otroNivel.concatena(dato));
		}		
	public void testHilosDiferentesConMismoProceso() {
		
			Hilo hilo= new Hilo();
			Hilo otroHilo = new Hilo();
		
			StringBuilder dato = new StringBuilder("Proceso");
									
			assertEquals (hilo.concatena(dato) ,otroHilo.concatena(dato));
		}
	public void testTiemposDiferentesConElMismoDato() {
		
			Tiempo tiempo= new Tiempo();
			Tiempo otroTiempo = new Tiempo();
	
			StringBuilder dato = new StringBuilder("23:56");
								
			assertEquals (tiempo.concatena(dato) ,otroTiempo.concatena(dato));
	}
	public void testOperadorDeDispositivosVacio() {
		
			OperadorDeDispositivos oper = new OperadorDeDispositivos();
									
			assertEquals ( oper.ld.size(),0);
		}
	public void testOperadorDeDispositivosConUnDispositivo() {
		
			OperadorDeDispositivos oper = new OperadorDeDispositivos();
			Dispositivo disp = new Consola();
			oper.agregarDispositivo(disp);
								
			assertEquals ( oper.ld.size(),1);
		}
	public void testOperadorDeDispositivosConDosDispositivoDiferentes() {
				
		OperadorDeDispositivos oper = new OperadorDeDispositivos();
		Dispositivo consola = new Consola();
		Dispositivo archivo = new Archivo("path");
		
		oper.agregarDispositivo(consola);
		oper.agregarDispositivo(archivo);
							
		assertEquals ( oper.ld.size(),2);
	}
	public void testConfiguracion(){
		Config config = new Config("conf/config.properties");
		config.toString();
		//TODO config no tiene metodos para hacer pruebas, creo que solo tiene metodos de clase
	
	}
	

}
