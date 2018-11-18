 
package project.pkg01;

import java.awt.*;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.MalformedURLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Vector;
import javax.imageio.ImageIO;
import javax.media.MediaLocator;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

public class Project01 extends javax.swing.JFrame{

   boolean start=false, startR=false, p=false, r=false;
   static boolean current=false, firsttry, sectry;  //current to discern bw recorder and caputrer
   static int time, timeR, t;
   DoBackground db=new DoBackground();
   String username, name, password, dbname="db2", dbpass="1234"; 
   static String to;
   Vector<String> imgLst = new Vector<String>();
   Thread contdn;
   
  
    public Project01() {
        initComponents();

        setVisible(true);
        setSize(820,550);
        setResizable(false);
        setTitle("Desktop Controls");
        setLocationRelativeTo(null);
     
                          
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Welcome = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        LogIn = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPasswordField3 = new javax.swing.JPasswordField();
        jButton5 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        home = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        screenshots = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        recorder = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        running = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Desktop Controls");
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.CardLayout());

        Welcome.setLayout(null);

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 50)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 204, 204));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Desktop Controls");
        Welcome.add(jLabel29);
        jLabel29.setBounds(140, 70, 540, 140);

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 204, 204));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Enter");
        jLabel30.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(0, 153, 153)));
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
        });
        Welcome.add(jLabel30);
        jLabel30.setBounds(260, 380, 320, 80);

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/pkg01/6946806-abstract-desktop.jpg"))); // NOI18N
        Welcome.add(jLabel28);
        jLabel28.setBounds(0, 0, 820, 550);

        getContentPane().add(Welcome, "card6");

        LogIn.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Desktop Controls");
        LogIn.add(jLabel12);
        jLabel12.setBounds(250, 0, 290, 70);

        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        LogIn.add(jLabel8);
        jLabel8.setBounds(30, 90, 330, 400);

        jLabel9.setBackground(new java.awt.Color(102, 102, 102));
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        LogIn.add(jLabel9);
        jLabel9.setBounds(430, 90, 370, 400);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Log In");
        LogIn.add(jLabel10);
        jLabel10.setBounds(120, 120, 130, 30);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Username");
        LogIn.add(jLabel13);
        jLabel13.setBounds(60, 200, 80, 30);

        jTextField3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        LogIn.add(jTextField3);
        jTextField3.setBounds(150, 200, 160, 23);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Password");
        LogIn.add(jLabel14);
        jLabel14.setBounds(60, 280, 80, 30);

        jPasswordField1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyReleased(evt);
            }
        });
        LogIn.add(jPasswordField1);
        jPasswordField1.setBounds(150, 280, 160, 23);

        jCheckBox1.setBackground(new java.awt.Color(0, 102, 102));
        jCheckBox1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(204, 204, 204));
        jCheckBox1.setText("Show Password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        LogIn.add(jCheckBox1);
        jCheckBox1.setBounds(150, 320, 160, 20);

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton3.setText("Log In");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        LogIn.add(jButton3);
        jButton3.setBounds(150, 390, 90, 30);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Forgot Password?");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        LogIn.add(jLabel15);
        jLabel15.setBounds(100, 430, 200, 30);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Sign Up");
        LogIn.add(jLabel16);
        jLabel16.setBounds(510, 100, 190, 50);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Name");
        LogIn.add(jLabel17);
        jLabel17.setBounds(450, 160, 70, 30);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Username");
        LogIn.add(jLabel18);
        jLabel18.setBounds(450, 210, 80, 30);

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Email");
        LogIn.add(jLabel19);
        jLabel19.setBounds(450, 260, 70, 30);

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Password");
        LogIn.add(jLabel20);
        jLabel20.setBounds(450, 310, 70, 30);

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("<html>Retype Password</html>");
        LogIn.add(jLabel21);
        jLabel21.setBounds(450, 370, 70, 40);

        jTextField4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        LogIn.add(jTextField4);
        jTextField4.setBounds(540, 160, 190, 30);

        jTextField5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        LogIn.add(jTextField5);
        jTextField5.setBounds(540, 210, 190, 30);

        jTextField6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField6KeyReleased(evt);
            }
        });
        LogIn.add(jTextField6);
        jTextField6.setBounds(540, 260, 190, 30);

        jPasswordField2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });
        jPasswordField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordField2KeyReleased(evt);
            }
        });
        LogIn.add(jPasswordField2);
        jPasswordField2.setBounds(540, 310, 190, 30);

        jPasswordField3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPasswordField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordField3KeyReleased(evt);
            }
        });
        LogIn.add(jPasswordField3);
        jPasswordField3.setBounds(540, 380, 190, 30);

        jButton5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton5.setText("Submit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        LogIn.add(jButton5);
        jButton5.setBounds(550, 440, 140, 30);

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        LogIn.add(jLabel22);
        jLabel22.setBounds(540, 340, 200, 40);

        jLabel23.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        LogIn.add(jLabel23);
        jLabel23.setBounds(540, 410, 190, 30);

        jLabel24.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        LogIn.add(jLabel24);
        jLabel24.setBounds(740, 300, 60, 50);

        jLabel33.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel33.setText("Configure database");
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel33MouseClicked(evt);
            }
        });
        LogIn.add(jLabel33);
        jLabel33.setBounds(660, 30, 140, 20);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/pkg01/AquaFresh.jpg"))); // NOI18N
        jLabel11.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/project/pkg01/background11.jpg"))); // NOI18N
        LogIn.add(jLabel11);
        jLabel11.setBounds(-70, -30, 1360, 730);

        getContentPane().add(LogIn, "card5");

        home.setBackground(new java.awt.Color(0, 0, 0));
        home.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Choose capturer or recorder");
        home.add(jLabel1);
        jLabel1.setBounds(110, 110, 590, 80);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("<html><center>Record Screen");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        home.add(jLabel2);
        jLabel2.setBounds(470, 250, 210, 170);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("<html><center>Capture Screenshots");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        home.add(jLabel3);
        jLabel3.setBounds(150, 250, 210, 170);

        jButton11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton11.setText("Log out");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        home.add(jButton11);
        jButton11.setBounds(720, 20, 80, 30);

        jButton12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton12.setText("Back");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        home.add(jButton12);
        jButton12.setBounds(30, 20, 80, 30);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/pkg01/AquaFresh.jpg"))); // NOI18N
        home.add(jLabel25);
        jLabel25.setBounds(0, 0, 820, 550);

        getContentPane().add(home, "card2");

        screenshots.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Screen Capturer");
        screenshots.add(jLabel4);
        jLabel4.setBounds(280, 60, 260, 80);

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton2.setText("Start");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        screenshots.add(jButton2);
        jButton2.setBounds(330, 350, 190, 60);

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        screenshots.add(jButton4);
        jButton4.setBounds(20, 20, 100, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Enter Time Limit:");
        screenshots.add(jLabel6);
        jLabel6.setBounds(220, 210, 190, 30);

        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jTextField1.setToolTipText("In minutes");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        screenshots.add(jTextField1);
        jTextField1.setBounds(410, 210, 190, 30);

        jLabel26.setBackground(new java.awt.Color(204, 204, 204));
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/pkg01/AquaFresh.jpg"))); // NOI18N
        screenshots.add(jLabel26);
        jLabel26.setBounds(0, 0, 820, 550);

        getContentPane().add(screenshots, "card3");

        recorder.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Screen Recorder");
        recorder.add(jLabel5);
        jLabel5.setBounds(320, 70, 210, 60);

        jButton6.setBackground(new java.awt.Color(204, 204, 204));
        jButton6.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jButton6.setText("Start");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        recorder.add(jButton6);
        jButton6.setBounds(340, 360, 180, 70);

        jButton10.setBackground(new java.awt.Color(204, 204, 204));
        jButton10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton10.setText("Back");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        recorder.add(jButton10);
        jButton10.setBounds(20, 20, 90, 30);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Enter Time Limit:");
        recorder.add(jLabel7);
        jLabel7.setBounds(220, 220, 160, 30);

        jTextField2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTextField2.setToolTipText("In minutes");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        recorder.add(jTextField2);
        jTextField2.setBounds(400, 220, 200, 30);

        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/pkg01/AquaFresh.jpg"))); // NOI18N
        recorder.add(jLabel27);
        jLabel27.setBounds(0, 0, 820, 550);

        getContentPane().add(recorder, "card4");

        running.setLayout(null);

        jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Screenshots Capturer running...");
        running.add(jLabel32);
        jLabel32.setBounds(110, 150, 570, 70);

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/pkg01/AquaFresh.jpg"))); // NOI18N
        running.add(jLabel31);
        jLabel31.setBounds(0, 0, 820, 550);

        getContentPane().add(running, "card7");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
       home.setVisible(false);
       screenshots.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      home.setVisible(true);
       screenshots.setVisible(false);  
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
       home.setVisible(true);
       recorder.setVisible(false);
    }//GEN-LAST:event_jButton10ActionPerformed
