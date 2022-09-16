
package app;

import static app.iniciarsesion.getConection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class proyectofinal extends javax.swing.JFrame {
    
    public static final String URL = "jdbc:mysql://localhost:3306/registro";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";

    PreparedStatement ps;
    ResultSet rs;
    
    
    public static Connection getConection() {
        Connection con = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
            JOptionPane.showMessageDialog(null, "Conexion exitosa");

        } catch (Exception e) {
            System.out.println(e);
        }
        return con;

    }
   
    private void limpiarproductos(){
        
        lacteos.setSelectedIndex(0);
        carnes.setSelectedIndex(0);
        bebidas.setSelectedIndex(0);
        limpieza.setSelectedIndex(0);
        higiene.setSelectedIndex(0);
        micelanea.setSelectedIndex(0);
        frutas.setSelectedIndex(0);
        viveres.setSelectedIndex(0);
        
        
        
    }
    
    public proyectofinal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lacteos = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        carnes = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        bebidas = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        micelanea = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        higiene = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        frutas = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        limpieza = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        viveres = new javax.swing.JComboBox<>();
        btnsiguiente = new javax.swing.JButton();
        reiniciar = new javax.swing.JButton();
        Anterior = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1624843.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("            SuperMarket ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 290, 25));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel2.setText("       PRODUCTOS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 70, 180, 25));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Lacteos");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 111, -1, -1));

        lacteos.setBackground(new java.awt.Color(255, 255, 255));
        lacteos.setForeground(new java.awt.Color(153, 153, 153));
        lacteos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir", "Leche-60$", "Yogurt-140$", "Mayonesa-80$", "Queso-100$", "Huevo-120$" }));
        lacteos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lacteosActionPerformed(evt);
            }
        });
        getContentPane().add(lacteos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 128, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Carnes");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 164, 49, -1));

        carnes.setBackground(new java.awt.Color(153, 255, 255));
        carnes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir", "Salchicha-250$", "Pollo-140$", "Carne de res-180$", "Chuleta-110$", "Cerdo-200$" }));
        getContentPane().add(carnes, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 163, 128, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Bebidas");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 219, 59, -1));

        bebidas.setBackground(new java.awt.Color(153, 255, 255));
        bebidas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir", "Jugo-60$", "Refresco-80$", "Agua-20$", "Cerveza-180$", "Vodka-240$" }));
        bebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bebidasActionPerformed(evt);
            }
        });
        getContentPane().add(bebidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 218, 128, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Micelanea");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 162, -1, 20));

        micelanea.setBackground(new java.awt.Color(153, 255, 255));
        micelanea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir", "Aluminio-120$", "Fosforo-100$", "Velas-60$", "Bombilla-100$", "Papel Tapiz-60$" }));
        micelanea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                micelaneaActionPerformed(evt);
            }
        });
        getContentPane().add(micelanea, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 163, 114, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("  Higiene");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 111, -1, -1));

        higiene.setBackground(new java.awt.Color(153, 255, 255));
        higiene.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir", "Pasta Dental-65$", "Hilo Dental-80$", "Jabon-50$", "Shampoo-120$", "Cepillo Dental-90$" }));
        higiene.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                higieneActionPerformed(evt);
            }
        });
        getContentPane().add(higiene, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 110, 115, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("   Frutas");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 219, -1, -1));

        frutas.setBackground(new java.awt.Color(153, 255, 255));
        frutas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir", "Sandia-80$", "Manzana-60$", "Melon-90$", "Piña-70$", "Pera-90$", "Lechoza-100$" }));
        getContentPane().add(frutas, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 218, 115, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Limpieza");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 275, -1, -1));

        limpieza.setBackground(new java.awt.Color(153, 255, 255));
        limpieza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir", "Esponja-50$", "Cloro-200$", "Suavizante-160$", "Mistolin-160$", "Axe-60$" }));
        getContentPane().add(limpieza, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 274, 128, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("  Viveres");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 275, -1, -1));

        viveres.setBackground(new java.awt.Color(153, 255, 255));
        viveres.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir", "Platano-300$", "Platano M.-250$", "Yuca-200$", "Yautia-150$", "Auyama-1004" }));
        viveres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viveresActionPerformed(evt);
            }
        });
        getContentPane().add(viveres, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 274, 115, -1));

        btnsiguiente.setBackground(new java.awt.Color(102, 102, 102));
        btnsiguiente.setText("Siguiente");
        btnsiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnsiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 347, 103, -1));

        reiniciar.setBackground(new java.awt.Color(102, 102, 102));
        reiniciar.setText("Reiniciar Seleccion");
        reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiniciarActionPerformed(evt);
            }
        });
        getContentPane().add(reiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 347, 138, -1));

        Anterior.setBackground(new java.awt.Color(102, 102, 102));
        Anterior.setText("Anterior");
        Anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnteriorActionPerformed(evt);
            }
        });
        getContentPane().add(Anterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 347, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 57, 532, 10));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, -1, -1));
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, -1, -1));
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, -1, -1));
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lacteosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lacteosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lacteosActionPerformed

    private void micelaneaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_micelaneaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_micelaneaActionPerformed

    private void higieneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_higieneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_higieneActionPerformed

    private void btnsiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsiguienteActionPerformed
       Formatodepago b = new Formatodepago();
       b.setVisible(true);
       this.setVisible(false);
       
       Connection con = null;
        
        try{
            
            con = getConection();
            ps = con.prepareStatement("INSERT INTO productos (Lacteos, Carnes, Bebidas, Limpieza, Higiene, Micelanea, Frutas, Viveres) VALUES(?,?,?,?,?,?,?,?) ");
            ps.setString(1, lacteos.getSelectedItem().toString());
            ps.setString(2, carnes.getSelectedItem().toString());
            ps.setString(3, bebidas.getSelectedItem().toString());
            ps.setString(4, limpieza.getSelectedItem().toString());
            ps.setString(5, higiene.getSelectedItem().toString());
            ps.setString(6, micelanea.getSelectedItem().toString());
            ps.setString(7, frutas.getSelectedItem().toString());
            ps.setString(8, viveres.getSelectedItem().toString());
            
          int res = ps.executeUpdate();
          
          if(res > 0){
              JOptionPane.showMessageDialog(null, "Seleccion guardada");
              limpiarproductos();
          } else{
              JOptionPane.showMessageDialog(null, "Error al guardar la seleccion");
              limpiarproductos();
          }
            
          con.close();
          
        } catch(Exception e){
            System.err.println(e);
        }
       
       
    }//GEN-LAST:event_btnsiguienteActionPerformed

    private void reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciarActionPerformed
        limpiarproductos();
    }//GEN-LAST:event_reiniciarActionPerformed

    private void viveresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viveresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viveresActionPerformed

    private void bebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bebidasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bebidasActionPerformed

    private void AnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnteriorActionPerformed
        this.hide();
        Registro frm=new Registro();
        frm.setVisible(true);
    }//GEN-LAST:event_AnteriorActionPerformed

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
            java.util.logging.Logger.getLogger(proyectofinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(proyectofinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(proyectofinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(proyectofinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new proyectofinal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Anterior;
    private javax.swing.JComboBox<String> bebidas;
    private javax.swing.JButton btnsiguiente;
    private javax.swing.JComboBox<String> carnes;
    private javax.swing.JComboBox<String> frutas;
    private javax.swing.JComboBox<String> higiene;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> lacteos;
    private javax.swing.JComboBox<String> limpieza;
    private javax.swing.JComboBox<String> micelanea;
    private javax.swing.JButton reiniciar;
    private javax.swing.JComboBox<String> viveres;
    // End of variables declaration//GEN-END:variables
}
