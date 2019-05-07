
import java.awt.event.KeyEvent;

public class loginFrame extends javax.swing.JFrame {
    int mouseX;
    int mouseY;
    public loginFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exit = new javax.swing.JLabel();
        jLabelDrag = new javax.swing.JLabel();
        userRole = new javax.swing.JComboBox<>();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JTextField();
        signIn = new javax.swing.JButton();
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

        userRole.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        userRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User Role", "Doctor", "Receptionist", "Admin" }));
        getContentPane().add(userRole);
        userRole.setBounds(640, 390, 190, 30);

        usernameField.setBackground(new java.awt.Color(51, 51, 51));
        usernameField.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        usernameField.setForeground(new java.awt.Color(255, 255, 255));
        usernameField.setText(" Username");
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
        usernameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernameFieldKeyPressed(evt);
            }
        });
        getContentPane().add(usernameField);
        usernameField.setBounds(620, 440, 230, 30);

        passwordField.setBackground(new java.awt.Color(51, 51, 51));
        passwordField.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        passwordField.setForeground(new java.awt.Color(255, 255, 255));
        passwordField.setText(" Password");
        passwordField.setCaretColor(new java.awt.Color(255, 255, 255));
        passwordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFieldFocusLost(evt);
            }
        });
        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordFieldKeyPressed(evt);
            }
        });
        getContentPane().add(passwordField);
        passwordField.setBounds(620, 480, 230, 30);

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
        signIn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                signInKeyPressed(evt);
            }
        });
        getContentPane().add(signIn);
        signIn.setBounds(680, 520, 110, 30);

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
        usernameField.setText("");
    }//GEN-LAST:event_usernameFieldFocusGained

    private void usernameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFieldFocusLost
        if (usernameField.getText().isEmpty()){
            usernameField.setText(" Username");
        }
    }//GEN-LAST:event_usernameFieldFocusLost

    private void passwordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusGained
        passwordField.setText("");
    }//GEN-LAST:event_passwordFieldFocusGained

    private void passwordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusLost
        if (passwordField.getText().isEmpty()){
            passwordField.setText(" Password");
        }
    }//GEN-LAST:event_passwordFieldFocusLost

    private void signInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInMouseClicked
        Object selected = userRole.getSelectedItem();
        if (selected.toString().equals("Doctor")){
            this.dispose();
            doctorFrame doctor = new doctorFrame();
            doctor.setVisible(true);
        }
        if(selected.toString().equals("Receptionist")){
            this.dispose();
            receptionistFrame receptionist = new receptionistFrame();
            receptionist.setVisible(true);
        }
        if(selected.toString().equals("Admin")){
            this.dispose();
            adminFrame admin = new adminFrame();
            admin.setVisible(true);
        }
    }//GEN-LAST:event_signInMouseClicked

    private void signInKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_signInKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
        Object selected = userRole.getSelectedItem();
        if (selected.toString().equals("Doctor")){
            this.dispose();
            doctorFrame doctor = new doctorFrame();
            doctor.setVisible(true);
        }
        if(selected.toString().equals("Receptionist")){
            this.dispose();
            receptionistFrame receptionist = new receptionistFrame();
            receptionist.setVisible(true);
        }
        if(selected.toString().equals("Admin")){
            this.dispose();
            adminFrame admin = new adminFrame();
            admin.setVisible(true);
        }
        }
    }//GEN-LAST:event_signInKeyPressed

    private void usernameFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameFieldKeyPressed
         if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
        Object selected = userRole.getSelectedItem();
        if (selected.toString().equals("Doctor")){
            this.dispose();
            doctorFrame doctor = new doctorFrame();
            doctor.setVisible(true);
        }
        if(selected.toString().equals("Receptionist")){
            this.dispose();
            receptionistFrame receptionist = new receptionistFrame();
            receptionist.setVisible(true);
        }
        if(selected.toString().equals("Admin")){
            this.dispose();
            adminFrame admin = new adminFrame();
            admin.setVisible(true);
        }
        }
    }//GEN-LAST:event_usernameFieldKeyPressed

    private void passwordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyPressed
  if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
        Object selected = userRole.getSelectedItem();
        if (selected.toString().equals("Doctor")){
            this.dispose();
            doctorFrame doctor = new doctorFrame();
            doctor.setVisible(true);
        }
        if(selected.toString().equals("Receptionist")){
            this.dispose();
            receptionistFrame receptionist = new receptionistFrame();
            receptionist.setVisible(true);
        }
        if(selected.toString().equals("Admin")){
            this.dispose();
            adminFrame admin = new adminFrame();
            admin.setVisible(true);
        }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldKeyPressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabelDrag;
    private javax.swing.JTextField passwordField;
    private javax.swing.JButton signIn;
    private javax.swing.JComboBox<String> userRole;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}