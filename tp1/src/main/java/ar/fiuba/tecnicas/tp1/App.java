package ar.fiuba.tecnicas.tp1;

import ar.fiuba.tecnicas.tp1.logger.*;

import org.slf4j.Logger;
import org.slf4j.impl.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// StaticLoggerBinder binderFactory;
    	LogFactory factory = new LogFactory();
    	Logeable log_nuestro1;
    	Logeable log_nuestro2;
        BuilderLog builder = new BuilderLog();
        log_nuestro1 = builder.get_Log();
        log_nuestro2 = builder.get_Log("conf/conf1/config.properties");
        
        final Logger log2 = factory.getLogger("Marcelo");  
        final Logger log3 = factory.getLogger("NICO");
                
        log_nuestro1.debug("No debe loguear DEBUG");
        log_nuestro1.info("Ver como loguea INFO");
        log_nuestro1.fatal("Ver como loguea FATAL");
        log_nuestro2.debug("No debe loguear DEBUG");
        log_nuestro2.info("Ver como loguea INFO");
        log_nuestro2.fatal("Ver como loguea FATAL");
      //   log.fatal(log.get_Nombre());
        log2.debug("No debe loguea DEBUGGG");
        log2.info("Ver como loguea INFOOOOOO");
        log2.error("Ver como loguea un Erroor");
        log3.debug("No debe loguea DEBUGGG");
        log3.info("Ver como loguea INFOOOOOO");
        log3.error("Ver como loguea un Erroor");
    }
}
