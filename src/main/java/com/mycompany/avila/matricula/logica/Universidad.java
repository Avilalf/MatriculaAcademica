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
    public void addPeriodo(Periodo periodo) {
        this.periodos.add(periodo);
        this.periodoActual = periodo;
    }

    public void removePeriodo(Periodo periodo) {
        this.periodos.remove(periodo);
    }

    public void addPrograma(Programa programa) {
        this.programas.add(programa);
    }

    public void removePrograma(Programa programa) {
        this.programas.remove(programa);
    }

    public void addAsignatura(Asignatura nuevaAsignatura) throws Exception {

        for (Asignatura registrarAsignatura : asignaturas) {
            if (registrarAsignatura.getCodigo().equals(nuevaAsignatura.getCodigo())) {
                throw new Exception("La asignatura ya se encuentra registrada a la universidad.");
            }
        }
        this.asignaturas.add(nuevaAsignatura);
    }

    public void removeAsignatura(Asignatura asignatura) {
        this.asignaturas.remove(asignatura);
    }

    public void addDocente(Docente docente) {
        this.docentes.add(docente);
    }

    public void removeDocente(Docente docente) {
        this.docentes.remove(docente);
    }

    public void addEstudiante(Estudiante nuevoEstudiante) throws Exception {
        for (Estudiante registrarEstudiante : estudiantes) {
            if (registrarEstudiante.getCodigo() == nuevoEstudiante.getCodigo()) {
                throw new Exception("El estudiante " + nuevoEstudiante.getCodigo() + " ya se encuentra registrado a la universidad.");
            }
        }
        this.estudiantes.add(nuevoEstudiante);
    }

    public void removeEstudiante(Estudiante estudiante) {
        this.estudiantes.remove(estudiante);
    }

    // Buscar - Un método que permite buscar un estudiante de la universidad a partir de un criterio.
    public Estudiante BuscarEstudiante(int codigo) throws Exception {
        for (Estudiante estudiante : estudiantes) { // Para cada uno de los elementos | For Each
            if (estudiante.getCodigo() == codigo) {
                return estudiante;
            }
        }
        throw new Exception("No se encontró el estudiante de codigo: " + codigo);
    }

    public Periodo getPeriodoActual() {
        return periodoActual;
    }

    @Override
    public String toString() {
        return "Universidad{" + "nit=" + nit + ", nombre=" + nombre + ", direccion=" + direccion + ", periodoActual=" + periodoActual + ", periodos=" + periodos + ", programas=" + programas + ", asignaturas=" + asignaturas + ", docentes=" + docentes + ", estudiantes=" + estudiantes + '}';
    }

}
