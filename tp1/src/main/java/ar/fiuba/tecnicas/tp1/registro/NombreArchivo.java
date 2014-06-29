package ar.fiuba.tecnicas.tp1.registro;

public class NombreArchivo implements Forma{

	private String nombreArchivo;
	private boolean titulo;
	public NombreArchivo(String nombre, boolean titulo){
		this.nombreArchivo = nombre;
		this.titulo = titulo;
	}
	@Override
	public StringBuilder concatena(StringBuilder dato) {
		// TODO Auto-generated method stub
		if(this.titulo) dato.append("Nombre Archivo: ");
		dato.append(this.nombreArchivo);
		return null;
	}
	

}
