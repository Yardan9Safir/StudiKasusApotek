package Views;

import Controller.AllObjectCtrl;
import static Controller.AllObjectCtrl.ObatCtrl;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class StaffApotekPanel {

    JFrame StaffGUI = new JFrame();
    JButton backbtn, deleteBtn, updateBtn, CreateBtn, DarkModeBtn;
    JTextField indexFld, namaFld1, kodeFld1, kegunaanFld1, hargaFld1, indexFld1,
            namaFld2, kodeFld2, kegunaanFld2, hargaFld2;
    JTextArea area;
    JLabel indexLbl1, indexLbl2, lbl3,
            dl, ul, cl,
            namaLbl1, namaLbl2,
            kodeLbl1, kodeLbl2,
            K1, K2,
            H1, H2;
    JTable tabelObat = new JTable();
    JScrollPane scrollObat = new JScrollPane(tabelObat);

    public StaffApotekPanel() {
        //nama, kode, Kegunaan, harga
        StaffGUI.setTitle("Menu Staff"); //set judul frame
        StaffGUI.setSize(900, 720); //set ukuran 
        StaffGUI.setLayout(null);
        StaffGUI.setResizable(false);

        //del
        dl = new JLabel("Hapus Data Obat");
        dl.setBounds(30, 160, 200, 30);
        dl.setFont(new Font("Consolas", Font.BOLD, 20));
        dl.setForeground(Color.BLACK);
        StaffGUI.add(dl);

        indexLbl1 = new JLabel("Index");
        indexLbl1.setBounds(50, 200, 100, 30);
        indexLbl1.setFont(new Font("Consolas", Font.BOLD, 15));
        indexLbl1.setForeground(Color.BLACK);
        StaffGUI.add(indexLbl1);
        indexFld = new JTextField();
        indexFld.setBounds(100, 200, 50, 30);
        indexFld.setForeground(new Color(20, 20, 20));
        indexFld.setFont(new Font("Consolas", Font.BOLD, 15));
        StaffGUI.add(indexFld);

        deleteBtn = new JButton("Hapus");
        deleteBtn.setBounds(50, 240, 100, 30);
        deleteBtn.setBackground(new Color(182, 33, 33));
        deleteBtn.setForeground(Color.black);
        StaffGUI.add(deleteBtn);

        //update
        ul = new JLabel("Update Data Obat");
        ul.setBounds(30, 320, 200, 30);
        ul.setFont(new Font("Consolas", Font.BOLD, 20));
        ul.setForeground(Color.BLACK);
        StaffGUI.add(ul);

        namaLbl1 = new JLabel("Nama Obat");
        namaLbl1.setBounds(50, 350, 100, 30);
        namaLbl1.setFont(new Font("Consolas", Font.BOLD, 15));
        namaLbl1.setForeground(Color.BLACK);
        StaffGUI.add(namaLbl1);
        namaFld1 = new JTextField();
        namaFld1.setBounds(60, 380, 90, 30);
        namaFld1.setForeground(new Color(20, 20, 20));
        namaFld1.setFont(new Font("Consolas", Font.BOLD, 15));
        StaffGUI.add(namaFld1);

        kodeLbl1 = new JLabel("Kode Obat");
        kodeLbl1.setBounds(50, 410, 100, 30);
        kodeLbl1.setFont(new Font("Consolas", Font.BOLD, 15));
        kodeLbl1.setForeground(Color.BLACK);
        StaffGUI.add(kodeLbl1);
        kodeFld1 = new JTextField();
        kodeFld1.setBounds(60, 440, 90, 30);
        kodeFld1.setForeground(new Color(20, 20, 20));
        kodeFld1.setFont(new Font("Consolas", Font.BOLD, 15));
        StaffGUI.add(kodeFld1);

        K1 = new JLabel("Kegunaan Obat");
        K1.setBounds(50, 470, 120, 30);
        K1.setFont(new Font("Consolas", Font.BOLD, 15));
        K1.setForeground(Color.BLACK);
        StaffGUI.add(K1);
        kegunaanFld1 = new JTextField();
        kegunaanFld1.setBounds(60, 500, 90, 30);
        kegunaanFld1.setForeground(new Color(20, 20, 20));
        kegunaanFld1.setFont(new Font("Consolas", Font.BOLD, 15));
        StaffGUI.add(kegunaanFld1);

        H1 = new JLabel("Harga Obat");
        H1.setBounds(50, 530, 100, 30);
        H1.setFont(new Font("Consolas", Font.BOLD, 15));
        H1.setForeground(Color.BLACK);
        StaffGUI.add(H1);
        hargaFld1 = new JTextField();
        hargaFld1.setBounds(60, 560, 90, 30);
        hargaFld1.setForeground(new Color(20, 20, 20));
        hargaFld1.setFont(new Font("Consolas", Font.BOLD, 15));
        StaffGUI.add(hargaFld1);

        indexLbl2 = new JLabel("Index");
        indexLbl2.setBounds(50, 600, 100, 30);
        indexLbl2.setFont(new Font("Consolas", Font.BOLD, 15));
        indexLbl2.setForeground(Color.BLACK);
        StaffGUI.add(indexLbl2);
        indexFld1 = new JTextField();
        indexFld1.setBounds(100, 600, 50, 30);
        indexFld1.setForeground(new Color(20, 20, 20));
        indexFld1.setFont(new Font("Consolas", Font.BOLD, 15));
        StaffGUI.add(indexFld1);

        updateBtn = new JButton("Update");
        updateBtn.setBounds(50, 635, 100, 30);
        updateBtn.setBackground(new Color(182, 33, 33));
        updateBtn.setForeground(Color.black);
        StaffGUI.add(updateBtn);

        //create
        cl = new JLabel("Create Data Obat");
        cl.setBounds(270, 160, 200, 30);
        cl.setFont(new Font("Consolas", Font.BOLD, 20));
        cl.setForeground(Color.BLACK);
        StaffGUI.add(cl);

        namaLbl2 = new JLabel("Nama Obat");
        namaLbl2.setBounds(270, 200, 100, 30);
        namaLbl2.setFont(new Font("Consolas", Font.BOLD, 15));
        namaLbl2.setForeground(Color.BLACK);
        StaffGUI.add(namaLbl2);
        namaFld2 = new JTextField();
        namaFld2.setBounds(350, 200, 90, 30);
        namaFld2.setForeground(new Color(20, 20, 20));
        namaFld2.setFont(new Font("Consolas", Font.BOLD, 15));
        StaffGUI.add(namaFld2);

        kodeLbl2 = new JLabel("Kode Obat");
        kodeLbl2.setBounds(270, 250, 100, 30);
        kodeLbl2.setFont(new Font("Consolas", Font.BOLD, 15));
        kodeLbl2.setForeground(Color.BLACK);
        StaffGUI.add(kodeLbl2);
        kodeFld2 = new JTextField();
        kodeFld2.setBounds(350, 250, 90, 30);
        kodeFld2.setForeground(new Color(20, 20, 20));
        kodeFld2.setFont(new Font("Consolas", Font.BOLD, 15));
        StaffGUI.add(kodeFld2);

        K2 = new JLabel("Kegunaan Obat");
        K2.setBounds(450, 250, 120, 30);
        K2.setFont(new Font("Consolas", Font.BOLD, 15));
        K2.setForeground(Color.BLACK);
        StaffGUI.add(K2);
        kegunaanFld2 = new JTextField();
        kegunaanFld2.setBounds(560, 250, 90, 30);
        kegunaanFld2.setForeground(new Color(20, 20, 20));
        kegunaanFld2.setFont(new Font("Consolas", Font.BOLD, 15));
        StaffGUI.add(kegunaanFld2);

        H2 = new JLabel("Harga Obat");
        H2.setBounds(470, 200, 100, 30);
        H2.setFont(new Font("Consolas", Font.BOLD, 15));
        H2.setForeground(Color.BLACK);
        StaffGUI.add(H2);
        hargaFld2 = new JTextField();
        hargaFld2.setBounds(560, 200, 90, 30);
        hargaFld2.setForeground(new Color(20, 20, 20));
        hargaFld2.setFont(new Font("Consolas", Font.BOLD, 15));
        StaffGUI.add(hargaFld2);

        CreateBtn = new JButton("Tambah");
        CreateBtn.setBounds(670, 225, 100, 30);
        CreateBtn.setBackground(new Color(182, 33, 33));
        CreateBtn.setForeground(Color.black);
        StaffGUI.add(CreateBtn);

        DarkModeBtn = new JButton(".");
        DarkModeBtn.setBounds(750, 630, 40, 30);
        DarkModeBtn.setBorderPainted(false);
        StaffGUI.add(DarkModeBtn);
        
        JButton LightMode = new JButton(".");
        LightMode.setBounds(700, 630, 40, 30);
        LightMode.setBorderPainted(false);
        StaffGUI.add(LightMode);

        lbl3 = new JLabel("Data Obat");
        lbl3.setBounds(270, 320, 200, 30);
        lbl3.setFont(new Font("Consolas", Font.BOLD, 20));
        lbl3.setForeground(Color.BLACK);
        StaffGUI.add(lbl3);

        backbtn = new JButton("EXIT");
        backbtn.setBounds(700, 30, 100, 30);
        backbtn.setFont(new Font("Consolas", Font.BOLD, 20));
        backbtn.setBackground(Color.red);
        backbtn.setForeground(Color.white);
        StaffGUI.add(backbtn);

        area = new JTextArea();
        area.setBounds(30, 30, 230, 100);
        TitledBorder title;
        title = BorderFactory.createTitledBorder("Data Staff Apoteker");
        area.setBorder(title);
        area.setText(text());
        area.setFont(new Font("Consolas", Font.BOLD, 15));
        StaffGUI.add(area);

        tabelObat.setModel(ObatCtrl.daftarObat());
        StaffGUI.add(scrollObat);
        scrollObat.setBounds(270, 360, 500, 200);

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

        DarkModeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Mode Brody", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                indexLbl1.setForeground(new Color(218, 214, 214));
                indexLbl2.setForeground(new Color(218, 214, 214));
                lbl3.setForeground(new Color(218, 214, 214));
                dl.setForeground(new Color(218, 214, 214));
                ul.setForeground(new Color(218, 214, 214));
                cl.setForeground(new Color(218, 214, 214));
                namaLbl1.setForeground(new Color(218, 214, 214));
                namaLbl2.setForeground(new Color(218, 214, 214));
                kodeLbl1.setForeground(new Color(218, 214, 214));
                kodeLbl2.setForeground(new Color(218, 214, 214));
                K1.setForeground(new Color(218, 214, 214));
                K2.setForeground(new Color(218, 214, 214));
                H1.setForeground(new Color(218, 214, 214));
                H2.setForeground(new Color(218, 214, 214));
                StaffGUI.getContentPane().setBackground(new Color(47, 43, 43)); //memberi warna
                DarkModeBtn.setBackground(new Color(47, 43, 43));
                DarkModeBtn.setBorderPainted(false);
            }
        });
        
        LightMode.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Mode Lunox", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                indexLbl1.setForeground(new Color(10, 10, 10));
                indexLbl2.setForeground(new Color(10, 10, 10));
                lbl3.setForeground(new Color(10, 10, 10));
                dl.setForeground(new Color(10, 10, 10));
                ul.setForeground(new Color(10, 10, 10));
                cl.setForeground(new Color(10, 10, 10));
                namaLbl1.setForeground(new Color(10, 10, 10));
                namaLbl2.setForeground(new Color(10, 10, 10));
                kodeLbl1.setForeground(new Color(10, 10, 10));
                kodeLbl2.setForeground(new Color(10, 10, 10));
                K1.setForeground(new Color(10, 10, 10));
                K2.setForeground(new Color(10, 10, 10));
                H1.setForeground(new Color(10, 10, 10));
                H2.setForeground(new Color(10, 10, 10));
                StaffGUI.getContentPane().setBackground(new Color(89, 130, 223)); //memberi warna
                LightMode.setBackground(new Color(89, 130, 223));
                LightMode.setBorderPainted(false);
            }
        });

        CreateBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nama = namaFld2.getText();
                    String kode = kodeFld2.getText();
                    String kegunaan = kegunaanFld2.getText();
                    String harga1 = hargaFld2.getText();
                    int harga = Integer.parseInt(harga1);
                    AllObjectCtrl.ObatCtrl.create(nama, kode, kegunaan, harga);
                    tabelObat.setModel(ObatCtrl.daftarObat());
                    JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                } catch (Exception exc) {
                    JOptionPane.showMessageDialog(null, "Maaf Data gagal Terbuat", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                }
            }
        });

        updateBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String index2 = indexFld1.getText();
                    int index = Integer.parseInt(index2);
                    String nama = namaFld1.getText();
                    String kode = kodeFld1.getText();
                    String kegunaan = kegunaanFld1.getText();
                    String harga2 = hargaFld1.getText();
                    int harga = Integer.parseInt(harga2);
                    if (AllObjectCtrl.ObatCtrl.getDataObat().size() > 0) {
                        AllObjectCtrl.ObatCtrl.updateDataObat(index, nama, kode, kegunaan, harga);
                        tabelObat.setModel(ObatCtrl.daftarObat());
                        JOptionPane.showMessageDialog(null, "Data Berhasil TerUpdate", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                        kosong();
                    } else {
                        JOptionPane.showMessageDialog(null, "Data Masih Kosong", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                        kosong();
                    }
                } catch (Exception exc) {
                    JOptionPane.showMessageDialog(null, "Maaf Data gagal TerUpdate", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                }

            }
        });

        deleteBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String index3 = indexFld.getText();
                    int index = Integer.parseInt(index3);
                    if (AllObjectCtrl.ObatCtrl.getDataObat().size() > 0) {
                        AllObjectCtrl.ObatCtrl.delete(index);
                        tabelObat.setModel(ObatCtrl.daftarObat());
                        JOptionPane.showMessageDialog(null, "Data Berhasil Terhapus", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                        kosong();
                    } else {
                        JOptionPane.showMessageDialog(null, "Data Masih Kosong", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                        kosong();
                    }
                } catch (Exception exc) {
                    JOptionPane.showMessageDialog(null, "Maaf Data gagal TerHapus", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                }
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

    void kosong() {
        namaFld1.setText(null);
        kodeFld1.setText(null);
        kegunaanFld1.setText(null);
        hargaFld1.setText(null);
        indexFld1.setText(null);
        indexFld.setText(null);
        namaFld2.setText(null);
        kodeFld2.setText(null);
        kegunaanFld2.setText(null);
        hargaFld2.setText(null);
    }

}
