/* 
 * — Autor: Cristian David Avila Narvaez
 * — Código de estudiante: 1957500-2711
 * — Programación Interactiva.
 * — Grupo: F.
 */
package com.mycompany.avila_sesion05.imp.relacion.matricula.logica;

/**
 *
 * @author Cristian D. Avila N.
 */
public class Docente extends Persona {

    private String profesion;

    public Docente(String profesion, long identificacion, String nombre, String apellido) {
        super(identificacion, nombre, apellido);
        this.profesion = profesion;
    }

}
