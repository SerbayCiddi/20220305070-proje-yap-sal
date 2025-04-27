package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame {
    public LoginForm() {
        setTitle("Giriş Yap");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel emailLabel = new JLabel("Email:");
        JLabel passwordLabel = new JLabel("Şifre:");
        JTextField emailField = new JTextField(15);
        JPasswordField passwordField = new JPasswordField(15);
        JButton loginBtn = new JButton("Giriş Yap");
        JButton registerBtn = new JButton("Kayıt Ol");

        JPanel panel = new JPanel(new GridLayout(3, 2, 5, 5));
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginBtn);
        panel.add(registerBtn);

        add(panel);

        // Butonlar
        loginBtn.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Giriş başarılı (örnek)");
            new MainDashboard(); // örnek geçiş
            dispose();
        });

        registerBtn.addActionListener(e -> {
            new RegisterForm();
            dispose();
        });

        setVisible(true);
    }
}
