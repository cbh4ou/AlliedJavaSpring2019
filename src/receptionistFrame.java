import java.awt.Color;
import java.util.Calendar;
import java.util.Locale;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;

public class receptionistFrame extends javax.swing.JFrame implements Runnable{
    static DefaultListModel noteNameList = new DefaultListModel();
    String[] note = new String[500];
    int listIndex = 0;
    int previousIndex = 0;
    String previousString = "";
    int mouseX;
    int mouseY;
    
    public receptionistFrame() {
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
        CardPanel = new javax.swing.JPanel();
        patRegPanel = new javax.swing.JPanel();
        patRegTitle = new javax.swing.JLabel();
        tranPanel1 = new javax.swing.JPanel();
        fNameTitle = new javax.swing.JLabel();
        firstName = new javax.swing.JTextField();
        lNameTitle = new javax.swing.JLabel();
        lastName = new javax.swing.JTextField();
        phoneNumber = new javax.swing.JTextField();
        phoneTitle = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        emailTitle = new javax.swing.JLabel();
        clearButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        roleTitle = new javax.swing.JLabel();
        patientID = new javax.swing.JTextField();
        mStatusTitle = new javax.swing.JLabel();
        dob = new javax.swing.JTextField();
        addressTitle = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        cityTitle = new javax.swing.JLabel();
        city = new javax.swing.JTextField();
        stateTitle = new javax.swing.JLabel();
        state = new javax.swing.JTextField();
        dobTitle = new javax.swing.JLabel();
        maritalStatus = new javax.swing.JComboBox<>();
        mStatusTitle1 = new javax.swing.JLabel();
        maritalStatus1 = new javax.swing.JComboBox<>();
        SSNTitle = new javax.swing.JLabel();
        SSN = new javax.swing.JTextField();
        insurancePanel = new javax.swing.JPanel();
        policy = new javax.swing.JTextField();
        policyTitle = new javax.swing.JLabel();
        holderTitle = new javax.swing.JLabel();
        policyHolder = new javax.swing.JTextField();
        policyNumberTitle = new javax.swing.JLabel();
        policyNumber = new javax.swing.JTextField();
        raceTitle = new javax.swing.JLabel();
        race = new javax.swing.JComboBox<>();
        languageTitle = new javax.swing.JLabel();
        language = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        eNameTitle = new javax.swing.JLabel();
        emergencyName = new javax.swing.JTextField();
        ePhoneTitle = new javax.swing.JLabel();
        emergencyPhone = new javax.swing.JTextField();
        emergencyRelation = new javax.swing.JTextField();
        eRelationTitle = new javax.swing.JLabel();
        patSearchPanel = new javax.swing.JPanel();
        patSearchTitle = new javax.swing.JLabel();
        tranPanel2 = new javax.swing.JPanel();
        patIDTitle = new javax.swing.JLabel();
        searchPatID = new javax.swing.JTextField();
        searchPhone = new javax.swing.JTextField();
        searchLastNameTitle1 = new javax.swing.JLabel();
        searchLastNameTitle = new javax.swing.JLabel();
        searchLastName = new javax.swing.JTextField();
        searchFirstName = new javax.swing.JTextField();
        searchFNameTitle = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        patSearchTable = new javax.swing.JTable();
        schAppointPanel = new javax.swing.JPanel();
        schAppointTitle = new javax.swing.JLabel();
        tranPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        scheduleTable = new javax.swing.JTable();
        tableNote = new javax.swing.JLabel();
        profilePanel = new javax.swing.JPanel();
        profileTitle = new javax.swing.JLabel();
        tranPanel4 = new javax.swing.JPanel();
        profileIDTitle = new javax.swing.JLabel();
        ProfileID = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        profileNameTitle = new javax.swing.JLabel();
        profileName = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        profileRoleTitle = new javax.swing.JLabel();
        profileRole = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        profilePhone = new javax.swing.JLabel();
        profilePhoneTitle = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        profileEmail = new javax.swing.JLabel();
        profileEmailTitle = new javax.swing.JLabel();
        workSchPanel = new javax.swing.JPanel();
        workSchTitle = new javax.swing.JLabel();
        tranPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        tasksPanel = new javax.swing.JPanel();
        homeTitle1 = new javax.swing.JLabel();
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
        pRegIcon.setBounds(3, 0, 40, 40);

        menu1.add(patRegister);
        patRegister.setBounds(30, 200, 270, 40);

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
        patSearch.setBounds(28, 270, 220, 40);

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
        schAppLabel.setBounds(50, 5, 260, 35);

        schAppIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/penPaperIcon.png"))); // NOI18N
        schedAppoint.add(schAppIcon);
        schAppIcon.setBounds(4, 2, 35, 40);

        menu1.add(schedAppoint);
        schedAppoint.setBounds(28, 340, 310, 40);

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

        fNameTitle.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        fNameTitle.setForeground(new java.awt.Color(255, 255, 255));
        fNameTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        fNameTitle.setText("First Name:");
        tranPanel1.add(fNameTitle);
        fNameTitle.setBounds(40, 80, 120, 21);

        firstName.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        tranPanel1.add(firstName);
        firstName.setBounds(170, 70, 170, 30);

        lNameTitle.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lNameTitle.setForeground(new java.awt.Color(255, 255, 255));
        lNameTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lNameTitle.setText("Last Name:");
        tranPanel1.add(lNameTitle);
        lNameTitle.setBounds(450, 80, 130, 21);

        lastName.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        tranPanel1.add(lastName);
        lastName.setBounds(590, 70, 170, 30);

        phoneNumber.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        tranPanel1.add(phoneNumber);
        phoneNumber.setBounds(750, 300, 170, 30);

        phoneTitle.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        phoneTitle.setForeground(new java.awt.Color(255, 255, 255));
        phoneTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        phoneTitle.setText("Phone Number:");
        tranPanel1.add(phoneTitle);
        phoneTitle.setBounds(570, 310, 170, 21);

        email.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        tranPanel1.add(email);
        email.setBounds(260, 300, 200, 30);

        emailTitle.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        emailTitle.setForeground(new java.awt.Color(255, 255, 255));
        emailTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        emailTitle.setText("E-mail Address:");
        tranPanel1.add(emailTitle);
        emailTitle.setBounds(90, 310, 160, 21);

        clearButton.setBackground(new java.awt.Color(71, 177, 175));
        clearButton.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        clearButton.setForeground(new java.awt.Color(255, 255, 255));
        clearButton.setText("Clear");
        clearButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tranPanel1.add(clearButton);
        clearButton.setBounds(920, 90, 140, 50);

        saveButton.setBackground(new java.awt.Color(71, 177, 175));
        saveButton.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        saveButton.setForeground(new java.awt.Color(255, 255, 255));
        saveButton.setText("Save");
        saveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tranPanel1.add(saveButton);
        saveButton.setBounds(920, 20, 140, 50);

        roleTitle.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        roleTitle.setForeground(new java.awt.Color(255, 255, 255));
        roleTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        roleTitle.setText("Patient ID:");
        tranPanel1.add(roleTitle);
        roleTitle.setBounds(20, 30, 140, 21);

        patientID.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        tranPanel1.add(patientID);
        patientID.setBounds(170, 20, 130, 30);

        mStatusTitle.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        mStatusTitle.setForeground(new java.awt.Color(255, 255, 255));
        mStatusTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mStatusTitle.setText("Marital Status:");
        tranPanel1.add(mStatusTitle);
        mStatusTitle.setBounds(280, 190, 160, 21);

        dob.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        tranPanel1.add(dob);
        dob.setBounds(150, 180, 130, 30);

        addressTitle.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        addressTitle.setForeground(new java.awt.Color(255, 255, 255));
        addressTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        addressTitle.setText("Street Address:");
        tranPanel1.add(addressTitle);
        addressTitle.setBounds(0, 250, 160, 21);

        address.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        tranPanel1.add(address);
        address.setBounds(170, 240, 390, 30);

        cityTitle.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        cityTitle.setForeground(new java.awt.Color(255, 255, 255));
        cityTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cityTitle.setText("City:");
        tranPanel1.add(cityTitle);
        cityTitle.setBounds(580, 250, 70, 21);

        city.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        tranPanel1.add(city);
        city.setBounds(660, 240, 150, 30);

        stateTitle.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        stateTitle.setForeground(new java.awt.Color(255, 255, 255));
        stateTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        stateTitle.setText("State:");
        tranPanel1.add(stateTitle);
        stateTitle.setBounds(840, 250, 70, 21);

        state.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        tranPanel1.add(state);
        state.setBounds(920, 240, 120, 30);

        dobTitle.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        dobTitle.setForeground(new java.awt.Color(255, 255, 255));
        dobTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dobTitle.setText("Date of Birth:");
        tranPanel1.add(dobTitle);
        dobTitle.setBounds(0, 190, 140, 21);

        maritalStatus.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        maritalStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Status", "Single", "Married" }));
        tranPanel1.add(maritalStatus);
        maritalStatus.setBounds(450, 184, 150, 31);

        mStatusTitle1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        mStatusTitle1.setForeground(new java.awt.Color(255, 255, 255));
        mStatusTitle1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mStatusTitle1.setText("Gender:");
        tranPanel1.add(mStatusTitle1);
        mStatusTitle1.setBounds(610, 190, 100, 21);

        maritalStatus1.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        maritalStatus1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Gender", "Male", "Female" }));
        tranPanel1.add(maritalStatus1);
        maritalStatus1.setBounds(720, 180, 150, 31);

        SSNTitle.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        SSNTitle.setForeground(new java.awt.Color(255, 255, 255));
        SSNTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        SSNTitle.setText("Social Security:");
        tranPanel1.add(SSNTitle);
        SSNTitle.setBounds(420, 30, 160, 21);

        SSN.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        tranPanel1.add(SSN);
        SSN.setBounds(590, 20, 140, 30);

        insurancePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Insurance Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        insurancePanel.setOpaque(false);
        insurancePanel.setLayout(null);

        policy.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        insurancePanel.add(policy);
        policy.setBounds(180, 50, 250, 30);

        policyTitle.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        policyTitle.setForeground(new java.awt.Color(255, 255, 255));
        policyTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        policyTitle.setText("Primary Policy:");
        insurancePanel.add(policyTitle);
        policyTitle.setBounds(10, 60, 160, 21);

        holderTitle.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        holderTitle.setForeground(new java.awt.Color(255, 255, 255));
        holderTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        holderTitle.setText("Policy Holder:");
        insurancePanel.add(holderTitle);
        holderTitle.setBounds(10, 120, 160, 21);

        policyHolder.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        insurancePanel.add(policyHolder);
        policyHolder.setBounds(180, 110, 250, 30);

        policyNumberTitle.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        policyNumberTitle.setForeground(new java.awt.Color(255, 255, 255));
        policyNumberTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        policyNumberTitle.setText("Policy Number:");
        insurancePanel.add(policyNumberTitle);
        policyNumberTitle.setBounds(10, 180, 160, 21);

        policyNumber.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        insurancePanel.add(policyNumber);
        policyNumber.setBounds(180, 170, 250, 30);

        tranPanel1.add(insurancePanel);
        insurancePanel.setBounds(40, 390, 470, 240);

        raceTitle.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        raceTitle.setForeground(new java.awt.Color(255, 255, 255));
        raceTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        raceTitle.setText("Ethnic Race:");
        tranPanel1.add(raceTitle);
        raceTitle.setBounds(60, 130, 160, 21);

        race.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        race.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Race", "Caucasian", "African American", "Asian", "Native Hawaiian/Pacific Islander", "American Indian/Alaskan Native", "Hispanic", "Other" }));
        tranPanel1.add(race);
        race.setBounds(230, 124, 200, 31);

        languageTitle.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        languageTitle.setForeground(new java.awt.Color(255, 255, 255));
        languageTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        languageTitle.setText("Language:");
        tranPanel1.add(languageTitle);
        languageTitle.setBounds(450, 130, 160, 21);

        language.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        language.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Language", "English", "Spanish", "French", "Arabic", "Chinese", "Korean", "Japanese", "Sign Language", "Other" }));
        tranPanel1.add(language);
        language.setBounds(620, 124, 180, 31);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Emergency Contact", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        eNameTitle.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        eNameTitle.setForeground(new java.awt.Color(255, 255, 255));
        eNameTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        eNameTitle.setText("Name:");
        jPanel1.add(eNameTitle);
        eNameTitle.setBounds(10, 60, 100, 21);

        emergencyName.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jPanel1.add(emergencyName);
        emergencyName.setBounds(120, 50, 310, 30);

        ePhoneTitle.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        ePhoneTitle.setForeground(new java.awt.Color(255, 255, 255));
        ePhoneTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ePhoneTitle.setText("Phone Number:");
        jPanel1.add(ePhoneTitle);
        ePhoneTitle.setBounds(10, 120, 160, 21);

        emergencyPhone.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jPanel1.add(emergencyPhone);
        emergencyPhone.setBounds(180, 110, 250, 30);

        emergencyRelation.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jPanel1.add(emergencyRelation);
        emergencyRelation.setBounds(210, 170, 220, 30);

        eRelationTitle.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        eRelationTitle.setForeground(new java.awt.Color(255, 255, 255));
        eRelationTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        eRelationTitle.setText("Relation to Patient:");
        jPanel1.add(eRelationTitle);
        eRelationTitle.setBounds(10, 180, 190, 21);

        tranPanel1.add(jPanel1);
        jPanel1.setBounds(570, 390, 470, 240);

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

        searchPhone.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        tranPanel2.add(searchPhone);
        searchPhone.setBounds(220, 130, 170, 30);

        searchLastNameTitle1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        searchLastNameTitle1.setForeground(new java.awt.Color(255, 255, 255));
        searchLastNameTitle1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        searchLastNameTitle1.setText("Phone Number:");
        tranPanel2.add(searchLastNameTitle1);
        searchLastNameTitle1.setBounds(40, 140, 170, 21);

        searchLastNameTitle.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        searchLastNameTitle.setForeground(new java.awt.Color(255, 255, 255));
        searchLastNameTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        searchLastNameTitle.setText("Last Name:");
        tranPanel2.add(searchLastNameTitle);
        searchLastNameTitle.setBounds(410, 140, 130, 21);

        searchLastName.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        tranPanel2.add(searchLastName);
        searchLastName.setBounds(550, 130, 170, 30);

        searchFirstName.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        tranPanel2.add(searchFirstName);
        searchFirstName.setBounds(550, 60, 170, 30);

        searchFNameTitle.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        searchFNameTitle.setForeground(new java.awt.Color(255, 255, 255));
        searchFNameTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        searchFNameTitle.setText("First Name:");
        tranPanel2.add(searchFNameTitle);
        searchFNameTitle.setBounds(420, 70, 120, 21);

        searchButton.setBackground(new java.awt.Color(71, 177, 175));
        searchButton.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.setText("Search");
        searchButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tranPanel2.add(searchButton);
        searchButton.setBounds(880, 50, 140, 50);

        editButton.setBackground(new java.awt.Color(71, 177, 175));
        editButton.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        editButton.setForeground(new java.awt.Color(255, 255, 255));
        editButton.setText("Edit");
        editButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tranPanel2.add(editButton);
        editButton.setBounds(880, 120, 140, 50);

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

        patSearchPanel.add(tranPanel2);
        tranPanel2.setBounds(10, 90, 1080, 683);
        tranPanel2.setBackground(new Color(0,0,0,65));

        CardPanel.add(patSearchPanel, "card3");

        schAppointPanel.setOpaque(false);
        schAppointPanel.setLayout(null);

        schAppointTitle.setFont(new java.awt.Font("Yu Gothic Light", 1, 48)); // NOI18N
        schAppointTitle.setForeground(new java.awt.Color(255, 255, 255));
        schAppointTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        schAppointTitle.setText("Schedule Appointment");
        schAppointPanel.add(schAppointTitle);
        schAppointTitle.setBounds(210, 15, 670, 70);

        tranPanel3.setLayout(null);

        scheduleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient ID", "First Name", "Last Name", "Doctor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(scheduleTable);
        if (scheduleTable.getColumnModel().getColumnCount() > 0) {
            scheduleTable.getColumnModel().getColumn(0).setResizable(false);
            scheduleTable.getColumnModel().getColumn(0).setPreferredWidth(30);
            scheduleTable.getColumnModel().getColumn(1).setResizable(false);
            scheduleTable.getColumnModel().getColumn(2).setResizable(false);
            scheduleTable.getColumnModel().getColumn(3).setResizable(false);
        }
        String[] doctors = {"Dr. Tran", "Dr. Hatcher", "Dr. Prouty"};
        JComboBox combo = new JComboBox<String>(doctors);
        TableColumn col = scheduleTable.getColumnModel().getColumn(3);
        col.setCellEditor(new DefaultCellEditor (combo));

        tranPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(10, 10, 1060, 630);

        tableNote.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        tableNote.setForeground(new java.awt.Color(255, 255, 255));
        tableNote.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableNote.setText("Click the doctor cells to appoint a doctor. This will send the patient to the queue.");
        tranPanel3.add(tableNote);
        tableNote.setBounds(80, 645, 930, 30);

        schAppointPanel.add(tranPanel3);
        tranPanel3.setBounds(10, 90, 1080, 683);
        tranPanel3.setBackground(new Color(0,0,0,65));

        CardPanel.add(schAppointPanel, "card4");

        profilePanel.setOpaque(false);
        profilePanel.setLayout(null);

        profileTitle.setFont(new java.awt.Font("Yu Gothic Light", 1, 48)); // NOI18N
        profileTitle.setForeground(new java.awt.Color(255, 255, 255));
        profileTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profileTitle.setText("Profile");
        profilePanel.add(profileTitle);
        profileTitle.setBounds(360, 15, 380, 70);

        tranPanel4.setLayout(null);

        profileIDTitle.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        profileIDTitle.setForeground(new java.awt.Color(255, 255, 255));
        profileIDTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        profileIDTitle.setText("Employee ID:");
        tranPanel4.add(profileIDTitle);
        profileIDTitle.setBounds(130, 60, 170, 28);

        ProfileID.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        ProfileID.setForeground(new java.awt.Color(255, 255, 255));
        tranPanel4.add(ProfileID);
        ProfileID.setBounds(140, 100, 260, 20);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        tranPanel4.add(jSeparator1);
        jSeparator1.setBounds(140, 120, 220, 10);

        profileNameTitle.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        profileNameTitle.setForeground(new java.awt.Color(255, 255, 255));
        profileNameTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        profileNameTitle.setText("Full Name:");
        tranPanel4.add(profileNameTitle);
        profileNameTitle.setBounds(130, 170, 170, 28);

        profileName.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        profileName.setForeground(new java.awt.Color(255, 255, 255));
        tranPanel4.add(profileName);
        profileName.setBounds(140, 207, 310, 23);

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        tranPanel4.add(jSeparator2);
        jSeparator2.setBounds(140, 230, 310, 10);

        profileRoleTitle.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        profileRoleTitle.setForeground(new java.awt.Color(255, 255, 255));
        profileRoleTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        profileRoleTitle.setText("Role:");
        tranPanel4.add(profileRoleTitle);
        profileRoleTitle.setBounds(560, 170, 90, 28);

        profileRole.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        profileRole.setForeground(new java.awt.Color(255, 255, 255));
        tranPanel4.add(profileRole);
        profileRole.setBounds(560, 210, 310, 20);

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        tranPanel4.add(jSeparator3);
        jSeparator3.setBounds(560, 230, 310, 10);

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

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        tranPanel4.add(jSeparator5);
        jSeparator5.setBounds(560, 360, 310, 10);

        profileEmail.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        profileEmail.setForeground(new java.awt.Color(255, 255, 255));
        tranPanel4.add(profileEmail);
        profileEmail.setBounds(560, 340, 310, 20);

        profileEmailTitle.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        profileEmailTitle.setForeground(new java.awt.Color(255, 255, 255));
        profileEmailTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        profileEmailTitle.setText("Email:");
        tranPanel4.add(profileEmailTitle);
        profileEmailTitle.setBounds(560, 300, 150, 28);

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
        jScrollPane3.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(30);
        }