//start - capture
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        start=true;          
        current=false;
        t=(Integer.parseInt(jTextField1.getText()))-1;
       
        Calendar c = new GregorianCalendar(); 
        time=c.get(Calendar.MINUTE);
            
        db.execute();          //do in background
       // new Stopwatch();
       
       running.setVisible(true);
       screenshots.setVisible(false);
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        home.setVisible(false);
        recorder.setVisible(true);
       
    }//GEN-LAST:event_jLabel2MouseClicked
//recording button - start
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        startR=true;  
        current=true;
        t=(Integer.parseInt(jTextField2.getText()))-1;
        
        Calendar c = new GregorianCalendar(); 
        timeR=c.get(Calendar.MINUTE);
            
        db.execute();        //do in background
        //new Stopwatch();
        
        jLabel32.setText("Screen recorder running...");
        running.setVisible(true);
        recorder.setVisible(false);
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed
//Password validations
    private void jPasswordField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField2KeyReleased
String s=jPasswordField2.getText();         

int n=0,m=0,o=0,l=0;
        for(int i=0;i<s.length();i++)   
        {            
        if(Character.isDigit(s.charAt(i)))
        {
            n=1;
        }            
        if(!Character.isLetterOrDigit(s.charAt(i)))   
                {
                   m=1; 
                }    
        if(Character.isUpperCase(s.charAt(i)))
        {
            o=1;
        }
        }
        
        if(s.length()<5)
        {
            jLabel24.setForeground(Color.RED);
            jLabel24.setText("<html>Weak password</html>");
        }
        else if(s.length()<8&&n==1)
        {
            jLabel24.setForeground(Color.yellow);
            jLabel24.setText("<html>Medium password</html>");
            l=1;
        }
        else if(s.length()>7&&n==1&&m==1&&o==1)
        {
            jLabel24.setForeground(Color.GREEN);
            jLabel24.setText("<html>Strong password</html>");
            l=1;
        }
        
        if(n==1&&m==1&&o==1&&l==1)
        {   
            jLabel22.setText(null);            
            p=true;
        }
        else
        {
            jLabel22.setText("<html>Your password must contain one uppercase letter,"
                        +" one digit and at least one special character</html>");  
        }  
        
       
    }//GEN-LAST:event_jPasswordField2KeyReleased
