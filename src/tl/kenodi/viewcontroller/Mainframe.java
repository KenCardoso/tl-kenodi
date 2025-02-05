/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tl.kenodi.viewcontroller;

import handlers.*;
import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kenca
 */
public class Mainframe extends javax.swing.JFrame {

    handlers.Handler myHandler = new handlers.Handler();

    /**
     * Creates new form mainframe
     */
    public Mainframe() {
        initComponents();
        textArea_log.append(myHandler.getTime()+myHandler.getLog(1));
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
        btn_applyall = new javax.swing.JButton();
        checkbox_removeshutdown = new javax.swing.JCheckBox();
        checkbox_removeshutdown1 = new javax.swing.JCheckBox();
        checkbox_removeshutdown2 = new javax.swing.JCheckBox();
        checkbox_removeshutdown3 = new javax.swing.JCheckBox();
        checkbox_removeshutdown4 = new javax.swing.JCheckBox();
        jTextField1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        btn_applycustom = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        textArea_log = new java.awt.TextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        item_exit = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("kenodi");
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1000, 1000));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btn_applyall.setBackground(new java.awt.Color(51, 153, 255));
        btn_applyall.setFont(new java.awt.Font("Helvetica-Normal", 0, 14)); // NOI18N
        btn_applyall.setForeground(new java.awt.Color(255, 255, 255));
        btn_applyall.setText("Apply ALL above settings & export");

        checkbox_removeshutdown.setFont(new java.awt.Font("Helvetica-Normal", 0, 14)); // NOI18N
        checkbox_removeshutdown.setText("Remove settings");
        checkbox_removeshutdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbox_removeshutdownActionPerformed(evt);
            }
        });

        checkbox_removeshutdown1.setFont(new java.awt.Font("Helvetica-Normal", 0, 14)); // NOI18N
        checkbox_removeshutdown1.setText("Add default medialib retrieval");
        checkbox_removeshutdown1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbox_removeshutdown1ActionPerformed(evt);
            }
        });

        checkbox_removeshutdown2.setFont(new java.awt.Font("Helvetica-Normal", 0, 14)); // NOI18N
        checkbox_removeshutdown2.setText("Password protect settings (master lock)");
        checkbox_removeshutdown2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbox_removeshutdown2ActionPerformed(evt);
            }
        });

        checkbox_removeshutdown3.setFont(new java.awt.Font("Helvetica-Normal", 0, 14)); // NOI18N
        checkbox_removeshutdown3.setSelected(true);
        checkbox_removeshutdown3.setText("Simplify navigation");
        checkbox_removeshutdown3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbox_removeshutdown3ActionPerformed(evt);
            }
        });

        checkbox_removeshutdown4.setFont(new java.awt.Font("Helvetica-Normal", 0, 14)); // NOI18N
        checkbox_removeshutdown4.setSelected(true);
        checkbox_removeshutdown4.setText("Simplify exit dialog");
        checkbox_removeshutdown4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbox_removeshutdown4ActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Helvetica-Normal", 0, 14)); // NOI18N
        jTextField1.setText("technolink");

        jLabel1.setFont(new java.awt.Font("Helvetica-Normal", 0, 14)); // NOI18N
        jLabel1.setText("Additional Options");

        btn_applycustom.setBackground(new java.awt.Color(51, 153, 255));
        btn_applycustom.setFont(new java.awt.Font("Helvetica-Normal", 0, 14)); // NOI18N
        btn_applycustom.setForeground(new java.awt.Color(255, 255, 255));
        btn_applycustom.setText("Apply custom setting & export");
        btn_applycustom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_applycustomMouseClicked(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Helvetica-Normal", 0, 14)); // NOI18N
        jTextField2.setText("http://medialib.technolink..u:80/music");

        jTextField3.setFont(new java.awt.Font("Helvetica-Normal", 0, 14)); // NOI18N
        jTextField3.setText("http://medialib.technolink..u:80/movies");

        jLabel2.setFont(new java.awt.Font("Helvetica-Normal", 0, 14)); // NOI18N
        jLabel2.setText("Library informations:");

        jTextField4.setFont(new java.awt.Font("Helvetica-Normal", 0, 14)); // NOI18N
        jTextField4.setText("technolink");

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(checkbox_removeshutdown2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jTextField1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btn_applyall, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkbox_removeshutdown, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkbox_removeshutdown3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(checkbox_removeshutdown4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(checkbox_removeshutdown1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(btn_applycustom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(165, 165, 165))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(checkbox_removeshutdown1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7))
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(checkbox_removeshutdown4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(checkbox_removeshutdown3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(checkbox_removeshutdown)))
                .addComponent(btn_applycustom, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_applyall, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkbox_removeshutdown2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        textArea_log.setEditable(false);
        textArea_log.setEnabled(false);
        textArea_log.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N

        jMenu1.setText("File");

        jMenuItem1.setText("Open...");
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator3);

        item_exit.setText("Exit");
        item_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                item_exitMousePressed(evt);
            }
        });
        item_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_exitActionPerformed(evt);
            }
        });
        jMenu1.add(item_exit);
        jMenu1.add(jSeparator2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Check...");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu2MousePressed(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setText("About");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textArea_log, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(textArea_log, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(738, 639));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void checkbox_removeshutdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbox_removeshutdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkbox_removeshutdownActionPerformed

    private void checkbox_removeshutdown1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbox_removeshutdown1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkbox_removeshutdown1ActionPerformed

    private void checkbox_removeshutdown2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbox_removeshutdown2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkbox_removeshutdown2ActionPerformed

    private void checkbox_removeshutdown3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbox_removeshutdown3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkbox_removeshutdown3ActionPerformed

    private void checkbox_removeshutdown4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbox_removeshutdown4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkbox_removeshutdown4ActionPerformed

    private void btn_applycustomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_applycustomMouseClicked
        myHandler.test();
    }//GEN-LAST:event_btn_applycustomMouseClicked

    private void item_exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_exitMousePressed
        try {
            textArea_log.append(myHandler.getTime()+myHandler.getLog(0));
            Thread.sleep(1000);
            // Clean up temp files if necessary
            textArea_log.append(myHandler.getTime()+myHandler.getLog(49));
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            Logger.getLogger(Mainframe.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.exit(0); //calling the method is a must
    }//GEN-LAST:event_item_exitMousePressed

    private void item_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_exitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item_exitActionPerformed

    private void jMenu2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MousePressed
        try {
            VersionCheck myVersionCheck = new VersionCheck();
        } catch (MalformedURLException ex) {
            Logger.getLogger(Mainframe.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_jMenu2MousePressed

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
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mainframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_applyall;
    private javax.swing.JButton btn_applycustom;
    private javax.swing.JCheckBox checkbox_removeshutdown;
    private javax.swing.JCheckBox checkbox_removeshutdown1;
    private javax.swing.JCheckBox checkbox_removeshutdown2;
    private javax.swing.JCheckBox checkbox_removeshutdown3;
    private javax.swing.JCheckBox checkbox_removeshutdown4;
    private javax.swing.JMenuItem item_exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private java.awt.TextArea textArea_log;
    // End of variables declaration//GEN-END:variables
}
