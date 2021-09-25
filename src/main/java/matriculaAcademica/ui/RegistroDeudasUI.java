/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriculaAcademica.ui;

import com.mycompany.avila.matricula.logica.Deuda;
import com.mycompany.avila.matricula.logica.Estudiante;
import com.mycompany.avila.matricula.logica.Universidad;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author avila
 */
public class RegistroDeudasUI extends javax.swing.JFrame {

    private Universidad universidad;
    private Estudiante estudianteEncontrado;

    /**
     * Creates new form RegistroDeudas
     */
    public RegistroDeudasUI(Universidad universidad) {
        this.universidad = universidad;
        this.estudianteEncontrado = estudianteEncontrado;
        initComponents();
        txfPeriodo.setText(universidad.getPeriodoActual().toString());
        btnSearch.addActionListener(new SearchStudent());
        btnCancelar.addActionListener(new Cancel());
        cbDeuda.setSelectedItem(null);
        btnRegistrarDeuda.setEnabled(false);
        btnRegistrarDeuda.addActionListener(new RegistrarDeuda());
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
        txfPeriodo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txfCodigoEstudiante = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        txfNombreEstudiante = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbDeuda = new javax.swing.JComboBox<>();
        btnRegistrarDeuda = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de Deudas");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registrar Deudas");

        jLabel2.setText("Periodo :");

        txfPeriodo.setEditable(false);
        txfPeriodo.setText("N/A");

        jLabel3.setText("Código :");

        btnSearch.setText("...");

        txfNombreEstudiante.setEditable(false);
        txfNombreEstudiante.setText("N/A");

        jLabel4.setText("Deuda :");

        cbDeuda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Documento de Identidad", "Biblioteca (Multa)", "Biblioteca (Libro no entregado)" }));

        btnRegistrarDeuda.setText("Registrar Deuda");

        btnCancelar.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txfPeriodo)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txfCodigoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txfNombreEstudiante)
                            .addComponent(cbDeuda, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRegistrarDeuda, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 36, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txfPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txfCodigoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txfNombreEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbDeuda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarDeuda)
                    .addComponent(btnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrarDeuda;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cbDeuda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txfCodigoEstudiante;
    private javax.swing.JTextField txfNombreEstudiante;
    private javax.swing.JTextField txfPeriodo;
    // End of variables declaration//GEN-END:variables

    public class SearchStudent implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            try {
                int codigoEstudiante = Integer.parseInt(txfCodigoEstudiante.getText());
                universidad.BuscarEstudiante(codigoEstudiante);
                estudianteEncontrado = universidad.BuscarEstudiante(codigoEstudiante);
                txfNombreEstudiante.setText(estudianteEncontrado.getNombre() + " " + estudianteEncontrado.getApellido() + " (" + estudianteEncontrado.getPrograma() + ")");
                btnRegistrarDeuda.setEnabled(true);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(RegistroDeudasUI.this, "El código digitado no es un valor correcto.");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(RegistroDeudasUI.this, "No se encontró el estudiante con dicho código " + "(" + txfCodigoEstudiante.getText() + ").");

            }

        }
    }

    public class RegistrarDeuda implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (cbDeuda.getSelectedItem() == null) {
                JOptionPane.showMessageDialog(RegistroDeudasUI.this, "No es posible registrar la deuda, seleccione el tipo de Deuda.");
            } else {

                try {
                    String descripcion = cbDeuda.getSelectedItem().toString();
                    Deuda deudaRegistrada = new Deuda(universidad.getPeriodoActual(), descripcion);
                    estudianteEncontrado.add(deudaRegistrada);
                    JOptionPane.showMessageDialog(RegistroDeudasUI.this, "Deuda registrada satisfactoriamente al estudiante (" + estudianteEncontrado.getCodigo() + ")");

                } catch (Exception exc) {

                    JOptionPane.showMessageDialog(RegistroDeudasUI.this, "Deuda registrada satisfactoriamente al estudiante (" + estudianteEncontrado.getCodigo() + ")");
                }
            }

        }
    }

    public class Cancel implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            txfNombreEstudiante.setText("N/A");
            txfCodigoEstudiante.setText("");
            estudianteEncontrado = null;
            cbDeuda.setSelectedItem(null);
            btnRegistrarDeuda.setEnabled(false);
            cbDeuda.updateUI();

        }

    }

}
