package ar.fiuba.tecnicas.tp1;
import ar.fiuba.tecnicas.tp1.propiedades.Config;
import ar.fiuba.tecnicas.tp1.registro.*;
import ar.fiuba.tecnicas.tp1.filtro.FiltroBasico;
import ar.fiuba.tecnicas.tp1.logger.*;
import ar.fiuba.tecnicas.tp1.logger.Error;

/**
 * Hello world!
 *
 */
public class AppLogDebug 
{
    public static void main( String[] args )
    {
    	
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
        Registrador nivel = new Debug(oper, format);
        Logeable log = new Logeable(nivel);
           
                
        
        log.trace("Ver como loguea TRACE");
        log.debug("Ver como loguea DEBUG");
        log.info("Ver como loguea INFO");
        log.warn("Ver como loguea WARN");
        log.error("Ver como loguea ERROR");
        log.fatal("Ver como loguea FATAL");
        
        
    }
}
