package gui;

import javax.swing.*;
import java.awt.*;

public class MainDashboard extends JFrame {
    public MainDashboard() {
        setTitle("Randevu Paneli");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel welcome = new JLabel("Hoş geldiniz, buradan randevu alabilirsiniz!");
        JButton btnExit = new JButton("Çıkış Yap");

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(welcome, BorderLayout.CENTER);
        panel.add(btnExit, BorderLayout.SOUTH);

        add(panel);

        btnExit.addActionListener(e -> {
            new LoginForm();
            dispose();
        });

        setVisible(true);
    }
}
