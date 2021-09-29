/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriculaAcademica.ui;

import com.mycompany.avila.matricula.logica.Periodo;
import com.mycompany.avila.matricula.logica.Universidad;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author avila
 */
public class ConsultaProgramacionAcademicaUI extends javax.swing.JInternalFrame {

    private Universidad universidad;
    private String periodoBuscar;

    /**
     * Creates new form ConsultaProgramacionAcademicaUI
     */
    public ConsultaProgramacionAcademicaUI(Universidad universidad) {
        this.universidad = universidad;
        initComponents();
        cbPeriodoAcademico.setSelectedItem(null);
        cbPeriodoAcademico.setModel(new ComboModelPeriodoAcademico());
        cbPeriodoAcademico.addActionListener(new TextodelArea());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbPeriodoAcademico = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaInfoGeneral = new javax.swing.JTextArea();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Consultar Programación Académica");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Consultar Programación Académica");

        jLabel2.setText("Periodo Académico :");

        jtaInfoGeneral.setEditable(false);
        jtaInfoGeneral.setColumns(20);
        jtaInfoGeneral.setRows(5);
        jScrollPane1.setViewportView(jtaInfoGeneral);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(cbPeriodoAcademico, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 17, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbPeriodoAcademico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Periodo> cbPeriodoAcademico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jtaInfoGeneral;
    // End of variables declaration//GEN-END:variables

    public class ComboModelPeriodoAcademico implements ComboBoxModel<Periodo> {

        public Periodo periodoSelected;

        @Override
        public void setSelectedItem(Object anItem) {
            this.periodoSelected = (Periodo) anItem;
        }

        @Override
        public Object getSelectedItem() {
            return this.periodoSelected;
        }

        @Override
        public int getSize() {
            return universidad.getPeriodos().size();
        }

        @Override
        public Periodo getElementAt(int index) {
            return universidad.getPeriodos().get(index);
        }

        @Override
        public void addListDataListener(ListDataListener l) {
        }

        @Override
        public void removeListDataListener(ListDataListener l) {
        }

    }

    public class TextodelArea implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            jtaInfoGeneral.setText("");
//            jtaInfoGeneral.append(cbPeriodoAcademico.getSelectedItem().toString());

            Periodo periodoSeleccionado = (Periodo) cbPeriodoAcademico.getSelectedItem();

            jtaInfoGeneral.append(periodoSeleccionado.ObtenerCursos().toString());

        }

    }

}
