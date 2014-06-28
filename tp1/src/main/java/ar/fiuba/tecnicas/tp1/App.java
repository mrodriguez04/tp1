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
    	Logeable loggernuestro1;
    	Logeable loggernuestro2;
    	Logeable loggernuestro3;
        BuilderLog builder = new BuilderLog();
        loggernuestro1 = builder.get_Log("conf/config1.properties.xml");
        loggernuestro2 = builder.get_Log("conf/config2.properties.xml");
        loggernuestro3 = builder.get_Log("conf/config3.properties.xml");
        final Logger logger1 = factory.getLogger("logger1");  
        final Logger logger2 = factory.getLogger("logger2");
        final Logger logger3 = factory.getLogger("logger3");
        
    //    System.out.println(builder.get_config().get_tipoFiltro());
        
        logger1.info("Helllo Word");
        logger1.info("Hola Mundo");
        logger1.info("Hallo Welt");
        
        logger2.info("tp no deberia loguearse");
        logger2.debug("tp deberia loguearse");
        
        logger3.trace("no deberia loguearse..");
        logger3.warn("esto deberia loggearse con excepcion", new NullPointerException());
        logger3.error("esto deberia loggearse tambien .....");
        
 }
}
