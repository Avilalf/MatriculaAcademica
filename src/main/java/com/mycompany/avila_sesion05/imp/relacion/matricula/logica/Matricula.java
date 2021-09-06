/* 
 * — Autor: Cristian David Avila Narvaez
 * — Código de estudiante: 1957500-2711
 * — Programación Interactiva.
 * — Grupo: F.
 */
package com.mycompany.avila_sesion05.imp.relacion.matricula.logica;

import java.util.Date;

/**
 *
 * @author Cristian D. Avila N.
 */
public class Matricula {

    private Date fechaMatriculada;
    private Date fechaCancelada;

    public Matricula(Date fechaMatriculada) {
        this.fechaMatriculada = fechaMatriculada;
    }

    public Date getFechaMatriculada() {
        return fechaMatriculada;
    }

    public Date getFechaCancelada() {
        return fechaCancelada;
    }

}
