/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.awt.Cursor;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author juan
 */
public class Bye extends javax.swing.JDialog {

    /**
     * Creates new form bye
     */
    public Bye(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_donate = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("www.jpgsoluciones.com");

        lb_donate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_donate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/donate.gif"))); // NOI18N
        lb_donate.setToolTipText("Apoya mi trabajo / Support my work");
        lb_donate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                navURL(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEnter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseLeave(evt);
            }
        });

        jLabel1.setText("Support my work");

        jLabel2.setText("Apoya mi trabajo");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Thanks for using this app, hope it worked for you");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Gracias por usar la aplicación, espero que te haya sido útil");

        jLabel5.setText("Juan Pablo García");

        jLabel8.setText("www.jpgsoluciones.com");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                navURL(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_donate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addComponent(jSeparator1)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_donate)
                .addContainerGap())
        );

        lb_donate.getAccessibleContext().setAccessibleName("Apoya mi trabajo / Support my work");
        lb_donate.getAccessibleContext().setAccessibleDescription("https://ko-fi.com/juanpgarciac");
        jLabel8.getAccessibleContext().setAccessibleName("https://jpgsoluciones.com");
        jLabel8.getAccessibleContext().setAccessibleDescription("https://jpgsoluciones.com");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void navURL(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navURL
        // TODO add your handling code here:
        if (Desktop.isDesktopSupported()) {
          try {
            JLabel lb =  (JLabel) evt.getSource() ;
            String url = lb.getAccessibleContext().getAccessibleDescription();
            Desktop.getDesktop().browse(new URI(url));
          } catch (IOException e) { /* TODO: error handling */ } catch (URISyntaxException ex) {           }
        } 
    }//GEN-LAST:event_navURL

    private void mouseEnter(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseEnter
        // TODO add your handling code here:       
        Object obj =  evt.getSource();        
        Class c = obj.getClass();
        if("class javax.swing.JLabel".equals(c.toString())){
           JLabel lb =  (JLabel) evt.getSource() ; 
           lb.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }else{
            JButton b = (JButton) evt.getSource() ; 
            b.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }  
    }//GEN-LAST:event_mouseEnter

    private void mouseLeave(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseLeave
        // TODO add your handling code here:
        Object obj =  evt.getSource();        
        Class c = obj.getClass();
        if("class javax.swing.JLabel".equals(c.toString())){
           JLabel lb =  (JLabel) evt.getSource() ; 
           lb.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        }else{
            JButton b = (JButton) evt.getSource() ; 
            b.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        } 
    }//GEN-LAST:event_mouseLeave
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            /* Set the Nimbus look and feel */
            //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
            /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
            * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
            */
            
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Bye.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Bye.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Bye.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Bye.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        /*
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(bye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Bye dialog = new Bye(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lb_donate;
    // End of variables declaration//GEN-END:variables
}
