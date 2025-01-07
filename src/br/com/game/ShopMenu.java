
package br.com.game;

import com.formdev.flatlaf.FlatDarkLaf;


public class ShopMenu extends javax.swing.JFrame {


    public ShopMenu() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Shop menu");
        setAlwaysOnTop(true);
        setMaximumSize(new java.awt.Dimension(200, 300));
        setMinimumSize(new java.awt.Dimension(200, 300));
        setPreferredSize(new java.awt.Dimension(200, 300));
        setResizable(false);
        getContentPane().setLayout(new java.awt.FlowLayout());

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);

        setBounds(500, 100, 216, 308);
    }// </editor-fold>//GEN-END:initComponents


    public static void main(String args[]) {
        FlatDarkLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShopMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
