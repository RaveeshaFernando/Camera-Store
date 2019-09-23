package RAD;

import java.awt.Image;
import javax.swing.*;
import java.sql.*;

public class Main extends javax.swing.JFrame {
    public static int total= 0 ; 
    int budget = 0;
    String T = null , B = null ;
    public Main() {
        initComponents();
        Images();
    }
    
    public void setTotal(){
        Display_Total.setText(Integer.toString(total));
    }
    
    private void Images(){
        //Camera Images
        camera1.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("./cam1.jpg")).getImage().getScaledInstance(camera1.getWidth(), camera1.getHeight(), Image.SCALE_SMOOTH)));
        camera2.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("./cam2.jpg")).getImage().getScaledInstance(camera2.getWidth(), camera2.getHeight(), Image.SCALE_SMOOTH)));
        camera3.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("./cam3.jpg")).getImage().getScaledInstance(camera3.getWidth(), camera3.getHeight(), Image.SCALE_SMOOTH)));
        camera4.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("./cam4.jpg")).getImage().getScaledInstance(camera4.getWidth(), camera4.getHeight(), Image.SCALE_SMOOTH)));
        
        //Lens Images
        lens1.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("./lens1.jpg")).getImage().getScaledInstance(lens1.getWidth(), lens1.getHeight(), Image.SCALE_SMOOTH)));
        lens2.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("./lens2.jpg")).getImage().getScaledInstance(lens2.getWidth(), lens2.getHeight(), Image.SCALE_SMOOTH)));
        lens3.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("./lens3.jpg")).getImage().getScaledInstance(lens3.getWidth(), lens3.getHeight(), Image.SCALE_SMOOTH)));
        lens4.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("./lens4.jpg")).getImage().getScaledInstance(lens4.getWidth(), lens4.getHeight(), Image.SCALE_SMOOTH)));
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanel_Item = new javax.swing.JPanel();
        logout = new javax.swing.JButton();
        cart = new javax.swing.JButton();
        JLabel_Logo_Item1 = new javax.swing.JLabel();
        JLabel_Logo_Item2 = new javax.swing.JLabel();
        Display_Total = new javax.swing.JTextField();
        Display_budget = new javax.swing.JTextField();
        JTab_Item_Tab = new javax.swing.JTabbedPane();
        tab_camera = new javax.swing.JPanel();
        JLabel_camera_1 = new javax.swing.JLabel();
        JLabel_camera_2 = new javax.swing.JLabel();
        JLabel_camera_3 = new javax.swing.JLabel();
        JLabel_camera_4 = new javax.swing.JLabel();
        camera1 = new javax.swing.JLabel();
        camera2 = new javax.swing.JLabel();
        camera3 = new javax.swing.JLabel();
        camera4 = new javax.swing.JLabel();
        add_to_cart1 = new javax.swing.JButton();
        add_to_cart2 = new javax.swing.JButton();
        add_to_cart3 = new javax.swing.JButton();
        add_to_cart4 = new javax.swing.JButton();
        camera_prize1 = new javax.swing.JLabel();
        camera_prize2 = new javax.swing.JLabel();
        camera_prize3 = new javax.swing.JLabel();
        camera_prize4 = new javax.swing.JLabel();
        tab_lenses = new javax.swing.JPanel();
        JLabel_lens_1 = new javax.swing.JLabel();
        JLabel_lens_2 = new javax.swing.JLabel();
        JLabel_lens_3 = new javax.swing.JLabel();
        JLabel_lens_4 = new javax.swing.JLabel();
        lens1 = new javax.swing.JLabel();
        lens2 = new javax.swing.JLabel();
        lens3 = new javax.swing.JLabel();
        lens4 = new javax.swing.JLabel();
        add_to_cart5 = new javax.swing.JButton();
        add_to_cart6 = new javax.swing.JButton();
        add_to_cart7 = new javax.swing.JButton();
        add_to_cart8 = new javax.swing.JButton();
        lens_prize1 = new javax.swing.JLabel();
        lens_prize2 = new javax.swing.JLabel();
        lens_prize3 = new javax.swing.JLabel();
        lens_prize4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        SignUp_Panel = new javax.swing.JPanel();
        JPanel_SignUp = new javax.swing.JPanel();
        signup_username = new javax.swing.JLabel();
        signup_password = new javax.swing.JLabel();
        signup_password_con = new javax.swing.JLabel();
        JSeparator3 = new javax.swing.JSeparator();
        JSeparator4 = new javax.swing.JSeparator();
        JSeparator6 = new javax.swing.JSeparator();
        signup_username_text = new javax.swing.JTextField();
        signup_pw_text = new javax.swing.JTextField();
        signup_conpw_text = new javax.swing.JTextField();
        JLabel_newto1 = new javax.swing.JLabel();
        JLabel_here1 = new javax.swing.JLabel();
        JButton_SignUp = new javax.swing.JButton();
        JButton_Signin_link = new javax.swing.JButton();
        JLabel_Logo_THE2 = new javax.swing.JLabel();
        Jlabel_Logo_camerastore2 = new javax.swing.JLabel();
        JLabel_Image1 = new javax.swing.JLabel();
        SignIn_Panel = new javax.swing.JPanel();
        JPanel_SignIn = new javax.swing.JPanel();
        JLabel_Logo_THE = new javax.swing.JLabel();
        Jlabel_Logo_camerastore = new javax.swing.JLabel();
        JLabel_username = new javax.swing.JLabel();
        JLabel_password = new javax.swing.JLabel();
        JSeparator1 = new javax.swing.JSeparator();
        JSeparator2 = new javax.swing.JSeparator();
        JTextField_Username = new javax.swing.JTextField();
        JPasswordField_Password = new javax.swing.JPasswordField();
        JLabel_newto = new javax.swing.JLabel();
        JLabel_here = new javax.swing.JLabel();
        JButton_SignIn = new javax.swing.JButton();
        JButton_SignUp_link = new javax.swing.JButton();
        JLabel_Image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 153, 255));
        setResizable(false);

        JPanel_Item.setBackground(new java.awt.Color(0, 51, 51));
        JPanel_Item.setVisible(false);

        logout.setBackground(new java.awt.Color(153, 0, 0));
        logout.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("Log Out");
        logout.setBorder(null);
        logout.setBorderPainted(false);
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        cart.setBackground(new java.awt.Color(0, 153, 255));
        cart.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        cart.setForeground(new java.awt.Color(255, 255, 255));
        cart.setText("View Cart");
        cart.setBorder(null);
        cart.setBorderPainted(false);
        cart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartActionPerformed(evt);
            }
        });

        JLabel_Logo_Item1.setFont(new java.awt.Font("Papyrus", 3, 48)); // NOI18N
        JLabel_Logo_Item1.setForeground(new java.awt.Color(255, 255, 255));
        JLabel_Logo_Item1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabel_Logo_Item1.setText("THE");

        JLabel_Logo_Item2.setFont(new java.awt.Font("Papyrus", 3, 24)); // NOI18N
        JLabel_Logo_Item2.setForeground(new java.awt.Color(255, 255, 255));
        JLabel_Logo_Item2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabel_Logo_Item2.setText("Camera Store");

        Display_Total.setEditable(false);
        Display_Total.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Display_Total.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Display_Total.setText("0");
        Display_Total.setToolTipText("");
        Display_Total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Display_TotalActionPerformed(evt);
            }
        });

        Display_budget.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Display_budget.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Display_budget.setText("0");
        Display_budget.setToolTipText("");

        JTab_Item_Tab.setBackground(new java.awt.Color(51, 153, 255));

        tab_camera.setBackground(new java.awt.Color(0, 153, 255));

        JLabel_camera_1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        JLabel_camera_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabel_camera_1.setText("<html><center>Canon EOS0 RP Mirrorless <br> Digital Camera<center></html>");
        JLabel_camera_1.setToolTipText("");

        JLabel_camera_2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        JLabel_camera_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabel_camera_2.setText("<html><center>DJI Osmo Action 4k <br>Camera<center></html>");
        JLabel_camera_2.setToolTipText("");

        JLabel_camera_3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        JLabel_camera_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabel_camera_3.setText("<html><center>Nikon Coolpix B600<br> Digital Camera<center></html>");
        JLabel_camera_3.setToolTipText("");

        JLabel_camera_4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        JLabel_camera_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabel_camera_4.setText("<html><center>Fujifilm X-T30 Mirrorless<br> Digital Camera<center></html>");
        JLabel_camera_4.setToolTipText("");

        add_to_cart1.setBackground(new java.awt.Color(0, 51, 102));
        add_to_cart1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        add_to_cart1.setForeground(new java.awt.Color(255, 255, 255));
        add_to_cart1.setText("Add to Cart");
        add_to_cart1.setBorder(null);
        add_to_cart1.setBorderPainted(false);
        add_to_cart1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add_to_cart1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_to_cart1ActionPerformed(evt);
            }
        });

        add_to_cart2.setBackground(new java.awt.Color(0, 51, 102));
        add_to_cart2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        add_to_cart2.setForeground(new java.awt.Color(255, 255, 255));
        add_to_cart2.setText("Add to Cart");
        add_to_cart2.setBorder(null);
        add_to_cart2.setBorderPainted(false);
        add_to_cart2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add_to_cart2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_to_cart2ActionPerformed(evt);
            }
        });

        add_to_cart3.setBackground(new java.awt.Color(0, 51, 102));
        add_to_cart3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        add_to_cart3.setForeground(new java.awt.Color(255, 255, 255));
        add_to_cart3.setText("Add to Cart");
        add_to_cart3.setBorder(null);
        add_to_cart3.setBorderPainted(false);
        add_to_cart3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add_to_cart3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_to_cart3ActionPerformed(evt);
            }
        });

        add_to_cart4.setBackground(new java.awt.Color(0, 51, 102));
        add_to_cart4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        add_to_cart4.setForeground(new java.awt.Color(255, 255, 255));
        add_to_cart4.setText("Add to Cart");
        add_to_cart4.setBorder(null);
        add_to_cart4.setBorderPainted(false);
        add_to_cart4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add_to_cart4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_to_cart4ActionPerformed(evt);
            }
        });

        camera_prize1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        camera_prize1.setForeground(new java.awt.Color(204, 0, 0));
        camera_prize1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        camera_prize1.setText("LKR 209,900");

        camera_prize2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        camera_prize2.setForeground(new java.awt.Color(204, 0, 0));
        camera_prize2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        camera_prize2.setText("LKR 159,999");

        camera_prize3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        camera_prize3.setForeground(new java.awt.Color(204, 0, 0));
        camera_prize3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        camera_prize3.setText("LKR 72,500");

        camera_prize4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        camera_prize4.setForeground(new java.awt.Color(204, 0, 0));
        camera_prize4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        camera_prize4.setText("LKR 69,500");

        javax.swing.GroupLayout tab_cameraLayout = new javax.swing.GroupLayout(tab_camera);
        tab_camera.setLayout(tab_cameraLayout);
        tab_cameraLayout.setHorizontalGroup(
            tab_cameraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_cameraLayout.createSequentialGroup()
                .addGroup(tab_cameraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(tab_cameraLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(add_to_cart1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(529, 529, 529))
                    .addGroup(tab_cameraLayout.createSequentialGroup()
                        .addGroup(tab_cameraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tab_cameraLayout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(JLabel_camera_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab_cameraLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(camera1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)))
                        .addGroup(tab_cameraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(tab_cameraLayout.createSequentialGroup()
                                .addGroup(tab_cameraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLabel_camera_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(camera2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(tab_cameraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(tab_cameraLayout.createSequentialGroup()
                                        .addGap(87, 87, 87)
                                        .addComponent(JLabel_camera_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab_cameraLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(camera3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(16, 16, 16)))
                                .addGap(65, 65, 65))
                            .addGroup(tab_cameraLayout.createSequentialGroup()
                                .addComponent(add_to_cart2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(add_to_cart3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77))))
                    .addGroup(tab_cameraLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(camera_prize1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(camera_prize2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(camera_prize3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)))
                .addGroup(tab_cameraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tab_cameraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(tab_cameraLayout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addGroup(tab_cameraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JLabel_camera_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(tab_cameraLayout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addComponent(camera_prize4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(camera4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(add_to_cart4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 113, Short.MAX_VALUE))
        );
        tab_cameraLayout.setVerticalGroup(
            tab_cameraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab_cameraLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(tab_cameraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(tab_cameraLayout.createSequentialGroup()
                        .addGroup(tab_cameraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(tab_cameraLayout.createSequentialGroup()
                                .addComponent(camera3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JLabel_camera_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tab_cameraLayout.createSequentialGroup()
                                .addGroup(tab_cameraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(camera2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(camera1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(tab_cameraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLabel_camera_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JLabel_camera_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(tab_cameraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(tab_cameraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(camera_prize2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(camera_prize1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(camera_prize3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(tab_cameraLayout.createSequentialGroup()
                        .addComponent(camera4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLabel_camera_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(camera_prize4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addGroup(tab_cameraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tab_cameraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(add_to_cart1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(add_to_cart2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(add_to_cart4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(add_to_cart3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        JTab_Item_Tab.addTab("cameras", tab_camera);

        tab_lenses.setBackground(new java.awt.Color(0, 153, 255));

        JLabel_lens_1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        JLabel_lens_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabel_lens_1.setText("<html><center>Sony FE 600mm F/4 <br> GM OSS Lens<center></html>");
        JLabel_lens_1.setToolTipText("");

        JLabel_lens_2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        JLabel_lens_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabel_lens_2.setText("<html><center>Sony FE 200mm -600mm<br>F/5.6-6.3 G OSS Lens<center></html>");
        JLabel_lens_2.setToolTipText("");

        JLabel_lens_3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        JLabel_lens_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabel_lens_3.setText("<html><center>Takina FiRIN F/2 FE AF <br> Lens for Sony E<center></html>");
        JLabel_lens_3.setToolTipText("");

        JLabel_lens_4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        JLabel_lens_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabel_lens_4.setText("<html><center>Fujinon XF 100-400mm<br> F/ 4.5-5.6 R LM OIS WR Lens<center></html>");
        JLabel_lens_4.setToolTipText("");

        add_to_cart5.setBackground(new java.awt.Color(0, 51, 102));
        add_to_cart5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        add_to_cart5.setForeground(new java.awt.Color(255, 255, 255));
        add_to_cart5.setText("Add to Cart");
        add_to_cart5.setBorder(null);
        add_to_cart5.setBorderPainted(false);
        add_to_cart5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add_to_cart5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_to_cart5ActionPerformed(evt);
            }
        });

        add_to_cart6.setBackground(new java.awt.Color(0, 51, 102));
        add_to_cart6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        add_to_cart6.setForeground(new java.awt.Color(255, 255, 255));
        add_to_cart6.setText("Add to Cart");
        add_to_cart6.setBorder(null);
        add_to_cart6.setBorderPainted(false);
        add_to_cart6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add_to_cart6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_to_cart6ActionPerformed(evt);
            }
        });

        add_to_cart7.setBackground(new java.awt.Color(0, 51, 102));
        add_to_cart7.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        add_to_cart7.setForeground(new java.awt.Color(255, 255, 255));
        add_to_cart7.setText("Add to Cart");
        add_to_cart7.setBorder(null);
        add_to_cart7.setBorderPainted(false);
        add_to_cart7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add_to_cart7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_to_cart7ActionPerformed(evt);
            }
        });

        add_to_cart8.setBackground(new java.awt.Color(0, 51, 102));
        add_to_cart8.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        add_to_cart8.setForeground(new java.awt.Color(255, 255, 255));
        add_to_cart8.setText("Add to Cart");
        add_to_cart8.setBorder(null);
        add_to_cart8.setBorderPainted(false);
        add_to_cart8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add_to_cart8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_to_cart8ActionPerformed(evt);
            }
        });

        lens_prize1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lens_prize1.setForeground(new java.awt.Color(204, 0, 0));
        lens_prize1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lens_prize1.setText("LKR 374,900");

        lens_prize2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lens_prize2.setForeground(new java.awt.Color(204, 0, 0));
        lens_prize2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lens_prize2.setText("LKR 2,450,000");

        lens_prize3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lens_prize3.setForeground(new java.awt.Color(204, 0, 0));
        lens_prize3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lens_prize3.setText("LKR 118,500");

        lens_prize4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lens_prize4.setForeground(new java.awt.Color(204, 0, 0));
        lens_prize4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lens_prize4.setText("LKR 299,000");

        javax.swing.GroupLayout tab_lensesLayout = new javax.swing.GroupLayout(tab_lenses);
        tab_lenses.setLayout(tab_lensesLayout);
        tab_lensesLayout.setHorizontalGroup(
            tab_lensesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_lensesLayout.createSequentialGroup()
                .addGroup(tab_lensesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tab_lensesLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(tab_lensesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tab_lensesLayout.createSequentialGroup()
                                .addGroup(tab_lensesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lens1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JLabel_lens_1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(57, 57, 57)
                                .addGroup(tab_lensesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLabel_lens_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(tab_lensesLayout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(lens2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(tab_lensesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(tab_lensesLayout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addComponent(JLabel_lens_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(tab_lensesLayout.createSequentialGroup()
                                        .addGap(79, 79, 79)
                                        .addComponent(lens3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(tab_lensesLayout.createSequentialGroup()
                                .addComponent(add_to_cart5, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(add_to_cart6, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85)
                                .addComponent(add_to_cart7, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(tab_lensesLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(lens_prize2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(lens_prize1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129)
                        .addComponent(lens_prize4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(tab_lensesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tab_lensesLayout.createSequentialGroup()
                        .addGroup(tab_lensesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tab_lensesLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(JLabel_lens_3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tab_lensesLayout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(lens_prize3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(99, Short.MAX_VALUE))
                    .addGroup(tab_lensesLayout.createSequentialGroup()
                        .addGroup(tab_lensesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tab_lensesLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(add_to_cart8, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tab_lensesLayout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(lens4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        tab_lensesLayout.setVerticalGroup(
            tab_lensesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab_lensesLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(tab_lensesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(tab_lensesLayout.createSequentialGroup()
                        .addComponent(lens3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLabel_lens_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tab_lensesLayout.createSequentialGroup()
                        .addGroup(tab_lensesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lens2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lens1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tab_lensesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLabel_lens_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLabel_lens_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tab_lensesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(tab_lensesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lens_prize1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lens_prize2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lens_prize4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tab_lensesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tab_lensesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(add_to_cart5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(add_to_cart7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(add_to_cart6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab_lensesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lens4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLabel_lens_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lens_prize3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(add_to_cart8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );

        JTab_Item_Tab.addTab("lenses", tab_lenses);

        jLabel1.setBackground(new java.awt.Color(0, 51, 51));
        jLabel1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Input your budget");
        jLabel1.setToolTipText("");

        jLabel2.setBackground(new java.awt.Color(0, 51, 51));
        jLabel2.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Total amount");
        jLabel2.setToolTipText("");

        javax.swing.GroupLayout JPanel_ItemLayout = new javax.swing.GroupLayout(JPanel_Item);
        JPanel_Item.setLayout(JPanel_ItemLayout);
        JPanel_ItemLayout.setHorizontalGroup(
            JPanel_ItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_ItemLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(JPanel_ItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JPanel_ItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(JTab_Item_Tab, javax.swing.GroupLayout.PREFERRED_SIZE, 1074, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(JPanel_ItemLayout.createSequentialGroup()
                            .addGroup(JPanel_ItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(JPanel_ItemLayout.createSequentialGroup()
                                    .addGap(52, 52, 52)
                                    .addComponent(JLabel_Logo_Item1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(JLabel_Logo_Item2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(JPanel_ItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Display_budget)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(JPanel_ItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Display_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(24, 24, 24)
                            .addComponent(cart, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(8, 8, 8))))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        JPanel_ItemLayout.setVerticalGroup(
            JPanel_ItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel_ItemLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(JPanel_ItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel_ItemLayout.createSequentialGroup()
                        .addComponent(JLabel_Logo_Item1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(JLabel_Logo_Item2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel_ItemLayout.createSequentialGroup()
                        .addGroup(JPanel_ItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanel_ItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Display_budget, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Display_Total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPanel_ItemLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(JPanel_ItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(cart, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(JTab_Item_Tab, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        SignUp_Panel.setBackground(new java.awt.Color(51, 204, 255));
        SignUp_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        SignUp_Panel.setVisible(false);

        JPanel_SignUp.setBackground(new java.awt.Color(0, 51, 51));
        JPanel_SignUp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signup_username.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        signup_username.setForeground(new java.awt.Color(102, 204, 255));
        signup_username.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        signup_username.setText("User Name     ");
        signup_username.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        JPanel_SignUp.add(signup_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 142, 38));

        signup_password.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        signup_password.setForeground(new java.awt.Color(102, 204, 255));
        signup_password.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        signup_password.setText("Password        ");
        signup_password.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        JPanel_SignUp.add(signup_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 142, 38));

        signup_password_con.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        signup_password_con.setForeground(new java.awt.Color(102, 204, 255));
        signup_password_con.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        signup_password_con.setText("Confirm Password        ");
        signup_password_con.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        JPanel_SignUp.add(signup_password_con, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 220, 38));
        JPanel_SignUp.add(JSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 290, -1));
        JPanel_SignUp.add(JSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 290, -1));
        JPanel_SignUp.add(JSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 290, -1));

        signup_username_text.setBackground(new java.awt.Color(0, 51, 51));
        signup_username_text.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        signup_username_text.setForeground(new java.awt.Color(153, 153, 153));
        signup_username_text.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        signup_username_text.setBorder(null);
        JPanel_SignUp.add(signup_username_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 290, -1));

        signup_pw_text.setBackground(new java.awt.Color(0, 51, 51));
        signup_pw_text.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        signup_pw_text.setForeground(new java.awt.Color(153, 153, 153));
        signup_pw_text.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        signup_pw_text.setBorder(null);
        JPanel_SignUp.add(signup_pw_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 290, -1));

        signup_conpw_text.setBackground(new java.awt.Color(0, 51, 51));
        signup_conpw_text.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        signup_conpw_text.setForeground(new java.awt.Color(153, 153, 153));
        signup_conpw_text.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        signup_conpw_text.setBorder(null);
        JPanel_SignUp.add(signup_conpw_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 290, -1));

        JLabel_newto1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        JLabel_newto1.setForeground(new java.awt.Color(153, 153, 153));
        JLabel_newto1.setText("Already Registered?");
        JLabel_newto1.setToolTipText("");
        JPanel_SignUp.add(JLabel_newto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 670, -1, -1));

        JLabel_here1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        JLabel_here1.setForeground(new java.awt.Color(153, 153, 153));
        JLabel_here1.setText("here!");
        JLabel_here1.setToolTipText("");
        JPanel_SignUp.add(JLabel_here1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 670, -1, -1));

        JButton_SignUp.setBackground(new java.awt.Color(0, 51, 255));
        JButton_SignUp.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        JButton_SignUp.setForeground(new java.awt.Color(255, 255, 255));
        JButton_SignUp.setText("Sign Up");
        JButton_SignUp.setBorder(null);
        JButton_SignUp.setBorderPainted(false);
        JButton_SignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButton_SignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_SignUpActionPerformed(evt);
            }
        });
        JPanel_SignUp.add(JButton_SignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 600, 230, 60));

        JButton_Signin_link.setBackground(new java.awt.Color(0, 51, 51));
        JButton_Signin_link.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        JButton_Signin_link.setForeground(new java.awt.Color(255, 255, 255));
        JButton_Signin_link.setText("Sign In");
        JButton_Signin_link.setBorder(null);
        JButton_Signin_link.setBorderPainted(false);
        JButton_Signin_link.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButton_Signin_link.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_Signin_linkActionPerformed(evt);
            }
        });
        JPanel_SignUp.add(JButton_Signin_link, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 670, 63, -1));

        JLabel_Logo_THE2.setFont(new java.awt.Font("Papyrus", 3, 48)); // NOI18N
        JLabel_Logo_THE2.setForeground(new java.awt.Color(255, 255, 255));
        JLabel_Logo_THE2.setText("THE");
        JPanel_SignUp.add(JLabel_Logo_THE2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 170, 90));

        Jlabel_Logo_camerastore2.setFont(new java.awt.Font("Papyrus", 3, 24)); // NOI18N
        Jlabel_Logo_camerastore2.setForeground(new java.awt.Color(255, 255, 255));
        Jlabel_Logo_camerastore2.setText("Camera Store");
        JPanel_SignUp.add(Jlabel_Logo_camerastore2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 210, 90));

        SignUp_Panel.add(JPanel_SignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 400, 750));

        JLabel_Image1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main.jpg"))); // NOI18N
        SignUp_Panel.add(JLabel_Image1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 750));

        SignIn_Panel.setBackground(new java.awt.Color(51, 204, 255));
        SignIn_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPanel_SignIn.setBackground(new java.awt.Color(0, 51, 51));
        JPanel_SignIn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JLabel_Logo_THE.setFont(new java.awt.Font("Papyrus", 3, 48)); // NOI18N
        JLabel_Logo_THE.setForeground(new java.awt.Color(255, 255, 255));
        JLabel_Logo_THE.setText("THE");
        JPanel_SignIn.add(JLabel_Logo_THE, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 170, 90));

        Jlabel_Logo_camerastore.setFont(new java.awt.Font("Papyrus", 3, 24)); // NOI18N
        Jlabel_Logo_camerastore.setForeground(new java.awt.Color(255, 255, 255));
        Jlabel_Logo_camerastore.setText("Camera Store");
        JPanel_SignIn.add(Jlabel_Logo_camerastore, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 210, 90));

        JLabel_username.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        JLabel_username.setForeground(new java.awt.Color(102, 204, 255));
        JLabel_username.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLabel_username.setText("User Name     ");
        JLabel_username.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        JPanel_SignIn.add(JLabel_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 142, 38));

        JLabel_password.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        JLabel_password.setForeground(new java.awt.Color(102, 204, 255));
        JLabel_password.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLabel_password.setText("Password        ");
        JLabel_password.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        JPanel_SignIn.add(JLabel_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 550, 142, 38));
        JPanel_SignIn.add(JSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 620, 290, -1));
        JPanel_SignIn.add(JSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, 290, -1));

        JTextField_Username.setBackground(new java.awt.Color(0, 51, 51));
        JTextField_Username.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        JTextField_Username.setForeground(new java.awt.Color(153, 153, 153));
        JTextField_Username.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        JTextField_Username.setBorder(null);
        JPanel_SignIn.add(JTextField_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 290, -1));

        JPasswordField_Password.setBackground(new java.awt.Color(0, 51, 51));
        JPasswordField_Password.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        JPasswordField_Password.setForeground(new java.awt.Color(153, 153, 153));
        JPasswordField_Password.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        JPasswordField_Password.setBorder(null);
        JPasswordField_Password.setName(""); // NOI18N
        JPanel_SignIn.add(JPasswordField_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 590, 290, -1));
        JPasswordField_Password.getAccessibleContext().setAccessibleName("");
        JPasswordField_Password.getAccessibleContext().setAccessibleDescription("");

        JLabel_newto.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        JLabel_newto.setForeground(new java.awt.Color(153, 153, 153));
        JLabel_newto.setText("New to 'The Camera Store' ? ");
        JLabel_newto.setToolTipText("");
        JPanel_SignIn.add(JLabel_newto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 760, -1, -1));

        JLabel_here.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        JLabel_here.setForeground(new java.awt.Color(153, 153, 153));
        JLabel_here.setText("here!");
        JLabel_here.setToolTipText("");
        JPanel_SignIn.add(JLabel_here, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 760, -1, -1));

        JButton_SignIn.setBackground(new java.awt.Color(0, 51, 255));
        JButton_SignIn.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        JButton_SignIn.setForeground(new java.awt.Color(255, 255, 255));
        JButton_SignIn.setText("Sign In");
        JButton_SignIn.setBorder(null);
        JButton_SignIn.setBorderPainted(false);
        JButton_SignIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButton_SignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_SignInActionPerformed(evt);
            }
        });
        JPanel_SignIn.add(JButton_SignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 660, 230, 60));

        JButton_SignUp_link.setBackground(new java.awt.Color(0, 51, 51));
        JButton_SignUp_link.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        JButton_SignUp_link.setForeground(new java.awt.Color(255, 255, 255));
        JButton_SignUp_link.setText("Sign Up");
        JButton_SignUp_link.setBorder(null);
        JButton_SignUp_link.setBorderPainted(false);
        JButton_SignUp_link.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButton_SignUp_link.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_SignUp_linkActionPerformed(evt);
            }
        });
        JPanel_SignIn.add(JButton_SignUp_link, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 760, 63, -1));

        SignIn_Panel.add(JPanel_SignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, -160, 400, 910));

        JLabel_Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main.jpg"))); // NOI18N
        SignIn_Panel.add(JLabel_Image, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 750));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SignIn_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(JPanel_Item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(SignUp_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SignIn_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 8, Short.MAX_VALUE)
                    .addComponent(JPanel_Item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 8, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(SignUp_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JButton_SignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_SignInActionPerformed
               String user= JTextField_Username.getText();
               String pw = JPasswordField_Password.getText();
               if(user.length()==0){
                    JOptionPane.showMessageDialog(null,"Plese Enter the username!");    
               }
               else if(pw.length()==0){
                   JOptionPane.showMessageDialog(null,"Plese Enter the password!");
               }
               else{
                   try{
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con=DriverManager.getConnection("jdbc:mysql://localhost/camerastore","root","");
                        Statement state=con.createStatement();
                        ResultSet res = state.executeQuery("SELECT userID FROM users WHERE username='"+user+"' and password='"+pw+"';");
                        String uid=null;
                        if(res.next()){
                            uid=res.getString("userID");
                        }
                        if (uid!=null){
                            JTextField_Username.setText(null);
                            JPasswordField_Password.setText(null);
                            SignIn_Panel.setVisible(false);
                            JPanel_Item.setVisible(true);                   
                        }
                        else{
                           JOptionPane.showMessageDialog(null,"Username or Password Incorrect!"); 
                        }
                                
                        con.close();  
                   }
                   catch(Exception e){System.out.println(e);}
                   
               }          
    }//GEN-LAST:event_JButton_SignInActionPerformed

    private void add_to_cart1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_to_cart1ActionPerformed
        String des="Canon EOS0 RP Mirrorless Digital Camera";
        int prize = 209900;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/camerastore","root","");
            Statement state=con.createStatement();
            total=total+prize ;
            T = String.valueOf(total);
            Display_Total.setText(T);
            B=Display_budget.getText();
            budget=Integer.parseInt(B);
            if(budget>total){
                state.executeUpdate("INSERT into cart(description,amount) values('"+des+"','"+prize+"');"); 
                JOptionPane.showMessageDialog(null,"Canon EOS0 RP Mirrorless Digital Camera has been added to your cart!");
            }
            else{
                JOptionPane.showMessageDialog(null,"Insufficient Budget !\nCannot add !");
                total=total-prize ;
                T = String.valueOf(total);
                Display_Total.setText(T);
            }
        }
        catch(Exception e){System.out.println(e);}              
    }//GEN-LAST:event_add_to_cart1ActionPerformed

    private void add_to_cart2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_to_cart2ActionPerformed
        String des="DJI Osmo Action 4k Camera";
        int prize = 159999;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/camerastore","root","");
            Statement state=con.createStatement();
            total=total+prize ;
            T = String.valueOf(total);
            Display_Total.setText(T);
            B=Display_budget.getText();
            budget=Integer.parseInt(B);
            if(budget>total){
                state.executeUpdate("INSERT into cart(description,amount) values('"+des+"','"+prize+"');"); 
                JOptionPane.showMessageDialog(null,"DJI Osmo Action 4k Camera has been added to your cart!"); 
            }
            else{
                JOptionPane.showMessageDialog(null,"Insufficient Budget !\nCannot add !");
                total=total-prize ;
                T = String.valueOf(total);
                Display_Total.setText(T);
            }
        }
        catch(Exception e){System.out.println(e);}
    }//GEN-LAST:event_add_to_cart2ActionPerformed

    private void add_to_cart3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_to_cart3ActionPerformed
       String des="Fujifilm X-T30 Mirrorless Digital Camera";
        int prize = 72500;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/camerastore","root","");
            Statement state=con.createStatement();
            total=total+prize ;
            T = String.valueOf(total);
            Display_Total.setText(T);
            B=Display_budget.getText();
            budget=Integer.parseInt(B);
            if(budget>total){
                state.executeUpdate("INSERT into cart(description,amount) values('"+des+"','"+prize+"');"); 
                JOptionPane.showMessageDialog(null,"Fujifilm X-T30 Mirrorless Digital Camera has been added to your cart!"); 
            }
            else{
                JOptionPane.showMessageDialog(null,"Insufficient Budget !\nCannot add !");
                total=total-prize ;
                T = String.valueOf(total);
                Display_Total.setText(T);
            }
        }
        catch(Exception e){System.out.println(e);}
    }//GEN-LAST:event_add_to_cart3ActionPerformed

    private void add_to_cart4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_to_cart4ActionPerformed
        String des="Nikon Coolpix B600 Digital Camera";
        int prize = 69500;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/camerastore","root","");
            Statement state=con.createStatement();
            total=total+prize ;
            T = String.valueOf(total);
            Display_Total.setText(T);
            B=Display_budget.getText();
            budget=Integer.parseInt(B);
            if(budget>total){
                state.executeUpdate("INSERT into cart(description,amount) values('"+des+"','"+prize+"');"); 
                JOptionPane.showMessageDialog(null,"Nikon Coolpix B600 Digital Camera has been added to your cart!"); 
            }
            else{
                JOptionPane.showMessageDialog(null,"Insufficient Budget !\nCannot add !");
                total=total-prize ;
                T = String.valueOf(total);
                Display_Total.setText(T);
            }
        }
        catch(Exception e){System.out.println(e);}
    }//GEN-LAST:event_add_to_cart4ActionPerformed

    private void add_to_cart5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_to_cart5ActionPerformed
        String des="Sony FE 600mm F/4 GM OSS Lens";
        int prize = 2450000;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/camerastore","root","");
            Statement state=con.createStatement();
            total=total+prize ;
            T = String.valueOf(total);
            Display_Total.setText(T);
            B=Display_budget.getText();
            budget=Integer.parseInt(B);
            if(budget>total){
                state.executeUpdate("INSERT into cart(description,amount) values('"+des+"','"+prize+"');"); 
                JOptionPane.showMessageDialog(null,"Sony FE 600mm F/4 GM OSS Lens has been added to your cart!"); 
            }
            else{
                JOptionPane.showMessageDialog(null,"Insufficient Budget !\nCannot add !");
                total=total-prize ;
                T = String.valueOf(total);
                Display_Total.setText(T);
            }
        }
        catch(Exception e){System.out.println(e);}
    }//GEN-LAST:event_add_to_cart5ActionPerformed

    private void add_to_cart6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_to_cart6ActionPerformed
        String des="Sony FE 200-600mm F/5.6-6.3 G OSS Lens";
        int prize = 374900;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/camerastore","root","");
            Statement state=con.createStatement();
            total=total+prize ;
            T = String.valueOf(total);
            Display_Total.setText(T);
            B=Display_budget.getText();
            budget=Integer.parseInt(B);
            if(budget>total){
                state.executeUpdate("INSERT into cart(description,amount) values('"+des+"','"+prize+"');"); 
                JOptionPane.showMessageDialog(null,"Sony FE 200-600mm F/5.6-6.3 G OSS Lens has been added to your cart!"); 
            }
            else{
                JOptionPane.showMessageDialog(null,"Insufficient Budget !\nCannot add !");
                total=total-prize ;
                T = String.valueOf(total);
                Display_Total.setText(T);
            }
        }
        catch(Exception e){System.out.println(e);}
    }//GEN-LAST:event_add_to_cart6ActionPerformed

    private void add_to_cart7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_to_cart7ActionPerformed
        String des="Fujinon XF 100-400mm F/ 4.5-5.6 R LM OIS WR Lens";
        int prize = 299000;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/camerastore","root","");
            Statement state=con.createStatement();
            total=total+prize ;
            T = String.valueOf(total);
            Display_Total.setText(T);
            B=Display_budget.getText();
            budget=Integer.parseInt(B);
            if(budget>total){
                state.executeUpdate("INSERT into cart(description,amount) values('"+des+"','"+prize+"');"); 
                JOptionPane.showMessageDialog(null,"Fujinon XF 100-400mm F/ 4.5-5.6 R LM OIS WR Lens has been added to your cart!"); 
            }
            else{
                JOptionPane.showMessageDialog(null,"Insufficient Budget !\nCannot add !");
                total=total-prize ;
                T = String.valueOf(total);
                Display_Total.setText(T);
            }
        }
        catch(Exception e){System.out.println(e);}
    }//GEN-LAST:event_add_to_cart7ActionPerformed

    private void add_to_cart8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_to_cart8ActionPerformed
        String des="Takina FiRIN F/2 FE AF Lens for Sony E";
        int prize = 118500;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/camerastore","root","");
            Statement state=con.createStatement();
            total=total+prize ;
            T = String.valueOf(total);
            Display_Total.setText(T);
            B=Display_budget.getText();
            budget=Integer.parseInt(B);
            if(budget>total){
                state.executeUpdate("INSERT into cart(description,amount) values('"+des+"','"+prize+"');"); 
                JOptionPane.showMessageDialog(null,"Takina FiRIN F/2 FE AF Lens for Sony E added to your cart!"); 
            }
            else{
                JOptionPane.showMessageDialog(null,"Insufficient Budget !\nCannot add !");
                total=total-prize ;
                T = String.valueOf(total);
                Display_Total.setText(T);
            }
        }
        catch(Exception e){System.out.println(e);}
    }//GEN-LAST:event_add_to_cart8ActionPerformed

    private void cartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartActionPerformed
        new cart(this).setVisible(true);
    }//GEN-LAST:event_cartActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/camerastore","root","");
            Statement state=con.createStatement();
            state.executeUpdate("DELETE FROM cart;"); 
        }
        catch(Exception e){System.out.println(e);}
        
        total = 0 ;
        budget = 0 ;
        Display_Total.setText("0");
        Display_budget.setText("0");
        JPanel_Item.setVisible(false);
        SignIn_Panel.setVisible(true); 
    }//GEN-LAST:event_logoutActionPerformed

    private void JButton_SignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_SignUpActionPerformed
        int flag =0;
        String us = signup_username_text.getText();
        String pw = signup_pw_text.getText();
        String conpw = signup_conpw_text.getText();
        if(us.length()==0){
            flag=1;
            JOptionPane.showMessageDialog(null,"Please Enter username!");
        }
        else if(pw.length()==0){
            flag=1;
            JOptionPane.showMessageDialog(null,"Please Enter a password!");
        }
        else if(pw.length()==conpw.length()){
            for(int x=0;x<pw.length();x++){
                if(pw.charAt(x)!=conpw.charAt(x)){
                    flag=2;
                }
            }
        }
        else{
            flag=2;
        }
        
        if(flag==2){
            JOptionPane.showMessageDialog(null,"Passwords doesn't match!");
        }
        else if(flag==0){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost/camerastore","root","");
                Statement state=con.createStatement();
                
                ResultSet res = state.executeQuery("SELECT userID FROM users WHERE username='"+us+"';");
                String uid=null;
                if(res.next()){
                    uid=res.getString("userID");
                }
                if(uid==null){        
                    state.executeUpdate("INSERT into users(username,password) values('"+us+"','"+pw+"');");
                    con.close();
                    JOptionPane.showMessageDialog(null,"sucessfully registered as a user. Please sign in now!");
                    
                    SignUp_Panel.setVisible(false);
                    SignIn_Panel.setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null,"username " + us + " already exsists! Try different username!");
                }
            }
            catch(Exception e){System.out.println(e);}        
        }

    }//GEN-LAST:event_JButton_SignUpActionPerformed

    private void JButton_Signin_linkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_Signin_linkActionPerformed
        SignUp_Panel.setVisible(false);
        SignIn_Panel.setVisible(true); 
    }//GEN-LAST:event_JButton_Signin_linkActionPerformed

    private void JButton_SignUp_linkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_SignUp_linkActionPerformed
        SignIn_Panel.setVisible(false);
        SignUp_Panel.setVisible(true);
    }//GEN-LAST:event_JButton_SignUp_linkActionPerformed

    private void Display_TotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Display_TotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Display_TotalActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (Exception ex) {
            System.out.println(ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Main main = new Main();
                main.setLocationRelativeTo(null);
                main.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Display_Total;
    private javax.swing.JTextField Display_budget;
    private javax.swing.JButton JButton_SignIn;
    private javax.swing.JButton JButton_SignUp;
    private javax.swing.JButton JButton_SignUp_link;
    private javax.swing.JButton JButton_Signin_link;
    private javax.swing.JLabel JLabel_Image;
    private javax.swing.JLabel JLabel_Image1;
    private javax.swing.JLabel JLabel_Logo_Item1;
    private javax.swing.JLabel JLabel_Logo_Item2;
    private javax.swing.JLabel JLabel_Logo_THE;
    private javax.swing.JLabel JLabel_Logo_THE2;
    private javax.swing.JLabel JLabel_camera_1;
    private javax.swing.JLabel JLabel_camera_2;
    private javax.swing.JLabel JLabel_camera_3;
    private javax.swing.JLabel JLabel_camera_4;
    private javax.swing.JLabel JLabel_here;
    private javax.swing.JLabel JLabel_here1;
    private javax.swing.JLabel JLabel_lens_1;
    private javax.swing.JLabel JLabel_lens_2;
    private javax.swing.JLabel JLabel_lens_3;
    private javax.swing.JLabel JLabel_lens_4;
    private javax.swing.JLabel JLabel_newto;
    private javax.swing.JLabel JLabel_newto1;
    private javax.swing.JLabel JLabel_password;
    private javax.swing.JLabel JLabel_username;
    private javax.swing.JPanel JPanel_Item;
    private javax.swing.JPanel JPanel_SignIn;
    private javax.swing.JPanel JPanel_SignUp;
    private javax.swing.JPasswordField JPasswordField_Password;
    private javax.swing.JSeparator JSeparator1;
    private javax.swing.JSeparator JSeparator2;
    private javax.swing.JSeparator JSeparator3;
    private javax.swing.JSeparator JSeparator4;
    private javax.swing.JSeparator JSeparator6;
    private javax.swing.JTabbedPane JTab_Item_Tab;
    private javax.swing.JTextField JTextField_Username;
    private javax.swing.JLabel Jlabel_Logo_camerastore;
    private javax.swing.JLabel Jlabel_Logo_camerastore2;
    private javax.swing.JPanel SignIn_Panel;
    private javax.swing.JPanel SignUp_Panel;
    private javax.swing.JButton add_to_cart1;
    private javax.swing.JButton add_to_cart2;
    private javax.swing.JButton add_to_cart3;
    private javax.swing.JButton add_to_cart4;
    private javax.swing.JButton add_to_cart5;
    private javax.swing.JButton add_to_cart6;
    private javax.swing.JButton add_to_cart7;
    private javax.swing.JButton add_to_cart8;
    private javax.swing.JLabel camera1;
    private javax.swing.JLabel camera2;
    private javax.swing.JLabel camera3;
    private javax.swing.JLabel camera4;
    private javax.swing.JLabel camera_prize1;
    private javax.swing.JLabel camera_prize2;
    private javax.swing.JLabel camera_prize3;
    private javax.swing.JLabel camera_prize4;
    private javax.swing.JButton cart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lens1;
    private javax.swing.JLabel lens2;
    private javax.swing.JLabel lens3;
    private javax.swing.JLabel lens4;
    private javax.swing.JLabel lens_prize1;
    private javax.swing.JLabel lens_prize2;
    private javax.swing.JLabel lens_prize3;
    private javax.swing.JLabel lens_prize4;
    private javax.swing.JButton logout;
    private javax.swing.JTextField signup_conpw_text;
    private javax.swing.JLabel signup_password;
    private javax.swing.JLabel signup_password_con;
    private javax.swing.JTextField signup_pw_text;
    private javax.swing.JLabel signup_username;
    private javax.swing.JTextField signup_username_text;
    private javax.swing.JPanel tab_camera;
    private javax.swing.JPanel tab_lenses;
    // End of variables declaration//GEN-END:variables
}
