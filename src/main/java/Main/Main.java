/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import com.mycompany.avila.matricula.logica.Estudiante;
import com.mycompany.avila.matricula.logica.Periodo;
import com.mycompany.avila.matricula.logica.Programa;
import com.mycompany.avila.matricula.logica.Universidad;
import matriculaAcademica.ui.ConsultaProgramacionAcademicaUI;
import matriculaAcademica.ui.RegistroDeudasUI;
import matriculaAcademica.ui.RegistroPeriodosUI;

/**
 *
 * @author Cristian D. Avila N.
 */
public class Main {

    public static void main(String args[]) throws Exception {

        Universidad univalle = new Universidad(1411L, "Universidad del Valle", "La Carbonera, Zamorano");

        Periodo periodoActual = new Periodo("Agosto", "Diciembre", (short) 2021, (short) 2022);
        Programa tecSistemas = new Programa((short) 2711, "Tecnología en Sistemas", "DIU");
        Programa ingIndustrial = new Programa((short) 2322, "Ingeniería Industrial", "NOC");

        Estudiante est01 = new Estudiante(201957500, tecSistemas, 1006326833, "Cristian", "Avila");
        Estudiante est02 = new Estudiante(201957800, tecSistemas, 1007327877, "Carolina", "García");
        Estudiante est03 = new Estudiante(201957900, tecSistemas, 1010586977, "Junior", "Ortiz");
        Estudiante est04 = new Estudiante(201723456, ingIndustrial, 1113265823, "Nicolás", "Salas");
        Estudiante est05 = new Estudiante(201823415, ingIndustrial, 1113547152, "Santiago", "Quintero");

        univalle.add(periodoActual);
        univalle.add(tecSistemas);
        univalle.add(ingIndustrial);
        univalle.add(est01);
        univalle.add(est02);
        univalle.add(est03);
        univalle.add(est04);
        univalle.add(est05);

        new RegistroPeriodosUI(univalle).setVisible(true);
        new RegistroDeudasUI(univalle).setVisible(true);
        new ConsultaProgramacionAcademicaUI(univalle).setVisible(true);

    }

}
