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
public class Cupo {

    private int cantidad;
    private int disponibles;
    private Programa programa;

    public Cupo(int cantidad, int disponibles, Programa programa) {
        this.cantidad = cantidad;
        this.disponibles = disponibles;
        this.programa = programa;
    }

}