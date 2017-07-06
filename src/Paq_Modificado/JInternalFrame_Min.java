package Paq_Modificado;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RAUL
 */
public class JInternalFrame_Min extends javax.swing.JInternalFrame {

    double Matriz[][] = null;
    int restricciones = 0, variables = 0, iter = 0, iteracion = 0;
    Object array[] = null;
    Object EtiquetaX[] = null, EtiquetaY[] = null;

    public JInternalFrame_Min() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtRestriccion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtVariable = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnSolucion1 = new javax.swing.JButton();
        btnSolucion = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableSolucion = new javax.swing.JTable();
        lbl_Iteraccion = new javax.swing.JLabel();

        setClosable(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 51, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));

        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("Nro de Restricciones:");

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("Nro de Variables:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtVariable)
                    .addComponent(txtRestriccion, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAceptar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtRestriccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtVariable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnAceptar)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(51, 0, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 24));
        jLabel3.setForeground(new java.awt.Color(51, 153, 255));
        jLabel3.setText("Minimizacion");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jTable1.setBackground(new java.awt.Color(51, 204, 255));
        jTable1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 153)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "                 X1", "                 X2", "                 X3", "                 X4"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(0, 0, 153));
        jScrollPane1.setViewportView(jTable1);

        btnSolucion1.setFont(new java.awt.Font("Verdana", 1, 11));
        btnSolucion1.setText("ITERACION");
        btnSolucion1.setEnabled(false);
        btnSolucion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolucion1ActionPerformed(evt);
            }
        });

        btnSolucion.setFont(new java.awt.Font("Verdana", 1, 11));
        btnSolucion.setText("SOLUCION");
        btnSolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolucionActionPerformed(evt);
            }
        });

        jTableSolucion.setBackground(new java.awt.Color(51, 204, 255));
        jTableSolucion.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 153)));
        jTableSolucion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "                 S1", "                 S2", "                 S3", "                 S4"
            }
        ));
        jTableSolucion.setGridColor(new java.awt.Color(0, 0, 153));
        jScrollPane2.setViewportView(jTableSolucion);

        lbl_Iteraccion.setForeground(new java.awt.Color(153, 255, 255));
        lbl_Iteraccion.setName("lbl_Iteraccion"); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(btnSolucion)
                        .addGap(12, 12, 12)
                        .addComponent(btnSolucion1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_Iteraccion)
                        .addGap(39, 39, 39)))
                .addGap(21, 21, 21))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSolucion)
                    .addComponent(btnSolucion1)
                    .addComponent(lbl_Iteraccion))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 509, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 543, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        try {
            restricciones = Integer.parseInt(txtRestriccion.getText());
            variables = Integer.parseInt(txtVariable.getText());

            DefaultTableModel modelo = new DefaultTableModel();
            modelo.setRowCount(restricciones + 1);
            modelo.setColumnCount(variables + restricciones + 2);
            array = new Object[variables + restricciones + 2];
            EtiquetaX = new Object[variables + restricciones];
            for (int i = 1; i < array.length - 1; i++) {
                if (i < variables + 1) {
                    array[i] = "X" + i;
                    EtiquetaX[i - 1] = "X" + i;
                } else {
                    array[i] = "S" + (i - variables);
                    EtiquetaX[i - 1] = "S" + (i - variables);
                }
            }
            //---------------------
            EtiquetaY = new Object[restricciones + 1];
            for (int i = 0; i < restricciones; i++) {
                modelo.setValueAt("S" + (i + 1), i, 0);
                EtiquetaY[i] = "S" + (i + 1);
            }
            modelo.setValueAt("Z", restricciones, 0);
            EtiquetaY[restricciones] = "Z";
            //----------------------
            array[array.length - 1] = "soluc";
            modelo.setColumnIdentifiers(array);
            jTable1.setModel(modelo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
        }
}//GEN-LAST:event_btnAceptarActionPerformed

    private void btnSolucion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolucion1ActionPerformed
        try {
            DefaultTableModel modeloSolucion = new DefaultTableModel();
            Matriz = new double[restricciones + 1][restricciones + variables + 1];
            for (int i = 0; i < (restricciones + 1); i++) {
                for (int j = 0; j < (restricciones + variables + 1); j++) {
                    Matriz[i][j] = Double.parseDouble(jTable1.getValueAt(i, j + 1).toString());
                }
            }
            int k = 0;
            iter++;
            if (iter <= iteracion) {
                lbl_Iteraccion.setText(": " + iter);
                while (iter > k) {
                    EtiquetaY[FilaPivote()] = EtiquetaX[ColumnaPivote()];
                    NuevaTabla(FilaPivote(), ColumnaPivote());
                    modeloSolucion.setColumnCount(restricciones + variables + 2);
                    modeloSolucion.setRowCount(restricciones + 1);
                    //--------------------------
                    modeloSolucion.setColumnIdentifiers(array);
                    //---------------------------
                    for (int i = 0; i < (restricciones + 1); i++) {
                        modeloSolucion.setValueAt(EtiquetaY[i], i, 0);
                        for (int j = 0; j < (restricciones + variables + 1); j++) {
                            modeloSolucion.setValueAt(Matriz[i][j], i, j + 1);
                        }
                    }
                    jTableSolucion.setModel(modeloSolucion);
                    k++;
                }
            } else {
                iter = 0;
                iteracion = 0;
                lbl_Iteraccion.setText("Final");
                btnSolucion.setEnabled(true);
                btnSolucion1.setEnabled(false);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
        }
}//GEN-LAST:event_btnSolucion1ActionPerformed

    private void btnSolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolucionActionPerformed
        try {
            DefaultTableModel modeloSolucion = new DefaultTableModel();
            Matriz = new double[restricciones + 1][restricciones + variables + 1];
            for (int i = 0; i < (restricciones + 1); i++) {
                for (int j = 0; j < (restricciones + variables + 1); j++) {
                    Matriz[i][j] = Double.parseDouble(jTable1.getValueAt(i, j + 1).toString());
                }
            }
            while (ComprobarResultado() != true) {
                EtiquetaY[FilaPivote()] = EtiquetaX[ColumnaPivote()];
                NuevaTabla(FilaPivote(), ColumnaPivote());
                modeloSolucion.setColumnCount(restricciones + variables + 2);
                modeloSolucion.setRowCount(restricciones + 1);
                //--------------------------
                modeloSolucion.setColumnIdentifiers(array);
                //---------------------------
                for (int i = 0; i < (restricciones + 1); i++) {
                    modeloSolucion.setValueAt(EtiquetaY[i], i, 0);
                    for (int j = 0; j < (restricciones + variables + 1); j++) {
                        modeloSolucion.setValueAt(Matriz[i][j], i, j + 1);
                    }
                }
                jTableSolucion.setModel(modeloSolucion);
                iteracion++;
            }
            btnSolucion.setEnabled(false);
            btnSolucion1.setEnabled(true);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
        }
}//GEN-LAST:event_btnSolucionActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnSolucion;
    private javax.swing.JButton btnSolucion1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableSolucion;
    private javax.swing.JLabel lbl_Iteraccion;
    private javax.swing.JTextField txtRestriccion;
    private javax.swing.JTextField txtVariable;
    // End of variables declaration//GEN-END:variables

    public int FilaPivote() {
        int pos = 0;
        double aux1 = 0, aux = 0;
        for (int i = 0; i < restricciones; i++) {
            aux1 = Matriz[i][variables + restricciones];
            if (aux1 < aux) {
                aux = aux1;
                pos = i;
            }
        }
        return pos;
    }

    public int ColumnaPivote() {
        int pos = 0, fila = FilaPivote();
        double temp = 0, razon = -1000;
        for (int i = 0; i < variables + restricciones; i++) {
            if (Matriz[fila][i] != 0) {
                temp = Matriz[restricciones][i] / Matriz[fila][i];
                if (temp > razon && temp < 0) {
                    razon = temp;
                    pos = i;
                }
            }
        }
        return pos;
    }

    public void NuevaTabla(int Fila, int Columna) {
        double pivote = Matriz[Fila][Columna], temp = 0;
        for (int i = 0; i < restricciones + variables + 1; i++) {
            Matriz[Fila][i] = Matriz[Fila][i] / pivote;
        }
        for (int i = 0; i < restricciones + 1; i++) {
            temp = Matriz[i][Columna];
            for (int j = 0; j < variables + restricciones + 1; j++) {
                if (i != Fila) {
                    Matriz[i][j] = Matriz[i][j] - temp * Matriz[Fila][j];
                } else {
                    break;
                }
            }
        }
    }

    public boolean ComprobarResultado() {
        boolean result = true;
        for (int i = 0; i < restricciones; i++) {
            if (Matriz[i][restricciones + variables] < 0) {    //que el reglon z optimo debe ser menor o igual a cero
                result = false;
                break;
            }
        }
        return result;
    }
}
