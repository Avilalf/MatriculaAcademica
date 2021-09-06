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
public class Persona {

    private long identificacion;
    private String nombre;
    private String apellido;

    public Persona(long identificacion, String nombre, String apellido) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public long getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

}
