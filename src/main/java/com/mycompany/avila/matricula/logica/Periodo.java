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
public class Periodo {

    private String inicia;
    private String finaliza;
    private short año;
    private List<Curso> cursos;

    public Periodo(String inicia, String finaliza, short año) {
        this.inicia = inicia;
        this.finaliza = finaliza;
        this.año = año;
        this.cursos = new LinkedList<>();
    }

    // Método que permite agregar cursos al periodo.
    public void add(Curso curso) {
        this.cursos.add(curso);
    }

    // Método que permite eliminar cursos del periodo.
    public void remove(Curso curso) {
        this.cursos.remove(curso);
    }

}
