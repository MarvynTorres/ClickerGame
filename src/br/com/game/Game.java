/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.game;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;

public class Game extends javax.swing.JFrame {

    /**
     * Creates new form Game
     */
    public Game() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbButton = new javax.swing.JButton();
        jlMoney = new javax.swing.JLabel();
        jpLeft = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jlLevelPercent = new javax.swing.JLabel();
        jpRight = new javax.swing.JPanel();
        jlClicks = new javax.swing.JLabel();
        jSplitPane2 = new javax.swing.JSplitPane();
        jlLevel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Game");
        setMinimumSize(new java.awt.Dimension(400, 300));

        jbButton.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jbButton.setText("Click me :)");
        jbButton.setToolTipText("Click me :)");
        jbButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbButton.setPreferredSize(new java.awt.Dimension(200, 100));
        jbButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbButtonMouseClicked(evt);
            }
        });
        jbButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbButtonActionPerformed(evt);
            }
        });
        getContentPane().add(jbButton, java.awt.BorderLayout.CENTER);

        jlMoney.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jlMoney.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlMoney.setText("$ 0");
        jlMoney.setToolTipText("Money earned");
        jlMoney.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlMoney.setMaximumSize(new java.awt.Dimension(50, 50));
        jlMoney.setMinimumSize(new java.awt.Dimension(50, 50));
        jlMoney.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(jlMoney, java.awt.BorderLayout.PAGE_START);

        jpLeft.setMaximumSize(new java.awt.Dimension(100, 100));
        jpLeft.setMinimumSize(new java.awt.Dimension(100, 100));
        jpLeft.setPreferredSize(new java.awt.Dimension(100, 100));
        jpLeft.setLayout(new java.awt.GridLayout());

        jSplitPane1.setMaximumSize(new java.awt.Dimension(10, 10));
        jSplitPane1.setMinimumSize(new java.awt.Dimension(10, 10));
        jSplitPane1.setPreferredSize(new java.awt.Dimension(10, 10));
        jpLeft.add(jSplitPane1);

        jlLevelPercent.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlLevelPercent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlLevelPercent.setText("Level %: ");
        jlLevelPercent.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlLevelPercent.setMaximumSize(new java.awt.Dimension(60, 30));
        jlLevelPercent.setMinimumSize(new java.awt.Dimension(60, 30));
        jlLevelPercent.setPreferredSize(new java.awt.Dimension(60, 30));
        jpLeft.add(jlLevelPercent);

        getContentPane().add(jpLeft, java.awt.BorderLayout.LINE_START);

        jpRight.setMaximumSize(new java.awt.Dimension(100, 100));
        jpRight.setMinimumSize(new java.awt.Dimension(100, 100));
        jpRight.setPreferredSize(new java.awt.Dimension(100, 100));
        jpRight.setLayout(new java.awt.GridLayout());

        jlClicks.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlClicks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlClicks.setText("Clicks: 0");
        jlClicks.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpRight.add(jlClicks);
        jpRight.add(jSplitPane2);

        getContentPane().add(jpRight, java.awt.BorderLayout.LINE_END);

        jlLevel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlLevel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlLevel.setText("Level 1");
        jlLevel.setMaximumSize(new java.awt.Dimension(50, 50));
        jlLevel.setMinimumSize(new java.awt.Dimension(50, 50));
        jlLevel.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(jlLevel, java.awt.BorderLayout.PAGE_END);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbButtonActionPerformed

    }//GEN-LAST:event_jbButtonActionPerformed

    private void jbButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbButtonMouseClicked
        clicked++;
        getMoney(clicked);
        level(clicked);
    }//GEN-LAST:event_jbButtonMouseClicked
   
    
    
    int clicked = 0;
    int level = 1;
    public int level(int clicks){
        if(clicks==100){
            level=2;
            jlLevel.setText("Level "+String.valueOf(level));
        }
        return level;
    }
    
    int aux1 = 0;
    int money = 0;
    protected Random generator = new Random();
    
    public void getMoney(int clicks){
        if(level(clicks)<=5){
            aux1 = money;
            money = aux1;
            int moneyEarn = generator.nextInt(1,3);
            money = money+moneyEarn;
            jlMoney.setText("$ "+String.valueOf(money));
        }
        if(level(clicks)>5&&level(clicks)<=10){
            int money = generator.nextInt(1, 5);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       FlatDarkLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JButton jbButton;
    private javax.swing.JLabel jlClicks;
    private javax.swing.JLabel jlLevel;
    private javax.swing.JLabel jlLevelPercent;
    private javax.swing.JLabel jlMoney;
    private javax.swing.JPanel jpLeft;
    private javax.swing.JPanel jpRight;
    // End of variables declaration//GEN-END:variables
}
