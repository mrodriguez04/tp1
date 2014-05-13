package ar.fiuba.tecnicas.tp1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Config config = new Config("conf/config.properties");
    	
        System.out.println("Imprimimos los datos del archivo Properties...");
        System.out.println( config.get_LogLevel());
        System.out.println( config.get_ArchivoLog());
        System.out.println( config.get_Aplicacion());
        
        Level nivel = new Info();
        Logger log = new Logger(nivel);
        log.Info("Ver como loguea");
        
        
    }
}
