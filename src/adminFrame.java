import java.awt.Color;
import java.util.Calendar;
import java.util.Locale;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class adminFrame extends javax.swing.JFrame implements Runnable{
    static DefaultListModel noteNameList = new DefaultListModel();
    String[] note = new String[500];
    int listIndex = 0;
    int previousIndex = 0;
    String previousString = "";
    private int mouseX;
    private int mouseY;
    
    public adminFrame() {
        Thread t = new Thread(this);
        t.start();
        initComponents();
        CardPanel.removeAll();
        CardPanel.add(homePanel);
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
        empRegister = new javax.swing.JPanel();
        pRegLabel = new javax.swing.JLabel();
        pRegIcon = new javax.swing.JLabel();
        empSearch = new javax.swing.JPanel();
        pSearchLabel = new javax.swing.JLabel();
        pSearchIcon = new javax.swing.JLabel();
        CardPanel = new javax.swing.JPanel();
        empRegPanel = new javax.swing.JPanel();
        empRegTitle = new javax.swing.JLabel();
        tranPanel1 = new javax.swing.JPanel();
        empIDTitle = new javax.swing.JLabel();
        employeeID = new javax.swing.JTextField();
        clearButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        firstName = new javax.swing.JTextField();
        fNameTitle = new javax.swing.JLabel();
        lastName = new javax.swing.JTextField();
        lNameTitle = new javax.swing.JLabel();
        phoneTitle = new javax.swing.JLabel();
        phoneNumber = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        emailTitle = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        passTitle = new javax.swing.JLabel();
        reenterPassTitle = new javax.swing.JLabel();
        reenterPassword = new javax.swing.JTextField();
        roleTitle = new javax.swing.JLabel();
        employeeRole = new javax.swing.JComboBox<>();
        fieldTitle = new javax.swing.JLabel();
        field = new javax.swing.JTextField();
        scheduleTitle = new javax.swing.JLabel();
        workSchedule = new javax.swing.JTextField();
        empSearchPanel = new javax.swing.JPanel();
        empSearchTitle = new javax.swing.JLabel();
        tranPanel2 = new javax.swing.JPanel();
        searchFirstName = new javax.swing.JTextField();
        searchFNameTitle = new javax.swing.JLabel();
        searchLastNameTitle = new javax.swing.JLabel();
        searchLastName = new javax.swing.JTextField();
        searchEmpID = new javax.swing.JTextField();
        empIDTitle1 = new javax.swing.JLabel();
        editButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        empSearchTable = new javax.swing.JTable();
        profilePanel = new javax.swing.JPanel();
        profileTitle = new javax.swing.JLabel();
        tranPanel3 = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        profilePhone = new javax.swing.JLabel();
        profilePhoneTitle = new javax.swing.JLabel();
        profileEmail = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        profileEmailTitle = new javax.swing.JLabel();
        profileRole = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        profileRoleTitle = new javax.swing.JLabel();
        profileName = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        profileNameTitle = new javax.swing.JLabel();
        profileID = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        profileIDTitle = new javax.swing.JLabel();
        workSchPanel = new javax.swing.JPanel();
        workSchTitle = new javax.swing.JLabel();
        tranPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        tasksPanel = new javax.swing.JPanel();
        tasksTitle = new javax.swing.JLabel();
        tranPanel5 = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();
        homePanel = new javax.swing.JPanel();
        homeTitle = new javax.swing.JLabel();
        tranPanel6 = new javax.swing.JPanel();
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
        logout.setBounds(210, 761, 110, 40);

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

        empRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        empRegister.setOpaque(false);
        empRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                empRegisterMouseClicked(evt);
            }
        });
        empRegister.setLayout(null);

        pRegLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        pRegLabel.setForeground(new java.awt.Color(255, 255, 255));
        pRegLabel.setText("Employee Registration");
        empRegister.add(pRegLabel);
        pRegLabel.setBounds(46, 5, 260, 35);

        pRegIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/personIcon.png"))); // NOI18N
        empRegister.add(pRegIcon);
        pRegIcon.setBounds(3, 0, 40, 40);

        menu.add(empRegister);
        empRegister.setBounds(30, 200, 310, 40);

        empSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        empSearch.setOpaque(false);
        empSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                empSearchMouseClicked(evt);
            }
        });
        empSearch.setLayout(null);

        pSearchLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        pSearchLabel.setForeground(new java.awt.Color(255, 255, 255));
        pSearchLabel.setText("Employee Search");
        empSearch.add(pSearchLabel);
        pSearchLabel.setBounds(50, 5, 200, 35);

        pSearchIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/searchIcon.png"))); // NOI18N
        empSearch.add(pSearchIcon);
        pSearchIcon.setBounds(0, 5, 34, 34);

        menu.add(empSearch);
        empSearch.setBounds(28, 270, 260, 40);

        getContentPane().add(menu);
        menu.setBounds(0, 0, 350, 820);

        CardPanel.setOpaque(false);
        CardPanel.setLayout(new java.awt.CardLayout());

        empRegPanel.setOpaque(false);
        empRegPanel.setLayout(null);

        empRegTitle.setFont(new java.awt.Font("Yu Gothic Light", 1, 48)); // NOI18N
        empRegTitle.setForeground(new java.awt.Color(255, 255, 255));
        empRegTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        empRegTitle.setText("Employee Registration");
        empRegPanel.add(empRegTitle);
        empRegTitle.setBounds(270, 15, 590, 70);

        tranPanel1.setLayout(null);

        empIDTitle.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        empIDTitle.setForeground(new java.awt.Color(255, 255, 255));
        empIDTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        empIDTitle.setText("Role:");
        tranPanel1.add(empIDTitle);
        empIDTitle.setBounds(40, 90, 140, 21);

        employeeID.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        tranPanel1.add(employeeID);
        employeeID.setBounds(650, 80, 130, 30);

        clearButton.setBackground(new java.awt.Color(71, 177, 175));
        clearButton.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        clearButton.setForeground(new java.awt.Color(255, 255, 255));
        clearButton.setText("Clear");
        clearButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tranPanel1.add(clearButton);
        clearButton.setBounds(880, 120, 140, 50);

        saveButton.setBackground(new java.awt.Color(71, 177, 175));
        saveButton.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        saveButton.setForeground(new java.awt.Color(255, 255, 255));
        saveButton.setText("Save");
        saveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tranPanel1.add(saveButton);
        saveButton.setBounds(880, 50, 140, 50);

        firstName.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        tranPanel1.add(firstName);
        firstName.setBounds(190, 190, 170, 30);

        fNameTitle.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        fNameTitle.setForeground(new java.awt.Color(255, 255, 255));
        fNameTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        fNameTitle.setText("First Name:");
        tranPanel1.add(fNameTitle);
        fNameTitle.setBounds(60, 200, 120, 21);

        lastName.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        tranPanel1.add(lastName);
        lastName.setBounds(650, 190, 170, 30);

        lNameTitle.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lNameTitle.setForeground(new java.awt.Color(255, 255, 255));
        lNameTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lNameTitle.setText("Last Name:");
        tranPanel1.add(lNameTitle);
        lNameTitle.setBounds(510, 200, 130, 21);

        phoneTitle.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        phoneTitle.setForeground(new java.awt.Color(255, 255, 255));
        phoneTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        phoneTitle.setText("Phone Number:");
        tranPanel1.add(phoneTitle);
        phoneTitle.setBounds(470, 300, 170, 21);

        phoneNumber.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        tranPanel1.add(phoneNumber);
        phoneNumber.setBounds(650, 290, 170, 30);

        email.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        tranPanel1.add(email);
        email.setBounds(190, 290, 210, 30);

        emailTitle.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        emailTitle.setForeground(new java.awt.Color(255, 255, 255));
        emailTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        emailTitle.setText("E-mail Address:");
        tranPanel1.add(emailTitle);
        emailTitle.setBounds(10, 300, 170, 21);

        password.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        tranPanel1.add(password);
        password.setBounds(190, 500, 170, 30);

        passTitle.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        passTitle.setForeground(new java.awt.Color(255, 255, 255));
        passTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        passTitle.setText("Password:");
        tranPanel1.add(passTitle);
        passTitle.setBounds(10, 510, 170, 21);

        reenterPassTitle.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        reenterPassTitle.setForeground(new java.awt.Color(255, 255, 255));
        reenterPassTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        reenterPassTitle.setText("Re-Enter Password:");
        tranPanel1.add(reenterPassTitle);
        reenterPassTitle.setBounds(450, 510, 190, 21);

        reenterPassword.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        tranPanel1.add(reenterPassword);
        reenterPassword.setBounds(650, 500, 170, 30);

        roleTitle.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        roleTitle.setForeground(new java.awt.Color(255, 255, 255));
        roleTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        roleTitle.setText("Employee ID:");
        tranPanel1.add(roleTitle);
        roleTitle.setBounds(500, 90, 140, 21);

        employeeRole.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        employeeRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Role", "Receptionist", "Doctor", "Admin" }));
        tranPanel1.add(employeeRole);
        employeeRole.setBounds(190, 82, 170, 31);

        fieldTitle.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        fieldTitle.setForeground(new java.awt.Color(255, 255, 255));
        fieldTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        fieldTitle.setText("Medical Field:");
        tranPanel1.add(fieldTitle);
        fieldTitle.setBounds(230, 410, 170, 21);

        field.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        tranPanel1.add(field);
        field.setBounds(410, 400, 170, 30);

        scheduleTitle.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        scheduleTitle.setForeground(new java.awt.Color(255, 255, 255));
        scheduleTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        scheduleTitle.setText("Work Schedule:");
        tranPanel1.add(scheduleTitle);
        scheduleTitle.setBounds(140, 600, 170, 21);

        workSchedule.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        tranPanel1.add(workSchedule);
        workSchedule.setBounds(320, 590, 450, 30);

        empRegPanel.add(tranPanel1);
        tranPanel1.setBounds(10, 90, 1080, 683);
        tranPanel1.setBackground(new Color(0,0,0,80));

        CardPanel.add(empRegPanel, "card2");

        empSearchPanel.setOpaque(false);
        empSearchPanel.setLayout(null);

        empSearchTitle.setFont(new java.awt.Font("Yu Gothic Light", 1, 48)); // NOI18N
        empSearchTitle.setForeground(new java.awt.Color(255, 255, 255));
        empSearchTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        empSearchTitle.setText("Employee Search");
        empSearchPanel.add(empSearchTitle);
        empSearchTitle.setBounds(280, 15, 580, 70);

        tranPanel2.setLayout(null);

        searchFirstName.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        tranPanel2.add(searchFirstName);
        searchFirstName.setBounds(550, 60, 170, 30);

        searchFNameTitle.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        searchFNameTitle.setForeground(new java.awt.Color(255, 255, 255));
        searchFNameTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        searchFNameTitle.setText("First Name:");
        tranPanel2.add(searchFNameTitle);
        searchFNameTitle.setBounds(420, 70, 120, 21);

        searchLastNameTitle.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        searchLastNameTitle.setForeground(new java.awt.Color(255, 255, 255));
        searchLastNameTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        searchLastNameTitle.setText("Last Name:");
        tranPanel2.add(searchLastNameTitle);
        searchLastNameTitle.setBounds(410, 140, 130, 21);

        searchLastName.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        tranPanel2.add(searchLastName);
        searchLastName.setBounds(550, 130, 170, 30);

        searchEmpID.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        tranPanel2.add(searchEmpID);
        searchEmpID.setBounds(220, 60, 130, 30);

        empIDTitle1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        empIDTitle1.setForeground(new java.awt.Color(255, 255, 255));
        empIDTitle1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        empIDTitle1.setText("Employee ID:");
        tranPanel2.add(empIDTitle1);
        empIDTitle1.setBounds(70, 70, 140, 21);

        editButton.setBackground(new java.awt.Color(71, 177, 175));
        editButton.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        editButton.setForeground(new java.awt.Color(255, 255, 255));
        editButton.setText("Edit");
        editButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tranPanel2.add(editButton);
        editButton.setBounds(880, 120, 140, 50);

        searchButton.setBackground(new java.awt.Color(71, 177, 175));
        searchButton.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.setText("Search");
        searchButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tranPanel2.add(searchButton);
        searchButton.setBounds(880, 50, 140, 50);

        empSearchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "First Name", "Last Name", "Phone Number", "Email"
            }
        ));
        jScrollPane1.setViewportView(empSearchTable);
        if (empSearchTable.getColumnModel().getColumnCount() > 0) {
            empSearchTable.getColumnModel().getColumn(0).setResizable(false);
            empSearchTable.getColumnModel().getColumn(0).setPreferredWidth(40);
            empSearchTable.getColumnModel().getColumn(1).setResizable(false);
            empSearchTable.getColumnModel().getColumn(2).setResizable(false);
            empSearchTable.getColumnModel().getColumn(3).setResizable(false);
            empSearchTable.getColumnModel().getColumn(4).setResizable(false);
        }

        tranPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 210, 1060, 460);

        empSearchPanel.add(tranPanel2);
        tranPanel2.setBounds(10, 90, 1080, 683);
        tranPanel2.setBackground(new Color(0,0,0,80));

        CardPanel.add(empSearchPanel, "card3");

        profilePanel.setOpaque(false);
        profilePanel.setLayout(null);

        profileTitle.setFont(new java.awt.Font("Yu Gothic Light", 1, 48)); // NOI18N
        profileTitle.setForeground(new java.awt.Color(255, 255, 255));
        profileTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profileTitle.setText("Profile");
        profilePanel.add(profileTitle);
        profileTitle.setBounds(360, 15, 380, 70);

        tranPanel3.setLayout(null);

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        tranPanel3.add(jSeparator4);
        jSeparator4.setBounds(140, 360, 310, 10);

        profilePhone.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        profilePhone.setForeground(new java.awt.Color(255, 255, 255));
        tranPanel3.add(profilePhone);
        profilePhone.setBounds(140, 340, 310, 20);

        profilePhoneTitle.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        profilePhoneTitle.setForeground(new java.awt.Color(255, 255, 255));
        profilePhoneTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        profilePhoneTitle.setText("Phone Number:");
        tranPanel3.add(profilePhoneTitle);
        profilePhoneTitle.setBounds(130, 300, 220, 28);

        profileEmail.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        profileEmail.setForeground(new java.awt.Color(255, 255, 255));
        tranPanel3.add(profileEmail);
        profileEmail.setBounds(560, 340, 310, 20);

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        tranPanel3.add(jSeparator5);
        jSeparator5.setBounds(560, 360, 310, 10);

        profileEmailTitle.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        profileEmailTitle.setForeground(new java.awt.Color(255, 255, 255));
        profileEmailTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        profileEmailTitle.setText("Email:");
        tranPanel3.add(profileEmailTitle);
        profileEmailTitle.setBounds(560, 300, 150, 28);

        profileRole.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        profileRole.setForeground(new java.awt.Color(255, 255, 255));
        tranPanel3.add(profileRole);
        profileRole.setBounds(560, 210, 310, 20);

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        tranPanel3.add(jSeparator3);
        jSeparator3.setBounds(560, 230, 310, 10);

        profileRoleTitle.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        profileRoleTitle.setForeground(new java.awt.Color(255, 255, 255));
        profileRoleTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        profileRoleTitle.setText("Role:");
        tranPanel3.add(profileRoleTitle);
        profileRoleTitle.setBounds(560, 170, 90, 28);

        profileName.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        profileName.setForeground(new java.awt.Color(255, 255, 255));
        tranPanel3.add(profileName);
        profileName.setBounds(140, 207, 310, 23);

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        tranPanel3.add(jSeparator2);
        jSeparator2.setBounds(140, 230, 310, 10);

        profileNameTitle.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        profileNameTitle.setForeground(new java.awt.Color(255, 255, 255));
        profileNameTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        profileNameTitle.setText("Full Name:");
        tranPanel3.add(profileNameTitle);
        profileNameTitle.setBounds(130, 170, 170, 28);

        profileID.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        profileID.setForeground(new java.awt.Color(255, 255, 255));
        tranPanel3.add(profileID);
        profileID.setBounds(140, 100, 260, 20);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        tranPanel3.add(jSeparator1);
        jSeparator1.setBounds(140, 120, 220, 10);

        profileIDTitle.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        profileIDTitle.setForeground(new java.awt.Color(255, 255, 255));
        profileIDTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        profileIDTitle.setText("Employee ID:");
        tranPanel3.add(profileIDTitle);
        profileIDTitle.setBounds(130, 60, 170, 28);

        profilePanel.add(tranPanel3);
        tranPanel3.setBounds(10, 90, 1080, 683);
        tranPanel3.setBackground(new Color(0,0,0,80));

        CardPanel.add(profilePanel, "card5");

        workSchPanel.setOpaque(false);
        workSchPanel.setLayout(null);

        workSchTitle.setFont(new java.awt.Font("Yu Gothic Light", 1, 48)); // NOI18N
        workSchTitle.setForeground(new java.awt.Color(255, 255, 255));
        workSchTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        workSchTitle.setText("Work Schedule");
        workSchPanel.add(workSchTitle);
        workSchTitle.setBounds(360, 15, 380, 70);

        tranPanel4.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Employee ID", "Role", "First Name", "Last Name", "Schedule"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        tranPanel4.add(jScrollPane2);
        jScrollPane2.setBounds(10, 10, 1060, 660);

        workSchPanel.add(tranPanel4);
        tranPanel4.setBounds(10, 90, 1080, 683);
        tranPanel4.setBackground(new Color(0,0,0,80));

        CardPanel.add(workSchPanel, "card6");

        tasksPanel.setOpaque(false);
        tasksPanel.setLayout(null);

        tasksTitle.setFont(new java.awt.Font("Yu Gothic Light", 1, 48)); // NOI18N
        tasksTitle.setForeground(new java.awt.Color(255, 255, 255));
        tasksTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tasksTitle.setText("Tasks");
        tasksPanel.add(tasksTitle);
        tasksTitle.setBounds(360, 15, 380, 70);

        tranPanel5.setLayout(null);

        addButton.setBackground(new java.awt.Color(71, 177, 175));
        addButton.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("Add");
        addButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButtonMouseClicked(evt);
            }
        });
        tranPanel5.add(addButton);
        addButton.setBounds(20, 600, 140, 50);

        deleteButton.setBackground(new java.awt.Color(71, 177, 175));
        deleteButton.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Delete");
        deleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteButtonMouseClicked(evt);
            }
        });
        tranPanel5.add(deleteButton);
        deleteButton.setBounds(200, 600, 140, 50);

        jScrollPane3.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane3.setOpaque(false);

        jList.setBackground(new java.awt.Color(246, 243, 243));
        jList.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        jList.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jList.setForeground(new java.awt.Color(0, 0, 0));
        jList.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jList.setSelectionBackground(new java.awt.Color(153, 153, 153));
        jList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(jList);

        tranPanel5.add(jScrollPane3);
        jScrollPane3.setBounds(10, 20, 340, 560);

        jScrollPane4.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane4.setOpaque(false);

        jTextArea.setBackground(new java.awt.Color(246, 243, 243));
        jTextArea.setColumns(20);
        jTextArea.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTextArea.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea.setRows(5);
        jTextArea.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        jTextArea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextArea.setSelectionColor(new java.awt.Color(153, 153, 153));
        jScrollPane4.setViewportView(jTextArea);

        tranPanel5.add(jScrollPane4);
        jScrollPane4.setBounds(360, 20, 710, 650);

        tasksPanel.add(tranPanel5);
        tranPanel5.setBounds(10, 90, 1080, 683);
        tranPanel5.setBackground(new Color(0,0,0,80));

        CardPanel.add(tasksPanel, "card8");

        homePanel.setOpaque(false);
        homePanel.setLayout(null);

        homeTitle.setFont(new java.awt.Font("Yu Gothic Light", 1, 48)); // NOI18N
        homeTitle.setForeground(new java.awt.Color(255, 255, 255));
        homeTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeTitle.setText("Home");
        homePanel.add(homeTitle);
        homeTitle.setBounds(360, 15, 380, 70);

        tranPanel6.setLayout(null);
        homePanel.add(tranPanel6);
        tranPanel6.setBounds(10, 90, 1080, 683);
        tranPanel6.setBackground(new Color(0,0,0,80));

        CardPanel.add(homePanel, "card7");

        getContentPane().add(CardPanel);
        CardPanel.setBounds(351, 31, 1100, 784);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adminBackground.png"))); // NOI18N
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
        CardPanel.removeAll();
        CardPanel.add(homePanel);
        CardPanel.repaint();
        CardPanel.revalidate();
    }//GEN-LAST:event_homeMouseClicked

    private void tasksButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tasksButtonMouseClicked
        CardPanel.removeAll();
        CardPanel.add(tasksPanel);
        CardPanel.repaint();
        CardPanel.revalidate();
    }//GEN-LAST:event_tasksButtonMouseClicked

    private void scheduleButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scheduleButton1MouseClicked
        CardPanel.removeAll();
        CardPanel.add(workSchPanel);
        CardPanel.repaint();
        CardPanel.revalidate();
    }//GEN-LAST:event_scheduleButton1MouseClicked

    private void profileButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileButtonMouseClicked
        CardPanel.removeAll();
        CardPanel.add(profilePanel);
        CardPanel.repaint();
        CardPanel.revalidate();
    }//GEN-LAST:event_profileButtonMouseClicked

    private void empRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empRegisterMouseClicked
        CardPanel.removeAll();
        CardPanel.add(empRegPanel);
        CardPanel.repaint();
        CardPanel.revalidate();
    }//GEN-LAST:event_empRegisterMouseClicked

    private void empSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empSearchMouseClicked
        CardPanel.removeAll();
        CardPanel.add(empSearchPanel);
        CardPanel.repaint();
        CardPanel.revalidate();
    }//GEN-LAST:event_empSearchMouseClicked

    private void jListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListValueChanged
        previousIndex = listIndex;
        listIndex = jList.getSelectedIndex();

        previousString = jTextArea.getText();
        if(previousIndex != -1){
            note[previousIndex] = previousString;
        }

        if (listIndex != -1){
            jTextArea.setText(note[listIndex]);
        }
    }//GEN-LAST:event_jListValueChanged

    private void addButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseClicked
        String noteName = JOptionPane.showInputDialog(null, "Enter a name for the note:");

        noteNameList.addElement(noteName);

        jList.setModel(noteNameList);
    }//GEN-LAST:event_addButtonMouseClicked

    private void deleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseClicked
        if (listIndex != -1){
            for (int i = listIndex; i < jList.getModel().getSize(); i++){
                if (i + 1 < jList.getModel().getSize()){
                    note[i] = note[i + 1];
                }
            }
            jTextArea.setText(note[listIndex]);
            noteNameList.remove(listIndex);
        }
        
        note[jList.getModel().getSize()] = "";
        
        if (jList.getModel().getSize() == 0){
            jTextArea.setText("");
        }
    }//GEN-LAST:event_deleteButtonMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CardPanel;
    private javax.swing.JButton addButton;
    private javax.swing.JLabel bg;
    private javax.swing.JButton clearButton;
    private javax.swing.JPanel clockDate;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField email;
    private javax.swing.JLabel emailTitle;
    private javax.swing.JLabel empIDTitle;
    private javax.swing.JLabel empIDTitle1;
    private javax.swing.JPanel empRegPanel;
    private javax.swing.JLabel empRegTitle;
    private javax.swing.JPanel empRegister;
    private javax.swing.JPanel empSearch;
    private javax.swing.JPanel empSearchPanel;
    private javax.swing.JTable empSearchTable;
    private javax.swing.JLabel empSearchTitle;
    private javax.swing.JTextField employeeID;
    private javax.swing.JComboBox<String> employeeRole;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel fNameTitle;
    private javax.swing.JTextField field;
    private javax.swing.JLabel fieldTitle;
    private javax.swing.JTextField firstName;
    private javax.swing.JPanel home;
    private javax.swing.JLabel homeIcon;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JPanel homePanel;
    private javax.swing.JLabel homeTitle;
    private javax.swing.JLabel jLabelClock;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelDrag;
    private javax.swing.JList<String> jList;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea;
    private javax.swing.JLabel lNameTitle;
    private javax.swing.JTextField lastName;
    private javax.swing.JPanel logout;
    private javax.swing.JLabel logoutIcon;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel pRegIcon;
    private javax.swing.JLabel pRegLabel;
    private javax.swing.JLabel pSearchIcon;
    private javax.swing.JLabel pSearchLabel;
    private javax.swing.JLabel passTitle;
    private javax.swing.JTextField password;
    private javax.swing.JTextField phoneNumber;
    private javax.swing.JLabel phoneTitle;
    private javax.swing.JLabel profileButton;
    private javax.swing.JLabel profileEmail;
    private javax.swing.JLabel profileEmailTitle;
    private javax.swing.JLabel profileID;
    private javax.swing.JLabel profileIDTitle;
    private javax.swing.JLabel profileName;
    private javax.swing.JLabel profileNameTitle;
    private javax.swing.JPanel profilePanel;
    private javax.swing.JLabel profilePhone;
    private javax.swing.JLabel profilePhoneTitle;
    private javax.swing.JLabel profileRole;
    private javax.swing.JLabel profileRoleTitle;
    private javax.swing.JLabel profileTitle;
    private javax.swing.JLabel reenterPassTitle;
    private javax.swing.JTextField reenterPassword;
    private javax.swing.JLabel roleTitle;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel scheduleButton1;
    private javax.swing.JLabel scheduleTitle;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchEmpID;
    private javax.swing.JLabel searchFNameTitle;
    private javax.swing.JTextField searchFirstName;
    private javax.swing.JTextField searchLastName;
    private javax.swing.JLabel searchLastNameTitle;
    private javax.swing.JLabel tasksButton;
    private javax.swing.JPanel tasksPanel;
    private javax.swing.JLabel tasksTitle;
    private javax.swing.JPanel tranPanel1;
    private javax.swing.JPanel tranPanel2;
    private javax.swing.JPanel tranPanel3;
    private javax.swing.JPanel tranPanel4;
    private javax.swing.JPanel tranPanel5;
    private javax.swing.JPanel tranPanel6;
    private javax.swing.JPanel workSchPanel;
    private javax.swing.JLabel workSchTitle;
    private javax.swing.JTextField workSchedule;
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
