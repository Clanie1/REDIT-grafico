import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class register extends JFrame {

    public register() {
        setSize(500, 500);
        setLayout(null);

        JLabel titulo = new JLabel("Registro");
        titulo.setBounds(150, 100, 300, 50);
        add(titulo);

        JTextArea userRegister = new JTextArea("User");
        userRegister.setBounds(250, 200, 150, 50);
        add(userRegister);

        JTextArea passwordRegister = new JTextArea("Password");
        passwordRegister.setBounds(50, 200, 150, 50);
        add(passwordRegister);

        JButton submitRegister = new JButton("Crear cuenta");
        submitRegister.setBounds(150, 300, 150, 70);
        submitRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String usuario = userRegister.getText();
                    String contra = passwordRegister.getText();
                    registerUser(usuario, contra);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });
        add(submitRegister);
        setVisible(true);
    }

    public void registerUser(String usuario, String contra) throws IOException {
        String file = "C:\\Users\\danyb\\Desktop\\GitHub\\Class\\ProyectoRedditGrafico\\docs\\usuarios.daniel";
        File f = new File(file);
        FileWriter writer = new FileWriter(f, true);
        writer.append(usuario + "," + contra + "\n");
        writer.close();
        setVisible(false);
    }

}
