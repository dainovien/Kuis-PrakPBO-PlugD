/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuis.prakpbo.pkg123220215;

/**
 *
 * @author HP
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SikuFrame extends JFrame {
    private JTextField alasField;
    private JTextField tinggiField;
    private JLabel hasilLabel;

    public SikuFrame() {
        setTitle("PT UKANG App - Hitung Sisi Miring");
        setSize(350, 230);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints(); // Mengatur tata letak komponen dalam GridBagLayout
        gbc.insets = new Insets(5, 5, 5, 5); // Menetapkan jarak (padding) sebesar 5 piksel di atas, kanan, bawah, dan kiri untuk setiap komponen

        JLabel alasLabel = new JLabel("Alas:");
        JLabel tinggiLabel = new JLabel("Tinggi:");
        JLabel sisiLabel = new JLabel("Sisi Miring:");
        alasField = new JTextField(10);
        tinggiField = new JTextField(10);
        hasilLabel = new JLabel();

        JButton hitungButton = new JButton("Hitung");
        hitungButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double alas = Double.parseDouble(alasField.getText());
                    double tinggi = Double.parseDouble(tinggiField.getText());
                    PerhitunganSiku perhitunganSiku = new PerhitunganSikuImpl();
                    double sisiMiring = perhitunganSiku.hitungSiku(alas, tinggi);
                    hasilLabel.setText(String.format("%.2f", sisiMiring)); // Menampilkan hasil dengan 2 angka di belakang koma
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(SikuFrame.this, "Masukkan angka yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST; // Mengatur agar teks rata kiri
        panel.add(alasLabel, gbc);// label "Alas" pada posisi grid (0, 0)

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL; // Mengatur komponen mengisi seluruh lebar horizontal yang tersedia
        panel.add(alasField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST; // Mengatur agar teks rata kiri
        panel.add(tinggiLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(tinggiField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(hitungButton, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(sisiLabel, gbc);

        gbc.gridx = 2;
        gbc.gridy = 2;
       // gbc.anchor = GridBagConstraints.WEST;
        panel.add(hasilLabel, gbc);

        add(panel);
        setVisible(true);
    }
}


