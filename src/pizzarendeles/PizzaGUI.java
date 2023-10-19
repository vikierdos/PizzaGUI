/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pizzarendeles;

import javax.swing.JOptionPane;

/**
 *
 * @author csics
 */
public class PizzaGUI extends javax.swing.JFrame {

    /**
     * Creates new form PizzaGUI
     */
    public PizzaGUI() {
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

        btngrp_teszta = new javax.swing.ButtonGroup();
        btngrp_alap = new javax.swing.ButtonGroup();
        pnl_teszta = new javax.swing.JPanel();
        rdbtn_vekony = new javax.swing.JRadioButton();
        rdbtn_kozepes = new javax.swing.JRadioButton();
        rdbtn_vastag = new javax.swing.JRadioButton();
        pnl_alap = new javax.swing.JPanel();
        rdbtn_tejfolos = new javax.swing.JRadioButton();
        rdbtn_paradicsomos = new javax.swing.JRadioButton();
        lbl_ar = new javax.swing.JLabel();
        cmbbx_pizza = new javax.swing.JComboBox<>();
        pnl_feltet = new javax.swing.JPanel();
        chkbx_ananasz = new javax.swing.JCheckBox();
        chkbx_cheddar = new javax.swing.JCheckBox();
        chkbx_gomba = new javax.swing.JCheckBox();
        chkbx_tojas = new javax.swing.JCheckBox();
        chkbx_tejfol = new javax.swing.JCheckBox();
        chkbox_pepperone = new javax.swing.JCheckBox();
        chkbx_kukorica = new javax.swing.JCheckBox();
        chkbx_bbq = new javax.swing.JCheckBox();
        chkbx_csirke = new javax.swing.JCheckBox();
        lbl_pizzakep = new javax.swing.JLabel();
        spnr_ar = new javax.swing.JSpinner();
        btn_rendeles = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pizza Rendelő");
        setBackground(new java.awt.Color(214, 195, 167));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        pnl_teszta.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Tészta"));

        btngrp_teszta.add(rdbtn_vekony);
        rdbtn_vekony.setText("Vékony");

        btngrp_teszta.add(rdbtn_kozepes);
        rdbtn_kozepes.setSelected(true);
        rdbtn_kozepes.setText("Közepes");

        btngrp_teszta.add(rdbtn_vastag);
        rdbtn_vastag.setText("Vastag");

        javax.swing.GroupLayout pnl_tesztaLayout = new javax.swing.GroupLayout(pnl_teszta);
        pnl_teszta.setLayout(pnl_tesztaLayout);
        pnl_tesztaLayout.setHorizontalGroup(
            pnl_tesztaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_tesztaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_tesztaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdbtn_vekony)
                    .addComponent(rdbtn_kozepes)
                    .addComponent(rdbtn_vastag))
                .addContainerGap())
        );
        pnl_tesztaLayout.setVerticalGroup(
            pnl_tesztaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_tesztaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdbtn_vekony)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdbtn_kozepes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdbtn_vastag)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pnl_alap.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Alap"));

        btngrp_alap.add(rdbtn_tejfolos);
        rdbtn_tejfolos.setText("Tejfölös");

        btngrp_alap.add(rdbtn_paradicsomos);
        rdbtn_paradicsomos.setSelected(true);
        rdbtn_paradicsomos.setText("Paradicsomos");

        javax.swing.GroupLayout pnl_alapLayout = new javax.swing.GroupLayout(pnl_alap);
        pnl_alap.setLayout(pnl_alapLayout);
        pnl_alapLayout.setHorizontalGroup(
            pnl_alapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_alapLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_alapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdbtn_paradicsomos)
                    .addComponent(rdbtn_tejfolos))
                .addContainerGap())
        );
        pnl_alapLayout.setVerticalGroup(
            pnl_alapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_alapLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdbtn_paradicsomos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdbtn_tejfolos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbl_ar.setText("Ár: ");

        cmbbx_pizza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<<Alap Pizza >>", "Margherita", "Hús Imádó", "Vegetáriánus", "Vegán", "Tenger Gyümölcse" }));
        cmbbx_pizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbbx_pizzaActionPerformed(evt);
            }
        });

        pnl_feltet.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Plusz Feltét"));

        chkbx_ananasz.setText("Ananász");
        chkbx_ananasz.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                chkbx_ananaszFocusGained(evt);
            }
        });

        chkbx_cheddar.setText("Cheddar");
        chkbx_cheddar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                chkbx_cheddarFocusGained(evt);
            }
        });

        chkbx_gomba.setText("Gomba");
        chkbx_gomba.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                chkbx_gombaFocusGained(evt);
            }
        });

        chkbx_tojas.setText("Főtt Tojás");
        chkbx_tojas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                chkbx_tojasFocusGained(evt);
            }
        });

        chkbx_tejfol.setText("Tejföl");
        chkbx_tejfol.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                chkbx_tejfolFocusGained(evt);
            }
        });

        chkbox_pepperone.setText("Pepperone");
        chkbox_pepperone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                chkbox_pepperoneFocusGained(evt);
            }
        });

        chkbx_kukorica.setText("Kukorica");
        chkbx_kukorica.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                chkbx_kukoricaFocusGained(evt);
            }
        });

        chkbx_bbq.setText("BBQ szósz");
        chkbx_bbq.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                chkbx_bbqFocusGained(evt);
            }
        });

        chkbx_csirke.setText("Csirke");
        chkbx_csirke.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                chkbx_csirkeFocusGained(evt);
            }
        });

        javax.swing.GroupLayout pnl_feltetLayout = new javax.swing.GroupLayout(pnl_feltet);
        pnl_feltet.setLayout(pnl_feltetLayout);
        pnl_feltetLayout.setHorizontalGroup(
            pnl_feltetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_feltetLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_feltetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkbx_ananasz)
                    .addComponent(chkbx_gomba)
                    .addComponent(chkbx_kukorica))
                .addGap(42, 42, 42)
                .addGroup(pnl_feltetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkbx_tojas)
                    .addComponent(chkbx_cheddar)
                    .addComponent(chkbx_tejfol))
                .addGap(24, 24, 24)
                .addGroup(pnl_feltetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkbox_pepperone)
                    .addComponent(chkbx_bbq)
                    .addComponent(chkbx_csirke))
                .addGap(0, 6, Short.MAX_VALUE))
        );
        pnl_feltetLayout.setVerticalGroup(
            pnl_feltetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_feltetLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_feltetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkbx_ananasz)
                    .addComponent(chkbx_tejfol)
                    .addComponent(chkbox_pepperone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_feltetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkbx_gomba)
                    .addComponent(chkbx_cheddar)
                    .addComponent(chkbx_bbq))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_feltetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkbx_tojas)
                    .addComponent(chkbx_csirke)
                    .addComponent(chkbx_kukorica))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        lbl_pizzakep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/New-York-Style-Pizza-Thumbnail1-scaled.jpg"))); // NOI18N

        spnr_ar.setEnabled(false);

        btn_rendeles.setText("Rendelés");
        btn_rendeles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rendelesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pnl_teszta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pnl_alap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pnl_feltet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_pizzakep)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_ar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spnr_ar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_rendeles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(13, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(cmbbx_pizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {pnl_alap, pnl_teszta});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_alap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_teszta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(cmbbx_pizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnl_feltet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_pizzakep)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spnr_ar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_ar))
                        .addGap(18, 18, 18)
                        .addComponent(btn_rendeles)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbbx_pizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbbx_pizzaActionPerformed
        
        spnr_ar.setValue(2700);
    }//GEN-LAST:event_cmbbx_pizzaActionPerformed

    private void chkbx_ananaszFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_chkbx_ananaszFocusGained
        int ar = Integer.parseInt(spnr_ar.getValue().toString())+200;
        spnr_ar.setValue(ar);
    }//GEN-LAST:event_chkbx_ananaszFocusGained

    private void chkbx_gombaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_chkbx_gombaFocusGained
        int ar = Integer.parseInt(spnr_ar.getValue().toString())+200;
        spnr_ar.setValue(ar);
    }//GEN-LAST:event_chkbx_gombaFocusGained

    private void chkbx_kukoricaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_chkbx_kukoricaFocusGained
       int ar = Integer.parseInt(spnr_ar.getValue().toString())+200;
       spnr_ar.setValue(ar);
    }//GEN-LAST:event_chkbx_kukoricaFocusGained

    private void chkbx_tejfolFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_chkbx_tejfolFocusGained
        int ar = Integer.parseInt(spnr_ar.getValue().toString())+200;
        spnr_ar.setValue(ar);
    }//GEN-LAST:event_chkbx_tejfolFocusGained

    private void chkbx_cheddarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_chkbx_cheddarFocusGained
        int ar = Integer.parseInt(spnr_ar.getValue().toString())+200;
        spnr_ar.setValue(ar);
    }//GEN-LAST:event_chkbx_cheddarFocusGained

    private void chkbx_tojasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_chkbx_tojasFocusGained
        int ar = Integer.parseInt(spnr_ar.getValue().toString())+200;
        spnr_ar.setValue(ar);
    }//GEN-LAST:event_chkbx_tojasFocusGained

    private void chkbox_pepperoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_chkbox_pepperoneFocusGained
        int ar = Integer.parseInt(spnr_ar.getValue().toString())+200;
        spnr_ar.setValue(ar);
    }//GEN-LAST:event_chkbox_pepperoneFocusGained

    private void chkbx_bbqFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_chkbx_bbqFocusGained
        int ar = Integer.parseInt(spnr_ar.getValue().toString())+200;
        spnr_ar.setValue(ar);
    }//GEN-LAST:event_chkbx_bbqFocusGained

    private void chkbx_csirkeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_chkbx_csirkeFocusGained
        int ar = Integer.parseInt(spnr_ar.getValue().toString())+200;
        spnr_ar.setValue(ar);
    }//GEN-LAST:event_chkbx_csirkeFocusGained

    private void btn_rendelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rendelesActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Tesztverzió!", "Cím", 2);
    }//GEN-LAST:event_btn_rendelesActionPerformed

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
            java.util.logging.Logger.getLogger(PizzaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PizzaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PizzaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PizzaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PizzaGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_rendeles;
    private javax.swing.ButtonGroup btngrp_alap;
    private javax.swing.ButtonGroup btngrp_teszta;
    private javax.swing.JCheckBox chkbox_pepperone;
    private javax.swing.JCheckBox chkbx_ananasz;
    private javax.swing.JCheckBox chkbx_bbq;
    private javax.swing.JCheckBox chkbx_cheddar;
    private javax.swing.JCheckBox chkbx_csirke;
    private javax.swing.JCheckBox chkbx_gomba;
    private javax.swing.JCheckBox chkbx_kukorica;
    private javax.swing.JCheckBox chkbx_tejfol;
    private javax.swing.JCheckBox chkbx_tojas;
    private javax.swing.JComboBox<String> cmbbx_pizza;
    private javax.swing.JLabel lbl_ar;
    private javax.swing.JLabel lbl_pizzakep;
    private javax.swing.JPanel pnl_alap;
    private javax.swing.JPanel pnl_feltet;
    private javax.swing.JPanel pnl_teszta;
    private javax.swing.JRadioButton rdbtn_kozepes;
    private javax.swing.JRadioButton rdbtn_paradicsomos;
    private javax.swing.JRadioButton rdbtn_tejfolos;
    private javax.swing.JRadioButton rdbtn_vastag;
    private javax.swing.JRadioButton rdbtn_vekony;
    private javax.swing.JSpinner spnr_ar;
    // End of variables declaration//GEN-END:variables
}
