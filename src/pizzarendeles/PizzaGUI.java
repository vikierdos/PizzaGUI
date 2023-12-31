package pizzarendeles;

import javax.swing.JOptionPane;

public class PizzaGUI extends javax.swing.JFrame {

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
        btn_rendeles = new javax.swing.JButton();
        lbl_udito = new javax.swing.JLabel();
        cmbbx_udito = new javax.swing.JComboBox<>();
        lbl_darab = new javax.swing.JLabel();
        lbl_ar = new javax.swing.JLabel();
        lbl_arszam = new javax.swing.JLabel();
        txt_darab = new javax.swing.JTextField();

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

        cmbbx_pizza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<<Alap Pizza >>", "Margherita", "Hús Imádó", "Vegetáriánus", "Vegán", "Tenger Gyümölcse" }));
        cmbbx_pizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbbx_pizzaActionPerformed(evt);
            }
        });

        pnl_feltet.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Plusz Feltét"));

        chkbx_ananasz.setText("Ananász");

        chkbx_cheddar.setText("Cheddar");

        chkbx_gomba.setText("Gomba");

        chkbx_tojas.setText("Főtt Tojás");

        chkbx_tejfol.setText("Tejföl");

        chkbox_pepperone.setText("Pepperone");

        chkbx_kukorica.setText("Kukorica");

        chkbx_bbq.setText("BBQ szósz");

        chkbx_csirke.setText("Csirke");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbl_pizzakep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/New-York-Style-Pizza-Thumbnail1-scaled.jpg"))); // NOI18N

        btn_rendeles.setText("Rendelés");
        btn_rendeles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rendelesActionPerformed(evt);
            }
        });

        lbl_udito.setText("Ajándék üdítő:");

        cmbbx_udito.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<< Üdítő >>", "Coca-Cola", "Sprite", "Fanta", "Coca-Cola Zero" }));

        lbl_darab.setText("Darab:");

        lbl_ar.setText("Ár:");

        lbl_arszam.setText("2500");

        txt_darab.setColumns(1);
        txt_darab.setText("1");
        txt_darab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_darabActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_pizzakep)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_rendeles, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_udito)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_ar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_arszam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_darab)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_darab, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmbbx_udito, javax.swing.GroupLayout.Alignment.TRAILING, 0, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(pnl_teszta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnl_alap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(pnl_feltet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(cmbbx_pizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {pnl_alap, pnl_teszta});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_alap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_teszta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(cmbbx_pizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnl_feltet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_udito)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbbx_udito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_darab)
                            .addComponent(txt_darab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_ar)
                            .addComponent(lbl_arszam))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_rendeles))
                    .addComponent(lbl_pizzakep))
                .addGap(16, 16, 16))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbbx_pizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbbx_pizzaActionPerformed

    }//GEN-LAST:event_cmbbx_pizzaActionPerformed

    private void btn_rendelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rendelesActionPerformed
        JOptionPane.showMessageDialog(rootPane, "A pizzádat hamarosan szállítjuk!");
        
    }//GEN-LAST:event_btn_rendelesActionPerformed

    private void txt_darabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_darabActionPerformed
        int darab = Integer.parseInt(txt_darab.getText());
        int ar = darab * 2500;
        lbl_arszam.setText(Integer.toString(ar));
    }//GEN-LAST:event_txt_darabActionPerformed

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
    private javax.swing.JComboBox<String> cmbbx_udito;
    private javax.swing.JLabel lbl_ar;
    private javax.swing.JLabel lbl_arszam;
    private javax.swing.JLabel lbl_darab;
    private javax.swing.JLabel lbl_pizzakep;
    private javax.swing.JLabel lbl_udito;
    private javax.swing.JPanel pnl_alap;
    private javax.swing.JPanel pnl_feltet;
    private javax.swing.JPanel pnl_teszta;
    private javax.swing.JRadioButton rdbtn_kozepes;
    private javax.swing.JRadioButton rdbtn_paradicsomos;
    private javax.swing.JRadioButton rdbtn_tejfolos;
    private javax.swing.JRadioButton rdbtn_vastag;
    private javax.swing.JRadioButton rdbtn_vekony;
    private javax.swing.JTextField txt_darab;
    // End of variables declaration//GEN-END:variables
}
