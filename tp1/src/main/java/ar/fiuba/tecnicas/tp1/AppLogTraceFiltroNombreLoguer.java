package ar.fiuba.tecnicas.tp1;
import ar.fiuba.tecnicas.tp1.propiedades.Config;
import ar.fiuba.tecnicas.tp1.registro.*;
import ar.fiuba.tecnicas.tp1.filtro.FiltroBasico;
import ar.fiuba.tecnicas.tp1.logger.*;

/**
 * Hello world!
 *
 */
public class AppLogTraceFiltroNombreLoguer 
{
    public static void main( String[] args )
    {
    	
    	Config config = new Config();
    	boolean excluyente = false;
    	FiltroBasico filtro = new FiltroBasico ("Marcelo",excluyente);
    	// Armo los dispositivos en los cuales voy a imprimir los logs
    	OperadorDeDispositivos oper = new OperadorDeDispositivos(filtro);
    	Dispositivo disp1 = new Consola();
    	Dispositivo disp2 = new Archivo(config.get_ArchivoLog());
    	oper.agregarDispositivo(disp1);
    	oper.agregarDispositivo(disp2);
    	
        Formateo format = new Formateo(config.get_Formateo(), config.get_LogLevel(), config.get_Loguer());
        Registrador nivel = new Trace(oper, format);
        Logeable log = new Logeable(nivel);
        
     /*   Config config2 = new Config("conf/config.properties.xml");
        Dispositivo disp3 = new Archivo(config2.get_ArchivoLog());
        OperadorDeDispositivos oper2 = new OperadorDeDispositivos(filtro);
        oper2.agregarDispositivo(disp3);
        Formateo format2 = new Formateo(config.get_Formateo(), config.get_LogLevel(), config.get_Loguer());
        Registrador nivel2 = new Trace (oper2, format2);
        Logeable log2 = new Logeable (nivel2);*/
           
                
        log.trace("Ver como loguea TRACE");
        log.debug("Ver como loguea DEBUG");
        log.info("Ver como loguea INFO");
        log.warn("Ver como loguea WARN");
        log.error("Ver como loguea ERROR");
        log.fatal("Ver como loguea FATAL");
        
        
        
    }
}
