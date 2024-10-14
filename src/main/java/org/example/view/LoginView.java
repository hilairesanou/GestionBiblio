package view;

import controller.UserController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginView extends JFrame {
    private JTextField emailField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginView() {
        setTitle("Connexion");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        emailField = new JTextField(20);
        passwordField = new JPasswordField(20);
        loginButton = new JButton("Connexion");

        panel.add(new JLabel("Email:"));
        panel.add(emailField);
        panel.add(new JLabel("Mot de passe:"));
        panel.add(passwordField);
        panel.add(loginButton);

        add(panel);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UserController controller = new UserController();
                if (controller.seConnecter(emailField.getText(), new String(passwordField.getPassword()))) {
                    System.out.println("Redirection vers le tableau de bord...");
                    // Ajouter la logique de redirection ici
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LoginView().setVisible(true));
    }
}
