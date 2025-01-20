/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.game;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Point;

public class ShopMenu extends javax.swing.JFrame {
    
    public ShopMenu() {
        initComponents();
        ShopMenuSetLocation(Game.jbShopMenuGetPosition());
    }
    
    private void ShopMenuSetLocation(Point position){
        position.setLocation(position.getX(), position.getY()-81);
        this.setLocation(position);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Shop menu");
        setAlwaysOnTop(true);
        setMaximumSize(new java.awt.Dimension(200, 300));
        setMinimumSize(new java.awt.Dimension(200, 300));
        setPreferredSize(new java.awt.Dimension(200, 300));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new java.awt.FlowLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("XP gain:");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setMaximumSize(new java.awt.Dimension(80, 30));
        jLabel1.setMinimumSize(new java.awt.Dimension(80, 30));
        jLabel1.setPreferredSize(new java.awt.Dimension(75, 30));
        getContentPane().add(jLabel1);

        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setText("Up");
        jButton1.setMaximumSize(new java.awt.Dimension(40, 25));
        jButton1.setMinimumSize(new java.awt.Dimension(40, 25));
        jButton1.setPreferredSize(new java.awt.Dimension(50, 25));
        getContentPane().add(jButton1);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Lvl 1");
        jLabel2.setMaximumSize(new java.awt.Dimension(40, 30));
        jLabel2.setMinimumSize(new java.awt.Dimension(40, 30));
        jLabel2.setPreferredSize(new java.awt.Dimension(40, 30));
        getContentPane().add(jLabel2);

        getAccessibleContext().setAccessibleName("shopmenu");
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        Game.changeShopMenuState();
    }//GEN-LAST:event_formWindowClosed

    public static void main(String args[]) {
        FlatDarkLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShopMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
