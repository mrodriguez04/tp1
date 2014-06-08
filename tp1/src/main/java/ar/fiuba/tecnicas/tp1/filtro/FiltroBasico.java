package ar.fiuba.tecnicas.tp1.filtro;



public class FiltroBasico {
	
	private String filtro;
	private boolean excluyente;
	
	
	public String getFiltro() {
		return filtro;
	}

	public void setFiltro(String filtro) {
		this.filtro = filtro;
	}

	public boolean isExcluyente() {
		return excluyente;
	}

	public void setExcluyente(boolean excluyente) {
		this.excluyente = excluyente;
	}

	public FiltroBasico (){
			filtro = " ";
			excluyente= true;
	}
	
	public FiltroBasico (String filtradopor,boolean excluyente){
		
		this.excluyente=excluyente;
		this.filtro = filtradopor;
	}
	
	public boolean esExcluido(String mensaje){
			
		if (this.excluyente)
		return !mensaje.contains(this.filtro);
		else
		return mensaje.contains(this.filtro);
	}
	
	

	

}
