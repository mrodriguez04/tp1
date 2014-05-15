package ar.fiuba.tecnicas.tp1;
import ar.fiuba.tecnicas.tp1.registro.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Config config = new Config("conf/config.properties");
    	// Armo los dispositivos en los cuales voy a imprimir los logs
    	Registra reg = new Registra();
    	Dispositivo disp1 = new Consola();
    	Dispositivo disp2 = new Archivo(config.get_ArchivoLog());
    	reg.agregarDispositivo(disp1);
    	reg.agregarDispositivo(disp2);
    	    	
        System.out.println("Imprimimos los datos del archivo Properties...");
        System.out.println( config.get_LogLevel());
        System.out.println( config.get_ArchivoLog());
        System.out.println( config.get_Aplicacion());
        Formateo format = new Formateo(config.get_Formateo(), config.get_LogLevel());
        Level nivel = new Info(reg, format);
        Logger log = new Logger(nivel);
       
        
        
        log.debug("No debe loguear DEBUG");
        log.info("Ver como loguea INFO");
        log.fatal("Ver como loguea FATAL");
        
        
    }
}
