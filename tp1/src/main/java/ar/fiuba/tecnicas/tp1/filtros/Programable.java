package ar.fiuba.tecnicas.tp1.filtros;

import java.util.Date;

/**
 *
 * @author sebas
 */
public interface Programable {

    public String getNombre();
    public String getDescripcion();
    public Date getFechaInicioCalendario();
    public String getHoraInicioCalendario();
    public Date getFechaFinCalendario();
    public String getHoraFinCalendario();

}
