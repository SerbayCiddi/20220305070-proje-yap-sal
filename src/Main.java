import gui.LoginForm;

public class Main {
    public static void main(String[] args) {
        // Swing GUI için önerilen yapı
        javax.swing.SwingUtilities.invokeLater(() -> {
            new LoginForm();
        });
    }
}
