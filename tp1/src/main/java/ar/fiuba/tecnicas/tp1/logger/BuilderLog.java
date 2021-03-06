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
		String standard = "default";
		config = new Config();
    	return Armador(config, standard);
	}
	public Logeable get_Log(String path){
		config = new Config(path);
		return Armador(config, path);
	}
	
	private Logeable Armador(Config config, String path){
		boolean titulo;
		FiltroBasico filtro;
		if (config.get_tipoFiltro()){
				filtro = new FiltroBasico (config.get_filtro(), config.get_tipoFiltro());
			//	System.out.println(config.get_tipoFiltro());
		}else {
				filtro = new FiltroBasico();
			//	System.out.println(config.get_tipoFiltro());
		}
		titulo = config.get_fjson();
    	
    	OperadorDeDispositivos oper = new OperadorDeDispositivos(filtro);
		//OperadorDeDispositivos oper = new OperadorDeDispositivos();
    	Dispositivo disp1 = new Consola();
    	Dispositivo disp2 = new Archivo(config.get_ArchivoLog());
    	oper.agregarDispositivo(disp1);
    	oper.agregarDispositivo(disp2);
    	Formateo format = new Formateo(config.get_Formateo(), config.get_LogLevel(), config.get_Loguer(), titulo, config.get_ArchivoLog());
        Registrador nivel = new Trace(oper, format);
        Logeable log = new Logeable(nivel, config.get_Loguer());
		return log;
	}
	
	public Config get_config(){
		return this.config;
	}
	
	
	
}
