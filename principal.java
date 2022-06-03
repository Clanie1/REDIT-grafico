import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class principal extends JFrame{
    public principal(){
    setSize(875,625);
    setLayout(null);
    
    JLabel pst = new JLabel();
    pst.setBounds(25,50,800,400);
    add(pst);

    JButton nxt = new JButton("Next Post");
    nxt.setBounds(705,480,120,25);
    add(nxt);

    JButton entr = new JButton("Enter Account");
    entr.setBounds(25,480,120,25); 
    add(entr);
    setVisible(true);
    }
    
}