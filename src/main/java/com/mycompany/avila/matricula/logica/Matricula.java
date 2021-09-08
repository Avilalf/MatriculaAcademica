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
public class Matricula {

    private Date fechaMatriculada;
    private Date fechaCancelada;
    private Curso curso;

    public Matricula(Date fechaMatriculada, Curso curso) {
        this.fechaMatriculada = fechaMatriculada;
        this.curso = curso;
    }

    public Date getFechaMatriculada() {
        return fechaMatriculada;
    }

    public Date getFechaCancelada() {
        return fechaCancelada;
    }

}
