package ar.fiuba.tecnicas.tp1.filtro;



public class FiltroBasico {
	
	
	private String filtro;
	
	public FiltroBasico (String filtradopor){
		
		
		this.filtro = filtradopor;
	}
	
	public boolean estaContenido(String mensaje){
		
		
		return mensaje.contains(this.filtro);
	}
	
	public boolean noContiene(String mensaje){
		
		
		return !mensaje.contains(this.filtro);
	}

	

}
