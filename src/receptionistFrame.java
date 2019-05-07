
import java.util.Calendar;
import java.util.Locale;

public class receptionistFrame extends javax.swing.JFrame implements Runnable{
    int mouseX;
    int mouseY;
    public receptionistFrame() {
        Thread t = new Thread(this);
        t.start();
        initComponents();
        patRegPanel.setVisible(false);
        patSearchPanel.setVisible(false);
        workSchPanel.setVisible(false);
        tasksPanel.setVisible(false);
        schAppointPanel.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exit = new javax.swing.JLabel();
        jLabelDrag = new javax.swing.JLabel();
        clockDate = new javax.swing.JPanel();
        jLabelClock = new javax.swing.JLabel();
        jLabelDate = new javax.swing.JLabel();
        menu1 = new javax.swing.JPanel();
        tasksButton = new javax.swing.JLabel();
        scheduleButton1 = new javax.swing.JLabel();
        profileButton = new javax.swing.JLabel();
        patRegister = new javax.swing.JPanel();
        pRegLabel = new javax.swing.JLabel();
        pRegIcon = new javax.swing.JLabel();
        patSearch = new javax.swing.JPanel();
        pSearchLabel = new javax.swing.JLabel();
        pSearchIcon = new javax.swing.JLabel();
        schedAppoint = new javax.swing.JPanel();
        schAppLabel = new javax.swing.JLabel();
        schAppIcon = new javax.swing.JLabel();
        home = new javax.swing.JPanel();
        homeLabel = new javax.swing.JLabel();
        homeIcon = new javax.swing.JLabel();
        logout = new javax.swing.JPanel();
        logoutLabel = new javax.swing.JLabel();
        logoutIcon = new javax.swing.JLabel();
        schAppointPanel = new javax.swing.JPanel();
        schAppTitle = new javax.swing.JLabel();
        patRegPanel = new javax.swing.JPanel();
        patRegTitle = new javax.swing.JLabel();
        patSearchPanel = new javax.swing.JPanel();
        patSearchTitle = new javax.swing.JLabel();
        profilePanel = new javax.swing.JPanel();
        profileTitle = new javax.swing.JLabel();
        workSchPanel = new javax.swing.JPanel();
        workSchTitle = new javax.swing.JLabel();
        tasksPanel = new javax.swing.JPanel();
        tasksTitle = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

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

        clockDate.setOpaque(false);
        clockDate.setLayout(null);

        jLabelClock.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabelClock.setForeground(new java.awt.Color(102, 102, 102));
        jLabelClock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clockDate.add(jLabelClock);
        jLabelClock.setBounds(510, 0, 90, 30);

        jLabelDate.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabelDate.setForeground(new java.awt.Color(102, 102, 102));
        jLabelDate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        clockDate.add(jLabelDate);
        jLabelDate.setBounds(5, 5, 270, 20);

        getContentPane().add(clockDate);
        clockDate.setBounds(350, 0, 1080, 30);

        menu1.setOpaque(false);
        menu1.setLayout(null);

        tasksButton.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        tasksButton.setForeground(new java.awt.Color(255, 255, 255));
        tasksButton.setText("Tasks");
        tasksButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tasksButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tasksButtonMouseClicked(evt);
            }
        });
        menu1.add(tasksButton);
        tasksButton.setBounds(290, 139, 40, 20);

        scheduleButton1.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        scheduleButton1.setForeground(new java.awt.Color(255, 255, 255));
        scheduleButton1.setText("Work Schedule");
        scheduleButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        scheduleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                scheduleButton1MouseClicked(evt);
            }
        });
        menu1.add(scheduleButton1);
        scheduleButton1.setBounds(120, 139, 110, 20);

        profileButton.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        profileButton.setForeground(new java.awt.Color(255, 255, 255));
        profileButton.setText("Profile");
        profileButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profileButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileButtonMouseClicked(evt);
            }
        });
        menu1.add(profileButton);
        profileButton.setBounds(20, 139, 50, 20);

        patRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        patRegister.setOpaque(false);
        patRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patRegisterMouseClicked(evt);
            }
        });
        patRegister.setLayout(null);

        pRegLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        pRegLabel.setForeground(new java.awt.Color(255, 255, 255));
        pRegLabel.setText("Patient Registration");
        patRegister.add(pRegLabel);
        pRegLabel.setBounds(46, 5, 220, 35);

        pRegIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/personIcon.png"))); // NOI18N
        patRegister.add(pRegIcon);
        pRegIcon.setBounds(0, 0, 40, 40);

        menu1.add(patRegister);
        patRegister.setBounds(40, 200, 270, 40);

        patSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        patSearch.setOpaque(false);
        patSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patSearchMouseClicked(evt);
            }
        });
        patSearch.setLayout(null);

        pSearchLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        pSearchLabel.setForeground(new java.awt.Color(255, 255, 255));
        pSearchLabel.setText("Patient Search");
        patSearch.add(pSearchLabel);
        pSearchLabel.setBounds(50, 5, 160, 35);

        pSearchIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/searchIcon.png"))); // NOI18N
        patSearch.add(pSearchIcon);
        pSearchIcon.setBounds(0, 5, 34, 34);

        menu1.add(patSearch);
        patSearch.setBounds(36, 270, 220, 40);

        schedAppoint.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        schedAppoint.setOpaque(false);
        schedAppoint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                schedAppointMouseClicked(evt);
            }
        });
        schedAppoint.setLayout(null);

        schAppLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        schAppLabel.setForeground(new java.awt.Color(255, 255, 255));
        schAppLabel.setText("Schedule Appointment");
        schedAppoint.add(schAppLabel);
        schAppLabel.setBounds(50, 5, 250, 35);

        schAppIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/penPaperIcon.png"))); // NOI18N
        schedAppoint.add(schAppIcon);
        schAppIcon.setBounds(4, 2, 35, 40);

        menu1.add(schedAppoint);
        schedAppoint.setBounds(36, 340, 300, 40);

        home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home.setOpaque(false);
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });

        homeLabel.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        homeLabel.setForeground(new java.awt.Color(255, 255, 255));
        homeLabel.setText("Home");

        homeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Home.png"))); // NOI18N

        javax.swing.GroupLayout homeLayout = new javax.swing.GroupLayout(home);
        home.setLayout(homeLayout);
        homeLayout.setHorizontalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayout.createSequentialGroup()
                .addComponent(homeIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(homeLabel)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        homeLayout.setVerticalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayout.createSequentialGroup()
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(homeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 2, Short.MAX_VALUE))
        );

        menu1.add(home);
        home.setBounds(30, 760, 110, 40);

        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.setOpaque(false);
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });

        logoutLabel.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        logoutLabel.setForeground(new java.awt.Color(255, 255, 255));
        logoutLabel.setText("Logout");

        logoutIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/signout2.png"))); // NOI18N

        javax.swing.GroupLayout logoutLayout = new javax.swing.GroupLayout(logout);
        logout.setLayout(logoutLayout);
        logoutLayout.setHorizontalGroup(
            logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoutLayout.createSequentialGroup()
                .addComponent(logoutIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoutLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        logoutLayout.setVerticalGroup(
            logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoutLayout.createSequentialGroup()
                .addGroup(logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logoutIcon)
                    .addComponent(logoutLabel))
                .addGap(9, 9, 9))
        );

        menu1.add(logout);
        logout.setBounds(210, 761, 110, 40);

        getContentPane().add(menu1);
        menu1.setBounds(0, 0, 350, 820);

        schAppointPanel.setOpaque(false);
        schAppointPanel.setLayout(null);

        schAppTitle.setFont(new java.awt.Font("Yu Gothic", 1, 48)); // NOI18N
        schAppTitle.setForeground(new java.awt.Color(255, 255, 255));
        schAppTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        schAppTitle.setText("Schedule Appointment");
        schAppointPanel.add(schAppTitle);
        schAppTitle.setBounds(280, 10, 550, 70);

        getContentPane().add(schAppointPanel);
        schAppointPanel.setBounds(350, 35, 1100, 780);

        patRegPanel.setOpaque(false);
        patRegPanel.setLayout(null);

        patRegTitle.setFont(new java.awt.Font("Yu Gothic", 1, 48)); // NOI18N
        patRegTitle.setForeground(new java.awt.Color(255, 255, 255));
        patRegTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        patRegTitle.setText("Patient Registration");
        patRegPanel.add(patRegTitle);
        patRegTitle.setBounds(320, 10, 490, 70);

        getContentPane().add(patRegPanel);
        patRegPanel.setBounds(350, 35, 1100, 780);

        patSearchPanel.setOpaque(false);
        patSearchPanel.setLayout(null);

        patSearchTitle.setFont(new java.awt.Font("Yu Gothic", 1, 48)); // NOI18N
        patSearchTitle.setForeground(new java.awt.Color(255, 255, 255));
        patSearchTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        patSearchTitle.setText("Patient Search");
        patSearchPanel.add(patSearchTitle);
        patSearchTitle.setBounds(320, 10, 490, 70);

        getContentPane().add(patSearchPanel);
        patSearchPanel.setBounds(350, 35, 1100, 780);

        profilePanel.setOpaque(false);
        profilePanel.setLayout(null);

        profileTitle.setFont(new java.awt.Font("Yu Gothic", 1, 48)); // NOI18N
        profileTitle.setForeground(new java.awt.Color(255, 255, 255));
        profileTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profileTitle.setText("Profile");
        profilePanel.add(profileTitle);
        profileTitle.setBounds(360, 10, 380, 70);

        getContentPane().add(profilePanel);
        profilePanel.setBounds(350, 35, 1100, 780);

        workSchPanel.setOpaque(false);
        workSchPanel.setLayout(null);

        workSchTitle.setFont(new java.awt.Font("Yu Gothic", 1, 48)); // NOI18N
        workSchTitle.setForeground(new java.awt.Color(255, 255, 255));
        workSchTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        workSchTitle.setText("Work Schedule");
        workSchPanel.add(workSchTitle);
        workSchTitle.setBounds(360, 10, 380, 70);

        getContentPane().add(workSchPanel);
        workSchPanel.setBounds(350, 35, 1100, 780);

        tasksPanel.setOpaque(false);
        tasksPanel.setLayout(null);

        tasksTitle.setFont(new java.awt.Font("Yu Gothic", 1, 48)); // NOI18N
        tasksTitle.setForeground(new java.awt.Color(255, 255, 255));
        tasksTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tasksTitle.setText("Tasks");
        tasksPanel.add(tasksTitle);
        tasksTitle.setBounds(360, 10, 380, 70);

        getContentPane().add(tasksPanel);
        tasksPanel.setBounds(350, 35, 1100, 780);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/receptBackground.png"))); // NOI18N
        getContentPane().add(bg);
        bg.setBounds(0, 0, 1450, 816);

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

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        this.dispose();
        loginFrame login = new loginFrame();
        login.setVisible(true);
    }//GEN-LAST:event_logoutMouseClicked

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        panelsOff();
        profilePanel.setVisible(true);
    }//GEN-LAST:event_homeMouseClicked

    private void patRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patRegisterMouseClicked
        panelsOff();
        patRegPanel.setVisible(true);
    }//GEN-LAST:event_patRegisterMouseClicked

    private void patSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patSearchMouseClicked
        panelsOff();
        patSearchPanel.setVisible(true);
    }//GEN-LAST:event_patSearchMouseClicked

    private void schedAppointMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_schedAppointMouseClicked
        panelsOff();
        schAppointPanel.setVisible(true);
    }//GEN-LAST:event_schedAppointMouseClicked

    private void profileButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileButtonMouseClicked
        panelsOff();
        profilePanel.setVisible(true);
    }//GEN-LAST:event_profileButtonMouseClicked

    private void scheduleButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scheduleButton1MouseClicked
        panelsOff();
        workSchPanel.setVisible(true);
    }//GEN-LAST:event_scheduleButton1MouseClicked

    private void tasksButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tasksButtonMouseClicked
        panelsOff();
        tasksPanel.setVisible(true);
    }//GEN-LAST:event_tasksButtonMouseClicked

    private void panelsOff(){
        patRegPanel.setVisible(false);
        patSearchPanel.setVisible(false);
        workSchPanel.setVisible(false);
        tasksPanel.setVisible(false);
        schAppointPanel.setVisible(false);
        profilePanel.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JPanel clockDate;
    private javax.swing.JLabel exit;
    private javax.swing.JPanel home;
    private javax.swing.JLabel homeIcon;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JLabel jLabelClock;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelDrag;
    private javax.swing.JPanel logout;
    private javax.swing.JLabel logoutIcon;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JPanel menu1;
    private javax.swing.JLabel pRegIcon;
    private javax.swing.JLabel pRegLabel;
    private javax.swing.JLabel pSearchIcon;
    private javax.swing.JLabel pSearchLabel;
    private javax.swing.JPanel patRegPanel;
    private javax.swing.JLabel patRegTitle;
    private javax.swing.JPanel patRegister;
    private javax.swing.JPanel patSearch;
    private javax.swing.JPanel patSearchPanel;
    private javax.swing.JLabel patSearchTitle;
    private javax.swing.JLabel profileButton;
    private javax.swing.JPanel profilePanel;
    private javax.swing.JLabel profileTitle;
    private javax.swing.JLabel schAppIcon;
    private javax.swing.JLabel schAppLabel;
    private javax.swing.JLabel schAppTitle;
    private javax.swing.JPanel schAppointPanel;
    private javax.swing.JPanel schedAppoint;
    private javax.swing.JLabel scheduleButton1;
    private javax.swing.JLabel tasksButton;
    private javax.swing.JPanel tasksPanel;
    private javax.swing.JLabel tasksTitle;
    private javax.swing.JPanel workSchPanel;
    private javax.swing.JLabel workSchTitle;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        while(true){
            Calendar cal = Calendar.getInstance();
                
                int hour = cal.get(Calendar.HOUR);
                int minute = cal.get(Calendar.MINUTE);
                int second = cal.get(Calendar.SECOND);
                int AM_PM = cal.get(Calendar.AM_PM);
                String month = cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.US);
                String dayName = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US);
                int day = cal.get(Calendar.DAY_OF_MONTH);
                int year = cal.get(Calendar.YEAR);

                String AMorPM = "";
                
                if (AM_PM == 1){
                    AMorPM = "PM";
                }
                else{
                    AMorPM = "AM";
                }
                
                String date = dayName + " " + month + " " + day + ", " + year;
                String time = hour + ":" + String.format("%02d", minute) 
                        + ":" + String.format("%02d", second) + " " + AMorPM;
                jLabelDate.setText(date);
                jLabelClock.setText(time);
        }
    }
}