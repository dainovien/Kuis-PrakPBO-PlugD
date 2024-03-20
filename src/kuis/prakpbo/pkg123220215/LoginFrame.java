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

public class LoginFrame extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;

    public LoginFrame() {
        setTitle("PT UKANG App - Login");
        setSize(350, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2, 5, 5)); //3 baris dan 2 kolom, dengan jarak 5 piksel antar komponen secara horizontal dan vertikal
        panel.setBorder(BorderFactory.createEmptyBorder(20, 15, 20, 15)); // Menambahkan border
        
        JLabel usernameLabel = new JLabel("Username:");
        JLabel passwordLabel = new JLabel("Password:");
        usernameField = new JTextField(15);
        passwordField = new JPasswordField(15);
        JButton loginButton = new JButton("Masuk");

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                if (username.equals("tukang_215") && password.equals("tukang_215")) {
                    dispose(); // Menutup frame login
                    SwingUtilities.invokeLater(SikuFrame::new); // Menampilkan frame perhitungan siku
                } else {
                    JOptionPane.showMessageDialog(LoginFrame.this, "Username atau password salah!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(new JLabel()); // Placeholder untuk mengisi sel di grid
        panel.add(loginButton);

        add(panel);
        setVisible(true);
    }
}
