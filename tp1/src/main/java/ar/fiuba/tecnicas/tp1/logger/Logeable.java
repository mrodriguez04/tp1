package ar.fiuba.tecnicas.tp1.logger;

import java.util.HashMap;
import java.util.Map;

import ar.fiuba.tecnicas.tp1.propiedades.Config;
import ar.fiuba.tecnicas.tp1.registro.Consola;
import ar.fiuba.tecnicas.tp1.registro.Dispositivo;
import ar.fiuba.tecnicas.tp1.registro.Formateo;
import ar.fiuba.tecnicas.tp1.registro.OperadorDeDispositivos;

public class Logeable {
	
	private Registrador registra;
	String nombrelog;
	
    private static final Map<String, Logeable> instances = new HashMap<String,  Logeable>();
    
    private  Logeable() {
        // Constructor por default, en una consola con el formato 
    	// que tenga el archivo de configuracion en nivel INFO
    	Config config = new Config();
    	OperadorDeDispositivos oper = new OperadorDeDispositivos();
    	Dispositivo disp1 = new Consola();
    	oper.agregarDispositivo(disp1);
    	this.nombrelog="loguer default";
    	Formateo format = new Formateo(config.get_Formateo(), config.get_LogLevel(), config.get_Loguer());
        Registrador nivel = new Info(oper, format);
        this.registra=nivel;
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
	
	public void cambiar_Nombre(String nuevo){
		this.nombrelog=nuevo;
	}
}