//passwords validations - part 2
    private void jPasswordField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField3KeyReleased
    String str1=jPasswordField2.getText();
    String str2=jPasswordField3.getText();
    
        for(int i=0; i<str2.length();i++)  
    {
        if(str2.length()>str1.length())
        {
            jLabel23.setText("The passwords don't match");
        }
        else
        {
        if(str1.charAt(i)!=str2.charAt(i))
        {   
           jLabel23.setText("The passwords don't match");
        }
       
        else
        {
            jLabel23.setText(null);        
            r=true;
        }}
    }
       
    }//GEN-LAST:event_jPasswordField3KeyReleased

    private void jTextField6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyReleased
        
    }//GEN-LAST:event_jTextField6KeyReleased
//submit/sign up
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      String name=jTextField4.getText();
      String username=jTextField5.getText();
      String email=jTextField6.getText();
      String password=jPasswordField2.getText();
      String RetypedPassword=jPasswordField3.getText();
      
      if(name.equals("")||username.equals("")||password.equals("")||RetypedPassword.equals(""))
{
       
  JOptionPane.showMessageDialog(null,"Fill out all the fields!");
          
}
    else
{
    
        if(p==false||r==false)
        {
            JOptionPane.showMessageDialog(null,"Recheck your password!"); 
        }
        else
        {
            try
                {
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+dbname,"root",dbpass);
    Statement stmt=con.createStatement();
   
    stmt.execute("create table if not exists table1(name varchar(40), username varchar(40), email varchar(40), password varchar(40))");
    stmt.executeUpdate("insert into table1(name,username,email,password)values('"+name+"','"+username+"','"+email+"','"+password+"')");
   
    JOptionPane.showMessageDialog(null,"Account created");
    
    jTextField4.setText(null);
    jTextField5.setText(null);
    jTextField6.setText(null);
    jPasswordField2.setText(null);
    jPasswordField3.setText(null);
    jLabel22.setText(null);
    jLabel23.setText(null);
    jLabel24.setText(null);
    
   
                }
            catch(Exception e)
                {   
    System.out.println(e);
                }
        }
}
    }//GEN-LAST:event_jButton5ActionPerformed
