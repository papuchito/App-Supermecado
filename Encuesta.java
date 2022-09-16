import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;


public class Encuesta extends javax.swing.JFrame {

    
    public Encuesta() {
        initComponents();
        
        ButtonGroup btg = new ButtonGroup();
        
        btg.add(rdbwindows);
        btg.add(rdblinux);
        btg.add(rdbmac);
       
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rdbwindows = new javax.swing.JRadioButton();
        rdblinux = new javax.swing.JRadioButton();
        rdbmac = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        ckbprog = new javax.swing.JCheckBox();
        ckbDis = new javax.swing.JCheckBox();
        ckbadmi = new javax.swing.JCheckBox();
        ckbninguna = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        sl1 = new javax.swing.JSlider();
        jButton1 = new javax.swing.JButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Mini Encuesta ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("- Elija una sistema operativo: ");

        rdbwindows.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdbwindows.setText("Windows");

        rdblinux.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdblinux.setText("Linux");

        rdbmac.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdbmac.setText("Mac");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("- Elije tu especialidad:");

        ckbprog.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ckbprog.setText("Programacion");

        ckbDis.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ckbDis.setText("Diseño grafico");

        ckbadmi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ckbadmi.setText("Administracion");

        ckbninguna.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ckbninguna.setText("Ninguna");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("- Horas dedicadas en el ordenador: ");

        sl1.setBackground(new java.awt.Color(255, 255, 255));
        sl1.setForeground(new java.awt.Color(0, 0, 0));
        sl1.setMajorTickSpacing(1);
        sl1.setMaximum(10);
        sl1.setPaintLabels(true);
        sl1.setPaintTicks(true);
        sl1.setValue(1);
        sl1.setInverted(true);
        sl1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sl1StateChanged(evt);
            }
        });

        jButton1.setText("Generar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rdbwindows)
                                .addComponent(rdblinux)
                                .addComponent(rdbmac)
                                .addComponent(ckbprog)
                                .addComponent(jLabel3)
                                .addComponent(ckbDis)
                                .addComponent(ckbadmi)
                                .addComponent(ckbninguna)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addComponent(jLabel4))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jButton1)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(rdbwindows)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdblinux)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdbmac)
                .addGap(3, 3, 3)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(ckbprog)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ckbDis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ckbadmi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ckbninguna)
                .addGap(6, 6, 6)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(sl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String informacion ="Tu sistema preferido es: ";
        JRadioButton[] rdbs = {rdbwindows,rdblinux,rdbmac};
         for(int i=0; i<rdbs.length; i++){
             
             if(rdbs[i].isSelected()){
                 informacion+= rdbs[i].getText();
                 
         }
      
        
    }//GEN-LAST:event_jButton1ActionPerformed
JCheckBox[] ckbs = {ckbprog,ckbDis,ckbadmi,ckbninguna};
informacion+= ", tus especialidades son: ";
for(int i = 0; i<ckbs.length; i++){
    if(ckbs[i].isSelected()){
        informacion+=ckbs[i].getText()+" ";
    }
}
        informacion+= "Y el numero de horas dedicas al ordenador son: "+sl1.getValue();
        JOptionPane.showMessageDialog(this, informacion, "Muestra de resultados",JOptionPane.INFORMATION_MESSAGE);


    }
    private void sl1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sl1StateChanged
        
    }//GEN-LAST:event_sl1StateChanged

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
            java.util.logging.Logger.getLogger(Encuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Encuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Encuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Encuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Encuesta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JCheckBox ckbDis;
    private javax.swing.JCheckBox ckbadmi;
    private javax.swing.JCheckBox ckbninguna;
    private javax.swing.JCheckBox ckbprog;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JRadioButton rdblinux;
    private javax.swing.JRadioButton rdbmac;
    private javax.swing.JRadioButton rdbwindows;
    private javax.swing.JSlider sl1;
    // End of variables declaration//GEN-END:variables
}
