package ar.fiuba.tecnicas.tp1.filtros;

/**
 *
 * @author sebas
 */
public class FiltroBoolean extends Filtro {

    private Boolean valor;

    public static final String VALOR_BOOLEAN_SI = "Si";
    public static final String VALOR_BOOLEAN_NO = "No";
    public static final String VALOR_BOOLEAN_VACIO = "";

    public FiltroBoolean() {
    }

    /**
     * Consructor en el que se le pasa como parametro el valor booleano por el que
     * se quiere filtrar
     * @param nombreAtributo - el nombre del atributo/columna por el que se quire filtrar
     * @param valor - el valor booleano del atributo a filtrar
     */
    public FiltroBoolean(String nombreAtributo, Boolean valor) {
        super(nombreAtributo, null);
        setValor(valor);
    }

    /**
     * Constructor en el que se le pasa como parametro un String por "Si" o "No"
     * que corresponde a los valores booleanos true y false
     * @param nombreAtributo - el nombre del atributo/columna por el que se quire filtrar
     * @param valor - el valor de tipo String del atributo a filtrar
     */
    public FiltroBoolean(String nombreAtributo, String valor) {
        super(nombreAtributo, null);
        if (valor.equals("Si")) {
            setValor(Boolean.TRUE);
        } else if (valor.equals("No")) {
            setValor(Boolean.FALSE);
        }
    }

    public Boolean getValor() {
        return valor;
    }

    public void setValor(Boolean valor) {
        this.valor = valor;
    }

}
