package Views;

import Controller.AllObjectCtrl;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginGUI {

    JFrame LoginGUI = new JFrame();
    JLabel Judul, LoginL, UsernameL, PasswordL;
    JButton addbtn;
    JTextField fieldusr;
    JPasswordField fieldpw;

    public LoginGUI() {
        LoginGUI.setTitle("Menu Login"); //set judul frame
        LoginGUI.setSize(700, 630); //set ukuran 
        LoginGUI.setLayout(null);
        LoginGUI.setResizable(false);
        LoginGUI.getContentPane().setBackground(new Color(89, 130, 223)); //memberi warna

        Judul = new JLabel("MENU APOTEKER");
        Judul.setBounds(200, 75, 400, 40);
        Judul.setFont(new Font("Consolas", Font.BOLD, 40));
        Judul.setForeground(Color.WHITE);
        LoginGUI.add(Judul);

        LoginL = new JLabel("LOGIN");
        LoginL.setBounds(280, 150, 100, 30);
        LoginL.setFont(new Font("Consolas", Font.BOLD, 30));
        LoginL.setForeground(Color.WHITE);
        LoginGUI.add(LoginL);

        UsernameL = new JLabel("Username");
        UsernameL.setBounds(225, 225, 200, 30);
        UsernameL.setFont(new Font("Consolas", Font.BOLD, 25));
        UsernameL.setForeground(Color.WHITE);
        LoginGUI.add(UsernameL);
        fieldusr = new JTextField();
        fieldusr.setBounds(225, 250, 200, 30);
        LoginGUI.add(fieldusr);

        PasswordL = new JLabel("Password");
        PasswordL.setBounds(225, 300, 200, 30);
        PasswordL.setFont(new Font("Consolas", Font.BOLD, 25));
        PasswordL.setForeground(Color.WHITE);
        LoginGUI.add(PasswordL);
        fieldpw = new JPasswordField();
        fieldpw.setBounds(225, 325, 200, 30);
        LoginGUI.add(fieldpw);

        addbtn = new JButton("Login");
        addbtn.setBounds(250, 375, 150, 50);
        addbtn.setFont(new Font("Consolas", Font.BOLD, 20));
        LoginGUI.add(addbtn);

        LoginGUI.setVisible(true); //melihat frame
        LoginGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //diclose tanpa klik stop
        LoginGUI.setLocationRelativeTo(null); //set ke tengah

        addbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    AllObjectCtrl.StaffCtrl.dataAdmin();
                    AllObjectCtrl.StaffCtrl.login(fieldusr.getText(), fieldpw.getText());
                    String nama = AllObjectCtrl.StaffCtrl.StaffEt().getNama();
                    JOptionPane.showMessageDialog(null, "Selamat Datang " + nama, "Informasi", JOptionPane.INFORMATION_MESSAGE);
                    StaffApotekPanel stf = new StaffApotekPanel();
                    LoginGUI.dispose();
                    kosong();
                } catch (Exception exc) {
                    JOptionPane.showMessageDialog(null, "Username/Password Salah", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                }
            }
        });
    }

    void kosong() {
        fieldusr.setText(null);
        fieldpw.setText(null);
    }
}
