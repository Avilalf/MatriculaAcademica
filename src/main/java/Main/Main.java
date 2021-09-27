/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import com.mycompany.avila.matricula.logica.Asignatura;
import com.mycompany.avila.matricula.logica.Cupo;
import com.mycompany.avila.matricula.logica.Curso;
import com.mycompany.avila.matricula.logica.Docente;
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

        Periodo periodo2020_1 = new Periodo("Enero", "Julio", (short) 2020, (short) 2020);
        Programa tecSistemas = new Programa((short) 2711, "Tecnología en Sistemas", "DIU");
        Programa ingIndustrial = new Programa((short) 2322, "Ingeniería Industrial", "NOC");
        Programa tecAlimentos = new Programa((short) 3142, "Tecnología en Alimentos", "DIU");
        Periodo periodo2020_2 = new Periodo("Agosto", "Diciembre", (short) 2020, (short) 2020);
        Periodo periodoActual = new Periodo("Agosto", "Diciembre", (short) 2021, (short) 2021);

        Docente doc01 = new Docente("Ingeniero en Sistemas", 1113456123, "Julio", "Romero");
        Docente doc02 = new Docente("Ingeniero Industrial", 1113851639, "Robert", "Rodriguez");
        Docente doc03 = new Docente("Licenciado en Matematicas", 1113845789, "Fredy", "Gutierrez");

        Asignatura progInteractiva = new Asignatura("750085M", "Programación Interactiva", 4, 4);
        Asignatura mateDiscretasI = new Asignatura("750030M", "Matemáticas Discretas I", 3, 3);
        Asignatura arquiComputadoresI = new Asignatura("750015M", "Arquitecturas de Computadores I", 4, 4);
        Asignatura adminEmpresas = new Asignatura("750032M", "Fundamentos en Administración de Empresas", 2, 2);

        Cupo cupo01 = new Cupo(10, 10, tecSistemas);
        Cupo cupo02 = new Cupo(10, 10, ingIndustrial);
        Cupo cupo03 = new Cupo(10, 10, tecAlimentos);

        Estudiante est01 = new Estudiante(201957500, tecSistemas, 1006326833, "Cristian", "Avila");
        Estudiante est02 = new Estudiante(201957800, tecSistemas, 1007327877, "Carolina", "García");
        Estudiante est03 = new Estudiante(201957900, tecSistemas, 1010586977, "Junior", "Ortiz");
        Estudiante est04 = new Estudiante(201723456, ingIndustrial, 1113265823, "Nicolás", "Salas");
        Estudiante est05 = new Estudiante(201823415, ingIndustrial, 1113547152, "Santiago", "Quintero");

        Curso curso01_DiscretasI = new Curso(50, 10, mateDiscretasI, doc03);
        Curso curso02_Interactiva = new Curso(50, 10, progInteractiva, doc01);
        Curso curso03_ArquitecturaI = new Curso(50, 10, arquiComputadoresI, doc01);
        Curso curso04_admEmpresas = new Curso(50, 10, adminEmpresas, doc02);

        univalle.addPeriodo(periodo2020_1);
        univalle.addPeriodo(periodo2020_2);
        univalle.addPeriodo(periodoActual);

        univalle.addPrograma(tecSistemas);
        univalle.addPrograma(ingIndustrial);
        univalle.addPrograma(tecAlimentos);

        univalle.addEstudiante(est01);
        univalle.addEstudiante(est02);
        univalle.addEstudiante(est03);
        univalle.addEstudiante(est04);
        univalle.addEstudiante(est05);

        univalle.addDocente(doc01);
        univalle.addDocente(doc02);
        univalle.addDocente(doc03);

        univalle.addAsignatura(progInteractiva);
        univalle.addAsignatura(mateDiscretasI);
        univalle.addAsignatura(arquiComputadoresI);
        univalle.addAsignatura(adminEmpresas);

        curso01_DiscretasI.add(cupo01);
        curso02_Interactiva.add(cupo01);
        curso03_ArquitecturaI.add(cupo01);
        curso04_admEmpresas.add(cupo02);
        curso04_admEmpresas.add(cupo03);

        univalle.getPeriodoActual().add(curso01_DiscretasI);
        univalle.getPeriodoActual().add(curso02_Interactiva);
        univalle.getPeriodoActual().add(curso03_ArquitecturaI);
        univalle.getPeriodoActual().add(curso04_admEmpresas);

        new RegistroPeriodosUI(univalle).setVisible(true);
        new RegistroDeudasUI(univalle).setVisible(true);
        new ConsultaProgramacionAcademicaUI(univalle).setVisible(true);

    }

}
