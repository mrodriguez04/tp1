package ar.fiuba.tecnicas.tp1;
import ar.fiuba.tecnicas.tp1.propiedades.Config;


/**
 * Hello world!
 *
 */
public class AppXML 
{
    public static void main( String[] args )
    {
    	
    	Config config = new Config("conf/config.properties.xml");
    	System.out.println(config.get_Loguer());
    	System.out.println(config.get_ArchivoLog());
    	System.out.println(config.get_Formateo());
    	System.out.println(config.get_LogLevel());
    	
    	
        
        
    }
}
