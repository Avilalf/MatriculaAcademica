/* 
 * — Autor: Cristian David Avila Narvaez
 * — Código de estudiante: 1957500-2711
 * — Programación Interactiva.
 * — Grupo: D.
 */
package com.mycompany.avila.matricula.logica;

import java.util.Date;

/**
 *
 * @author Cristian D. Avila N.
 */
public class Horario {

    private String dia;
    private Date horaInicio;
    private Date horafin;

    public Horario(String dia, Date horaInicio, Date horafin) {
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.horafin = horafin;
    }

    public String getDia() {
        return dia;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public Date getHorafin() {
        return horafin;
    }

}
