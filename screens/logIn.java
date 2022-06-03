package screens;

import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
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
        user.setBounds(50, 200, 150, 50);
        add(user);

        JTextArea password = new JTextArea("Password");
        password.setBounds(250, 200, 150, 50);
        add(password);
        JButton submitLogin = new JButton("Ingresar");
        submitLogin.setBounds(150, 300, 150, 70);
        submitLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    enterAccount(user.getText(), password.getText());
                } catch (IOException a) {
                    a.printStackTrace();
                }
            }
        });

        add(submitLogin);
        setVisible(true);
    }

    public void enterAccount(String user, String contra) throws FileNotFoundException {
        String file = "C:\\Users\\danyb\\Desktop\\GitHub\\Class\\ProyectoRedditGrafico\\docs\\usuarios.daniel";
        File f = new File(file);
        Scanner src = new Scanner(f);
        while (src.hasNext()) {
            String line = src.nextLine();
            String[] parts = line.split(",");
            if (parts[0].equals(user) && parts[1].equals(contra)) {
                System.out.println("hola");
                JOptionPane.showMessageDialog(null, "Sesion iniciada");
                setVisible(false);
                return;
            }
        }
        JLabel error = new JLabel("Usuario o contraseña incorrectos");
        error.setBounds(150, 400, 300, 50);
        add(error);
        setVisible(true);
        JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
        System.out.println("No se encontro el usuario");
    }
}
