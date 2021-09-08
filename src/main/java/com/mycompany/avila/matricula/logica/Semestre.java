/* 
 * — Autor: Cristian David Avila Narvaez
 * — Código de estudiante: 1957500-2711
 * — Programación Interactiva.
 * — Grupo: D.
 */
package com.mycompany.avila.matricula.logica;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Cristian D. Avila N.
 */
public class Semestre {

    private int numero;

    private List<Asignatura> asignaturas;

    public Semestre(int numero) {
        this.numero = numero;
        this.asignaturas = new LinkedList<>();
    }

    // Método que permite agregar asignaturas al semestre.
    public void add(Asignatura asignatura) {
        this.asignaturas.add(asignatura);
    }

    //Método que permite remover/eliminar asignaturas al semestre.
    public void remove(Asignatura asignatura) {
        this.asignaturas.remove(asignatura);
    }

}
