import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame {
    public LoginFrame() {
        setTitle("Login");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2, 5, 5));

        // Komponen login
        JLabel userLabel = new JLabel("Username:");
        JTextField userField = new JTextField();

        JLabel passLabel = new JLabel("Password:");
        JPasswordField passField = new JPasswordField();

        JButton loginButton = new JButton("Login");
        JLabel statusLabel = new JLabel("", JLabel.CENTER);

        // Listener untuk tombol login
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userField.getText();
                String password = new String(passField.getPassword());

                // Login sederhana (username: admin, password: admin)
                if ("jasmine".equals(username) && "1101".equals(password)) {

                    JOptionPane.showMessageDialog(null, "Login berhasil!");
                    dispose(); // Menutup frame login
                    new ImageViewer(); // Membuka frame image viewer
                } else {
                    statusLabel.setText("Login gagal, coba lagi.");
                }
            }
        });

        // Menambahkan komponen ke frame
        add(userLabel);
        add(userField);
        add(passLabel);
        add(passField);
        add(loginButton);
        add(statusLabel);

        setLocationRelativeTo(null); // Menempatkan frame di tengah layar
        setVisible(true);
    }

    // Metode utama untuk memulai aplikasi
    public static void main(String[] args) {
        new LoginFrame();
    }
}
