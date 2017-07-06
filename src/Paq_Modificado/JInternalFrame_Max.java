package Paq_Modificado;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Raúl
 */
public class JInternalFrame_Max extends javax.swing.JInternalFrame {

    double Matriz[][] = null;
    int restricciones = 0, variables = 0, iter = 0, iteracion = 0;
    Object array[] = null;
    Object EtiquetaX[] = null, EtiquetaY[] = null;
    static DecimalFormat df = new DecimalFormat("#.##");
    private JComboBox comboBox;
    private String menorIgualQue = "<=";
    private String mayorIgualQue = ">=";
    private String igualQue = "=";
    private boolean opc;//true maximizar

    //en el metodo constructor para añadir las opciones al comboBox
    public JInternalFrame_Max() {
        initComponents();
        comboBox = new JComboBox();
        comboBox.addItem(menorIgualQue);
        comboBox.addItem(mayorIgualQue);
        comboBox.addItem(igualQue);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        opctimizacion = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnSolucion = new javax.swing.JButton();
        btnSolucion1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableSolucion = new javax.swing.JTable();
        lbl_Iteraccion = new javax.swing.JLabel();

        setClosable(true);
        setAlignmentX(5.0F);
        setAlignmentY(5.0F);

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
                .addContainerGap(16, Short.MAX_VALUE))
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

        jPanel2.setBackground(new java.awt.Color(51, 0, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));

        opctimizacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Maximizar", "Minimizar" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(opctimizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(opctimizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setBackground(new java.awt.Color(102, 204, 255));
        jTable1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 153)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "                X1", "                X2", "                X3", "                X4"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(0, 0, 204));
        jScrollPane1.setViewportView(jTable1);

        btnSolucion.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        btnSolucion.setText("SOLUCION");
        btnSolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolucionActionPerformed(evt);
            }
        });

        btnSolucion1.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        btnSolucion1.setText("INTERACCION");
        btnSolucion1.setEnabled(false);
        btnSolucion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolucion1ActionPerformed(evt);
            }
        });

        jTableSolucion.setBackground(new java.awt.Color(102, 204, 255));
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

        lbl_Iteraccion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_Iteraccion.setForeground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(360, 360, 360)
                                .addComponent(lbl_Iteraccion))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSolucion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSolucion1)
                .addGap(142, 142, 142))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_Iteraccion)
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSolucion)
                    .addComponent(btnSolucion1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        try {
            restricciones = Integer.parseInt(txtRestriccion.getText());
            variables = Integer.parseInt(txtVariable.getText());

            DefaultTableModel modelo = new DefaultTableModel();
            modelo.setRowCount(restricciones + 1);
            modelo.setColumnCount(variables + restricciones + 3);
            array = new Object[variables + restricciones + 2];
            Object[] array2 = new Object[variables + restricciones + 3];
            array[0] = "";
            array2[0] = "";
            EtiquetaX = new Object[variables + restricciones];
                
            for (int i = 1; i < array.length - 1; i++) {
                if (i < variables + 1) {
                    array[i] = "X" + i;
                    array2[i] = "X" + i;
                    EtiquetaX[i - 1] = "X" + i;
                } else {
                    array[i] = "S" + (i - variables);
                    array2[i] = "S" + (i - variables);
                    EtiquetaX[i - 1] = "S" + (i - variables);
                }
            }
            //----------------------
            array[array.length - 1] = "VB";
            array2[array2.length - 2] = "Símbolo";
            array2[array2.length - 1] = "VB";
            modelo.setColumnIdentifiers(array2);
            //---------------------
            EtiquetaY = new Object[restricciones + 1];
            for (int i = 0; i < restricciones; i++) {
                modelo.setValueAt("R" + (i + 1), i, 0);
                modelo.setValueAt(comboBox.getItemAt(0), i, modelo.getColumnCount() - 2);
                EtiquetaY[i] = "S" + (i + 1);
            }
            modelo.setValueAt("Z", restricciones, 0);
            EtiquetaY[restricciones] = "Z";

            jTable1.setModel(modelo);

            TableColumn signo = jTable1.getColumnModel().getColumn(jTable1.getColumnCount() - 2);
            signo.setCellEditor(new DefaultCellEditor(comboBox));

            for (int i = 0; i < restricciones; i++) {
                jTable1.removeColumn(jTable1.getColumnModel().getColumn(variables + 1));
            }
        } catch (Exception e) {
            java.util.logging.Logger.getLogger(JInternalFrame_Max.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        }
}//GEN-LAST:event_btnAceptarActionPerformed
    
    
    private void imprimirMatriz() {
        System.out.println("Esta es tu matriz\n\n\n");
        for (int i = 0; i < restricciones + 1; i++) {
            for (int j = 0; j < restricciones + variables + 1; j++) {
                System.out.print(Matriz[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    private void btnSolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolucionActionPerformed
        try {

            opc = opctimizacion.getSelectedIndex() == 0;

            for (int i = 0; i < jTable1.getModel().getRowCount(); i++) {

                for (int j = 0; j < restricciones; j++) {
                    jTable1.getModel().setValueAt("0", i, variables + 1 + j);
                }

                if (i != jTable1.getModel().getRowCount() - 1) {//sino es z
                    Object o = jTable1.getModel().getValueAt(i, jTable1.getModel().getColumnCount() - 2);
                    if (o.equals(menorIgualQue) || o.equals(mayorIgualQue)) {
                        jTable1.getModel().setValueAt("1", i, variables + 1 + i);
                    } else {
                        jTable1.getModel().setValueAt("0", i, variables + 1 + i);
                    }
                }
            }

            jTable1.getModel().setValueAt("0", jTable1.getModel().getRowCount() - 1, jTable1.getModel().getColumnCount() - 1);


            DefaultTableModel modeloSolucion = new DefaultTableModel();
            Matriz = new double[restricciones + 1][restricciones + variables + 1];
            for (int i = 0; i < (restricciones + 1); i++) {
                boolean sw = i == restricciones || jTable1.getModel().getValueAt(i, jTable1.getModel().getColumnCount() - 2).equals(mayorIgualQue);

                for (int j = 0; j < (restricciones + variables + 1); j++) {
                    double d;
                    if (j == (restricciones + variables)) {//para saltarse el signo
                        d = convert(jTable1.getModel().getValueAt(i, j + 2).toString());
                        Matriz[i][j] = sw ? d * -1 : d;
                    } else {
                        d = convert(jTable1.getModel().getValueAt(i, j + 1).toString());
                        Matriz[i][j] = sw ? d * -1 : d;
                    }

                }
            }

            while (ComprobarResultado() != true) {
                imprimirMatriz();
                JOptionPane.showMessageDialog(this, "aca");
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
            imprimirMatriz();
            btnSolucion.setEnabled(false);
            btnSolucion1.setEnabled(true);
        } catch (Exception e) {
            java.util.logging.Logger.getLogger(JInternalFrame_Max.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        }
}//GEN-LAST:event_btnSolucionActionPerformed

    private void btnSolucion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolucion1ActionPerformed
        try {
            DefaultTableModel modeloSolucion = new DefaultTableModel();
            Matriz = new double[restricciones + 1][restricciones + variables + 1];
            for (int i = 0; i < (restricciones + 1); i++) {
                boolean sw = i == restricciones || jTable1.getModel().getValueAt(i, jTable1.getModel().getColumnCount() - 2).equals(mayorIgualQue);

                for (int j = 0; j < (restricciones + variables + 1); j++) {
                    double d;
                    if (j == (restricciones + variables)) {//para saltarse el signo
                        d = convert(jTable1.getModel().getValueAt(i, j + 2).toString());
                        Matriz[i][j] = sw ? d * -1 : d;
                    } else {
                        d = convert(jTable1.getModel().getValueAt(i, j + 1).toString());
                        Matriz[i][j] = sw ? d * -1 : d;
                    }

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

    public static double convert(String s) {
//        return Double.parseDouble(df.format(Double.parseDouble(s)).replace(',', '.'));
//        return new BigDecimal(Double.parseDouble(s)).setScale(2, RoundingMode.HALF_UP).doubleValue();
        return Double.parseDouble(s);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnSolucion;
    private javax.swing.JButton btnSolucion1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableSolucion;
    private javax.swing.JLabel lbl_Iteraccion;
    private javax.swing.JComboBox opctimizacion;
    private javax.swing.JTextField txtRestriccion;
    private javax.swing.JTextField txtVariable;
    // End of variables declaration//GEN-END:variables

    public int ColumnaPivote() { //el metodo pivot devuelve la posicion del numero minimo de la columna
        System.out.println(restricciones);
        int pos = 0;
        double aux = Matriz[restricciones][0];
        for (int i = 1; i < restricciones + variables; i++) {
            if (aux > Matriz[restricciones][i]) { //busca al menor numero para pivot de la columna
                aux = Matriz[restricciones][i];    // si es menor se guarda en la varriable aux
                pos = i;                            //tambien se guarda la posicion del numero menor
            }
        }
        return pos;             //devuelve la posicion del numero minimo
    }

    public int FilaPivote() { 
        int columna = ColumnaPivote();   //guardamos la posicion de la columna del pivot
        double aux = 0; 
        Double razon = null;
        int pos = 0;
        for (int i = 0; i < restricciones; i++) { 
            double columPiv = Matriz[i][columna];   //empieza de la columna del pivot
            double columSoluc = Matriz[i][variables + restricciones];   //guarda el numero el numero del lado derecho
            if ((columPiv > 0 && columSoluc > 0) || (columPiv < 0 && columSoluc < 0)) {  //el pivot debe ser mayor a cero y LD>0
                aux = columSoluc / columPiv;  // dividimos para que sea 1
                if ((razon == null) || aux < razon) { //busca el mas minimo Sol Basica
                    razon = aux;   //se lo guarda si e minimo
                    pos = i;   //tambien la posicion
                }
            }
        }
        return pos;   //retorna la posicion
    }

    public void NuevaTabla(int Fila, int Columna) { //método para crear una nueva tabla

        double pivote = Matriz[Fila][Columna], aux = 0;    //ahora recien sacamos el numero de la posicion
        System.out.println("pivote [" + Fila + "]" + "[" + Columna + "]=" + pivote);

        for (int i = 0; i < restricciones + variables + 1; i++) {
            Matriz[Fila][i] = Matriz[Fila][i] / pivote;   //a la fila lo divido por el pivot
        }
        //en esta parte R2 = R1*(-2) + R2
        for (int i = 0; i < restricciones + 1; i++) {
            aux = Matriz[i][Columna];   
            for (int j = 0; j < variables + restricciones + 1; j++) {
                if (i != Fila) {
                    Matriz[i][j] = Matriz[i][j] - aux * Matriz[Fila][j];
                } else {
                    break;
                }
            }
        }
    }
    
    //compruebo el reglon de z optimos es mayor a cero 
    public boolean ComprobarResultado() {
        boolean result = true;
        for (int i = 0; i < restricciones + variables; i++) {
            if (((Matriz[restricciones][i] < 0) && opc) || ((Matriz[restricciones][i] > 0) && !opc)) {  //si hay negativos en el reglon z
                result = false;                 //resultado falso
                break;              //y termina el proceso
            }
        }
        return result;
    }
}
