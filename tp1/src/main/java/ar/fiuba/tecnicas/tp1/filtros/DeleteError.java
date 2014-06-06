package ar.fiuba.tecnicas.tp1.filtros;

public class DeleteError {

	private int codigo;
	private String descripcion;
	
	public static final DeleteError ERROR_CONSTRAINT = new DeleteError(1, "Error de eliminacion de tipo Constraint");
	
	public DeleteError() {
		super();
	}

	public DeleteError(int codigo, String descripcion) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
	}
	
    public String toString() {
        String nombreClase = "\n[DeleteError] ";
        StringBuffer sbf = new StringBuffer();

        sbf.append(nombreClase);
        sbf.append("codigo: ");
        sbf.append(codigo);

        sbf.append(nombreClase);
        sbf.append("descripcion: ");
        sbf.append(descripcion);

        return sbf.toString();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
