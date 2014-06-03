package ar.fiuba.tecnicas.tp1.registro;

import java.io.*;
import java.io.IOException;
import java.io.InputStream;

public class Archivo implements Dispositivo{
	private String path;
	private InputStream input;
	FileWriter archivo = null;
    PrintWriter br = null;
    
	public Archivo (String lugar){
		 this.path = lugar;
	}
	
	
	public void Imprimir(String dato) {
		// TODO Auto-generated method stub
		abrir();
		br.println(dato);
		cerrar();
	}
	
	private void abrir(){
		try {
			 archivo = new FileWriter(path,true);
			 br = new PrintWriter(archivo);
				//input = new FileInputStream(this.path);
		 			
			} catch (IOException ex) {
				ex.printStackTrace();
			} finally {
				if (input != null) {
					try {
						input.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
			
	}
	
	private void cerrar(){
		br.close();
	}
	
	public String get_Path(){
		return this.path;
	}
	

}