        tranPanel5.add(jScrollPane3);
        jScrollPane3.setBounds(10, 10, 1060, 660);

        workSchPanel.add(tranPanel5);
        tranPanel5.setBounds(10, 90, 1080, 683);
        tranPanel5.setBackground(new Color(0,0,0,65));

        CardPanel.add(workSchPanel, "card6");

        tasksPanel.setOpaque(false);
        tasksPanel.setLayout(null);

        homeTitle1.setFont(new java.awt.Font("Yu Gothic Light", 1, 48)); // NOI18N
        homeTitle1.setForeground(new java.awt.Color(255, 255, 255));
        homeTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeTitle1.setText("Tasks");
        tasksPanel.add(homeTitle1);
        homeTitle1.setBounds(360, 15, 380, 70);

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
        homePanel.add(tranPanel7);
        tranPanel7.setBounds(10, 90, 1080, 683);
        tranPanel7.setBackground(new Color(0,0,0,65));

        CardPanel.add(homePanel, "card7");

        getContentPane().add(CardPanel);
        CardPanel.setBounds(351, 31, 1100, 784);

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

    private void schedAppointMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_schedAppointMouseClicked
        CardPanel.removeAll();
        CardPanel.add(schAppointPanel);
        CardPanel.repaint();
        CardPanel.revalidate();
    }//GEN-LAST:event_schedAppointMouseClicked

    private void profileButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileButtonMouseClicked
        CardPanel.removeAll();
        CardPanel.add(profilePanel);
        CardPanel.repaint();
        CardPanel.revalidate();
    }//GEN-LAST:event_profileButtonMouseClicked

    private void scheduleButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scheduleButton1MouseClicked
        CardPanel.removeAll();
        CardPanel.add(workSchPanel);
        CardPanel.repaint();
        CardPanel.revalidate();
    }//GEN-LAST:event_scheduleButton1MouseClicked

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
    private javax.swing.JLabel ProfileID;
    private javax.swing.JTextField SSN;
    private javax.swing.JLabel SSNTitle;
    private javax.swing.JButton addButton;
    private javax.swing.JTextField address;
    private javax.swing.JLabel addressTitle;
    private javax.swing.JLabel bg;
    private javax.swing.JTextField city;
    private javax.swing.JLabel cityTitle;
    private javax.swing.JButton clearButton;
    private javax.swing.JPanel clockDate;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField dob;
    private javax.swing.JLabel dobTitle;
    private javax.swing.JLabel eNameTitle;
    private javax.swing.JLabel ePhoneTitle;
    private javax.swing.JLabel eRelationTitle;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField email;
    private javax.swing.JLabel emailTitle;
    private javax.swing.JTextField emergencyName;
    private javax.swing.JTextField emergencyPhone;
    private javax.swing.JTextField emergencyRelation;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel fNameTitle;
    private javax.swing.JTextField firstName;
    private javax.swing.JLabel holderTitle;
    private javax.swing.JPanel home;
    private javax.swing.JLabel homeIcon;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JPanel homePanel;
    private javax.swing.JLabel homeTitle;
    private javax.swing.JLabel homeTitle1;
    private javax.swing.JPanel insurancePanel;
    private javax.swing.JLabel jLabelClock;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelDrag;
    private javax.swing.JList<String> jList;
    private javax.swing.JPanel jPanel1;
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
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea;
    private javax.swing.JLabel lNameTitle;
    private javax.swing.JComboBox<String> language;
    private javax.swing.JLabel languageTitle;
    private javax.swing.JTextField lastName;
    private javax.swing.JPanel logout;
    private javax.swing.JLabel logoutIcon;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JLabel mStatusTitle;
    private javax.swing.JLabel mStatusTitle1;
    private javax.swing.JComboBox<String> maritalStatus;
    private javax.swing.JComboBox<String> maritalStatus1;
    private javax.swing.JPanel menu1;
    private javax.swing.JLabel pRegIcon;
    private javax.swing.JLabel pRegLabel;
    private javax.swing.JLabel pSearchIcon;
    private javax.swing.JLabel pSearchLabel;
    private javax.swing.JLabel patIDTitle;
    private javax.swing.JPanel patRegPanel;
    private javax.swing.JLabel patRegTitle;
    private javax.swing.JPanel patRegister;
    private javax.swing.JPanel patSearch;
    private javax.swing.JPanel patSearchPanel;
    private javax.swing.JTable patSearchTable;
    private javax.swing.JLabel patSearchTitle;
    private javax.swing.JTextField patientID;
    private javax.swing.JTextField phoneNumber;
    private javax.swing.JLabel phoneTitle;
    private javax.swing.JTextField policy;
    private javax.swing.JTextField policyHolder;
    private javax.swing.JTextField policyNumber;
    private javax.swing.JLabel policyNumberTitle;
    private javax.swing.JLabel policyTitle;
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
    private javax.swing.JComboBox<String> race;
    private javax.swing.JLabel raceTitle;
    private javax.swing.JLabel roleTitle;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel schAppIcon;
    private javax.swing.JLabel schAppLabel;
    private javax.swing.JPanel schAppointPanel;
    private javax.swing.JLabel schAppointTitle;
    private javax.swing.JPanel schedAppoint;
    private javax.swing.JLabel scheduleButton1;
    private javax.swing.JTable scheduleTable;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel searchFNameTitle;
    private javax.swing.JTextField searchFirstName;
    private javax.swing.JTextField searchLastName;
    private javax.swing.JLabel searchLastNameTitle;
    private javax.swing.JLabel searchLastNameTitle1;
    private javax.swing.JTextField searchPatID;
    private javax.swing.JTextField searchPhone;
    private javax.swing.JTextField state;
    private javax.swing.JLabel stateTitle;
    private javax.swing.JLabel tableNote;
    private javax.swing.JLabel tasksButton;
    private javax.swing.JPanel tasksPanel;
    private javax.swing.JPanel tranPanel1;
    private javax.swing.JPanel tranPanel2;
    private javax.swing.JPanel tranPanel3;
    private javax.swing.JPanel tranPanel4;
    private javax.swing.JPanel tranPanel5;
    private javax.swing.JPanel tranPanel6;
    private javax.swing.JPanel tranPanel7;
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
