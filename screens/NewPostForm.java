package screens;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NewPostForm extends JFrame {
    public NewPostForm() {
        setTitle("New Post");
        setSize(400, 400);

        JLabel Titulo = new JLabel("Titulo");
        Titulo.setBounds(100, 100, 100, 50);
        add(Titulo);

        JTextField Title = new JTextField("");
        Title.setBounds(100, 150, 200, 50);
        add(Title);

        JLabel Hora = new JLabel("");
        Hora.setBounds(100,200,100,50);
        add(Hora);

        JTextField Hour = new JTextField("");
        Hour.setBounds(100,250,200,50);
        add(Hour);

        JLabel Contenido = new JLabel("Contenido");
        Contenido.setBounds(100,300,100,50);
        add(Contenido);

        JTextField Content = new JTextField("");
        Content.setBounds(100,350,300,300);
        add(Content);

        JButton Submit = new JButton("Submit");
        Submit.setBounds(100,650,100,50);
        Submit.addActionListener(new ActionListener);
        
        add(Submit);

        setVisible(true);
    }
}
