import gui.LoginForm;

public class Main {
    public static void main(String[] args) {
        
        javax.swing.SwingUtilities.invokeLater(() -> {
            new LoginForm();
        });
    }
}
