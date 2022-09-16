
package app;

import static app.Registro.getConection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class Formatodepago extends javax.swing.JFrame {

    public static final String URL = "jdbc:mysql://localhost:3306/registro";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";
    
    PreparedStatement ps; 
    ResultSet rs; 
    
   public static Connection getConection(){
       Connection con = null;
       
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
           JOptionPane.showMessageDialog(null, "Proceso exitoso");
           
       } catch (Exception e){
           System.out.println(e);
       }
       return con;
   }
   
   private void limpiarpago(){
       
       tarjeta.setSelectedIndex(0);
       titular.setText(null);
       ntarjeta.setText(null);
       vencimiento.setText(null);
       cvv.setText(null);
   }
   
    public Formatodepago() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jButton2 = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        titular = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ntarjeta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        vencimiento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cvv = new javax.swing.JTextField();
        tarjeta = new javax.swing.JComboBox<>();
        btncompra = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        jButton2.setText("Atras");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tarjetas-credito-no-de-bancos.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Formato de pago");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Nombre Del Titular");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 111, 180, 40));
        getContentPane().add(titular, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 150, 30));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Numero De Tarjeta");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 163, -1, -1));
        getContentPane().add(ntarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 150, 30));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Fecha De Vencimiento");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 215, -1, -1));
        getContentPane().add(vencimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 150, 30));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("CVV");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 258, -1, -1));

        cvv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cvvActionPerformed(evt);
            }
        });
        getContentPane().add(cvv, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 50, 30));

        tarjeta.setBackground(new java.awt.Color(153, 255, 255));
        tarjeta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir", "Visa", "Mastercad", "American Express" }));
        tarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tarjetaActionPerformed(evt);
            }
        });
        getContentPane().add(tarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 154, 30));

        btncompra.setBackground(new java.awt.Color(102, 102, 102));
        btncompra.setText("Finalizar Compra");
        btncompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncompraActionPerformed(evt);
            }
        });
        getContentPane().add(btncompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Tarjeta");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 70, 30));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 42, 434, 10));

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setText("Volver");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncompraActionPerformed
        if ( titular.getText().isEmpty()|| ntarjeta.getText().isEmpty()
                || vencimiento.getText().isEmpty()|| cvv.getText().isEmpty() ){
            JOptionPane.showMessageDialog(this, "Favor no dejar campos vacios", "Aviso!", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(this, "Su Compra Fue Procesada Con Exito. \n*Llegara Dentro De 30-40 Minutos A Su Casa*, \n    Gracias por preferirnos!!");
        }
        
       
       Connection con = null;
        
        try{
            con = getConection();
            ps = con.prepareStatement("INSERT INTO pago (Tarjeta, Nombre_Titular, Numero_Tarjeta, Fecha_Vencimiento, CVV) VALUES(?,?,?,?,?) ");
            ps.setString(1, tarjeta.getSelectedItem().toString());
            ps.setString(2, titular.getText());
            ps.setString(3, ntarjeta.getText());
            ps.setString(4, vencimiento.getText());
            ps.setString(5, cvv.getText());
            
            int res = ps.executeUpdate();
            
            if(res > 0){
                
                limpiarpago();
            } else{
                JOptionPane.showMessageDialog(null, "Error al guardadar los datos");
                limpiarpago();
            }
            
            con.close();
            
        } catch(Exception e){
            System.err.println(e);
            
        }
               
    }//GEN-LAST:event_btncompraActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.hide();
        proyectofinal frm=new proyectofinal();
        frm.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cvvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cvvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cvvActionPerformed

    private void tarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tarjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tarjetaActionPerformed

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
            java.util.logging.Logger.getLogger(Formatodepago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formatodepago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formatodepago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formatodepago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formatodepago().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncompra;
    private javax.swing.JTextField cvv;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField ntarjeta;
    private javax.swing.JComboBox<String> tarjeta;
    private javax.swing.JTextField titular;
    private javax.swing.JTextField vencimiento;
    // End of variables declaration//GEN-END:variables
}
