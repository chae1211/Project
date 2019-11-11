/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author USER
 */
public class trylng extends javax.swing.JApplet {
    Timer move;
    int command = 0;
    int banda = 0;
   
    @Override
    public void init() {
                  
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
            java.util.logging.Logger.getLogger(trylng.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(trylng.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(trylng.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(trylng.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the applet */
        try {
            java.awt.EventQueue.invokeAndWait(new Runnable() {
                public void run() {
                    setSize(400,400);
                    initComponents();
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public void start(){
              move = new Timer (10 , (ActionListener) new trylng.MoveSprites());
       
    }
    public class MoveSprites implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            if(banda==0){
                labay.setLocation(labay.getX()+1,labay.getY()-1);
            }else if(banda==2){
                    labay.setLocation(labay.getX()+1,labay.getY()-1);
           }else if(banda==3){    
                    labay.setLocation(labay.getX()-1,labay.getY()-1);
            }else if(banda==4){
                    labay.setLocation(labay.getX()+1,labay.getY()+1);
            }else if(banda==5){
                if(b4.getX()<150){
                    labay.setLocation(labay.getX()-1,labay.getY()+1);
                }else{
                    labay.setLocation(labay.getX()+1,labay.getY()+1);
                }
            }
            if(command==1){
                 b1.setLocation(b1.getX()+5,b1.getY());
                 b2.setLocation(b2.getX(),b2.getY()-5);
                 b3.setLocation(b3.getX(),b3.getY()+5);
                 b4.setLocation(b4.getX()-5,b4.getY());
            }else if(command==2){
                 b1.setLocation(b1.getX()-5,b1.getY());
                 b2.setLocation(b2.getX(),b2.getY()+5);
                 b3.setLocation(b3.getX(),b3.getY()-5);
                 b4.setLocation(b4.getX()+5,b4.getY());
            //     JOptionPane.showMessageDialog(null,b4.getLocation());
            }else{
             move.stop();
            }
            if(labay.getBounds().intersects(b4.getBounds())){
                banda = 5;
            }else if(labay.getBounds().intersects(b3.getBounds())){
                banda = 4;
            }else if(labay.getBounds().intersects(b2.getBounds())){
                banda = 3;
            }else if(labay.getBounds().intersects(b1.getBounds())){
                banda = 2;
            }
            
//          - o - o - o - o - o - o - o - o - o - o - o - o - o - o - o - o - o
            if(b3.getY()<0){
             b3.setLocation(b3.getX(), 0);
            }
            if(b3.getY()>300){
             b3.setLocation(b3.getX(),300);
            }
            if(b2.getY()<0){
             b2.setLocation(b2.getX(),0);
            }
            if(b2.getY()>300){
                b2.setLocation(b2.getX(), 300);
            }
            if(b1.getX()<0){
                b1.setLocation(0,b1.getY());
            }
            if(b1.getX()>300){
                b1.setLocation(300,b1.getY());
            }
            if(b4.getX()<0){
             b4.setLocation(0, b4.getY());
            }
            if(b4.getX()>300){
             b4.setLocation(300,b4.getY());
            }
        }
        
    }

    /**
     * This method is called from within the init() method to initialize the
     * form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        ctrl = new javax.swing.JTextField();
        labay = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 379, 100, 15));
        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 294, 15, 100));
        getContentPane().add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 15, 100));
        getContentPane().add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 6, 100, 15));

        ctrl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ctrlKeyPressed(evt);
            }
        });
        getContentPane().add(ctrl, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 67, -1));

        labay.setText("jLabel1");
        getContentPane().add(labay, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 51, 48));
    }// </editor-fold>//GEN-END:initComponents

    private void ctrlKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ctrlKeyPressed
        switch(evt.getKeyChar()){
            
            case 'a':command = 1;move.start();break;
            case 'A':command = 1;move.start();break;
            case 'd':command = 2;move.start();break;
            case 'D':command = 2;move.start();break;
            default:command = 0;
        }
        
    }//GEN-LAST:event_ctrlKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JTextField ctrl;
    private javax.swing.JLabel labay;
    // End of variables declaration//GEN-END:variables
}
