
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class TOP_PUBG_1 extends javax.swing.JFrame {
            
    String GID = "GID051";
    
    public TOP_PUBG_1() {
        initComponents();
                
        White.setVisible(false);
        pan_Platform.setVisible(false);
        lab4_C.setVisible(false);
        
        new Thread(new Runnable() {
           @Override
           public void run() {
               
               int a = 1;
               while(a == 1) {
                   for(int i=1 ;i<=3 ;i++)
                   {
                       try {                                                               
                                Img.setIcon(new ImageIcon("C:\\Users\\Monika\\Documents\\NetBeansProjects\\Final Project\\src\\Cover_Images\\PUBG_1.jpg"));
                                                           
                                Thread.sleep(3000);
                                Img.setIcon(new ImageIcon("C:\\Users\\Monika\\Documents\\NetBeansProjects\\Final Project\\src\\Cover_Images\\PUBG_2.jpg"));
                                                          
                                Thread.sleep(3000);
                                Img.setIcon(new ImageIcon("C:\\Users\\Monika\\Documents\\NetBeansProjects\\Final Project\\src\\Cover_Images\\PUBG_3.jpg"));
                                                          
                                Thread.sleep(3000);
                                Img.setIcon(new ImageIcon("C:\\Users\\Monika\\Documents\\NetBeansProjects\\Final Project\\src\\Cover_Images\\PUBG_4.jpg"));
                                                          
                                Thread.sleep(3000);
                                Img.setIcon(new ImageIcon("C:\\Users\\Monika\\Documents\\NetBeansProjects\\Final Project\\src\\Cover_Images\\PUBG_5.png"));
                                
                                Thread.sleep(3000);
                            
                       } catch (InterruptedException e) {
                       }                       
                   } a++;                         
               }                                                        
           }                      
       }).start(); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        n1 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        Back1 = new javax.swing.JPanel();
        Code1 = new javax.swing.JLabel();
        Black = new javax.swing.JLabel();
        White = new javax.swing.JLabel();
        Origins = new javax.swing.JPanel();
        Image = new javax.swing.JPanel();
        pan_Platform = new javax.swing.JPanel();
        lab4 = new javax.swing.JLabel();
        lab4_C = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        XB = new javax.swing.JLabel();
        XB_1 = new javax.swing.JRadioButton();
        Img = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        P = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Sign = new javax.swing.JLabel();
        Platform = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(24, 24, 24));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        n1.setFont(new java.awt.Font("Unispace", 1, 48)); // NOI18N
        n1.setForeground(new java.awt.Color(255, 255, 255));
        n1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        n1.setText("Player's Unknown Battlegrounds");
        jPanel1.add(n1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1200, 70));

        l1.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        l1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 10, 90, 90));

        l2.setForeground(new java.awt.Color(24, 24, 24));
        jPanel1.add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 40, 20, 20));

        l3.setForeground(new java.awt.Color(24, 24, 24));
        jPanel1.add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 10, 20, 20));

        Back1.setBackground(new java.awt.Color(255, 255, 255));
        Back1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Back1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Code1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Code1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Code1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Code1MouseExited(evt);
            }
        });
        Back1.add(Code1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 35, 35));

        Black.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        Black.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Black.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Back1.png"))); // NOI18N
        Back1.add(Black, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 35, 35));

        White.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        White.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        White.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/White.png"))); // NOI18N
        Back1.add(White, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 35, 35));

        jPanel1.add(Back1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 35, 35));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 110));

        Origins.setBackground(new java.awt.Color(255, 255, 255));
        Origins.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Origins.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Image.setBackground(new java.awt.Color(255, 255, 255));
        Image.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Image.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pan_Platform.setBackground(new java.awt.Color(246, 246, 246));
        pan_Platform.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        pan_Platform.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab4.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        lab4.setForeground(new java.awt.Color(255, 0, 0));
        lab4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab4.setText("X");
        lab4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        lab4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lab4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lab4MouseExited(evt);
            }
        });
        pan_Platform.add(lab4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 30, 30));

        lab4_C.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        lab4_C.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab4_C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lab3_C.png"))); // NOI18N
        pan_Platform.add(lab4_C, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 30, 30));

        jLabel10.setFont(new java.awt.Font("Unispace", 0, 26)); // NOI18N
        jLabel10.setText("Select Platform");
        pan_Platform.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 250, 30));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        XB.setFont(new java.awt.Font("Unispace", 0, 24)); // NOI18N
        XB.setText("<html><body><b>PC</b><br> <font color = 'red'  size = 4>Rs. 3999");
        jPanel4.add(XB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 170, 50));

        XB_1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(XB_1);
        XB_1.setSelected(true);
        XB_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XB_1ActionPerformed(evt);
            }
        });
        jPanel4.add(XB_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 20, -1));

        pan_Platform.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 360, 90));

        Image.add(pan_Platform, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, 160));

        Img.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Image.add(Img, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 800, 500));

        Origins.add(Image, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 802, 502));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true), "Description", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Unispace", 0, 18), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Cambria", 0, 15)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("<html><body>PUBG is a player versus player shooter game in which up to one hundred players fight in a battle royale, a type of large-scale last man standing deathmatch where players fight to remain the last alive. Players can choose to enter the match solo, duo, or with a small team of up to four people.");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 36, 290, 130));

        Origins.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, 320, 180));

        P.setFont(new java.awt.Font("Unispace", 0, 24)); // NOI18N
        P.setForeground(new java.awt.Color(51, 153, 0));
        P.setText("3999");
        Origins.add(P, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 210, 80, 40));

        jButton1.setFont(new java.awt.Font("Unispace", 0, 22)); // NOI18N
        jButton1.setText("Place Order");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Origins.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 470, 190, 50));

        jLabel7.setFont(new java.awt.Font("Unispace", 0, 24)); // NOI18N
        jLabel7.setText("Rs.");
        Origins.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 210, -1, 40));

        Sign.setFont(new java.awt.Font("Roboto Light", 0, 15)); // NOI18N
        Sign.setText("(Selected)");
        Origins.add(Sign, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 290, 70, 20));

        Platform.setFont(new java.awt.Font("Unispace", 0, 18)); // NOI18N
        Platform.setText("<html><body>Platform Select :<br><b>PC</b>");
        Platform.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Platform.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Platform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlatformActionPerformed(evt);
            }
        });
        Origins.add(Platform, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 260, 320, 60));

        getContentPane().add(Origins, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1200, 540));

        setSize(new java.awt.Dimension(1200, 650));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MID_PUBG_1 f1 = new MID_PUBG_1();
        String platform = "PC";
        
        f1.l3_UN.setText(this.l3.getText());
        f1.l_l1.setText(this.l2.getText());
        f1.GID1.setText(GID);
        f1.p1.setText(this.P.getText());        
                        
        if(XB_1.isSelected())   
        {
            f1.Img1.setVisible(true);            
            platform = "PC";
            f1.dis.setText("14");
        }
        
        f1.l_l2.setText(platform);
        f1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        String a = l2.getText();        
        l1.setIcon(new ImageIcon(a));           
    }//GEN-LAST:event_formWindowOpened

    private void Code1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Code1MouseClicked
        Gamin_Main_Page f1 = new Gamin_Main_Page();
        f1.l2.setText(this.l2.getText());           // Address
        f1.l3.setText(this.l3.getText());           // Username
        f1.l4.setText("1");                         // Alphabets Checking        
        
        f1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Code1MouseClicked

    private void Code1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Code1MouseEntered
        Black.setVisible(false);
        White.setVisible(true);
    }//GEN-LAST:event_Code1MouseEntered

    private void Code1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Code1MouseExited
        Black.setVisible(true);
        White.setVisible(false);
    }//GEN-LAST:event_Code1MouseExited

    private void lab4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab4MouseClicked
        pan_Platform.setVisible(false);
    }//GEN-LAST:event_lab4MouseClicked

    private void lab4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab4MouseEntered
        lab4_C.setVisible(true);
        lab4.setForeground(new java.awt.Color(255,255,255));
        lab4.setBorder(javax.swing.BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_lab4MouseEntered

    private void lab4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab4MouseExited
        lab4_C.setVisible(false);
        lab4.setForeground(new java.awt.Color(255,0,0));
        lab4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
    }//GEN-LAST:event_lab4MouseExited

    private void XB_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XB_1ActionPerformed
        if(XB_1.isSelected())
        {
            P.setText("3999");            
            Platform.setText("<html><body>Platform Select :<br><b>PC</b>");
            pan_Platform.setVisible(false);
            GID = "GID051";
        }
    }//GEN-LAST:event_XB_1ActionPerformed

    private void PlatformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlatformActionPerformed
        pan_Platform.setVisible(true);
    }//GEN-LAST:event_PlatformActionPerformed

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
            java.util.logging.Logger.getLogger(TOP_PUBG_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TOP_PUBG_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TOP_PUBG_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TOP_PUBG_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TOP_PUBG_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Back1;
    private javax.swing.JLabel Black;
    private javax.swing.JLabel Code1;
    private javax.swing.JPanel Image;
    private javax.swing.JLabel Img;
    private javax.swing.JPanel Origins;
    private javax.swing.JLabel P;
    public javax.swing.JButton Platform;
    private javax.swing.JLabel Sign;
    public javax.swing.JLabel White;
    private javax.swing.JLabel XB;
    public javax.swing.JRadioButton XB_1;
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JLabel l1;
    public javax.swing.JLabel l2;
    public javax.swing.JLabel l3;
    private javax.swing.JLabel lab4;
    public javax.swing.JLabel lab4_C;
    private javax.swing.JLabel n1;
    public javax.swing.JPanel pan_Platform;
    // End of variables declaration//GEN-END:variables
}
