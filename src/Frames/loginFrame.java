package Frames;


import Models.Datasource;
import Models.Users;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class loginFrame extends javax.swing.JFrame {
    int mouseX;
    int mouseY;
    private static int firstInstance = 1;
    public loginFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exit = new javax.swing.JLabel();
        jLabelDrag = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        signIn = new javax.swing.JButton();
        jPasswordField = new javax.swing.JPasswordField();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        exit.setBackground(new java.awt.Color(102, 102, 102));
        exit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        exit.setForeground(new java.awt.Color(102, 102, 102));
        exit.setText("X");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        getContentPane().add(exit);
        exit.setBounds(1430, 0, 20, 30);

        jLabelDrag.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelDrag.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabelDragMouseDragged(evt);
            }
        });
        jLabelDrag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelDragMousePressed(evt);
            }
        });
        getContentPane().add(jLabelDrag);
        jLabelDrag.setBounds(0, 0, 1450, 30);

        usernameField.setBackground(new java.awt.Color(51, 51, 51));
        usernameField.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        usernameField.setForeground(new java.awt.Color(255, 255, 255));
        usernameField.setText("Username");
        usernameField.setToolTipText("");
        usernameField.setCaretColor(new java.awt.Color(255, 255, 255));
        usernameField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        usernameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameFieldFocusLost(evt);
            }
        });
        usernameField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameFieldMouseClicked(evt);
            }
        });
        usernameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernameFieldKeyPressed(evt);
            }
        });
        getContentPane().add(usernameField);
        usernameField.setBounds(630, 390, 230, 30);

        signIn.setBackground(new java.awt.Color(51, 51, 51));
        signIn.setForeground(new java.awt.Color(255, 255, 255));
        signIn.setText("Sign In");
        signIn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        signIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signInMouseClicked(evt);
            }
        });
        signIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInActionPerformed(evt);
            }
        });
        signIn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                signInKeyPressed(evt);
            }
        });
        getContentPane().add(signIn);
        signIn.setBounds(690, 470, 110, 30);

        jPasswordField.setBackground(new java.awt.Color(51, 51, 51));
        jPasswordField.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField.setText("Password");
        jPasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordFieldFocusLost(evt);
            }
        });
        jPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordFieldKeyPressed(evt);
            }
        });
        getContentPane().add(jPasswordField);
        jPasswordField.setBounds(630, 430, 230, 30);

        background.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login-background-final.jpg.png"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 1450, 816);

        setSize(new java.awt.Dimension(1450, 816));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelDragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDragMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x-mouseX, y-mouseY);
    }//GEN-LAST:event_jLabelDragMouseDragged

    private void jLabelDragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDragMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_jLabelDragMousePressed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void usernameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFieldFocusGained
         if(firstInstance == 1){
        usernameField.setText("Username"); 
        firstInstance++;
         }
    }//GEN-LAST:event_usernameFieldFocusGained

    private void usernameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFieldFocusLost

    }//GEN-LAST:event_usernameFieldFocusLost

    private void signInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInMouseClicked
        try {
            String pass = new String(jPasswordField.getPassword());
            Datasource user = new Datasource();
            System.out.println("PASSWORD: " + pass + " , " + "USERNAME:" + usernameField.getText());
            if(!user.open()) {
                System.out.println("Can't open datasource");
                return;
            }
            else if ("Doctor".equals(user.loginUsers(pass,usernameField.getText()))){
                this.dispose();
                doctorFrame doctor = new doctorFrame(user.queryUser(usernameField.getText()));
                doctor.setVisible(true);
            }
           else if("Receptionist".equals(user.loginUsers(pass,usernameField.getText()))){
                this.dispose();
                receptionistFrame receptionist = new receptionistFrame(user.queryUser(usernameField.getText()));
                receptionist.setVisible(true);
            }
           else if("Admin".equals(user.loginUsers(pass,usernameField.getText()))){
                this.dispose();
                System.out.println(Users.getCurrentUser());
                adminFrame admin = new adminFrame(user.queryUser(usernameField.getText()));
                admin.setVisible(true);
            }
           else {
               JOptionPane.showMessageDialog(null, "Invalid Usern");
           }
            
            user.close();
        } catch (SQLException ex) {
            Logger.getLogger(loginFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_signInMouseClicked

    private void signInKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_signInKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                String pass = new String(jPasswordField.getPassword());
                Datasource user = new Datasource();
                if(!user.open()) {
                    System.out.println("Can't open datasource");
                    return;
                }
                if ("Doctor".equals(user.loginUsers(pass,usernameField.getText()))){
                    this.dispose();
                    doctorFrame doctor = new doctorFrame(user.queryUser(usernameField.getText()));
                    doctor.setVisible(true);
                }
                if("Receptionist".equals(user.loginUsers(pass,usernameField.getText()))){
                    this.dispose();
                    receptionistFrame receptionist = new receptionistFrame(user.queryUser(usernameField.getText()));
                    receptionist.setVisible(true);
                }
                if("Admin".equals(user.loginUsers(pass,usernameField.getText()))){
                    this.dispose();
                    adminFrame admin = new adminFrame(user.queryUser(usernameField.getText()));
                    admin.setVisible(true);
                }
                user.close();
            } catch (SQLException ex) {
                Logger.getLogger(loginFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_signInKeyPressed

    private void usernameFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameFieldKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
            if(usernameField.getText().equals("Username")){
        usernameField.setText("");
            }
        }
         if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                String pass = new String(jPasswordField.getPassword());
                Datasource user = new Datasource();
                if(!user.open()) {
                    System.out.println("Can't open datasource");
                    return;
                }
                if ("Doctor".equals(user.loginUsers(pass,usernameField.getText()))){
                    this.dispose();
                    doctorFrame doctor = new doctorFrame(user.queryUser(usernameField.getText()));
                    doctor.setVisible(true);
                }
                if("Receptionist".equals(user.loginUsers(pass,usernameField.getText()))){
                    this.dispose();
                    receptionistFrame receptionist = new receptionistFrame(user.queryUser(usernameField.getText()));
                    receptionist.setVisible(true);
                }
                if("Admin".equals(user.loginUsers(pass,usernameField.getText()))){
                    this.dispose();
                    adminFrame admin = new adminFrame(user.queryUser(usernameField.getText()));
                    admin.setVisible(true);
                }
                user.close();
            } catch (SQLException ex) {
                Logger.getLogger(loginFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_usernameFieldKeyPressed

    private void jPasswordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                String pass = new String(jPasswordField.getPassword());
                Datasource user = new Datasource();
                if(!user.open()) {
                    System.out.println("Can't open datasource");
                    return;
                }
                if ("Doctor".equals(user.loginUsers(pass,usernameField.getText()))){
                    this.dispose();
                    doctorFrame doctor = new doctorFrame(user.queryUser(usernameField.getText()));
                    doctor.setVisible(true);
                }
                if("Receptionist".equals(user.loginUsers(pass,usernameField.getText()))){
                    this.dispose();
                    receptionistFrame receptionist = new receptionistFrame(user.queryUser(usernameField.getText()));
                    receptionist.setVisible(true);
                }
                if("Admin".equals(user.loginUsers(pass,usernameField.getText()))){
                    this.dispose();
                    adminFrame admin = new adminFrame(user.queryUser(usernameField.getText()));
                    admin.setVisible(true);
                }
                user.close();
            } catch (SQLException ex) {
                Logger.getLogger(loginFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jPasswordFieldKeyPressed

    private void jPasswordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldFocusGained
        jPasswordField.setText("");
    }//GEN-LAST:event_jPasswordFieldFocusGained

    private void jPasswordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldFocusLost
        if (jPasswordField.getText().isEmpty()){
            jPasswordField.setText(" Password");
        }
    }//GEN-LAST:event_jPasswordFieldFocusLost

    private void usernameFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameFieldMouseClicked
         if(usernameField.getText().equals("Username")){
        usernameField.setText("");
            }
    }//GEN-LAST:event_usernameFieldMouseClicked

    private void signInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signInActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new loginFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabelDrag;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JButton signIn;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
