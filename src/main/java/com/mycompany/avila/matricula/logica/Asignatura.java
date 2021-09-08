/* 
 * — Autor: Cristian David Avila Narvaez
 * — Código de estudiante: 1957500-2711
 * — Programación Interactiva.
 * — Grupo: D.
 */
package com.mycompany.avila.matricula.logica;

/**
 *
 * @author Cristian D. Avila N.
 */
public class Asignatura {

    private String codigo;
    private String nombre;
    private int creditos;
    private int intensidad;

    public Asignatura(String codigo, String nombre, int creditos, int intensidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.intensidad = intensidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public int getIntensidad() {
        return intensidad;
    }

}
