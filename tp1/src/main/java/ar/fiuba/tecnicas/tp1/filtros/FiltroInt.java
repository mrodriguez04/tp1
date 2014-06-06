package ar.fiuba.tecnicas.tp1.filtros;

/**
 *
 * @author sebas
 */
public class FiltroInt extends Filtro {

    private Integer valor1;
    private Integer valor2;

    public FiltroInt() {
    }

    public FiltroInt(String nombreAtributo, String tipoFiltro, Integer valor1, Integer valor2) {
        super(nombreAtributo, tipoFiltro);
        setValor1(valor1);
        setValor2(valor2);
    }

    public Integer getValor1() {
        return valor1;
    }

    public void setValor1(Integer valor1) {
        this.valor1 = valor1;
    }

    public Integer getValor2() {
        return valor2;
    }

    public void setValor2(Integer valor2) {
        this.valor2 = valor2;
    }

}
