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
public class Tabulado {

    private Periodo periodo;
    private List<Matricula> matriculas;

    public Tabulado(Periodo periodo) {
        this.periodo = periodo;
        this.matriculas = new LinkedList<>();

    }

    // Método que permite agregar matriculas al tabulado.
    public void add(Matricula matricula) {
        this.matriculas.add(matricula);
    }

    // Método que remover matriculas al tabulado.
    public void remove(Matricula matricula) {
        this.matriculas.remove(matricula);
    }

}
