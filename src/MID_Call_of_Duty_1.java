import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class MID_Call_of_Duty_1 extends javax.swing.JFrame {
    
    /**
     * Creates new form Buy_Assiss
     */
    public MID_Call_of_Duty_1() {
        initComponents();                
        White.setVisible(false);    
        lab3_C.setVisible(false);
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        pan1_Origins = new javax.swing.JPanel();
        Close = new javax.swing.JPanel();
        lab3 = new javax.swing.JLabel();
        lab3_C = new javax.swing.JLabel();
        pan1_1 = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        l_img = new javax.swing.JLabel();
        l3_UN = new javax.swing.JLabel();
        l_l1 = new javax.swing.JLabel();
        l_l2 = new javax.swing.JLabel();
        Back1 = new javax.swing.JPanel();
        Code1 = new javax.swing.JLabel();
        Black = new javax.swing.JLabel();
        White = new javax.swing.JLabel();
        pan1_2 = new javax.swing.JPanel();
        Img1 = new javax.swing.JLabel();
        Img2 = new javax.swing.JLabel();
        Img3 = new javax.swing.JLabel();
        GID1 = new javax.swing.JLabel();
        p1 = new javax.swing.JLabel();
        cb1 = new javax.swing.JComboBox<>();
        cb2 = new javax.swing.JComboBox<>();
        dis = new javax.swing.JLabel();
        Comp5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta1 = new javax.swing.JTextArea();
        Comp10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Comp13 = new javax.swing.JLabel();
        Stock2 = new javax.swing.JLabel();
        Comp6 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        Comp11 = new javax.swing.JLabel();
        Pr1 = new javax.swing.JLabel();
        jlable1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pan1_Origins.setBackground(new java.awt.Color(255, 255, 255));
        pan1_Origins.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Close.setBackground(new java.awt.Color(255, 255, 255));
        Close.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab3.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        lab3.setForeground(new java.awt.Color(255, 0, 0));
        lab3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab3.setText("X");
        lab3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        lab3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lab3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lab3MouseExited(evt);
            }
        });
        Close.add(lab3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        lab3_C.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        lab3_C.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab3_C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lab3_C.png"))); // NOI18N
        Close.add(lab3_C, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        pan1_Origins.add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, 30, 30));

        pan1_1.setBackground(new java.awt.Color(24, 24, 24));
        pan1_1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        pan1_1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name.setFont(new java.awt.Font("Unispace", 1, 40)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name.setText("Call of Duty World War II");
        pan1_1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 870, 70));

        l_img.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        l_img.setForeground(new java.awt.Color(51, 51, 51));
        pan1_1.add(l_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 90, 90));

        l3_UN.setForeground(new java.awt.Color(24, 24, 24));
        pan1_1.add(l3_UN, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 20, 20));

        l_l1.setForeground(new java.awt.Color(24, 24, 24));
        pan1_1.add(l_l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 40, 20, 20));

        l_l2.setForeground(new java.awt.Color(24, 24, 24));
        pan1_1.add(l_l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 80, 20, 20));

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

        pan1_1.add(Back1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 35, 35));

        pan1_Origins.add(pan1_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 110));

        pan1_2.setBackground(new java.awt.Color(255, 255, 255));
        pan1_2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        pan1_2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Img1.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        Img1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Img1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Platform_Images/COD_PC_1.png"))); // NOI18N
        pan1_2.add(Img1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 330, 400));

        Img2.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        Img2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Img2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Platform_Images/COD_PS4_1.jpg"))); // NOI18N
        pan1_2.add(Img2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 330, 400));

        Img3.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        Img3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Img3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Platform_Images/COD_Xbox 1_1.jpg"))); // NOI18N
        pan1_2.add(Img3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 330, 400));

        GID1.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        GID1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        GID1.setText("GID010");
        pan1_2.add(GID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 70, 30));

        p1.setFont(new java.awt.Font("Unispace", 0, 30)); // NOI18N
        p1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        p1.setText("3799");
        pan1_2.add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, 100, 40));

        cb1.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Add Credit or Debit Card", "Net Banking", "Cash on Delivery" }));
        pan1_2.add(cb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, 300, 40));

        cb2.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        cb2.setMaximumRowCount(5);
        cb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        pan1_2.add(cb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 70, 40));

        dis.setFont(new java.awt.Font("Roboto Light", 0, 20)); // NOI18N
        dis.setForeground(new java.awt.Color(255, 0, 0));
        dis.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dis.setText("12");
        pan1_2.add(dis, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 30, 40));

        Comp5.setFont(new java.awt.Font("Unispace", 0, 18)); // NOI18N
        Comp5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Comp5.setText("City :");
        pan1_2.add(Comp5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 130, 30));

        ta1.setColumns(20);
        ta1.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        ta1.setLineWrap(true);
        ta1.setRows(1);
        ta1.setToolTipText("");
        ta1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(ta1);

        pan1_2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, 230, 60));

        Comp10.setFont(new java.awt.Font("Roboto Light", 0, 20)); // NOI18N
        Comp10.setForeground(new java.awt.Color(255, 0, 0));
        Comp10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Comp10.setText("% discount ");
        pan1_2.add(Comp10, new org.netbeans.lib.awtextra.AbsoluteConstraints(562, 100, -1, 40));

        jButton1.setFont(new java.awt.Font("Unispace", 0, 24)); // NOI18N
        jButton1.setText("Add to Cart");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pan1_2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 420, 190, 50));

        Comp13.setFont(new java.awt.Font("Unispace", 0, 18)); // NOI18N
        Comp13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Comp13.setText("Payment Mode :");
        pan1_2.add(Comp13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 160, 40));

        Stock2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Stock2.setForeground(new java.awt.Color(6, 190, 18));
        Stock2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Stock2.setText("In Stock");
        pan1_2.add(Stock2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 70, 20));

        Comp6.setFont(new java.awt.Font("Unispace", 0, 18)); // NOI18N
        Comp6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Comp6.setText("Address :");
        pan1_2.add(Comp6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 130, 40));

        t1.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        pan1_2.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 370, 230, 30));

        Comp11.setFont(new java.awt.Font("Unispace", 0, 18)); // NOI18N
        Comp11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Comp11.setText("Quantity :");
        pan1_2.add(Comp11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 120, 40));

        Pr1.setFont(new java.awt.Font("Unispace", 0, 30)); // NOI18N
        Pr1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Pr1.setText("Rs. ");
        pan1_2.add(Pr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 110, 40));

        jlable1.setFont(new java.awt.Font("Unispace", 0, 18)); // NOI18N
        jlable1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlable1.setText("Game ID :");
        pan1_2.add(jlable1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 110, 30));

        pan1_Origins.add(pan1_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 870, 490));

        getContentPane().add(pan1_Origins, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int a = Integer.parseInt(p1.getText());
        int b = Integer.parseInt(dis.getText());
        Object c = cb1.getSelectedItem();
        int d = cb2.getSelectedIndex();
        String e = ta1.getText();
        String f = t1.getText();
        String g = l_l2.getText();
        String h = l3_UN.getText();     //Username
        String i = l_l1.getText();      //letter address
        String j = l_l2.getText();      //platform
        String k = GID1.getText();
        
        int A , T ;
        
        A = (int)(a - (a * b * 0.01));
        T = A * (d+1);
        String Amt = Integer.toString(T);
        
        try
        {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/P","root","root");
            Statement st = con.createStatement();
            String qry = "Insert into buy values('" +h+ "','Call of Duty : World War II','" +j+ "'," +(d+1)+ "," +T+ ",'" +e+ "','" +c+ "','" +b+ "%','" +f+ "','" +k+ "');";
            int rs = st.executeUpdate(qry);                        
            JOptionPane.showMessageDialog(null,"Cart Updated","Item added to the Cart",JOptionPane.INFORMATION_MESSAGE);
            
            Gamin_Main_Page f1 = new Gamin_Main_Page();
            f1.l2.setText(this.l_l1.getText());       //letter address
            f1.l3.setText(this.l3_UN.getText());       //Username
            f1.l4.setText("1");
            
            f1.setVisible(true);
            this.dispose();
        }
        
        catch (HeadlessException | ClassNotFoundException | SQLException e1)
        {
            JOptionPane.showMessageDialog(null,e1.getMessage());
        }                
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        String a = l_l1.getText();
        l_img.setIcon(new ImageIcon(a));           
    }//GEN-LAST:event_formWindowOpened

    private void Code1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Code1MouseClicked
        TOP_Call_of_Duty_1 f1 = new TOP_Call_of_Duty_1();
        f1.l3.setText(this.l3_UN.getText());
        f1.l2.setText(this.l_l1.getText());
        
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

    private void lab3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab3MouseExited
        lab3_C.setVisible(false);
        lab3.setForeground(new java.awt.Color(255,0,0));
        lab3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
    }//GEN-LAST:event_lab3MouseExited

    private void lab3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab3MouseEntered
        lab3_C.setVisible(true);
        lab3.setForeground(new java.awt.Color(255,255,255));
        lab3.setBorder(javax.swing.BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_lab3MouseEntered

    private void lab3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab3MouseClicked
        this.dispose();
    }//GEN-LAST:event_lab3MouseClicked

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
            java.util.logging.Logger.getLogger(MID_Call_of_Duty_1 .class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MID_Call_of_Duty_1 .class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MID_Call_of_Duty_1 .class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MID_Call_of_Duty_1 .class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MID_Call_of_Duty_1 ().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Back1;
    private javax.swing.JLabel Black;
    private javax.swing.JPanel Close;
    private javax.swing.JLabel Code1;
    private javax.swing.JLabel Comp10;
    private javax.swing.JLabel Comp11;
    private javax.swing.JLabel Comp13;
    private javax.swing.JLabel Comp5;
    private javax.swing.JLabel Comp6;
    public javax.swing.JLabel GID1;
    public javax.swing.JLabel Img1;
    public javax.swing.JLabel Img2;
    public javax.swing.JLabel Img3;
    private javax.swing.JLabel Pr1;
    private javax.swing.JLabel Stock2;
    public javax.swing.JLabel White;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JComboBox<String> cb2;
    public javax.swing.JLabel dis;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlable1;
    public javax.swing.JLabel l3_UN;
    public javax.swing.JLabel l_img;
    public javax.swing.JLabel l_l1;
    public javax.swing.JLabel l_l2;
    private javax.swing.JLabel lab3;
    public javax.swing.JLabel lab3_C;
    private javax.swing.JLabel name;
    public javax.swing.JLabel p1;
    private javax.swing.JPanel pan1_1;
    private javax.swing.JPanel pan1_2;
    public javax.swing.JPanel pan1_Origins;
    private javax.swing.JTextField t1;
    private javax.swing.JTextArea ta1;
    // End of variables declaration//GEN-END:variables
}
