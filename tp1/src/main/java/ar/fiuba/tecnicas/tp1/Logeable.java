package ar.fiuba.tecnicas.tp1;

import java.util.HashMap;
import java.util.Map;

public class Logeable {
	
	private Registrador registra;
	String nombrelog;
	
    private static final Map<String, Logeable> instances = new HashMap<String,  Logeable>();
    
    private  Logeable() {
        // no explicit implementation
    	System.out.println("Este loguer no existia");
    	nombrelog="loguer default";
    }
 
    public static synchronized  Logeable getInstance(String key) {
 
        // Our "per key" singleton
    	 Logeable instance = instances.get(key);
 
    	 if (instance == null) {
            // Lazily create instance
            instance = new  Logeable();
 
            // Add it to map   
            instances.put(key, instance);
    	 }
 
        return instance;
    }
	
	
	
	public Logeable(Registrador level1){
		registra = level1;
	}

	public void debug(String log){
		registra.debug(log);
	}
	
	public void info(String log){
		registra.info(log);
	}
	
	public void fatal(String log){
		registra.fatal(log);
	}
	
	public String get_Nombre(){
		return this.nombrelog;
	}
}
