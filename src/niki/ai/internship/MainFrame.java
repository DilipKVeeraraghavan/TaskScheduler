/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package niki.ai.internship;

import java.awt.Desktop;
import java.awt.Image;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        
        super("Niki.ai Task Scheduler");
        try{
            UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Warning !");
        }
        initComponents();
        messageArea.setLineWrap(true);
        messageArea.setWrapStyleWord(true);
        messagePanel.setVisible(false);
        welcome.setVisible(true);
        warn.setVisible(false);
        fileChooser.setVisible(false);
        advice.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jSplitPane1 = new javax.swing.JSplitPane();
        MainPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        secondcount = new javax.swing.JComboBox<>();
        minutecount = new javax.swing.JComboBox<>();
        hourcount = new javax.swing.JComboBox<>();
        daycount = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Remainder = new javax.swing.JRadioButton();
        txtfile = new javax.swing.JRadioButton();
        openfile = new javax.swing.JRadioButton();
        displayPhoto = new javax.swing.JRadioButton();
        prepareButton = new javax.swing.JButton();
        warn = new javax.swing.JLabel();
        advice = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        messagePanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        messageArea = new javax.swing.JTextArea();
        createTask = new javax.swing.JButton();
        welcome = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        timeRem = new javax.swing.JLabel();
        fileChooser = new javax.swing.JFileChooser();
        picturePanel = new javax.swing.JPanel();
        label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setDividerLocation(450);

        MainPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TimeStamp", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 2, 14))); // NOI18N

        secondcount.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

        minutecount.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        minutecount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minutecountActionPerformed(evt);
            }
        });

        hourcount.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

        daycount.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SS");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("MM");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("HH");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Days");

        jLabel8.setText(":");

        jLabel9.setText(":");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(secondcount, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(minutecount, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hourcount, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(daycount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(secondcount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minutecount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hourcount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(daycount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Select Task", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 2, 14))); // NOI18N

        buttonGroup.add(Remainder);
        Remainder.setText("Create Remainder with alarm");
        Remainder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemainderActionPerformed(evt);
            }
        });

        buttonGroup.add(txtfile);
        txtfile.setText("Save a message in a textfile named Task.txt");

        buttonGroup.add(openfile);
        openfile.setText("Open a file on a computer(pdf,txt)");

        buttonGroup.add(displayPhoto);
        displayPhoto.setText("Display a photo");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Remainder)
                    .addComponent(txtfile)
                    .addComponent(openfile)
                    .addComponent(displayPhoto))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Remainder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(openfile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(displayPhoto))
        );

        prepareButton.setText("Prepare Scheduled Task");
        prepareButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prepareButtonActionPerformed(evt);
            }
        });

        warn.setFont(new java.awt.Font("Ubuntu", 2, 15)); // NOI18N
        warn.setForeground(new java.awt.Color(217, 2, 2));
        warn.setText("Please select one of the options above !");

        advice.setFont(new java.awt.Font("Ubuntu", 2, 15)); // NOI18N
        advice.setForeground(new java.awt.Color(212, 2, 2));
        advice.setText("Choose Directory to save the file !");

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(prepareButton))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(warn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(advice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(warn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(advice)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(prepareButton)
                .addContainerGap())
        );

        jSplitPane1.setLeftComponent(MainPanel);

        messagePanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setText("Please Enter Your message :");

        messageArea.setColumns(20);
        messageArea.setRows(5);
        jScrollPane1.setViewportView(messageArea);

        createTask.setText("Create Task");
        createTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createTaskActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout messagePanelLayout = new javax.swing.GroupLayout(messagePanel);
        messagePanel.setLayout(messagePanelLayout);
        messagePanelLayout.setHorizontalGroup(
            messagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(messagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(messagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                    .addGroup(messagePanelLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, messagePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(createTask)))
                .addContainerGap())
        );
        messagePanelLayout.setVerticalGroup(
            messagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(messagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createTask)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel11.setFont(new java.awt.Font("Ubuntu", 2, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(1, 34, 176));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Welcome to Scheduler !");

        timeRem.setFont(new java.awt.Font("Purisa", 0, 14)); // NOI18N
        timeRem.setText("Time Remaining :");

        javax.swing.GroupLayout welcomeLayout = new javax.swing.GroupLayout(welcome);
        welcome.setLayout(welcomeLayout);
        welcomeLayout.setHorizontalGroup(
            welcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(welcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                    .addComponent(timeRem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        welcomeLayout.setVerticalGroup(
            welcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcomeLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel11)
                .addGap(49, 49, 49)
                .addComponent(timeRem)
                .addContainerGap(299, Short.MAX_VALUE))
        );

        picturePanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        label.setMaximumSize(new java.awt.Dimension(361, 415));
        label.setMinimumSize(new java.awt.Dimension(361, 415));
        label.setPreferredSize(new java.awt.Dimension(361, 415));

        javax.swing.GroupLayout picturePanelLayout = new javax.swing.GroupLayout(picturePanel);
        picturePanel.setLayout(picturePanelLayout);
        picturePanelLayout.setHorizontalGroup(
            picturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        picturePanelLayout.setVerticalGroup(
            picturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLayeredPane1.setLayer(messagePanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(welcome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(fileChooser, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(picturePanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 391, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(messagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addComponent(welcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fileChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(picturePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 445, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(messagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(welcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fileChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(picturePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jSplitPane1.setRightComponent(jLayeredPane1);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 2, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Task Scheduler");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 2, 15)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Dilip Kumar Shanmugasundaram Veeraraghavan");

        jLabel10.setFont(new java.awt.Font("Ubuntu", 2, 15)); // NOI18N
        jLabel10.setText("Mail : dilipv46@gmail.com  Phone : +91- 9933924498");

        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createTaskActionPerformed
        int seconds,minutes,hours,days;
        long noofseconds;
        if(Remainder.isSelected()== true){
            warn.setVisible(false);
            messagePanel.setVisible(false);
            seconds=secondcount.getSelectedIndex();
            minutes=minutecount.getSelectedIndex();
            hours=hourcount.getSelectedIndex();
            days=daycount.getSelectedIndex();
            
            this.secondscounter(seconds, minutes, hours, days);
            noofseconds = seconds + (60*minutes)+(60*60*hours)+(60*60*24*days);
            new java.util.Timer().schedule( 
                new java.util.TimerTask(){
                    @Override
                    public void run() {
                        timeRem.setText("");
                        Timer timer = new Timer ();
                        TimerTask hourlyTask;
                        hourlyTask = new TimerTask () {
                            @Override
                            public void run () {
                                MainClass.playSound("remainder.wav");
                            }
                        };
                        timer.schedule (hourlyTask, 0l, 1000*4);
                        Object[] options1 = { "Snooze for 5 minutes !", "Cancel remainder"};
                        JPanel panel = new JPanel();
                        int result = JOptionPane.showOptionDialog(null,messageArea.getText(),"Niki.ai",
                        JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE,
                        null, options1, null);
                        if(result == JOptionPane.YES_OPTION){
                            timer.cancel();
                            timer.purge();
                            secondscounter(0,10,0,0);
                            MainFrame.tenmoreminutes(messageArea.getText());
                            timeRem.setText("");
                            Enumeration<AbstractButton> enumeration = buttonGroup.getElements();
                            while (enumeration.hasMoreElements()) {
                                enumeration.nextElement().setEnabled(true);
                            }
                            messageArea.setText("");
                            return;
                        }
                        else if(result == JOptionPane.NO_OPTION){
                            timer.cancel();
                            timer.purge();
                            messageArea.setText("");
                            Enumeration<AbstractButton> enumeration = buttonGroup.getElements();
                            while (enumeration.hasMoreElements()) {
                                enumeration.nextElement().setEnabled(true);
                            }
                            return;
                        }
                        
                    }
                }, 
                1000*noofseconds
            );
        }
        else if(txtfile.isSelected()==true){
            seconds=secondcount.getSelectedIndex()+1;
            minutes=minutecount.getSelectedIndex();
            hours=hourcount.getSelectedIndex();
            days=daycount.getSelectedIndex();
            
            noofseconds = seconds + (60*minutes)+(60*60*hours)+(60*60*24*days);
            fileChooser.setVisible(true);
            fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            int retval =fileChooser.showOpenDialog(null);
            if(retval == JFileChooser.APPROVE_OPTION){
                timeRem.setText("");
                savetofile(""+fileChooser.getSelectedFile(),messageArea.getText(),noofseconds);
                this.secondscounter(seconds, minutes, hours, days);
            
                messagePanel.setVisible(false);
                messageArea.setText("");
                Enumeration<AbstractButton> enumeration = buttonGroup.getElements();
                while (enumeration.hasMoreElements()) {
                enumeration.nextElement().setEnabled(true);
                }
            }
        }
    }//GEN-LAST:event_createTaskActionPerformed
    private static void openfile(String current,long sec){
        new java.util.Timer().schedule( 
                new java.util.TimerTask(){
                    @Override
                    public void run() {
                        File file = new File(current);
         
                        if(!Desktop.isDesktopSupported()){
                            System.out.println("Desktop is not supported");
                            return;
                        }
                        Desktop desktop = Desktop.getDesktop();
                        if(file.exists()) try {
                            desktop.open(file);
                        } catch (IOException ex) {
                            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                    }   
                }, 
            1000*sec
        );
    }
    
    private void secondscounter(int second,int minute,int hour,int day ){
        Timer timer = new Timer ();
                        TimerTask hourlyTask;
                        hourlyTask = new TimerTask () {
                            int seconds =second;
                            int minutes =minute;
                            int days =day;
                            int hours =hour;
                            @Override
                            public void run () {
                                if(seconds == 0){
                                    if(minutes == 0){
                                        if(hours==0){
                                           if(days == 0){
                                               timeRem.setText("");
                                               return;
                                           }
                                           else{
                                               days = -1;
                                               hours =23;
                                               minutes =59;
                                               seconds =59;
                                           }
                                        }
                                        else{
                                            hours -=1;
                                            minutes =59;
                                            seconds =59;
                                        }
                                    }
                                    else {
                                        minutes -=1;
                                        seconds =59;
                                    }
                                    
                                }
                                else seconds -=1;
                                timeRem.setText("Time Remaining: " +seconds +"sec : "+minutes+"min : "+hours+"hrs : "+days+"days" );
                            }
        };
        timer.schedule (hourlyTask, 0l, 1000);
    }
    
    private static void savetofile(String current,String text,long sec){
            
        new java.util.Timer().schedule( 
                new java.util.TimerTask(){
                    @Override
                    public void run() {
                        BufferedWriter bw = null;
                        try {
                        File file = new File(current+"/newtext.txt");
                        System.out.println(current+"/newtext.txt");
                        if (!file.exists()) {
                         file.createNewFile();
                        }
                        MainClass.playSound("newfile.wav");
                        FileWriter fw = new FileWriter(file);
                        bw = new BufferedWriter(fw);
                        bw.write(text);
                        System.out.println("File written Successfully");
                            
                        } catch (IOException ioe) {
                            ioe.printStackTrace();
                        }
                        finally
                        { 
                            try{
                                if(bw!=null)
                                bw.close();
                            }catch(Exception ex){
                                System.out.println("Error in closing the BufferedWriter"+ex);
                            }
                        }
                        Object[] options1 = {"Click Ok"};
                        JPanel panel = new JPanel();
                        int result = JOptionPane.showOptionDialog(null, "Successfully written !","Niki.ai",
                        JOptionPane.YES_OPTION, JOptionPane.PLAIN_MESSAGE,
                        null, options1, null);
                        if(result == JOptionPane.YES_OPTION){
                            return;
                        }
                   }
                }, 
                1000*sec
            );
    }
    
    
    private static void displayphoto(String text,long sec){
        
    }
    
    private static void tenmoreminutes(String text){
            new java.util.Timer().schedule( 
                new java.util.TimerTask(){
                    @Override
                    public void run() {
                        MainClass.playSound("remainder.wav");
                            
                        Object[] options1 = {"Cancel remainder"};
                        JPanel panel = new JPanel();
                        int result = JOptionPane.showOptionDialog(null,text,"Niki.ai",
                        JOptionPane.YES_OPTION, JOptionPane.PLAIN_MESSAGE,
                        null, options1, null);
                        if(result == JOptionPane.YES_OPTION){
                            
                        }
                        
                    }
                }, 
                1000*15
            );
        
    }
    private void minutecountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minutecountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minutecountActionPerformed

    private void prepareButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prepareButtonActionPerformed
        int seconds,minutes,hours,days;
        long noofseconds;
        if(buttonGroup.getSelection()==null)
            warn.setVisible(true);
        else if(Remainder.isSelected()== true){
            warn.setVisible(false);
            picturePanel.setVisible(false);
            messagePanel.setVisible(true);
            Enumeration<AbstractButton> enumeration = buttonGroup.getElements();
            while (enumeration.hasMoreElements()) {
                enumeration.nextElement().setEnabled(false);
            }
        }
        else if(txtfile.isSelected()==true){
            warn.setVisible(false);
            picturePanel.setVisible(false);
            messagePanel.setVisible(true);
            Enumeration<AbstractButton> enumeration = buttonGroup.getElements();
            while (enumeration.hasMoreElements()) {
                enumeration.nextElement().setEnabled(false);
            }
        }
        else if(openfile.isSelected()==true){
            warn.setVisible(false);
            picturePanel.setVisible(false);
            seconds=secondcount.getSelectedIndex();
            minutes=minutecount.getSelectedIndex();
            hours=hourcount.getSelectedIndex();
            days=daycount.getSelectedIndex();
            
            noofseconds = seconds + (60*minutes)+(60*60*hours)+(60*60*24*days);
            fileChooser.setVisible(true);
            fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            int retval =fileChooser.showOpenDialog(null);
            if(retval == JFileChooser.APPROVE_OPTION){
                openfile(""+fileChooser.getSelectedFile(),noofseconds);
                this.secondscounter(seconds, minutes, hours, days);
            }
            timeRem.setText("");
        }
        else if(displayPhoto.isSelected()==true){
                warn.setVisible(false);
                seconds=secondcount.getSelectedIndex()+1;
                minutes=minutecount.getSelectedIndex();
                hours=hourcount.getSelectedIndex();
                days=daycount.getSelectedIndex();
                welcome.setVisible(false);
                noofseconds = seconds + (60*minutes)+(60*60*hours)+(60*60*24*days);
                fileChooser.setVisible(true);
                fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images","jpg","bmp","png","gif"); 
                fileChooser.setFileFilter(filter);
                int retval =fileChooser.showOpenDialog(null);
                if(retval == JFileChooser.APPROVE_OPTION){
                    this.secondscounter(seconds, minutes, hours, days);
                    new java.util.Timer().schedule( 
                    new java.util.TimerTask(){
                    @Override
                    public void run() {
                            ImageIcon icon = new ImageIcon(""+fileChooser.getSelectedFile());
                            Image img =icon.getImage();
                            System.out.println(label.getHeight());
                            Image newImg = img.getScaledInstance(label.getWidth(),label.getHeight(),Image.SCALE_DEFAULT);
                            ImageIcon newicon = new ImageIcon(newImg);
                            label.setIcon(newicon);
                        }
                    }, 
                    1000*noofseconds
                );
                }
                timeRem.setText("");
                welcome.setVisible(true);
        }
    }//GEN-LAST:event_prepareButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Object[] option= {"GoodBye"};
        int result = JOptionPane.showOptionDialog(null, "Did you like it? \nYour suggestions are important.\nThank you for the oppurtunity.","Niki.ai",
            JOptionPane.YES_OPTION, JOptionPane.PLAIN_MESSAGE,
        null,option, null);
        if(result == JOptionPane.YES_OPTION){
            dispose();
            return;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void RemainderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemainderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RemainderActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JRadioButton Remainder;
    private javax.swing.JLabel advice;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JButton createTask;
    private javax.swing.JComboBox<String> daycount;
    private javax.swing.JRadioButton displayPhoto;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JComboBox<String> hourcount;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel label;
    private javax.swing.JTextArea messageArea;
    private javax.swing.JPanel messagePanel;
    private javax.swing.JComboBox<String> minutecount;
    private javax.swing.JRadioButton openfile;
    private javax.swing.JPanel picturePanel;
    private javax.swing.JButton prepareButton;
    private javax.swing.JComboBox<String> secondcount;
    private javax.swing.JLabel timeRem;
    private javax.swing.JRadioButton txtfile;
    private javax.swing.JLabel warn;
    private javax.swing.JPanel welcome;
    // End of variables declaration//GEN-END:variables
}
