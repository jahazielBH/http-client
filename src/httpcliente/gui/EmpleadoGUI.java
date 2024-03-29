/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package httpcliente.gui;

import httpcliente.model.Empleado;
import httpcliente.service.EmpleadoHttp;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author jahaziel
 */
public class EmpleadoGUI extends javax.swing.JInternalFrame {

    private static final long serialVersionUID = 1L;
    private Empleado empleado;
    private final EmpleadoHttp empleadoRequest;
    private JSONObject json;
    private DefaultTableModel modelo = new DefaultTableModel();

    /**
     * Creates new form EmpleadoGUI
     */
    public EmpleadoGUI() {
        initComponents();
        empleadoRequest = new EmpleadoHttp();
    }

    private static EmpleadoGUI empdogui = null;

    public static EmpleadoGUI getInstance() {
        if (empdogui == null) {
            empdogui = new EmpleadoGUI();
        }
        return empdogui;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleado = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        btoGuardar = new javax.swing.JButton();
        btoActualizar = new javax.swing.JButton();
        btoListar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btoLimpiar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtIdB = new javax.swing.JTextField();
        btoBuscar = new javax.swing.JButton();
        btoEliminar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EMPLEADO - CRUD");

        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tblEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "TELEFONO", "CORREO", "DIRECCION"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEmpleado.getTableHeader().setReorderingAllowed(false);
        tblEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmpleadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmpleado);
        if (tblEmpleado.getColumnModel().getColumnCount() > 0) {
            tblEmpleado.getColumnModel().getColumn(0).setMinWidth(100);
            tblEmpleado.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Formulario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(4, 2, 2))); // NOI18N

        jLabel2.setText("Nombre:");

        jLabel3.setText("Correo:");

        jLabel4.setText("Telefono:");

        jLabel5.setText("Direccion:");

        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });

        btoGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/httpcliente/icon/guardar.png"))); // NOI18N
        btoGuardar.setText("Guardar");
        btoGuardar.setToolTipText("Guardar");
        btoGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btoGuardar.setFocusable(false);
        btoGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btoGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btoGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoGuardarActionPerformed(evt);
            }
        });

        btoActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/httpcliente/icon/actualizar.png"))); // NOI18N
        btoActualizar.setText("Actualizar");
        btoActualizar.setToolTipText("Actualizar");
        btoActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btoActualizar.setFocusable(false);
        btoActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btoActualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btoActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoActualizarActionPerformed(evt);
            }
        });

        btoListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/httpcliente/icon/listar.png"))); // NOI18N
        btoListar.setText("Listar");
        btoListar.setToolTipText("Listar");
        btoListar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btoListar.setFocusable(false);
        btoListar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btoListar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btoListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoListarActionPerformed(evt);
            }
        });

        jLabel7.setText("ID:");

        txtId.setEnabled(false);

        btoLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/httpcliente/icon/eraser.png"))); // NOI18N
        btoLimpiar.setText("Limpiar");
        btoLimpiar.setToolTipText("Listar");
        btoLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btoLimpiar.setFocusable(false);
        btoLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btoLimpiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btoLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel7)
                        .addComponent(jLabel2))
                    .addComponent(btoGuardar))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btoActualizar)
                        .addGap(18, 18, 18)
                        .addComponent(btoListar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btoLimpiar))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                        .addComponent(txtNombre)
                        .addComponent(txtCorreo)
                        .addComponent(txtDireccion)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btoActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btoGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btoListar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btoLimpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar y Elimar por:"));

        jLabel6.setText("ID:");

        btoBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/httpcliente/icon/lupa.png"))); // NOI18N
        btoBuscar.setText("Buscar");
        btoBuscar.setToolTipText("Buscar");
        btoBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoBuscarActionPerformed(evt);
            }
        });

        btoEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/httpcliente/icon/eliminar.png"))); // NOI18N
        btoEliminar.setText("Eliminar");
        btoEliminar.setToolTipText("Eliminar");
        btoEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btoEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btoEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btoBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtIdB))
                .addContainerGap(159, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(43, 43, 43)
                .addComponent(btoBuscar)
                .addGap(45, 45, 45)
                .addComponent(btoEliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void btoGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoGuardarActionPerformed
        try {
            if (txtNombre.getText().isEmpty() || txtTelefono.getText().isEmpty()
                    || txtCorreo.getText().isEmpty() || txtDireccion.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Aviso! Campos del formulario vacios");
            } else {
                empleado = new Empleado();
                empleado.setNombre(txtNombre.getText());
                empleado.setTelefono(txtTelefono.getText());
                empleado.setCorreo(txtCorreo.getText());
                empleado.setDireccion(txtDireccion.getText());

                json = new JSONObject(empleado);
                empleadoRequest.addEmpdo(json.toString());
                JOptionPane.showMessageDialog(null, "Empleado Registrado");
                limpiar();
            }
        } catch (Exception ex) {
            Logger.getLogger(EmpleadoGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btoGuardarActionPerformed

    private void btoListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoListarActionPerformed
        JSONArray jsonArray;
        Object[] columnas = {"ID","NOMBRE","TELEFONO","CORREO","DIRECCION"}
;        try {
            jsonArray = new JSONArray(empleadoRequest.getAllEmpdos());
            modelo = ((DefaultTableModel) tblEmpleado.getModel());
            
            limpiarTabla();
            Object[] ob = new Object[5];
            for (int i = 0; i < jsonArray.length(); i++) {
                ob[0] = jsonArray.getJSONObject(i).getLong("id");
                ob[1] = jsonArray.getJSONObject(i).getString("nombre");
                ob[2] = jsonArray.getJSONObject(i).getString("telefono");
                ob[3] = jsonArray.getJSONObject(i).getString("correo");
                ob[4] = jsonArray.getJSONObject(i).getString("direccion");
                modelo.addRow(ob);
            }
        } catch (Exception ex) {
            Logger.getLogger(EmpleadoGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btoListarActionPerformed

    private void btoEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoEliminarActionPerformed
        try {
            empleadoRequest.deleteEmpdo(txtIdB.getText());
            limpiar();
        } catch (Exception ex) {
            Logger.getLogger(EmpleadoGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btoEliminarActionPerformed

    private void btoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoBuscarActionPerformed
        String[] columnas = {"ID","NOMBRE","TELEFONO","CORREO","DIRECCION"};
        try {
            json = new JSONObject(empleadoRequest.getEmpdoById(txtIdB.getText()));
            modelo = ((DefaultTableModel) tblEmpleado.getModel());
            limpiarTabla();
            limpiar();
            modelo.addRow(new Object[]{
                json.get("id"),
                json.get("nombre"),
                json.get("telefono"),
                json.get("correo"),
                json.get("direccion")
            });
            limpiar();
        } catch (Exception ex) {
            Logger.getLogger(EmpleadoGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btoBuscarActionPerformed

    private void btoActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoActualizarActionPerformed
        try {
            empleado = new Empleado();
            empleado.setId(Long.valueOf(txtId.getText()));
            empleado.setNombre(txtNombre.getText());
            empleado.setTelefono(txtTelefono.getText());
            empleado.setCorreo(txtCorreo.getText());
            empleado.setDireccion(txtDireccion.getText());

            json = new JSONObject(empleado);
            empleadoRequest.updateEmpdo(json.toString());
            JOptionPane.showMessageDialog(null, "Empleado Actualizado");
            limpiar();
        } catch (Exception ex) {
            Logger.getLogger(EmpleadoGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btoActualizarActionPerformed

    private void tblEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpleadoMouseClicked
        int selecion = tblEmpleado.rowAtPoint(evt.getPoint());
        txtId.setText(tblEmpleado.getValueAt(selecion, 0) + "");
        txtNombre.setText(tblEmpleado.getValueAt(selecion, 1) + "");
        txtTelefono.setText(tblEmpleado.getValueAt(selecion, 2) + "");
        txtCorreo.setText(tblEmpleado.getValueAt(selecion, 3) + "");
        txtDireccion.setText(tblEmpleado.getValueAt(selecion, 4) + "");
    }//GEN-LAST:event_tblEmpleadoMouseClicked

    private void btoLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoLimpiarActionPerformed
        limpiarTabla();
        limpiar();
    }//GEN-LAST:event_btoLimpiarActionPerformed

    public void limpiar() {
        txtId.setText("");
        txtNombre.setText("");
        txtTelefono.setText("");
        txtCorreo.setText("");
        txtDireccion.setText("");
        txtIdB.setText("");
    }

    public void limpiarTabla() {
        int numDatos = modelo.getRowCount();
        for (int i = 0; i < numDatos; i++) {
            modelo.removeRow(0);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btoActualizar;
    private javax.swing.JButton btoBuscar;
    private javax.swing.JButton btoEliminar;
    private javax.swing.JButton btoGuardar;
    private javax.swing.JButton btoLimpiar;
    private javax.swing.JButton btoListar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEmpleado;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdB;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
