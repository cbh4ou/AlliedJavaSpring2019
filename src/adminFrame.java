
import java.awt.CardLayout;
import java.awt.Color;
import java.util.Calendar;
import java.util.Locale;

public class adminFrame extends javax.swing.JFrame implements Runnable{
    private int mouseX;
    private int mouseY;
    
    public adminFrame() {
        Thread t = new Thread(this);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exit = new javax.swing.JLabel();
        jLabelDrag = new javax.swing.JLabel();
        clockDate = new javax.swing.JPanel();
        jLabelClock = new javax.swing.JLabel();
        jLabelDate = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        home = new javax.swing.JPanel();
        homeLabel = new javax.swing.JLabel();
        homeIcon = new javax.swing.JLabel();
        logout = new javax.swing.JPanel();
        logoutLabel = new javax.swing.JLabel();
        logoutIcon = new javax.swing.JLabel();
        tasksButton = new javax.swing.JLabel();
        scheduleButton1 = new javax.swing.JLabel();
        profileButton = new javax.swing.JLabel();
        pRegLabel = new javax.swing.JLabel();
        pSearchLabel = new javax.swing.JLabel();
        profilePanel = new javax.swing.JPanel();
        CardPanel = new javax.swing.JPanel();
        registerPanel = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        searchPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        Card3 = new javax.swing.JPanel();
        Tasks = new javax.swing.JPanel();
        Profile = new javax.swing.JPanel();
        Schedule = new javax.swing.JPanel();
        profileTitle = new javax.swing.JLabel();
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

        menu.setOpaque(false);
        menu.setLayout(null);

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

        menu.add(home);
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

        menu.add(logout);
        logout.setBounds(210, 761, 114, 40);

        tasksButton.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        tasksButton.setForeground(new java.awt.Color(255, 255, 255));
        tasksButton.setText("Tasks");
        tasksButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tasksButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tasksButtonMouseClicked(evt);
            }
        });
        menu.add(tasksButton);
        tasksButton.setBounds(290, 140, 40, 20);

        scheduleButton1.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        scheduleButton1.setForeground(new java.awt.Color(255, 255, 255));
        scheduleButton1.setText("Work Schedule");
        scheduleButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        scheduleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                scheduleButton1MouseClicked(evt);
            }
        });
        menu.add(scheduleButton1);
        scheduleButton1.setBounds(120, 140, 110, 20);

        profileButton.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        profileButton.setForeground(new java.awt.Color(255, 255, 255));
        profileButton.setText("Profile");
        profileButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profileButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileButtonMouseClicked(evt);
            }
        });
        menu.add(profileButton);
        profileButton.setBounds(20, 140, 50, 20);

        pRegLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        pRegLabel.setForeground(new java.awt.Color(255, 255, 255));
        pRegLabel.setText("Employee Registration");
        pRegLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pRegLabelMouseClicked(evt);
            }
        });
        menu.add(pRegLabel);
        pRegLabel.setBounds(50, 220, 250, 60);

        pSearchLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        pSearchLabel.setForeground(new java.awt.Color(255, 255, 255));
        pSearchLabel.setText("Employee Search");
        pSearchLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pSearchLabelMouseClicked(evt);
            }
        });
        menu.add(pSearchLabel);
        pSearchLabel.setBounds(50, 310, 220, 50);

        getContentPane().add(menu);
        menu.setBounds(0, 0, 350, 820);

        profilePanel.setOpaque(false);
        profilePanel.setLayout(null);

        CardPanel.setBackground(new Color(0,0,0,0));
        CardPanel.setOpaque(false);
        CardPanel.setLayout(new java.awt.CardLayout());

        registerPanel.setBackground(new Color(0,0,0,64));
        registerPanel.setDoubleBuffered(false);

        jButton2.setText("Employee Registration");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout registerPanelLayout = new javax.swing.GroupLayout(registerPanel);
        registerPanel.setLayout(registerPanelLayout);
        registerPanelLayout.setHorizontalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addGap(447, 447, 447)
                .addComponent(jButton2)
                .addContainerGap(454, Short.MAX_VALUE))
        );
        registerPanelLayout.setVerticalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jButton2)
                .addContainerGap(605, Short.MAX_VALUE))
        );

        CardPanel.add(registerPanel, "register");

        searchPanel.setBackground(new Color(0,0,0,64));
        searchPanel.setOpaque(true);

        jButton1.setText("jButton1");

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jButton1)
                .addContainerGap(727, Short.MAX_VALUE))
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jButton1)
                .addContainerGap(529, Short.MAX_VALUE))
        );

        CardPanel.add(searchPanel, "search");

        javax.swing.GroupLayout Card3Layout = new javax.swing.GroupLayout(Card3);
        Card3.setLayout(Card3Layout);
        Card3Layout.setHorizontalGroup(
            Card3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1040, Short.MAX_VALUE)
        );
        Card3Layout.setVerticalGroup(
            Card3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );

        CardPanel.add(Card3, "card4");

        javax.swing.GroupLayout TasksLayout = new javax.swing.GroupLayout(Tasks);
        Tasks.setLayout(TasksLayout);
        TasksLayout.setHorizontalGroup(
            TasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1040, Short.MAX_VALUE)
        );
        TasksLayout.setVerticalGroup(
            TasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );

        CardPanel.add(Tasks, "tasks");

        javax.swing.GroupLayout ProfileLayout = new javax.swing.GroupLayout(Profile);
        Profile.setLayout(ProfileLayout);
        ProfileLayout.setHorizontalGroup(
            ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1040, Short.MAX_VALUE)
        );
        ProfileLayout.setVerticalGroup(
            ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );

        CardPanel.add(Profile, "profile");

        javax.swing.GroupLayout ScheduleLayout = new javax.swing.GroupLayout(Schedule);
        Schedule.setLayout(ScheduleLayout);
        ScheduleLayout.setHorizontalGroup(
            ScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1040, Short.MAX_VALUE)
        );
        ScheduleLayout.setVerticalGroup(
            ScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );

        CardPanel.add(Schedule, "schedule");

        profilePanel.add(CardPanel);
        CardPanel.setBounds(30, 100, 1040, 660);

        profileTitle.setFont(new java.awt.Font("Yu Gothic", 1, 48)); // NOI18N
        profileTitle.setForeground(new java.awt.Color(255, 255, 255));
        profileTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profileTitle.setText("Profile");
        profilePanel.add(profileTitle);
        profileTitle.setBounds(150, 0, 740, 70);

        getContentPane().add(profilePanel);
        profilePanel.setBounds(350, 35, 1100, 780);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adminBackground.png"))); // NOI18N
        getContentPane().add(bg);
        bg.setBounds(0, 0, 1450, 816);

        setSize(new java.awt.Dimension(1460, 816));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelDragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDragMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x-getMouseX(), y-getMouseY());
    }//GEN-LAST:event_jLabelDragMouseDragged

    private void jLabelDragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDragMousePressed
        setMouseX(evt.getX());
        setMouseY(evt.getY());
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
        
    }//GEN-LAST:event_homeMouseClicked

    private void tasksButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tasksButtonMouseClicked
        profileTitle.setText("Tasks");
        CardLayout cl = (CardLayout)(CardPanel.getLayout());
        cl.show(CardPanel, "tasks");
    }//GEN-LAST:event_tasksButtonMouseClicked

    private void scheduleButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scheduleButton1MouseClicked
       profileTitle.setText("Schedules");
        CardLayout cl = (CardLayout)(CardPanel.getLayout());
        cl.show(CardPanel, "schedule");
    }//GEN-LAST:event_scheduleButton1MouseClicked

    private void profileButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileButtonMouseClicked
        profileTitle.setText("Profile");
        CardLayout cl = (CardLayout)(CardPanel.getLayout());
        cl.show(CardPanel, "profile");
    }//GEN-LAST:event_profileButtonMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void pRegLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pRegLabelMouseClicked
        profileTitle.setText("Employee Registration");
        CardLayout cl = (CardLayout)(CardPanel.getLayout());
        cl.show(CardPanel, "register");
    }//GEN-LAST:event_pRegLabelMouseClicked

    private void pSearchLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pSearchLabelMouseClicked
        profileTitle.setText("Employee Search");
        CardLayout cl = (CardLayout)(CardPanel.getLayout());
        cl.show(CardPanel, "search");
    }//GEN-LAST:event_pSearchLabelMouseClicked

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Card3;
    private javax.swing.JPanel CardPanel;
    private javax.swing.JPanel Profile;
    private javax.swing.JPanel Schedule;
    private javax.swing.JPanel Tasks;
    private javax.swing.JLabel bg;
    private javax.swing.JPanel clockDate;
    private javax.swing.JLabel exit;
    private javax.swing.JPanel home;
    private javax.swing.JLabel homeIcon;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabelClock;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelDrag;
    private javax.swing.JPanel logout;
    private javax.swing.JLabel logoutIcon;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel pRegLabel;
    private javax.swing.JLabel pSearchLabel;
    private javax.swing.JLabel profileButton;
    private javax.swing.JPanel profilePanel;
    private javax.swing.JLabel profileTitle;
    private javax.swing.JPanel registerPanel;
    private javax.swing.JLabel scheduleButton1;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JLabel tasksButton;
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

    /**
     * @return the mouseY
     */
    public int getMouseY() {
        return mouseY;
    }

    /**
     * @param mouseY the mouseY to set
     */
    public void setMouseY(int mouseY) {
        this.mouseY = mouseY;
    }

    /**
     * @return the mouseX
     */
    public int getMouseX() {
        return mouseX;
    }

    /**
     * @param mouseX the mouseX to set
     */
    public void setMouseX(int mouseX) {
        this.mouseX = mouseX;
    }
}
