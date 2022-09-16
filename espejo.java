
public class espejo extends javax.swing.JFrame {

    public espejo() {
        initComponents();

        //añado los botones al grupo de la parte original
        buttonGroup1.add(this.rdb1Original);
        buttonGroup1.add(this.rdb2Original);
        buttonGroup1.add(this.rdb3Original);

        //añado los botones al grupo de la parte espejo        
        buttonGroup2.add(this.rdb1Imitacion);
        buttonGroup2.add(this.rdb2Imitacion);
        buttonGroup2.add(this.rdb3Imitacion);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rdb1Original = new javax.swing.JRadioButton();
        rdb2Original = new javax.swing.JRadioButton();
        rdb3Original = new javax.swing.JRadioButton();
        ckb1Original = new javax.swing.JCheckBox();
        ckb2Original = new javax.swing.JCheckBox();
        ckb3Original = new javax.swing.JCheckBox();
        txtOriginal = new javax.swing.JTextField();
        cmbOriginal = new javax.swing.JComboBox<>();
        spnOriginal = new javax.swing.JSpinner();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        rdb1Imitacion = new javax.swing.JRadioButton();
        rdb2Imitacion = new javax.swing.JRadioButton();
        rdb3Imitacion = new javax.swing.JRadioButton();
        ckb1Imitacion = new javax.swing.JCheckBox();
        ckb2Imitacion = new javax.swing.JCheckBox();
        ckb3Imitacion = new javax.swing.JCheckBox();
        txtImitacion = new javax.swing.JTextField();
        cmbImitacion = new javax.swing.JComboBox<>();
        spnImitacion = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Original");

        rdb1Original.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdb1Original.setText("Opcion 1");

        rdb2Original.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdb2Original.setText("Opcion 2");

        rdb3Original.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdb3Original.setText("Opcion 3");
        rdb3Original.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb3OriginalActionPerformed(evt);
            }
        });

        ckb1Original.setText("Opcion 4");

        ckb2Original.setText("Opcion 5");

        ckb3Original.setText("Opcion 6");

        cmbOriginal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        spnOriginal.setToolTipText("5\n10\n15\n20\n25\n30");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Espejo");

        rdb1Imitacion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdb1Imitacion.setText("Opcion 1");
        rdb1Imitacion.setEnabled(false);

        rdb2Imitacion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdb2Imitacion.setSelected(true);
        rdb2Imitacion.setText("Opcion 2");
        rdb2Imitacion.setEnabled(false);

        rdb3Imitacion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdb3Imitacion.setText("Opcion 3");
        rdb3Imitacion.setEnabled(false);

        ckb1Imitacion.setSelected(true);
        ckb1Imitacion.setText("Opcion 4");
        ckb1Imitacion.setEnabled(false);

        ckb2Imitacion.setSelected(true);
        ckb2Imitacion.setText("Opcion 5");
        ckb2Imitacion.setEnabled(false);

        ckb3Imitacion.setText("Opcion 6");
        ckb3Imitacion.setEnabled(false);

        txtImitacion.setEnabled(false);

        cmbImitacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 2", "Item 3", "Item 4" }));
        cmbImitacion.setEnabled(false);

        spnImitacion.setModel(new javax.swing.SpinnerNumberModel(20, null, null, 1));
        spnImitacion.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(rdb2Original)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ckb2Original))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(rdb1Original)
                                        .addGap(28, 28, 28)
                                        .addComponent(ckb1Original))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rdb3Original)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ckb3Original))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(spnOriginal)
                            .addComponent(cmbOriginal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rdb2Imitacion)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(rdb1Imitacion))
                                .addComponent(jLabel3))
                            .addComponent(rdb3Imitacion))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ckb1Imitacion)
                            .addComponent(ckb2Imitacion)
                            .addComponent(ckb3Imitacion))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spnImitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtImitacion)
                                .addComponent(cmbImitacion, 0, 99, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel1)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdb1Original)
                            .addComponent(ckb1Original)
                            .addComponent(txtOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ckb2Original)
                                    .addComponent(rdb2Original))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rdb3Original)
                                    .addComponent(ckb3Original)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(cmbOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spnOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rdb1Imitacion)
                                    .addComponent(ckb1Imitacion)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(txtImitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdb2Imitacion)
                            .addComponent(ckb2Imitacion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdb3Imitacion))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(ckb3Imitacion))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cmbImitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spnImitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void rdb1OriginalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb1OriginalActionPerformed

        this.rdb1Imitacion.setSelected(this.rdb1Original.isSelected());
        
    }//GEN-LAST:event_rdb1OriginalActionPerformed

    private void rdb2OriginalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb2OriginalActionPerformed

        this.rdb2Imitacion.setSelected(this.rdb2Original.isSelected());
    }//GEN-LAST:event_rdb2OriginalActionPerformed
    private void rdb3OriginalActionPerformed(java.awt.event.ActionEvent evt) {                                             
        this.rdb1Imitacion.setSelected(this.rdb1Original.isSelected());
        
    }                                            
    private void rdb3riginalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb3OriginalActionPerformed

        this.rdb3Imitacion.setSelected(this.rdb3Original.isSelected());

    }//GEN-LAST:event_rdb3OriginalActionPerformed

    private void ckb1OriginalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckb1OriginalActionPerformed

        this.ckb1Imitacion.setSelected(this.ckb1Original.isSelected());

    }//GEN-LAST:event_ckb1OriginalActionPerformed

    private void ckb2OriginalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckb2OriginalActionPerformed
        this.ckb2Imitacion.setSelected(this.ckb2Original.isSelected());
    }//GEN-LAST:event_ckb2OriginalActionPerformed

    private void ckb3OriginalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckb3OriginalActionPerformed
        this.ckb3Imitacion.setSelected(this.ckb3Original.isSelected());
    }//GEN-LAST:event_ckb3OriginalActionPerformed

    private void txtOriginalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOriginalKeyTyped

    }//GEN-LAST:event_txtOriginalKeyTyped

    private void spnOriginalStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnOriginalStateChanged
        this.spnImitacion.setValue((Integer) this.spnOriginal.getValue());
    }//GEN-LAST:event_spnOriginalStateChanged

    private void cmbOriginalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbOriginalItemStateChanged

        this.cmbImitacion.setSelectedIndex(this.cmbOriginal.getSelectedIndex());

    }//GEN-LAST:event_cmbOriginalItemStateChanged

    private void txtOriginalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOriginalKeyPressed

    }//GEN-LAST:event_txtOriginalKeyPressed

    private void txtOriginalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOriginalKeyReleased
        this.txtImitacion.setText(this.txtOriginal.getText());
    }//GEN-LAST:event_txtOriginalKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(espejo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(espejo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(espejo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(espejo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new espejo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox ckb1Imitacion;
    private javax.swing.JCheckBox ckb1Original;
    private javax.swing.JCheckBox ckb2Imitacion;
    private javax.swing.JCheckBox ckb2Original;
    private javax.swing.JCheckBox ckb3Imitacion;
    private javax.swing.JCheckBox ckb3Original;
    private javax.swing.JComboBox<String> cmbImitacion;
    private javax.swing.JComboBox<String> cmbOriginal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton rdb1Imitacion;
    private javax.swing.JRadioButton rdb1Original;
    private javax.swing.JRadioButton rdb2Imitacion;
    private javax.swing.JRadioButton rdb2Original;
    private javax.swing.JRadioButton rdb3Imitacion;
    private javax.swing.JRadioButton rdb3Original;
    private javax.swing.JSpinner spnImitacion;
    private javax.swing.JSpinner spnOriginal;
    private javax.swing.JTextField txtImitacion;
    private javax.swing.JTextField txtOriginal;
    // End of variables declaration//GEN-END:variables
}
