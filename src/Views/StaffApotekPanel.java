package Views;

import Controller.AllObjectCtrl;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class StaffApotekPanel {

    JFrame StaffGUI = new JFrame();
    JButton backbtn;
    JTextArea area;

    public StaffApotekPanel() {
        StaffGUI.setTitle("Menu Staff"); //set judul frame
        StaffGUI.setSize(900, 720); //set ukuran 
        StaffGUI.setLayout(null);
        StaffGUI.setResizable(false);

        backbtn = new JButton("Keluar");
        backbtn.setBounds(50, 600, 150, 30);
        backbtn.setFont(new Font("Consolas", Font.BOLD, 20));
        backbtn.setBackground(Color.red);
        backbtn.setForeground(Color.white);
        StaffGUI.add(backbtn);

        area = new JTextArea();
        area.setBounds(50, 50, 230, 100);
        TitledBorder title;
        title = BorderFactory.createTitledBorder("Data Staff Apoteker");
        area.setBorder(title);
        area.setText(text());
        area.setFont(new Font("Consolas", Font.BOLD, 15));
        StaffGUI.add(area);

        StaffGUI.getContentPane().setBackground(new Color(89, 130, 223)); //memberi warna
        StaffGUI.setVisible(true); //melihat frame
        StaffGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //diclose tanpa klik stop
        StaffGUI.setLocationRelativeTo(null); //set ke tengah

        backbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StaffGUI.dispose();
                LoginGUI lgn = new LoginGUI();
            }
        });

    }

    String text() {
        AllObjectCtrl.StaffCtrl.dataAdmin();
        String dataStaff = "kosong";
        dataStaff = "Kode : " + AllObjectCtrl.StaffCtrl.StaffEt().getKode()
                + "\nNama : " + AllObjectCtrl.StaffCtrl.StaffEt().getNama()
                + "\nUsername : " + AllObjectCtrl.StaffCtrl.StaffEt().getUsername()
                + "\nPengalaman Kerja : " + AllObjectCtrl.StaffCtrl.StaffEt().getPengalamanKerja() + " tahun";

        return dataStaff;
    }
}
