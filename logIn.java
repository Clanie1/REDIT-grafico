import javax.swing.JFrame;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.*;

public class logIn extends JFrame {
    public logIn() {
        setSize(500, 500);
        setLayout(null);

        JLabel ingrese = new JLabel("Ingrese su usuario y contraseña");
        ingrese.setBounds(150, 100, 300, 50);
        add(ingrese);

        JTextArea user = new JTextArea("User");
        user.setBounds(250, 200, 150, 50);
        add(user);

        JTextArea password = new JTextArea("Password");
        password.setBounds(50, 200, 150, 50);
        add(password);
        JButton submitLogin = new JButton("Ingresar");
        submitLogin.setBounds(150, 300, 150, 70);
        add(submitLogin);
        setVisible(true);
    }

    public void enterAccount(String user, String contra) throws FileNotFoundException {
        String file = "..//docs//usuarios.daniel";
        File f = new File(file);
        Scanner src = new Scanner(f);

        while (src.hasNext()) {
            String line = src.nextLine();
            String[] parts = line.split(",");
            if (parts[0].equals(user) && parts[1].equals(contra)) {
                // falta mucho codigo
                break;
            }
        }
    }
}
