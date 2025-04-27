package gui;

import javax.swing.*;
import java.awt.*;

public class RegisterForm extends JFrame {
    public RegisterForm() {
        setTitle("Kayıt Ol");
        setSize(300, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel nameLabel = new JLabel("Ad Soyad:");
        JLabel emailLabel = new JLabel("Email:");
        JLabel passwordLabel = new JLabel("Şifre:");
        JTextField nameField = new JTextField(15);
        JTextField emailField = new JTextField(15);
        JPasswordField passwordField = new JPasswordField(15);
        JButton registerBtn = new JButton("Kayıt Ol");

        JPanel panel = new JPanel(new GridLayout(4, 2, 5, 5));
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(new JLabel(""));
        panel.add(registerBtn);

        add(panel);

        registerBtn.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Kayıt başarılı (örnek)");
            new LoginForm();
            dispose();
        });

        setVisible(true);
    }
}
