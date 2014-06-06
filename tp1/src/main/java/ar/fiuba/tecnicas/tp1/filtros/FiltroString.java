package ar.fiuba.tecnicas.tp1.filtros;

/**
 *
 * @author sebas
 */
public class FiltroString extends Filtro {

    private String valor1;
    private String valor2;

    public FiltroString() {
    }

    public FiltroString(String nombreAtributo, String tipoFiltro, String valor1, String valor2) {
        super(nombreAtributo, tipoFiltro);
        setValor1(valor1);
        setValor2(valor2);
    }

    public String getValor1() {
        return valor1;
    }

    public void setValor1(String valor1) {
        this.valor1 = valor1;
    }

    public String getValor2() {
        return valor2;
    }

    public void setValor2(String valor2) {
        this.valor2 = valor2;
    }

}
