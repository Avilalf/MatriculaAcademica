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
public class Curso {

    private int grupo;
    private int totalCupos;
    private Asignatura asignatura;
    private Docente docente;
    private List<Cupo> cupos;
    private List<Horario> horarios;
    private List<Estudiante> estudiantes;

    public Curso(int grupo, int totalCupos, Asignatura asignatura, Docente docente, List<Cupo> cupos, List<Horario> horarios, List<Estudiante> estudiantes) {
        this.grupo = grupo;
        this.totalCupos = totalCupos;
        this.asignatura = asignatura;
        this.docente = docente;
        this.cupos = new LinkedList<>();
        this.horarios = new LinkedList<>();
        this.estudiantes = new LinkedList<>();
    }

    // Método que permite agregar cupos al curso.
    public void add(Cupo cupo) {
        this.cupos.add(cupo);
    }

    //Método que permite remover/eliminar cupos al curso.
    public void remove(Cupo cupo) {
        this.cupos.remove(cupo);
    }

    //Mètodo que permite agregar horarios al curso.
    public void add(Horario horario) {
        this.horarios.add(horario);
    }

    //Método que permite  remover o eliminar horarios al curso.
    public void remove(Horario horario) {
        this.horarios.remove(horario);
    }

    //Método que permite agregar estudiantes al curso, con el factor de que los cupos del curso se reducen en 1 por cada estudiante
    public void registrarEstudiante(Estudiante estudiante, Cupo cupo) {

        this.estudiantes.add(estudiante);

        for (int i = 0; i < this.cupos.size(); i++) {

            this.cupos.get(i).removeCupo();

        }

    }
}
