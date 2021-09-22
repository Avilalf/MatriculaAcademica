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
public class Programa {

    private short codigo;
    private String nombre;
    private String jornada;
    private List<Semestre> semestres;

    public Programa(short codigo, String nombre, String jornada) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.jornada = jornada;
        this.semestres = new LinkedList<>();
    }

    // Método que permite agregar semestres al programa.
    public void add(Semestre semestre) {
        this.semestres.add(semestre);
    }

    //Método que permite remover/eliminar semestres al programa.
    public void remove(Semestre semestre) {
        this.semestres.remove(semestre);
    }

    @Override
    public String toString() {
        return nombre + " - " + jornada;
    }

}
