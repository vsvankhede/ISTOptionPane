package com.infiniteshivtechnologies.ISTOptionpane;

import javax.swing.ImageIcon;


public class ISTMainFrame extends javax.swing.JFrame {

    public static boolean option = false;
    JOptionpane jop = new JOptionpane();
    public ISTMainFrame() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title_lab = new javax.swing.JLabel();
        question_lab = new javax.swing.JLabel();
        yes_but = new javax.swing.JButton();
        no_but = new javax.swing.JButton();
        bkg_lab = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 200));
        getContentPane().setLayout(null);
        getContentPane().add(title_lab);
        title_lab.setBounds(0, 0, 400, 20);
        getContentPane().add(question_lab);
        question_lab.setBounds(50, 40, 330, 60);

        yes_but.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/infiniteshivtechnologies/ISTOptionpane/message_yes_but.png"))); // NOI18N
        yes_but.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                yes_butMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                yes_butMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                yes_butMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                yes_butMouseReleased(evt);
            }
        });
        yes_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yes_butActionPerformed(evt);
            }
        });
        getContentPane().add(yes_but);
        yes_but.setBounds(20, 150, 150, 40);

        no_but.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/infiniteshivtechnologies/ISTOptionpane/message_No_but.png"))); // NOI18N
        no_but.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                no_butMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                no_butMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                no_butMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                no_butMouseReleased(evt);
            }
        });
        getContentPane().add(no_but);
        no_but.setBounds(230, 150, 150, 40);

        bkg_lab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/infiniteshivtechnologies/ISTOptionpane/message_bkg.png"))); // NOI18N
        getContentPane().add(bkg_lab);
        bkg_lab.setBounds(0, 0, 400, 200);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void yes_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yes_butActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yes_butActionPerformed

    private void yes_butMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yes_butMouseEntered

        ImageIcon II = new ImageIcon(getClass().getResource("/com/infiniteshivtechnologies/ISTOptionpane/message_yes_but_h.png"));
        yes_but.setIcon(II);
    }//GEN-LAST:event_yes_butMouseEntered

    private void yes_butMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yes_butMouseExited

        ImageIcon II = new ImageIcon(getClass().getResource("/com/infiniteshivtechnologies/ISTOptionpane/message_yes_but.png"));
        yes_but.setIcon(II);
    }//GEN-LAST:event_yes_butMouseExited

    private void yes_butMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yes_butMousePressed

        ImageIcon II = new ImageIcon(getClass().getResource("/com/infiniteshivtechnologies/ISTOptionpane/message_yes_but_c.png"));
        yes_but.setIcon(II);
    }//GEN-LAST:event_yes_butMousePressed

    private void yes_butMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yes_butMouseReleased

        ImageIcon II = new ImageIcon(getClass().getResource("/com/infiniteshivtechnologies/ISTOptionpane/message_yes_but_h.png"));
        yes_but.setIcon(II);
        JOptionpane.getState();
        option = true;
        
        this.dispose();
    }//GEN-LAST:event_yes_butMouseReleased

    private void no_butMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_no_butMouseEntered

        ImageIcon II = new ImageIcon(getClass().getResource("/com/infiniteshivtechnologies/ISTOptionpane/message_no_but_h.png"));
        no_but.setIcon(II);
    }//GEN-LAST:event_no_butMouseEntered

    private void no_butMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_no_butMouseExited

        ImageIcon II = new ImageIcon(getClass().getResource("/com/infiniteshivtechnologies/ISTOptionpane/message_no_but.png"));
        no_but.setIcon(II);
    }//GEN-LAST:event_no_butMouseExited

    private void no_butMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_no_butMousePressed

        ImageIcon II = new ImageIcon(getClass().getResource("/com/infiniteshivtechnologies/ISTOptionpane/message_no_but_c.png"));
        no_but.setIcon(II);
    }//GEN-LAST:event_no_butMousePressed

    private void no_butMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_no_butMouseReleased
        
        ImageIcon II = new ImageIcon(getClass().getResource("/com/infiniteshivtechnologies/ISTOptionpane/message_no_but_h.png"));
        no_but.setIcon(II);
        
        option = false;
        this.dispose();
    }//GEN-LAST:event_no_butMouseReleased

    
    
    public static void main(String args[]) {
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ISTMainFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bkg_lab;
    private javax.swing.JButton no_but;
    public static javax.swing.JLabel question_lab;
    public static javax.swing.JLabel title_lab;
    private javax.swing.JButton yes_but;
    // End of variables declaration//GEN-END:variables
}
