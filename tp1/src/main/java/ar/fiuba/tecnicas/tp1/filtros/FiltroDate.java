package ar.fiuba.tecnicas.tp1.filtros;

import java.util.Date;

/**
 *
 * @author sebas
 */
public class FiltroDate extends Filtro {

    private Date valor1;
    private Date valor2;

    public FiltroDate() {
    }

    public FiltroDate(String nombreAtributo, String tipoFiltro, Date valor1, Date valor2) {
        super(nombreAtributo, tipoFiltro);
        setValor1(valor1);
        setValor2(valor2);
    }

    public Date getValor1() {
        return valor1;
    }

    public void setValor1(Date valor1) {
        this.valor1 = valor1;
    }

    public Date getValor2() {
        return valor2;
    }

    public void setValor2(Date valor2) {
        this.valor2 = valor2;
    }

}
