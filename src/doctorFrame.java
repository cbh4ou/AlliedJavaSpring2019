import Models.Users;
import java.awt.Color;
import java.util.Calendar;
import java.util.Locale;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class doctorFrame extends javax.swing.JFrame implements Runnable{
    static DefaultListModel noteNameList = new DefaultListModel();
    String[] note = new String[500];
    int listIndex = 0;
    int previousIndex = 0;
    String previousString = "";
    int mouseX;
    int mouseY;
    private final Users currentUser;
    public doctorFrame(Users currentUser) {
        this.currentUser = currentUser;
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
        tasksButton = new javax.swing.JLabel();
        scheduleButton = new javax.swing.JLabel();
        profileButton = new javax.swing.JLabel();
        patRegister = new javax.swing.JPanel();
        pRegLabel = new javax.swing.JLabel();
        pRegIcon = new javax.swing.JLabel();
        patSearch = new javax.swing.JPanel();
        pSearchLabel = new javax.swing.JLabel();
        pSearchIcon = new javax.swing.JLabel();
        pQueueButton = new javax.swing.JPanel();
        pQueueLabel = new javax.swing.JLabel();
        pQueueIcon = new javax.swing.JLabel();
        home = new javax.swing.JPanel();
        homeLabel = new javax.swing.JLabel();
        homeIcon = new javax.swing.JLabel();
        logout = new javax.swing.JPanel();
        logoutLabel = new javax.swing.JLabel();
        logoutIcon = new javax.swing.JLabel();
        CardPanel = new javax.swing.JPanel();
        patRegPanel = new javax.swing.JPanel();
        patRegTitle = new javax.swing.JLabel();
        tranPanel1 = new javax.swing.JPanel();
        fNameTitle1 = new javax.swing.JLabel();
        firstName1 = new javax.swing.JTextField();
        lNameTitle1 = new javax.swing.JLabel();
        lastName1 = new javax.swing.JTextField();
        phoneNumber1 = new javax.swing.JTextField();
        phoneTitle1 = new javax.swing.JLabel();
        email1 = new javax.swing.JTextField();
        emailTitle1 = new javax.swing.JLabel();
        clearButton1 = new javax.swing.JButton();
        saveButton1 = new javax.swing.JButton();
        roleTitle1 = new javax.swing.JLabel();
        patientID1 = new javax.swing.JTextField();
        mStatusTitle2 = new javax.swing.JLabel();
        dob1 = new javax.swing.JTextField();
        addressTitle1 = new javax.swing.JLabel();
        address1 = new javax.swing.JTextField();
        cityTitle1 = new javax.swing.JLabel();
        city1 = new javax.swing.JTextField();
        stateTitle1 = new javax.swing.JLabel();
        state1 = new javax.swing.JTextField();
        dobTitle1 = new javax.swing.JLabel();
        maritalStatus2 = new javax.swing.JComboBox<>();
        mStatusTitle3 = new javax.swing.JLabel();
        maritalStatus3 = new javax.swing.JComboBox<>();
        SSNTitle1 = new javax.swing.JLabel();
        SSN1 = new javax.swing.JTextField();
        insurancePanel1 = new javax.swing.JPanel();
        policy1 = new javax.swing.JTextField();
        policyTitle1 = new javax.swing.JLabel();
        holderTitle1 = new javax.swing.JLabel();
        policyHolder1 = new javax.swing.JTextField();
        policyNumberTitle1 = new javax.swing.JLabel();
        policyNumber1 = new javax.swing.JTextField();
        raceTitle1 = new javax.swing.JLabel();
        race1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        eNameTitle1 = new javax.swing.JLabel();
        emergencyName1 = new javax.swing.JTextField();
        ePhoneTitle1 = new javax.swing.JLabel();
        emergencyPhone1 = new javax.swing.JTextField();
        emergencyRelation1 = new javax.swing.JTextField();
        eRelationTitle1 = new javax.swing.JLabel();
        patSearchPanel = new javax.swing.JPanel();
        patSearchTitle = new javax.swing.JLabel();
        tranPanel2 = new javax.swing.JPanel();
        patIDTitle = new javax.swing.JLabel();
        searchPatID = new javax.swing.JTextField();
        searchFNameTitle = new javax.swing.JLabel();
        searchFirstName = new javax.swing.JTextField();
        searchLastName = new javax.swing.JTextField();
        searchLastNameTitle = new javax.swing.JLabel();
        editButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        patSearchTable = new javax.swing.JTable();
        searchPhone = new javax.swing.JTextField();
        searchLastNameTitle1 = new javax.swing.JLabel();
        patQPanel = new javax.swing.JPanel();
        patQTitle = new javax.swing.JLabel();
        tranPanel3 = new javax.swing.JPanel();
        searchDoctorButton = new javax.swing.JButton();
        reloadButton = new javax.swing.JButton();
        getPatButton = new javax.swing.JButton();
        ODPButton = new javax.swing.JButton();
        IDPButton = new javax.swing.JButton();
        dischargeButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        patQueueTable = new javax.swing.JTable();
        searchDoctor = new javax.swing.JTextField();
        profilePanel = new javax.swing.JPanel();
        profileTitle = new javax.swing.JLabel();
        tranPanel4 = new javax.swing.JPanel();
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
        ProfileID = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        profileIDTitle = new javax.swing.JLabel();
        workSchPanel = new javax.swing.JPanel();
        workSchTitle = new javax.swing.JLabel();
        tranPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        workScheduleTable = new javax.swing.JTable();
        tasksPanel = new javax.swing.JPanel();
        tasksTitle = new javax.swing.JLabel();
        tranPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();
        deleteButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        homePanel = new javax.swing.JPanel();
        homeTitle = new javax.swing.JLabel();
        tranPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        bg1 = new javax.swing.JLabel();

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
        tasksButton.setBounds(290, 143, 40, 20);

        scheduleButton.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        scheduleButton.setForeground(new java.awt.Color(255, 255, 255));
        scheduleButton.setText("Work Schedule");
        scheduleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        scheduleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                scheduleButtonMouseClicked(evt);
            }
        });
        menu.add(scheduleButton);
        scheduleButton.setBounds(120, 143, 110, 20);

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
        profileButton.setBounds(20, 143, 50, 20);

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
        pRegLabel.setBounds(46, 5, 240, 35);

        pRegIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/personIcon.png"))); // NOI18N
        patRegister.add(pRegIcon);
        pRegIcon.setBounds(3, 0, 40, 40);

        menu.add(patRegister);
        patRegister.setBounds(30, 200, 290, 40);

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
        pSearchLabel.setBounds(50, 5, 180, 35);

        pSearchIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/searchIcon.png"))); // NOI18N
        patSearch.add(pSearchIcon);
        pSearchIcon.setBounds(0, 5, 34, 34);

        menu.add(patSearch);
        patSearch.setBounds(28, 270, 240, 40);

        pQueueButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pQueueButton.setOpaque(false);
        pQueueButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pQueueButtonMouseClicked(evt);
            }
        });
        pQueueButton.setLayout(null);

        pQueueLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        pQueueLabel.setForeground(new java.awt.Color(255, 255, 255));
        pQueueLabel.setText("Patient Queue");
        pQueueButton.add(pQueueLabel);
        pQueueLabel.setBounds(50, 5, 170, 35);

        pQueueIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clockIcon.png"))); // NOI18N
        pQueueButton.add(pQueueIcon);
        pQueueIcon.setBounds(1, 5, 34, 34);

        menu.add(pQueueButton);
        pQueueButton.setBounds(28, 340, 230, 40);

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
        logout.setBounds(210, 761, 116, 40);

        getContentPane().add(menu);
        menu.setBounds(0, 0, 350, 820);

        CardPanel.setOpaque(false);
        CardPanel.setLayout(new java.awt.CardLayout());

        patRegPanel.setOpaque(false);
        patRegPanel.setLayout(null);

        patRegTitle.setFont(new java.awt.Font("Yu Gothic Light", 1, 48)); // NOI18N
        patRegTitle.setForeground(new java.awt.Color(255, 255, 255));
        patRegTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        patRegTitle.setText("Patient Registration");
        patRegPanel.add(patRegTitle);
        patRegTitle.setBounds(320, 15, 490, 70);

        tranPanel1.setLayout(null);

        fNameTitle1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        fNameTitle1.setForeground(new java.awt.Color(255, 255, 255));
        fNameTitle1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        fNameTitle1.setText("First Name:");
        tranPanel1.add(fNameTitle1);
        fNameTitle1.setBounds(40, 80, 120, 21);

        firstName1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        tranPanel1.add(firstName1);
        firstName1.setBounds(170, 70, 170, 30);

        lNameTitle1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lNameTitle1.setForeground(new java.awt.Color(255, 255, 255));
        lNameTitle1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lNameTitle1.setText("Last Name:");
        tranPanel1.add(lNameTitle1);
        lNameTitle1.setBounds(450, 80, 130, 21);

        lastName1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        tranPanel1.add(lastName1);
        lastName1.setBounds(590, 70, 170, 30);

        phoneNumber1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        tranPanel1.add(phoneNumber1);
        phoneNumber1.setBounds(590, 290, 170, 30);

        phoneTitle1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        phoneTitle1.setForeground(new java.awt.Color(255, 255, 255));
        phoneTitle1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        phoneTitle1.setText("Phone Number:");
        tranPanel1.add(phoneTitle1);
        phoneTitle1.setBounds(410, 290, 170, 21);

        email1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        tranPanel1.add(email1);
        email1.setBounds(170, 290, 200, 30);

        emailTitle1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        emailTitle1.setForeground(new java.awt.Color(255, 255, 255));
        emailTitle1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        emailTitle1.setText("E-mail Address:");
        tranPanel1.add(emailTitle1);
        emailTitle1.setBounds(0, 290, 160, 21);

        clearButton1.setBackground(new java.awt.Color(71, 177, 175));
        clearButton1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        clearButton1.setForeground(new java.awt.Color(255, 255, 255));
        clearButton1.setText("Clear");
        clearButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tranPanel1.add(clearButton1);
        clearButton1.setBounds(920, 90, 140, 50);

        saveButton1.setBackground(new java.awt.Color(71, 177, 175));
        saveButton1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        saveButton1.setForeground(new java.awt.Color(255, 255, 255));
        saveButton1.setText("Save");
        saveButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tranPanel1.add(saveButton1);
        saveButton1.setBounds(920, 20, 140, 50);

        roleTitle1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        roleTitle1.setForeground(new java.awt.Color(255, 255, 255));
        roleTitle1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        roleTitle1.setText("Patient ID:");
        tranPanel1.add(roleTitle1);
        roleTitle1.setBounds(20, 30, 140, 21);

        patientID1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        tranPanel1.add(patientID1);
        patientID1.setBounds(170, 20, 130, 30);

        mStatusTitle2.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        mStatusTitle2.setForeground(new java.awt.Color(255, 255, 255));
        mStatusTitle2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mStatusTitle2.setText("Marital Status:");
        tranPanel1.add(mStatusTitle2);
        mStatusTitle2.setBounds(420, 170, 160, 21);

        dob1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        tranPanel1.add(dob1);
        dob1.setBounds(170, 120, 130, 30);

        addressTitle1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        addressTitle1.setForeground(new java.awt.Color(255, 255, 255));
        addressTitle1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        addressTitle1.setText("Street Address:");
        tranPanel1.add(addressTitle1);
        addressTitle1.setBounds(0, 250, 160, 21);

        address1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        tranPanel1.add(address1);
        address1.setBounds(170, 240, 360, 30);

        cityTitle1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        cityTitle1.setForeground(new java.awt.Color(255, 255, 255));
        cityTitle1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cityTitle1.setText("City:");
        tranPanel1.add(cityTitle1);
        cityTitle1.setBounds(510, 240, 70, 21);

        city1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        tranPanel1.add(city1);
        city1.setBounds(590, 240, 150, 30);

        stateTitle1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        stateTitle1.setForeground(new java.awt.Color(255, 255, 255));
        stateTitle1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        stateTitle1.setText("State:");
        tranPanel1.add(stateTitle1);
        stateTitle1.setBounds(740, 240, 70, 21);

        state1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        tranPanel1.add(state1);
        state1.setBounds(810, 240, 120, 30);

        dobTitle1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        dobTitle1.setForeground(new java.awt.Color(255, 255, 255));
        dobTitle1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dobTitle1.setText("Date of Birth:");
        tranPanel1.add(dobTitle1);
        dobTitle1.setBounds(20, 130, 140, 21);

        maritalStatus2.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        maritalStatus2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Status", "Single", "Married" }));
        tranPanel1.add(maritalStatus2);
        maritalStatus2.setBounds(590, 170, 150, 30);

        mStatusTitle3.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        mStatusTitle3.setForeground(new java.awt.Color(255, 255, 255));
        mStatusTitle3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mStatusTitle3.setText("Gender:");
        tranPanel1.add(mStatusTitle3);
        mStatusTitle3.setBounds(480, 120, 100, 21);

        maritalStatus3.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        maritalStatus3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Gender", "Male", "Female" }));
        tranPanel1.add(maritalStatus3);
        maritalStatus3.setBounds(590, 120, 150, 30);

        SSNTitle1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        SSNTitle1.setForeground(new java.awt.Color(255, 255, 255));
        SSNTitle1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        SSNTitle1.setText("Social Security:");
        tranPanel1.add(SSNTitle1);
        SSNTitle1.setBounds(420, 30, 160, 21);

        SSN1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        tranPanel1.add(SSN1);
        SSN1.setBounds(590, 20, 140, 30);

        insurancePanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Insurance Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        insurancePanel1.setOpaque(false);
        insurancePanel1.setLayout(null);

        policy1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        insurancePanel1.add(policy1);
        policy1.setBounds(180, 50, 250, 30);

        policyTitle1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        policyTitle1.setForeground(new java.awt.Color(255, 255, 255));
        policyTitle1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        policyTitle1.setText("Primary Policy:");
        insurancePanel1.add(policyTitle1);
        policyTitle1.setBounds(10, 60, 160, 21);

        holderTitle1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        holderTitle1.setForeground(new java.awt.Color(255, 255, 255));
        holderTitle1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        holderTitle1.setText("Policy Holder:");
        insurancePanel1.add(holderTitle1);
        holderTitle1.setBounds(10, 120, 160, 21);

        policyHolder1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        insurancePanel1.add(policyHolder1);
        policyHolder1.setBounds(180, 110, 250, 30);

        policyNumberTitle1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        policyNumberTitle1.setForeground(new java.awt.Color(255, 255, 255));
        policyNumberTitle1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        policyNumberTitle1.setText("Policy Number:");
        insurancePanel1.add(policyNumberTitle1);
        policyNumberTitle1.setBounds(10, 180, 160, 21);

        policyNumber1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        insurancePanel1.add(policyNumber1);
        policyNumber1.setBounds(180, 170, 250, 30);

        tranPanel1.add(insurancePanel1);
        insurancePanel1.setBounds(40, 390, 470, 240);

        raceTitle1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        raceTitle1.setForeground(new java.awt.Color(255, 255, 255));
        raceTitle1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        raceTitle1.setText("Ethnic Race:");
        tranPanel1.add(raceTitle1);
        raceTitle1.setBounds(0, 180, 160, 21);

        race1.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        race1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Race", "Caucasian", "African American", "Asian", "Native Hawaiian/Pacific Islander", "American Indian/Alaskan Native", "Hispanic", "Other" }));
        tranPanel1.add(race1);
        race1.setBounds(170, 170, 200, 30);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Emergency Contact", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setOpaque(false);
        jPanel2.setLayout(null);

        eNameTitle1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        eNameTitle1.setForeground(new java.awt.Color(255, 255, 255));
        eNameTitle1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        eNameTitle1.setText("Name:");
        jPanel2.add(eNameTitle1);
        eNameTitle1.setBounds(100, 60, 100, 21);

        emergencyName1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jPanel2.add(emergencyName1);
        emergencyName1.setBounds(210, 50, 220, 30);

        ePhoneTitle1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        ePhoneTitle1.setForeground(new java.awt.Color(255, 255, 255));
        ePhoneTitle1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ePhoneTitle1.setText("Phone Number:");
        jPanel2.add(ePhoneTitle1);
        ePhoneTitle1.setBounds(40, 120, 160, 21);

        emergencyPhone1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jPanel2.add(emergencyPhone1);
        emergencyPhone1.setBounds(210, 110, 220, 30);

        emergencyRelation1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jPanel2.add(emergencyRelation1);
        emergencyRelation1.setBounds(210, 170, 220, 30);

        eRelationTitle1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        eRelationTitle1.setForeground(new java.awt.Color(255, 255, 255));
        eRelationTitle1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        eRelationTitle1.setText("Relation to Patient:");
        jPanel2.add(eRelationTitle1);
        eRelationTitle1.setBounds(10, 180, 190, 21);

        tranPanel1.add(jPanel2);
        jPanel2.setBounds(570, 390, 470, 240);

        patRegPanel.add(tranPanel1);
        tranPanel1.setBounds(10, 90, 1080, 683);
        tranPanel1.setBackground(new Color(0,0,0,65));

        CardPanel.add(patRegPanel, "card2");

        patSearchPanel.setOpaque(false);
        patSearchPanel.setLayout(null);

        patSearchTitle.setFont(new java.awt.Font("Yu Gothic Light", 1, 48)); // NOI18N
        patSearchTitle.setForeground(new java.awt.Color(255, 255, 255));
        patSearchTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        patSearchTitle.setText("Patient Search");
        patSearchPanel.add(patSearchTitle);
        patSearchTitle.setBounds(320, 15, 490, 70);

        tranPanel2.setLayout(null);

        patIDTitle.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        patIDTitle.setForeground(new java.awt.Color(255, 255, 255));
        patIDTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        patIDTitle.setText("Patient ID:");
        tranPanel2.add(patIDTitle);
        patIDTitle.setBounds(70, 70, 140, 21);

        searchPatID.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        tranPanel2.add(searchPatID);
        searchPatID.setBounds(220, 60, 130, 30);

        searchFNameTitle.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        searchFNameTitle.setForeground(new java.awt.Color(255, 255, 255));
        searchFNameTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        searchFNameTitle.setText("First Name:");
        tranPanel2.add(searchFNameTitle);
        searchFNameTitle.setBounds(420, 70, 120, 21);

        searchFirstName.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        tranPanel2.add(searchFirstName);
        searchFirstName.setBounds(550, 60, 170, 30);

        searchLastName.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        tranPanel2.add(searchLastName);
        searchLastName.setBounds(550, 130, 170, 30);

        searchLastNameTitle.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        searchLastNameTitle.setForeground(new java.awt.Color(255, 255, 255));
        searchLastNameTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        searchLastNameTitle.setText("Last Name:");
        tranPanel2.add(searchLastNameTitle);
        searchLastNameTitle.setBounds(410, 140, 130, 21);

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

        patSearchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "First Name", "Last Name", "Phone Number", "Email"
            }
        ));
        jScrollPane1.setViewportView(patSearchTable);

        tranPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 210, 1060, 460);

        searchPhone.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        tranPanel2.add(searchPhone);
        searchPhone.setBounds(220, 130, 170, 30);

        searchLastNameTitle1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        searchLastNameTitle1.setForeground(new java.awt.Color(255, 255, 255));
        searchLastNameTitle1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        searchLastNameTitle1.setText("Phone Number:");
        tranPanel2.add(searchLastNameTitle1);
        searchLastNameTitle1.setBounds(40, 140, 170, 21);

        patSearchPanel.add(tranPanel2);
        tranPanel2.setBounds(10, 90, 1080, 683);
        tranPanel2.setBackground(new Color(0,0,0,65));

        CardPanel.add(patSearchPanel, "card3");

        patQPanel.setOpaque(false);
        patQPanel.setLayout(null);

        patQTitle.setFont(new java.awt.Font("Yu Gothic Light", 1, 48)); // NOI18N
        patQTitle.setForeground(new java.awt.Color(255, 255, 255));
        patQTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        patQTitle.setText("Patient Queue");
        patQPanel.add(patQTitle);
        patQTitle.setBounds(370, 15, 380, 70);

        tranPanel3.setLayout(null);

        searchDoctorButton.setBackground(new java.awt.Color(71, 177, 175));
        searchDoctorButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        searchDoctorButton.setForeground(new java.awt.Color(255, 255, 255));
        searchDoctorButton.setText("Search By Doctor");
        searchDoctorButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tranPanel3.add(searchDoctorButton);
        searchDoctorButton.setBounds(330, 230, 190, 30);

        reloadButton.setBackground(new java.awt.Color(71, 177, 175));
        reloadButton.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        reloadButton.setForeground(new java.awt.Color(255, 255, 255));
        reloadButton.setText("Reload Queue");
        reloadButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tranPanel3.add(reloadButton);
        reloadButton.setBounds(130, 40, 210, 50);

        getPatButton.setBackground(new java.awt.Color(71, 177, 175));
        getPatButton.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        getPatButton.setForeground(new java.awt.Color(255, 255, 255));
        getPatButton.setText("Get My Patients");
        getPatButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tranPanel3.add(getPatButton);
        getPatButton.setBounds(130, 130, 210, 50);

        ODPButton.setBackground(new java.awt.Color(71, 177, 175));
        ODPButton.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        ODPButton.setForeground(new java.awt.Color(255, 255, 255));
        ODPButton.setText("Sent to ODP");
        ODPButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tranPanel3.add(ODPButton);
        ODPButton.setBounds(450, 40, 210, 50);

        IDPButton.setBackground(new java.awt.Color(71, 177, 175));
        IDPButton.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        IDPButton.setForeground(new java.awt.Color(255, 255, 255));
        IDPButton.setText("Sent to IDP");
        IDPButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tranPanel3.add(IDPButton);
        IDPButton.setBounds(450, 130, 210, 50);

        dischargeButton.setBackground(new java.awt.Color(71, 177, 175));
        dischargeButton.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        dischargeButton.setForeground(new java.awt.Color(255, 255, 255));
        dischargeButton.setText("Discharge");
        dischargeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tranPanel3.add(dischargeButton);
        dischargeButton.setBounds(760, 80, 210, 50);

        patQueueTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient ID", "First Name", "Last Name", "Doctor Name", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(patQueueTable);
        if (patQueueTable.getColumnModel().getColumnCount() > 0) {
            patQueueTable.getColumnModel().getColumn(0).setResizable(false);
            patQueueTable.getColumnModel().getColumn(0).setPreferredWidth(30);
            patQueueTable.getColumnModel().getColumn(1).setResizable(false);
            patQueueTable.getColumnModel().getColumn(2).setResizable(false);
            patQueueTable.getColumnModel().getColumn(3).setResizable(false);
            patQueueTable.getColumnModel().getColumn(4).setResizable(false);
        }

        tranPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(10, 290, 1060, 380);

        searchDoctor.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        tranPanel3.add(searchDoctor);
        searchDoctor.setBounds(560, 230, 210, 30);

        patQPanel.add(tranPanel3);
        tranPanel3.setBounds(10, 90, 1080, 683);
        tranPanel3.setBackground(new Color(0,0,0,65));

        CardPanel.add(patQPanel, "card4");

        profilePanel.setOpaque(false);
        profilePanel.setLayout(null);

        profileTitle.setFont(new java.awt.Font("Yu Gothic Light", 1, 48)); // NOI18N
        profileTitle.setForeground(new java.awt.Color(255, 255, 255));
        profileTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profileTitle.setText("Profile");
        profilePanel.add(profileTitle);
        profileTitle.setBounds(360, 15, 380, 70);

        tranPanel4.setLayout(null);

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        tranPanel4.add(jSeparator4);
        jSeparator4.setBounds(140, 360, 310, 10);

        profilePhone.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        profilePhone.setForeground(new java.awt.Color(255, 255, 255));
        tranPanel4.add(profilePhone);
        profilePhone.setBounds(140, 340, 310, 20);

        profilePhoneTitle.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        profilePhoneTitle.setForeground(new java.awt.Color(255, 255, 255));
        profilePhoneTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        profilePhoneTitle.setText("Phone Number:");
        tranPanel4.add(profilePhoneTitle);
        profilePhoneTitle.setBounds(130, 300, 220, 28);

        profileEmail.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        profileEmail.setForeground(new java.awt.Color(255, 255, 255));
        tranPanel4.add(profileEmail);
        profileEmail.setBounds(560, 340, 310, 20);

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        tranPanel4.add(jSeparator5);
        jSeparator5.setBounds(560, 360, 310, 10);

        profileEmailTitle.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        profileEmailTitle.setForeground(new java.awt.Color(255, 255, 255));
        profileEmailTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        profileEmailTitle.setText("Email:");
        tranPanel4.add(profileEmailTitle);
        profileEmailTitle.setBounds(560, 300, 150, 28);

        profileRole.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        profileRole.setForeground(new java.awt.Color(255, 255, 255));
        tranPanel4.add(profileRole);
        profileRole.setBounds(560, 210, 310, 20);

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        tranPanel4.add(jSeparator3);
        jSeparator3.setBounds(560, 230, 310, 10);

        profileRoleTitle.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        profileRoleTitle.setForeground(new java.awt.Color(255, 255, 255));
        profileRoleTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        profileRoleTitle.setText("Role:");
        tranPanel4.add(profileRoleTitle);
        profileRoleTitle.setBounds(560, 170, 90, 28);

        profileName.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        profileName.setForeground(new java.awt.Color(255, 255, 255));
        tranPanel4.add(profileName);
        profileName.setBounds(140, 207, 310, 23);

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        tranPanel4.add(jSeparator2);
        jSeparator2.setBounds(140, 230, 310, 10);

        profileNameTitle.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        profileNameTitle.setForeground(new java.awt.Color(255, 255, 255));
        profileNameTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        profileNameTitle.setText("Full Name:");
        tranPanel4.add(profileNameTitle);
        profileNameTitle.setBounds(130, 170, 170, 28);

        ProfileID.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        ProfileID.setForeground(new java.awt.Color(255, 255, 255));
        tranPanel4.add(ProfileID);
        ProfileID.setBounds(140, 100, 260, 20);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        tranPanel4.add(jSeparator1);
        jSeparator1.setBounds(140, 120, 220, 10);

        profileIDTitle.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        profileIDTitle.setForeground(new java.awt.Color(255, 255, 255));
        profileIDTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        profileIDTitle.setText("Employee ID:");
        tranPanel4.add(profileIDTitle);
        profileIDTitle.setBounds(130, 60, 170, 28);

        profilePanel.add(tranPanel4);
        tranPanel4.setBounds(10, 90, 1080, 683);
        tranPanel4.setBackground(new Color(0,0,0,65));

        CardPanel.add(profilePanel, "card5");

        workSchPanel.setOpaque(false);
        workSchPanel.setLayout(null);

        workSchTitle.setFont(new java.awt.Font("Yu Gothic Light", 1, 48)); // NOI18N
        workSchTitle.setForeground(new java.awt.Color(255, 255, 255));
        workSchTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        workSchTitle.setText("Work Schedule");
        workSchPanel.add(workSchTitle);
        workSchTitle.setBounds(360, 15, 380, 70);

        tranPanel5.setLayout(null);

        workScheduleTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(workScheduleTable);
        if (workScheduleTable.getColumnModel().getColumnCount() > 0) {
            workScheduleTable.getColumnModel().getColumn(0).setPreferredWidth(30);
            workScheduleTable.getColumnModel().getColumn(1).setPreferredWidth(30);
        }

        tranPanel5.add(jScrollPane3);
        jScrollPane3.setBounds(10, 10, 1060, 660);

        workSchPanel.add(tranPanel5);
        tranPanel5.setBounds(10, 90, 1080, 683);
        tranPanel5.setBackground(new Color(0,0,0,65));

        CardPanel.add(workSchPanel, "card6");

        tasksPanel.setOpaque(false);
        tasksPanel.setLayout(null);

        tasksTitle.setFont(new java.awt.Font("Yu Gothic Light", 1, 48)); // NOI18N
        tasksTitle.setForeground(new java.awt.Color(255, 255, 255));
        tasksTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tasksTitle.setText("Tasks");
        tasksPanel.add(tasksTitle);
        tasksTitle.setBounds(360, 15, 380, 70);

        tranPanel6.setLayout(null);

        jScrollPane4.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane4.setOpaque(false);

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
        jScrollPane4.setViewportView(jList);

        tranPanel6.add(jScrollPane4);
        jScrollPane4.setBounds(10, 20, 340, 560);

        jScrollPane5.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane5.setOpaque(false);

        jTextArea.setBackground(new java.awt.Color(246, 243, 243));
        jTextArea.setColumns(20);
        jTextArea.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTextArea.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea.setRows(5);
        jTextArea.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        jTextArea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextArea.setSelectionColor(new java.awt.Color(153, 153, 153));
        jScrollPane5.setViewportView(jTextArea);

        tranPanel6.add(jScrollPane5);
        jScrollPane5.setBounds(360, 20, 710, 650);

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
        tranPanel6.add(deleteButton);
        deleteButton.setBounds(200, 600, 140, 50);

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
        tranPanel6.add(addButton);
        addButton.setBounds(20, 600, 140, 50);

        tasksPanel.add(tranPanel6);
        tranPanel6.setBounds(10, 90, 1080, 683);
        tranPanel6.setBackground(new Color(0,0,0,65));

        CardPanel.add(tasksPanel, "card8");

        homePanel.setOpaque(false);
        homePanel.setLayout(null);

        homeTitle.setFont(new java.awt.Font("Yu Gothic Light", 1, 48)); // NOI18N
        homeTitle.setForeground(new java.awt.Color(255, 255, 255));
        homeTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeTitle.setText("Home");
        homePanel.add(homeTitle);
        homeTitle.setBounds(360, 15, 380, 70);

        tranPanel7.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText(currentUser.welcomeString());
        tranPanel7.add(jLabel2);
        jLabel2.setBounds(20, 40, 1010, 60);

        homePanel.add(tranPanel7);
        tranPanel7.setBounds(10, 90, 1080, 683);
        tranPanel7.setBackground(new Color(0,0,0,65));

        CardPanel.add(homePanel, "card7");

        getContentPane().add(CardPanel);
        CardPanel.setBounds(351, 31, 1100, 784);

        bg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/docBackground.png"))); // NOI18N
        getContentPane().add(bg1);
        bg1.setBounds(0, 0, 1450, 816);

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

    private void patRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patRegisterMouseClicked
        CardPanel.removeAll();
        CardPanel.add(patRegPanel);
        CardPanel.repaint();
        CardPanel.revalidate();
    }//GEN-LAST:event_patRegisterMouseClicked

    private void patSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patSearchMouseClicked
        CardPanel.removeAll();
        CardPanel.add(patSearchPanel);
        CardPanel.repaint();
        CardPanel.revalidate();
    }//GEN-LAST:event_patSearchMouseClicked

    private void pQueueButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pQueueButtonMouseClicked
        CardPanel.removeAll();
        CardPanel.add(patQPanel);
        CardPanel.repaint();
        CardPanel.revalidate();
    }//GEN-LAST:event_pQueueButtonMouseClicked

    private void profileButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileButtonMouseClicked
        CardPanel.removeAll();
        CardPanel.add(profilePanel);
        CardPanel.repaint();
        CardPanel.revalidate();
    }//GEN-LAST:event_profileButtonMouseClicked

    private void scheduleButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scheduleButtonMouseClicked
        CardPanel.removeAll();
        CardPanel.add(workSchPanel);
        CardPanel.repaint();
        CardPanel.revalidate();
    }//GEN-LAST:event_scheduleButtonMouseClicked

    private void tasksButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tasksButtonMouseClicked
        CardPanel.removeAll();
        CardPanel.add(tasksPanel);
        CardPanel.repaint();
        CardPanel.revalidate();
    }//GEN-LAST:event_tasksButtonMouseClicked

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

    private void addButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseClicked
        String noteName = JOptionPane.showInputDialog(null, "Enter a name for the note:");

        noteNameList.addElement(noteName);

        jList.setModel(noteNameList);
    }//GEN-LAST:event_addButtonMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CardPanel;
    private javax.swing.JButton IDPButton;
    private javax.swing.JButton ODPButton;
    private javax.swing.JLabel ProfileID;
    private javax.swing.JTextField SSN1;
    private javax.swing.JLabel SSNTitle1;
    private javax.swing.JButton addButton;
    private javax.swing.JTextField address1;
    private javax.swing.JLabel addressTitle1;
    private javax.swing.JLabel bg1;
    private javax.swing.JTextField city1;
    private javax.swing.JLabel cityTitle1;
    private javax.swing.JButton clearButton1;
    private javax.swing.JPanel clockDate;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton dischargeButton;
    private javax.swing.JTextField dob1;
    private javax.swing.JLabel dobTitle1;
    private javax.swing.JLabel eNameTitle1;
    private javax.swing.JLabel ePhoneTitle1;
    private javax.swing.JLabel eRelationTitle1;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField email1;
    private javax.swing.JLabel emailTitle1;
    private javax.swing.JTextField emergencyName1;
    private javax.swing.JTextField emergencyPhone1;
    private javax.swing.JTextField emergencyRelation1;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel fNameTitle1;
    private javax.swing.JTextField firstName1;
    private javax.swing.JButton getPatButton;
    private javax.swing.JLabel holderTitle1;
    private javax.swing.JPanel home;
    private javax.swing.JLabel homeIcon;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JPanel homePanel;
    private javax.swing.JLabel homeTitle;
    private javax.swing.JPanel insurancePanel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelClock;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelDrag;
    private javax.swing.JList<String> jList;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextArea jTextArea;
    private javax.swing.JLabel lNameTitle1;
    private javax.swing.JTextField lastName1;
    private javax.swing.JPanel logout;
    private javax.swing.JLabel logoutIcon;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JLabel mStatusTitle2;
    private javax.swing.JLabel mStatusTitle3;
    private javax.swing.JComboBox<String> maritalStatus2;
    private javax.swing.JComboBox<String> maritalStatus3;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel pQueueButton;
    private javax.swing.JLabel pQueueIcon;
    private javax.swing.JLabel pQueueLabel;
    private javax.swing.JLabel pRegIcon;
    private javax.swing.JLabel pRegLabel;
    private javax.swing.JLabel pSearchIcon;
    private javax.swing.JLabel pSearchLabel;
    private javax.swing.JLabel patIDTitle;
    private javax.swing.JPanel patQPanel;
    private javax.swing.JLabel patQTitle;
    private javax.swing.JTable patQueueTable;
    private javax.swing.JPanel patRegPanel;
    private javax.swing.JLabel patRegTitle;
    private javax.swing.JPanel patRegister;
    private javax.swing.JPanel patSearch;
    private javax.swing.JPanel patSearchPanel;
    private javax.swing.JTable patSearchTable;
    private javax.swing.JLabel patSearchTitle;
    private javax.swing.JTextField patientID1;
    private javax.swing.JTextField phoneNumber1;
    private javax.swing.JLabel phoneTitle1;
    private javax.swing.JTextField policy1;
    private javax.swing.JTextField policyHolder1;
    private javax.swing.JTextField policyNumber1;
    private javax.swing.JLabel policyNumberTitle1;
    private javax.swing.JLabel policyTitle1;
    private javax.swing.JLabel profileButton;
    private javax.swing.JLabel profileEmail;
    private javax.swing.JLabel profileEmailTitle;
    private javax.swing.JLabel profileIDTitle;
    private javax.swing.JLabel profileName;
    private javax.swing.JLabel profileNameTitle;
    private javax.swing.JPanel profilePanel;
    private javax.swing.JLabel profilePhone;
    private javax.swing.JLabel profilePhoneTitle;
    private javax.swing.JLabel profileRole;
    private javax.swing.JLabel profileRoleTitle;
    private javax.swing.JLabel profileTitle;
    private javax.swing.JComboBox<String> race1;
    private javax.swing.JLabel raceTitle1;
    private javax.swing.JButton reloadButton;
    private javax.swing.JLabel roleTitle1;
    private javax.swing.JButton saveButton1;
    private javax.swing.JLabel scheduleButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchDoctor;
    private javax.swing.JButton searchDoctorButton;
    private javax.swing.JLabel searchFNameTitle;
    private javax.swing.JTextField searchFirstName;
    private javax.swing.JTextField searchLastName;
    private javax.swing.JLabel searchLastNameTitle;
    private javax.swing.JLabel searchLastNameTitle1;
    private javax.swing.JTextField searchPatID;
    private javax.swing.JTextField searchPhone;
    private javax.swing.JTextField state1;
    private javax.swing.JLabel stateTitle1;
    private javax.swing.JLabel tasksButton;
    private javax.swing.JPanel tasksPanel;
    private javax.swing.JLabel tasksTitle;
    private javax.swing.JPanel tranPanel1;
    private javax.swing.JPanel tranPanel2;
    private javax.swing.JPanel tranPanel3;
    private javax.swing.JPanel tranPanel4;
    private javax.swing.JPanel tranPanel5;
    private javax.swing.JPanel tranPanel6;
    private javax.swing.JPanel tranPanel7;
    private javax.swing.JPanel workSchPanel;
    private javax.swing.JLabel workSchTitle;
    private javax.swing.JTable workScheduleTable;
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
