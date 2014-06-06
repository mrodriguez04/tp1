package ar.fiuba.tecnicas.tp1.filtros;



/**
 *
 * @author sebas
 */
public class Filtro {

    private String nombreAtributo;
    private String tipoFiltro;
    private boolean nativo = true;
    
    public static final String TIPO_FILTRO_NO_FILTRAR = "No filtrar";

    // Tipos de filtro para String
    public static final String TIPO_FILTRO_STRING_COMIENZA = "Comienza en..";
    public static final String TIPO_FILTRO_STRING_TERMINA = "Termina en..";
    public static final String TIPO_FILTRO_STRING_IGUAL = "Igual a..";
    public static final String TIPO_FILTRO_STRING_QUE_CONTENGA = "Que contenga..";
    
    // Tipos de filtro para Int y Date
    public static final String TIPO_FILTRO_MAYOR = ">";
    public static final String TIPO_FILTRO_MAYOR_O_IGUAL = ">=";
    public static final String TIPO_FILTRO_MENOR_O_IGUAL = "<=";
    public static final String TIPO_FILTRO_MENOR = "<";
    public static final String TIPO_FILTRO_IGUAL = "=";
    public static final String TIPO_FILTRO_DISTINTO = "<>";
    public static final String TIPO_FILTRO_ENTRE = "Entre..";
    
    public Filtro() {
    }

    public Filtro(String nombreAtributo, String tipoFiltro) {
        this.nombreAtributo = nombreAtributo;
        this.tipoFiltro = tipoFiltro;
        if (nombreAtributo.contains(".")) {
            nativo = false;
        }
    }

    public String getNombreAtributo() {
        return nombreAtributo;
    }

    public void setNombreAtributo(String nombreAtributo) {
        this.nombreAtributo = nombreAtributo;
    }

    public String getTipoFiltro() {
        return tipoFiltro;
    }

    public void setTipoFiltro(String tipoFiltro) {
        this.tipoFiltro = tipoFiltro;
    }

    public boolean isNativo() {
        return nativo;
    }

    public void setNativo(boolean nativo) {
        this.nativo = nativo;
    }

}
