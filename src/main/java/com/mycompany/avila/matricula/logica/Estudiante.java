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
public class Estudiante extends Persona {

    private int codigo;
    private Programa programa;
    private List<Tabulado> tabulados;
    private List<Deuda> deudas;

    public Estudiante(int codigo, Programa programa, long identificacion, String nombre, String apellido) {
        super(identificacion, nombre, apellido);
        this.codigo = codigo;
        this.programa = programa;
        this.tabulados = new LinkedList<>();
        this.deudas = new LinkedList<>();
    }

    public void add(Tabulado tabulado) {
        this.tabulados.add(tabulado);
    }

    public void remove(Tabulado tabulado) {
        this.tabulados.remove(tabulado);
    }

    public void add(Deuda deuda) {
        this.deudas.add(deuda);
    }

    public void remove(Deuda deuda) {
        this.deudas.remove(deuda);
    }

    public int getCodigo() {
        return codigo;
    }

    public Programa getPrograma() {
        return programa;
    }

}