//log in
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        boolean b=false;
        try
        {
        String s=jTextField3.getText();
        String s1=jPasswordField1.getText();
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+dbname,"root",dbpass);
        Statement stmt=con.createStatement();    
        ResultSet rs=stmt.executeQuery("select * from table1");
        
        String n=" ",nm=" ",p=" ";
        
        while(rs.next())
        {
        n=rs.getString("username");
        p=rs.getString("password");
                
        if(n.equals(s)&&p.equals(s1))
        {
        b=true;
        to=rs.getString("email");
        nm=rs.getString("name");
        }
        }
        
        if(b)
        {                    
        LogIn.setVisible(false);
        home.setVisible(true);
                
        jLabel1.setText("Welcome "+nm+", choose capturer or recorder:");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Incorrect username or password");
        }
        
        }
catch(Exception e)
{
     System.out.println(e);
}
        
    }//GEN-LAST:event_jButton3ActionPerformed
//log in (by enter)
    private void jPasswordField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyReleased
    int c=evt.getKeyCode();
    
    if(c==KeyEvent.VK_ENTER)
    {
        boolean b=false;
        try
        {
        String s=jTextField3.getText();
        String s1=jPasswordField1.getText();
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+dbname,"root",dbpass);
        Statement stmt=con.createStatement();    
        ResultSet rs=stmt.executeQuery("select * from table1");
        
        String n=" ",nm=" ",p=" ";
        
        while(rs.next())
        {
        n=rs.getString("username");
        p=rs.getString("password");
                
        if(n.equals(s)&&p.equals(s1))
        {
        b=true;
        to=rs.getString("email");        
        nm=rs.getString("name");
        }
        }
        
        if(b)
        {                    
        LogIn.setVisible(false);
        home.setVisible(true);
                
        jLabel1.setText("Welcome "+nm+", choose capturer or recorder:");
        }
        else if(sectry==false)
        {
           JOptionPane.showMessageDialog(null,"Incorrect username or password");
           sectry=true;
        }
        }
catch(Exception e)
{
     System.out.println(e);
}
    }
    }//GEN-LAST:event_jPasswordField1KeyReleased
//Log in password field (checkbox)
    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
          if(jCheckBox1.isSelected())
               {
                   jPasswordField1.setEchoChar('\u0000');
               }
               else
               {
                   jPasswordField1.setEchoChar('*');
               }      
    }//GEN-LAST:event_jCheckBox1ActionPerformed
