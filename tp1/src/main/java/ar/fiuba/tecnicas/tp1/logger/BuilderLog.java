package ar.fiuba.tecnicas.tp1.logger;

import ar.fiuba.tecnicas.tp1.filtro.FiltroBasico;
import ar.fiuba.tecnicas.tp1.propiedades.Config;
import ar.fiuba.tecnicas.tp1.registro.Archivo;
import ar.fiuba.tecnicas.tp1.registro.Consola;
import ar.fiuba.tecnicas.tp1.registro.Dispositivo;
import ar.fiuba.tecnicas.tp1.registro.Formateo;
import ar.fiuba.tecnicas.tp1.registro.OperadorDeDispositivos;

public class BuilderLog {
	Config config;
	
	public Logeable get_Log(){
		config = new Config();
    	return Armador(config);
	}
	public Logeable get_Log(String path){
		config = new Config(path);
		return Armador(config);
	}
	
	private Logeable Armador(Config config){
		boolean titulo = true;
    	FiltroBasico filtro = new FiltroBasico ();
    	OperadorDeDispositivos oper = new OperadorDeDispositivos(filtro);
		//OperadorDeDispositivos oper = new OperadorDeDispositivos();
    	Dispositivo disp1 = new Consola();
    	Dispositivo disp2 = new Archivo(config.get_ArchivoLog());
    	oper.agregarDispositivo(disp1);
    	oper.agregarDispositivo(disp2);
    	Formateo format = new Formateo(config.get_Formateo(), config.get_LogLevel(), config.get_Loguer(), titulo);
        Registrador nivel = new Trace(oper, format);
        Logeable log = new Logeable(nivel, config.get_Loguer());
		return log;
	}
	
	
	
}
