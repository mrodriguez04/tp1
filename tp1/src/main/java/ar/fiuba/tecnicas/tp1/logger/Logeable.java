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
    	boolean titulo = false;
    	String path = "default";
    	OperadorDeDispositivos oper = new OperadorDeDispositivos();
    	Dispositivo disp1 = new Consola();
    	oper.agregarDispositivo(disp1);
    	this.nombrelog=config.get_Loguer();
    	instances.put(config.get_Loguer(), this);
    	Formateo format = new Formateo(config.get_Formateo(), config.get_LogLevel(), config.get_Loguer(), titulo, path);
        Registrador nivel = new Debug(oper, format);
        this.registra=nivel;
    }
   /*
    public Logeable(String nombre){
    	Config config = new Config();
    	OperadorDeDispositivos oper = new OperadorDeDispositivos();
    	Dispositivo disp1 = new Consola();
    	oper.agregarDispositivo(disp1);
    	this.nombrelog=nombre;
    	instances.put(config.get_Loguer(), this);
    	Formateo format = new Formateo(config.get_Formateo(), config.get_LogLevel(), nombre);
        Registrador nivel = new Debug(oper, format);
        this.registra=nivel;
    }
    public Logeable(String nombre, String pathConfig){
    	Config config = new Config(pathConfig);
    	OperadorDeDispositivos oper = new OperadorDeDispositivos();
    	Dispositivo disp1 = new Consola();
    	oper.agregarDispositivo(disp1);
    	this.nombrelog=nombre;
    	instances.put(config.get_Loguer(), this);
    	Formateo format = new Formateo(config.get_Formateo(), config.get_LogLevel(), nombre);
        Registrador nivel = new Debug(oper, format);
        this.registra=nivel;
    }
    
    
    public static Logeable getInstance(String nombre){
    	Logeable instance = new Logeable(nombre);
    	instance.cambiar_Nombre(nombre);
    	return instance;
    }
    */
    
 
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
	public Logeable(Registrador level1, String nombre){
		registra = level1;
		this.nombrelog=nombre;
		instances.put(nombre, this);
		
	}
	
	
	public Logeable(Registrador level1){
		registra = level1;
		this.nombrelog="loguer default";
	}
	public void trace(String log){
		registra.trace(log);
	}
	public void debug(String log){
		registra.debug(log);
	}
	public void info(String log){
		registra.info(log);
	}
	public void warn(String log){
		registra.warn(log);
	}
	public void error(String log){
		registra.error(log);
	}
	public void fatal(String log){
		registra.fatal(log);
	}
	public void trace(String log, Throwable e){
		this.trace(log);
		registra.excepcion(e);
	}
	public void debug(String log, Throwable e){
		this.debug(log);
		registra.excepcion(e);
	}
	public void info(String log, Throwable e){
		registra.info(log);
		registra.excepcion(e);
	}
	public void warn(String log, Throwable e){
		registra.warn(log);
		registra.excepcion(e);
	}
	public void error(String log, Throwable e){
		registra.error(log);
		registra.excepcion(e);
	}
	public void fatal(String log, Throwable e){
		registra.fatal(log);
		registra.excepcion(e);
	}
	
	public String get_Nombre(){
		return this.nombrelog;
	}
	
	public void cambiar_Nombre(String nuevo){
		this.nombrelog=nuevo;
	}
}
