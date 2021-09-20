/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.avila.matricula.logica;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Cristian D. Avila N.
 */
public class Universidad {

    private long nit;
    private String nombre;
    private String direccion;
    private Periodo periodoActual;
    private List<Periodo> periodos;
    private List<Programa> programas;
    private List<Asignatura> asignaturas;
    private List<Docente> docentes;
    private List<Estudiante> estudiantes;

    public Universidad(long nit, String nombre, String direccion) {
        this.nit = nit;
        this.nombre = nombre;
        this.direccion = direccion;
        this.periodoActual = null;
        this.periodos = new LinkedList<>();
        this.programas = new LinkedList<>();
        this.asignaturas = new LinkedList<>();
        this.docentes = new LinkedList<>();
        this.estudiantes = new LinkedList<>();
    }

    // Métodos que permiten agregar y remover datos a las listas.
    public void add(Periodo periodo) {
        this.periodos.add(periodo);
        this.periodoActual = periodo;
    }

    public void remove(Periodo periodo) {
        this.periodos.remove(periodo);
    }

    public void add(Programa programa) {
        this.programas.add(programa);
    }

    public void remove(Programa programa) {
        this.programas.remove(programa);
    }

    public void add(Asignatura asignatura) {
        this.asignaturas.add(asignatura);
    }

    public void remove(Asignatura asignatura) {
        this.asignaturas.remove(asignatura);
    }

    public void add(Docente docente) {
        this.docentes.add(docente);
    }

    public void remove(Docente docente) {
        this.docentes.remove(docente);
    }

    public void add(Estudiante estudiante) {
        this.estudiantes.add(estudiante);
    }

    public void remove(Estudiante estudiante) {
        this.estudiantes.remove(estudiante);
    }

}
