package screens;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class principal extends JFrame {
    public principal() {
        setSize(875, 625);
        setLayout(null);

        JLabel nombre = new JLabel();
        nombre.setBounds(25, 50, 100, 25);
        add(nombre);

        JLabel hora = new JLabel();
        hora.setBounds(200, 50, 100, 25);
        add(hora);

        JLabel titulito = new JLabel();
        titulito.setBounds(25, 125, 150, 25);
        add(titulito);

        JLabel contenido = new JLabel();
        contenido.setBounds(25, 200, 700, 250);
        add(contenido);

        JButton nxt = new JButton("Next Post");
        nxt.setBounds(705, 480, 120, 25);
        add(nxt);

        JButton entr = new JButton("Enter Account");
        entr.setBounds(25, 480, 120, 25);
        add(entr);
        setVisible(true);
    }
    
     public principal(User user) {
         setSize(875, 625);
         setLayout(null);

         JLabel usuarioguapo = new JLabel();
         usuarioguapo.setBounds(25, 10, 100, 25);
         add(usuarioguapo);

         JLabel nombre = new JLabel();
         nombre.setBounds(25, 50, 100, 25);
         add(nombre);

         JLabel hora = new JLabel();
         hora.setBounds(200, 50, 100, 25);
         add(hora);

         JLabel titulito = new JLabel();
         titulito.setBounds(25, 125, 150, 25);
         add(titulito);

         JLabel contenido = new JLabel();
         contenido.setBounds(25, 200, 700, 250);
         add(contenido);

         JButton nxt = new JButton("Next Post");
         nxt.setBounds(705, 480, 120, 25);
         add(nxt);

         JButton entr = new JButton("Exit Account");
         entr.setBounds(25, 480, 120, 25);
         add(entr);
         setVisible(true);
     }
}