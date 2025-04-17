/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyEvent;
import koneksi.koneksi;

/**
 *
 * @author martinaron
 */
public class kasir extends javax.swing.JFrame {

    private Connection conn = new koneksi().connect();
    private DefaultTableModel tabmode;
    /**
     * Creates new form kasir
     */
    public kasir() {
        initComponents();
        kosong();
        aktif();
        datatable();
    }
    
    //    method aktif
    protected void aktif() {
        txt_idKasir.requestFocus();
    }
    
    //    method kosong
    protected void kosong() {
        txt_idKasir.setText("");
        txt_nmKasir.setText("");
        txt_telpKasir.setText("");
        txt_alamatKasir.setText("");
        txtcari.setText("");
        jns_kelamin.clearSelection();
    }
    
    //    data table dan cari
    protected void datatable() {
        Object[] baris = {"ID Kasir", "Nama Kasir", "Jenis Kelamin", "No. Telepon", "Agama", "Alamat", "Kata Sandi"};
        tabmode = new DefaultTableModel(null, baris);
        String cariitem = txtcari.getText();
        
        try {
            String sql = "SELECT * FROM tb_kasir where id like '%"+cariitem+"%' or nm_kasir like '%"+cariitem+"%' order by id asc";
            Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                tabmode.addRow(new Object[] {
                    hasil.getString(1),
                    hasil.getString(2),
                    hasil.getString(3),
                    hasil.getString(4),
                    hasil.getString(5),
                    hasil.getString(6),
                    hasil.getString(7)
            });
            }
            tbl_kasir.setModel(tabmode);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Data gagal dipanggil" + e);
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jns_kelamin = new javax.swing.ButtonGroup();
        bubah = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        bkeluar = new javax.swing.JButton();
        rpria = new javax.swing.JRadioButton();
        rwanita = new javax.swing.JRadioButton();
        bhapus = new javax.swing.JButton();
        bsimpan = new javax.swing.JButton();
        bbatal = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_kasir = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_idKasir = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_nmKasir = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_telpKasir = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtcari = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_alamatKasir = new javax.swing.JTextArea();
        bcari = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txt_agamaKasir = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        passKasir = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bubah.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bubah.setText("UBAH DATA");
        bubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bubahActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(240, 225, 181));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Jenis Kelamin");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        bkeluar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bkeluar.setText("KELUAR");
        bkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkeluarActionPerformed(evt);
            }
        });

        jns_kelamin.add(rpria);
        rpria.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rpria.setText("PRIA");
        rpria.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jns_kelamin.add(rwanita);
        rwanita.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rwanita.setText("WANITA");
        rwanita.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        bhapus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bhapus.setText("HAPUS DATA");
        bhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhapusActionPerformed(evt);
            }
        });

        bsimpan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bsimpan.setText("SIMPAN");
        bsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsimpanActionPerformed(evt);
            }
        });

        bbatal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bbatal.setText("BATAL");
        bbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbatalActionPerformed(evt);
            }
        });

        tbl_kasir.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_kasir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_kasirMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_kasir);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("TABEL DATA KASIR");

        jLabel1.setBackground(new java.awt.Color(240, 225, 181));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("DATA KASIR");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setBackground(new java.awt.Color(240, 225, 181));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("ID Kasir");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel3.setBackground(new java.awt.Color(240, 225, 181));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Nama Kasir");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel4.setBackground(new java.awt.Color(240, 225, 181));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("No. Telepon");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel5.setBackground(new java.awt.Color(240, 225, 181));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Alamat");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcariActionPerformed(evt);
            }
        });
        txtcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcariKeyPressed(evt);
            }
        });

        txt_alamatKasir.setColumns(20);
        txt_alamatKasir.setRows(5);
        jScrollPane1.setViewportView(txt_alamatKasir);

        bcari.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bcari.setText("CARI");
        bcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcariActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(240, 225, 181));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Agama");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel9.setBackground(new java.awt.Color(240, 225, 181));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Kata Sandi");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        passKasir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passKasirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(396, 396, 396))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bkeluar)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(bcari))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bubah)
                                .addGap(18, 18, 18)
                                .addComponent(bhapus))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9)
                            .addComponent(bsimpan)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txt_agamaKasir, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel4))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(rpria)
                                            .addGap(31, 31, 31)
                                            .addComponent(rwanita))
                                        .addComponent(txt_telpKasir)
                                        .addComponent(txt_nmKasir)
                                        .addComponent(txt_idKasir, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passKasir, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bbatal))))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_idKasir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nmKasir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(rpria)
                    .addComponent(rwanita))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_telpKasir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_agamaKasir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passKasir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bbatal)
                    .addComponent(bsimpan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bcari))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bubah)
                            .addComponent(bhapus)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(72, 72, 72)
                .addComponent(bkeluar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsimpanActionPerformed
        // TODO add your handling code here:
        // tombol simpan         
        String jns_kelamin = null;
        if (rpria.isSelected()) {
            jns_kelamin = "Pria";
        } else if (rwanita.isSelected()) {
            jns_kelamin = "Wanita";
        }
        String sql = "insert into tb_kasir values (?,?,?,?,?,?,?)";
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, txt_idKasir.getText());
            stat.setString(2, txt_nmKasir.getText());
            stat.setString(3, jns_kelamin);
            stat.setString(4, txt_telpKasir.getText());
            stat.setString(5, txt_agamaKasir.getText());
            stat.setString(6, txt_alamatKasir.getText());
            stat.setString(7, passKasir.getText());
           
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null,"data berhasil disimpan");
            kosong();
            txt_idKasir.requestFocus();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "data gagal disimpan" + e);
        }
        datatable();
    }//GEN-LAST:event_bsimpanActionPerformed

    private void txtcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcariActionPerformed

    private void bbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbatalActionPerformed
        // TODO add your handling code here:
        kosong();
        datatable();
    }//GEN-LAST:event_bbatalActionPerformed

    private void bcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcariActionPerformed
        // TODO add your handling code here:
        datatable();
    }//GEN-LAST:event_bcariActionPerformed

    private void bubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bubahActionPerformed
        // TODO add your handling code here:
         String jns_kelamin = null;
        if (rpria.isSelected()) {
            jns_kelamin = "Pria";
        } else if (rwanita.isSelected()) {
            jns_kelamin = "Wanita";
        }
        
         try {
        String sql = "update tb_kasir set nm_kasir=?, jns_kelamin=?, no_telepon=?, agama=?, alamat=?, kata_sandi=? where id_kasir='"+txt_idKasir.getText()+"'";
       
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, txt_nmKasir.getText());
            stat.setString(2, jns_kelamin);
            stat.setString(3, txt_telpKasir.getText());
            stat.setString(4, txt_alamatKasir.getText());
            
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null,"data berhasil diubah");
            kosong();
            txt_idKasir.requestFocus();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "data gagal diubah" + e);
        }
        datatable();
    }//GEN-LAST:event_bubahActionPerformed

    private void bhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhapusActionPerformed
        // TODO add your handling code here:
         int oke = JOptionPane.showConfirmDialog(null,"Hapus Data Ini?", "Konfirmasi Penghapusan Data", JOptionPane.YES_NO_OPTION);
            if (oke == 0) {
                String sql = "delete from tb_kasir where id ='"+txt_idKasir.getText()+"'";
                try {
                    PreparedStatement stat = conn.prepareStatement(sql);
                    stat.executeUpdate();
                    JOptionPane.showMessageDialog(null, "data berhasil dihapus");
                    kosong();
                    txt_idKasir.requestFocus();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "data gagal dihapus" + e);
                }
                datatable();
            }
    }//GEN-LAST:event_bhapusActionPerformed

    private void bkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkeluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_bkeluarActionPerformed

    private void tbl_kasirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_kasirMouseClicked
        // TODO add your handling code here:
       int bar = tbl_kasir.getSelectedRow();
       String a = tabmode.getValueAt(bar, 0).toString();
       String b = tabmode.getValueAt(bar, 1).toString();
       String c = tabmode.getValueAt(bar, 2).toString();
       String d = tabmode.getValueAt(bar, 3).toString();
       String e = tabmode.getValueAt(bar, 4).toString();
       String f = tabmode.getValueAt(bar, 5).toString();
       String g = tabmode.getValueAt(bar, 6).toString();
       
       txt_idKasir.setText(a);
       txt_nmKasir.setText(b);
       if ("Pria".equals(c)) {
            rpria.setSelected(true);
       } else {
            rwanita.setSelected(true);
       }
       
       txt_telpKasir.setText(d);
       txt_agamaKasir.setText(e);
       txt_alamatKasir.setText(f);
       passKasir.setText(g);
    }//GEN-LAST:event_tbl_kasirMouseClicked

    private void txtcariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcariKeyPressed
        // TODO add your handling code here:
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
           datatable();
       }
    }//GEN-LAST:event_txtcariKeyPressed

    private void passKasirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passKasirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passKasirActionPerformed

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
            java.util.logging.Logger.getLogger(kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kasir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bbatal;
    private javax.swing.JButton bcari;
    private javax.swing.JButton bhapus;
    private javax.swing.JButton bkeluar;
    private javax.swing.JButton bsimpan;
    private javax.swing.JButton bubah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.ButtonGroup jns_kelamin;
    private javax.swing.JPasswordField passKasir;
    private javax.swing.JRadioButton rpria;
    private javax.swing.JRadioButton rwanita;
    private javax.swing.JTable tbl_kasir;
    private javax.swing.JTextField txt_agamaKasir;
    private javax.swing.JTextArea txt_alamatKasir;
    private javax.swing.JTextField txt_idKasir;
    private javax.swing.JTextField txt_nmKasir;
    private javax.swing.JTextField txt_telpKasir;
    private javax.swing.JTextField txtcari;
    // End of variables declaration//GEN-END:variables
}