//forgot password
    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
     
        try
           {
               
        String user=JOptionPane.showInputDialog("Enter username");
        String answer="", password="";
        boolean b=false;
        firsttry=true;
               
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+dbname,"root",dbpass);
        Statement stmt=con.createStatement();    
        ResultSet rs=stmt.executeQuery("select * from table1 where username='"+user+"'");
        
        while(rs.next()&&b==false&&firsttry)
        {
         answer=JOptionPane.showInputDialog("Enter your name:");
                
        if(answer.equalsIgnoreCase(rs.getString("name")))
        {
            String uname=rs.getString("username");
            
            if(uname.equalsIgnoreCase(user)) {
                b=true;
                password=rs.getString("password");
                firsttry=false;
            }           
        }
        else if(b==false)
            {
         JOptionPane.showMessageDialog(null,"Your username and name don't match!");
         firsttry=false;
            }
        }
        
        if(b)  {
            JOptionPane.showMessageDialog(null,"Your password: "+password);
        }
           }
           
         catch (Exception e)
         {
             JOptionPane.showMessageDialog(null,e); 
         }
       
    }//GEN-LAST:event_jLabel15MouseClicked
//log out
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
       jTextField3.setText(null);
       jPasswordField1.setText(null);
       jCheckBox1.setSelected(false);
       
       sectry=false;
       
       LogIn.setVisible(true);
       home.setVisible(false);
    }//GEN-LAST:event_jButton11ActionPerformed
//back (home)
    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
      jCheckBox1.setSelected(false);
      
      LogIn.setVisible(true);
      home.setVisible(false);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        String str=jTextField1.getText();
        char c=evt.getKeyChar();
           
       if(!Character.isDigit(c))
            {
                evt.consume();
                getToolkit().beep(); 
            }
       
       if(str.length()>2)
             {
                evt.consume();
                getToolkit().beep(); 
                JOptionPane.showMessageDialog(null,"Enter the time limit in minutes. Maximum limit=999");
            }          
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
String str=jTextField2.getText();
        char c=evt.getKeyChar();
           
       if(!Character.isDigit(c))
            {
                evt.consume();
                getToolkit().beep(); 
            }
       
       if(str.length()>2)
             {
                evt.consume();
                getToolkit().beep(); 
                JOptionPane.showMessageDialog(null,"Enter the time limit in minutes. Maximum limit=999");
            }         
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
LogIn.setVisible(true);
Welcome.setVisible(false);
    }//GEN-LAST:event_jLabel30MouseClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       quitApp();
    }//GEN-LAST:event_formWindowClosing

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
     
    }//GEN-LAST:event_formWindowStateChanged

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
     /*  char c=evt.getKeyChar();
       
       if(c==KeyEvent.VK_TAB||c==KeyEvent.VK_DOWN)  {
           
           jPasswordField1.requestFocus();
           
       }*/
    }//GEN-LAST:event_jTextField3KeyPressed

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
       
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jLabel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseClicked
        dbname = JOptionPane.showInputDialog("Enter database name (MySQL): \n(Do not create a new database. Use an existing one.)");
        dbpass = JOptionPane.showInputDialog("Enter MySQL password (if exists): ");
    }//GEN-LAST:event_jLabel33MouseClicked

   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() 
            {
                new Project01().setVisible(true);
               
            }
        }
);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LogIn;
    private javax.swing.JPanel Welcome;
    private javax.swing.JPanel home;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JPanel recorder;
    private javax.swing.JPanel running;
    private javax.swing.JPanel screenshots;
    // End of variables declaration//GEN-END:variables

class DoBackground extends SwingWorker<Void , Integer> {

    
        @Override
        protected Void doInBackground() throws Exception 
        {
               if(start)
               {
               
                Random ran=new Random();
                Capture cap=new  Capture();
                
                while(true)
                {
                int tm=ran.nextInt(10);
                System.out.println(tm);
                   
                cap.capture();
               
                Thread.sleep(tm*1000);
                
               }
               }
               
               
               if(startR)
               {
                System.out.println("Recording...");   
                   
                while(true)
                {
                Recorder rec=new Recorder();
                rec.record();
                
                              
                Thread.sleep(10);
                }
               }
            
          
            return null;
        }
    
}

