package ar.fiuba.tecnicas.tp1.registro;


import ar.fiuba.tecnicas.tp1.Config;
import junit.framework.TestCase;

public class TestRegistro extends TestCase {
	

	public void testNivelesDiferentesMismoFormato() {

			
			Formateo n = new Formateo( "p", "INFO", "Nicolas");
			
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
	public void testConfiguracionLogLevel(){
		Config config = new Config("conf/config.properties");
		assertEquals(config.get_LogLevel(),"WARN");
	}
	public void testConfiguracionAplicacion(){
		Config config = new Config("conf/config.properties");
		assertEquals(config.get_Aplicacion(),"TP1");
	}
	public void testConfiguracionFormato(){
		Config config = new Config("conf/config.properties");
		assertEquals(config.get_Formateo(),"%d%p%t%g");
	}
	public void testConfiguracionPathArchivo(){
		Config config = new Config("conf/config.properties");
		assertEquals(config.get_ArchivoLog(),"/tmp/Aplicacion.log");
	}
	public void testUnloguer(){
		Config config = new Config("conf/config.properties");
		assertEquals(config.get_Loguer(),"Marcelo");
	}
	
	
	

}
