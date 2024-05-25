/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JTable;
import javax.swing.JTextField;
import controller.DataPenitipanController;

/**
 *
 * @author Lab Informatika
 */
public class MainView extends javax.swing.JFrame {

    /**
     * Creates new form MainView
     */
    DataPenitipanController dpc;
    public MainView() {
        initComponents();
        dpc = new DataPenitipanController(this);
        dpc.isiTabel();
    }
    private int selectedId;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableDataPenitipan = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfNamaPemilik = new javax.swing.JTextField();
        tfNamaHewan = new javax.swing.JTextField();
        tfJenisHewan = new javax.swing.JTextField();
        tfNomorTelepon = new javax.swing.JTextField();
        tfDurasiTitip = new javax.swing.JTextField();
        buttonInsert = new javax.swing.JButton();
        buttonUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableDataPenitipan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Tittle 5", "Tittle 6", "Tittle 7"
            }
        ));
        tableDataPenitipan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDataPenitipanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableDataPenitipan);

        jLabel1.setText(" Nama Pemilik :");

        jLabel2.setText("Nama Hewan :");

        jLabel3.setText("Jenis Hewan :");

        jLabel4.setText("NomorTelepon :");

        jLabel5.setText("Durasi Titip :");

        tfNamaPemilik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNamaPemilikActionPerformed(evt);
            }
        });

        tfJenisHewan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfJenisHewanActionPerformed(evt);
            }
        });

        tfDurasiTitip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDurasiTitipActionPerformed(evt);
            }
        });

        buttonInsert.setText("Add");
        buttonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInsertActionPerformed(evt);
            }
        });

        buttonUpdate.setText("update");
        buttonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(buttonInsert))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNomorTelepon)
                            .addComponent(tfDurasiTitip)
                            .addComponent(tfNamaPemilik, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNamaHewan)
                            .addComponent(tfJenisHewan))
                        .addGap(193, 193, 193))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(buttonUpdate)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tfNamaPemilik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfNamaHewan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfJenisHewan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tfNomorTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tfDurasiTitip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(buttonInsert)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonUpdate))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNamaPemilikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNamaPemilikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNamaPemilikActionPerformed

    private void tfDurasiTitipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDurasiTitipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDurasiTitipActionPerformed

    private void tfJenisHewanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfJenisHewanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfJenisHewanActionPerformed

    private void buttonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInsertActionPerformed
        // TODO add your handling code here:
        dpc.insert();
        dpc.isiTabel();
    }//GEN-LAST:event_buttonInsertActionPerformed

    private void buttonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdateActionPerformed
        // TODO add your handling code here:
        dpc.update();
        dpc.isiTabel();
    }//GEN-LAST:event_buttonUpdateActionPerformed

    private void tableDataPenitipanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDataPenitipanMouseClicked
        // TODO add your handling code here:
        int baris = tableDataPenitipan.getSelectedRow();
        
        selectedId = (Integer.parseInt(tableDataPenitipan.getValueAt(baris, 0).toString()));
    }//GEN-LAST:event_tableDataPenitipanMouseClicked

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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonInsert;
    private javax.swing.JButton buttonUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableDataPenitipan;
    private javax.swing.JTextField tfDurasiTitip;
    private javax.swing.JTextField tfJenisHewan;
    private javax.swing.JTextField tfNamaHewan;
    private javax.swing.JTextField tfNamaPemilik;
    private javax.swing.JTextField tfNomorTelepon;
    // End of variables declaration//GEN-END:variables

    public JTable getTableDataPenitipan() {
        return tableDataPenitipan;
    }

    public void setTableDataPenitipan(JTable tableDataPenitipan) {
        this.tableDataPenitipan = tableDataPenitipan;
    }

    public JTextField getTfDurasiTitip() {
        return tfDurasiTitip;
    }

    public void setTfDurasiTitip(JTextField tfDurasiTitip) {
        this.tfDurasiTitip = tfDurasiTitip;
    }

    public JTextField getTfJenisHewan() {
        return tfJenisHewan;
    }

    public void setTfJenisHewan(JTextField tfJenisHewan) {
        this.tfJenisHewan = tfJenisHewan;
    }

    public JTextField getTfNamaHewan() {
        return tfNamaHewan;
    }

    public void setTfNamaHewan(JTextField tfNamaHewan) {
        this.tfNamaHewan = tfNamaHewan;
    }

    public JTextField getTfNamaPemilik() {
        return tfNamaPemilik;
    }

    public void setTfNamaPemilik(JTextField tfNamaPemilik) {
        this.tfNamaPemilik = tfNamaPemilik;
    }

    public JTextField getTfNomorTelepon() {
        return tfNomorTelepon;
    }

    public void setTfNomorTelepon(JTextField tfNomorTelepon) {
        this.tfNomorTelepon = tfNomorTelepon;
    }
    
    
    //getter setter textField

    public int getSelectedId() {
        return selectedId;
    }
    
}
