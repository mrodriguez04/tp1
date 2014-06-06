package ar.fiuba.tecnicas.tp1.filtros;

import java.util.List;

/**
 *
 * @author sebas
 */
public interface Filtreable {

    public void setFiltros(List<Filtro> filtros);

    public List<Filtro> getFiltros();

    public void addFiltro(Filtro filtro);

}
