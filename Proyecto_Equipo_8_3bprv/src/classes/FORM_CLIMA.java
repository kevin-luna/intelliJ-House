/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author kevin
 */
public class FORM_CLIMA extends javax.swing.JFrame {

    ClimaActual ca = new ClimaActual();
    public float TEMP;
    /**
     * Creates new form CLIMA_FORM
     */
    public FORM_CLIMA() {
        initComponents();

        try {
          ca.obtenerClima("xA1ZR50q3VyDU5pVGZ7gwvyxugBLGWM2", "236233", "es-MX","true");
          this.TEMP=ca.TEMPERATURE;
            ImageIcon icon = new ImageIcon("src/icons/"+ca.ICON+"-s.png");
            icon = new ImageIcon(icon.getImage().getScaledInstance(this.icon.getWidth(),this.icon.getHeight(),Image.SCALE_SMOOTH));
            this.icon.setIcon(icon);
            texto.setText(ca.TEXT);
            temp.setText(Float.toString(ca.TEMPERATURE));
            hum.setText(Integer.toString(ca.HUMEDITY));
            
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(this,"No se pudo establecer la conexión con el servidor","Error de conexión",JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        }
    }
    

        
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        texto = new javax.swing.JLabel();
        temp = new javax.swing.JLabel();
        hum = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Clima exterior");
        setBackground(new java.awt.Color(51, 255, 255));
        setForeground(java.awt.Color.white);

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon.setText("Icono");
        jPanel1.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 150, 90));

        texto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        texto.setText("Texto");
        jPanel1.add(texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 150, 46));

        temp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        temp.setText("temp");
        jPanel1.add(temp, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 40, 30));

        hum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hum.setText("hum");
        jPanel1.add(hum, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 60, 30));

        jLabel1.setText("Temperatura:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 214, 80, 20));

        jLabel2.setText("Humedad:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FORM_CLIMA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FORM_CLIMA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FORM_CLIMA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FORM_CLIMA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FORM_CLIMA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel hum;
    public static javax.swing.JLabel icon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel temp;
    public static javax.swing.JLabel texto;
    // End of variables declaration//GEN-END:variables
}
