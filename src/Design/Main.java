/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design;

import Helper.Win10UI;
import Main.Member;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JMenuBar;
import javax.swing.plaf.basic.BasicMenuBarUI;





/**
 *
 * @author Çağrı
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    
   

    private Win10UI modernUI = new Win10UI();
    private Member member = new Member();
    JMenuBar bar = new JMenuBar();
    
    
    private void color(){
        jMenuBar1.setUI ( new BasicMenuBarUI (){
    @Override
    public void paint ( Graphics g, JComponent c ){
       g.setColor ( new Color(225, 162, 129) );
       g.fillRect ( 0, 0, c.getWidth (), c.getHeight () );
    }
} );
    }
    
    public void control (){
        if (member.getMemberID() > 0 ){
           // new Main().setVisible(true);
            System.out.println(member.getMemberID());
            menu_editBook.setVisible(false);
            menu_editMember.setVisible(false);
            menu_borrowBook.setVisible(true);
            menu_searchBook.setVisible(true);
            item_viewBook.setVisible(false);
        }
    }
    
    public Main() {
        modernUI.modernDesign();
        initComponents();
        control();
        color();
       
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
        btn_exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_editBook = new javax.swing.JMenu();
        item_addBook = new javax.swing.JMenuItem();
        item_editBook = new javax.swing.JMenuItem();
        menu_borrowBook = new javax.swing.JMenu();
        item_borrowBook = new javax.swing.JMenuItem();
        item_returnBook = new javax.swing.JMenuItem();
        item_viewBook = new javax.swing.JMenuItem();
        menu_searchBook = new javax.swing.JMenu();
        menu_editMember = new javax.swing.JMenu();
        item_addMember = new javax.swing.JMenuItem();
        item_editMember = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_exit.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        btn_exit.setText("Çıkış");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });
        jPanel1.add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 880, 140, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jMenuBar1.setPreferredSize(new java.awt.Dimension(0, 55));

        menu_editBook.setBackground(new java.awt.Color(253, 219, 188));
        menu_editBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_books_48px.png"))); // NOI18N
        menu_editBook.setText("Kitap Düzenleme İşlemleri");
        menu_editBook.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        item_addBook.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        item_addBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_add_book_40px.png"))); // NOI18N
        item_addBook.setText("Kitap Ekle ");
        item_addBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_addBookActionPerformed(evt);
            }
        });
        menu_editBook.add(item_addBook);

        item_editBook.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        item_editBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_book_and_pencil_40px.png"))); // NOI18N
        item_editBook.setText("Kitap Bilgilerini Düzenle");
        item_editBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_editBookActionPerformed(evt);
            }
        });
        menu_editBook.add(item_editBook);

        jMenuBar1.add(menu_editBook);

        menu_borrowBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_borrow_book_48px.png"))); // NOI18N
        menu_borrowBook.setText("Kitap Ödünç İşlemleri");
        menu_borrowBook.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        item_borrowBook.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        item_borrowBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_borrow_book_40px.png"))); // NOI18N
        item_borrowBook.setText("Kitap Ödünç Al");
        item_borrowBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_borrowBookActionPerformed(evt);
            }
        });
        menu_borrowBook.add(item_borrowBook);

        item_returnBook.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        item_returnBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_return_book_40px.png"))); // NOI18N
        item_returnBook.setText("Kitabı Geri Ver");
        item_returnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_returnBookActionPerformed(evt);
            }
        });
        menu_borrowBook.add(item_returnBook);

        item_viewBook.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        item_viewBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_combo_chart_40px.png"))); // NOI18N
        item_viewBook.setText("İstatistikleri Görüntüle");
        item_viewBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_viewBookActionPerformed(evt);
            }
        });
        menu_borrowBook.add(item_viewBook);

        jMenuBar1.add(menu_borrowBook);

        menu_searchBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search_book_48px_1.png"))); // NOI18N
        menu_searchBook.setText("Kitap Arama");
        menu_searchBook.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menu_searchBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_searchBookMouseClicked(evt);
            }
        });
        jMenuBar1.add(menu_searchBook);

        menu_editMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_account_48px.png"))); // NOI18N
        menu_editMember.setText("Kullanıcı İşlemleri");
        menu_editMember.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        item_addMember.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        item_addMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_add_user_group_woman_man_40px.png"))); // NOI18N
        item_addMember.setText("Kullanıcı Ekle");
        item_addMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_addMemberActionPerformed(evt);
            }
        });
        menu_editMember.add(item_addMember);

        item_editMember.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        item_editMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_more_info_40px.png"))); // NOI18N
        item_editMember.setText("Kullanıcı Bilgilerini Düzenle");
        item_editMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_editMemberActionPerformed(evt);
            }
        });
        menu_editMember.add(item_editMember);

        jMenuBar1.add(menu_editMember);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void item_addBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_addBookActionPerformed
        AddBook addBook = new AddBook();
        addBook.setVisible(true);
        
    }//GEN-LAST:event_item_addBookActionPerformed

    private void item_editBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_editBookActionPerformed
        try {
            new EditBook().setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_item_editBookActionPerformed

    private void item_borrowBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_borrowBookActionPerformed
        try {
            new Borrow().setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_item_borrowBookActionPerformed

    private void item_returnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_returnBookActionPerformed
        try {
            new ReturnBook().setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_item_returnBookActionPerformed

    private void item_viewBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_viewBookActionPerformed
        try {
            new ViewBook().setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_item_viewBookActionPerformed

    private void menu_searchBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_searchBookMouseClicked
        try {
            new SearchBook().setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_menu_searchBookMouseClicked

    private void item_addMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_addMemberActionPerformed
        try {
            new AddMember().setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_item_addMemberActionPerformed

    private void item_editMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_editMemberActionPerformed
        try {
            new EditMember().setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_item_editMemberActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_exitActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_exit;
    private javax.swing.JMenuItem item_addBook;
    private javax.swing.JMenuItem item_addMember;
    private javax.swing.JMenuItem item_borrowBook;
    private javax.swing.JMenuItem item_editBook;
    private javax.swing.JMenuItem item_editMember;
    private javax.swing.JMenuItem item_returnBook;
    private javax.swing.JMenuItem item_viewBook;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menu_borrowBook;
    private javax.swing.JMenu menu_editBook;
    private javax.swing.JMenu menu_editMember;
    private javax.swing.JMenu menu_searchBook;
    // End of variables declaration//GEN-END:variables
}