class Capture {
    
public void capture(){
    try 
            {             
            Robot r=new Robot();
            Rectangle screenSize=new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage b=r.createScreenCapture(screenSize);  
            SimpleDateFormat format01 = new SimpleDateFormat("hh mm ss a");
            Calendar now=Calendar.getInstance();
            File f=new File("D:\\Screenshot");
            f.mkdir();        
                                       
            ImageIO.write(b,"jpg",new File("D:\\Screenshot\\"+format01.format(now.getTime())+".jpg"));
            
            int min=Integer.parseInt(jTextField1.getText());
            
            Calendar c = new GregorianCalendar(); 
            int minute=c.get(Calendar.MINUTE);
                        
            if(minute == time+min)
            {
                start=false;
                
                System.out.println("Screenshots done");
                jLabel32.setText("Creating zipfile");
                
                zipfile.zipfile();
                
                System.out.println("zipfile created");
                jLabel32.setText("Mailing... This may take some time.");
                
                SendMail.mailsend();
                
                System.out.println("Mail sent. Congratulations, your project finally works!!");
                
                logout();
                
                System.out.println("Logged out.");
                
                System.exit(0);
            }
                 
            } 
            catch (Exception ex) 
            {
            JOptionPane.showMessageDialog(null, ex);
            }  
       }
}

class Recorder{
    
    public void record(){
         try 
            {
             String video="Recording.mov";
             
                           
            Robot r=new Robot();
            Rectangle screenSize=new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage b=r.createScreenCapture(screenSize);  
            SimpleDateFormat format01 = new SimpleDateFormat("hh mm ss a");
            Calendar now=Calendar.getInstance();
            File f=new File("D:\\Recorder");
            f.mkdir(); 
            
            ImageIO.write(b,"jpg",new File("D:\\Recorder\\"+format01.format(now.getTime())+".jpg"));
            
            
            int min=Integer.parseInt(jTextField2.getText());
            
            Calendar c = new GregorianCalendar(); 
            int minute=c.get(Calendar.MINUTE);
            
                      
            if(minute == timeR+min)
            {
                startR=false;
                
                
                
                jLabel32.setText("Please wait... creating video");
                makeVideo(video);
                System.out.println("makeVideo running");
                                    
                
                jLabel32.setText("Mailing... This may take some time.");
                SendMail.mailsend();
                System.out.println("Mailing... This may take some time.");
                
                System.out.println("Mail sent. Congratulations, your project finally works!!");
                logout();
                System.out.println("Logged out.");
                
                
                System.exit(0);
            }
                 
            } 
            catch (Exception ex) 
            {
            JOptionPane.showMessageDialog(null, ex);
            } 
    }
    
    public void makeVideo(String movFile) throws MalformedURLException {
		System.out.println("making video, please wait!!!");
		CreateMovie imageToMovie = new CreateMovie();
		
                /**
                * Interval between which the image needs to be captured.
                */
                int captureInterval = 10;
                
		File f = new File("D:\\Recorder");
		File[] fileLst = f.listFiles();
		for (int i = 0; i < fileLst.length; i++) 
                {
		    imgLst.add(fileLst[i].getAbsolutePath());
		}
		// Generate the output media locators.
		MediaLocator oml;
		if ((oml = imageToMovie.createMediaLocator(movFile)) == null) {
			System.err.println("Cannot build media locator from: " + movFile);
			System.exit(0);
		}
		imageToMovie.doIt(Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit.getDefaultToolkit().getScreenSize().height, 
                        (70 / captureInterval), imgLst, oml);

	}
}

void runnning() {
    if(current)
    {
        jLabel32.setText("Screen recorder running...");
    }
    
    /*String clk=jLabel33.getText();
    int s=59;
    
    contdn=new Thread((Runnable) this);
    
    while(true)
    {
       try
       {
           contdn.sleep(1000);
           s--;
           
           if(s==0)
           {
                t--;
                s=59;
           }           
           else if(s==0&&t==0)
           {
               System.exit(0);
           }
           
           jLabel33.setText(t+":"+s);
           
       }
       catch(Exception e)
       {
          System.out.println(e);
       }
    }    */
}

void logout()  {
      jTextField3.setText(null);
       jPasswordField1.setText(null);
       jCheckBox1.setSelected(false);
       
       sectry=false;
}

void quitApp()
{
    int ans = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", 
            "Desktop Controls",JOptionPane.YES_NO_OPTION);
    
    if(ans ==JOptionPane.YES_OPTION)
    {
    setVisible(false);
    dispose();
    System.exit(0);
    }
    else
    {
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }


}

}
