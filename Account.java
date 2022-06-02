import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class Account extends JFrame {
    public Account() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);

        JLabel title = new JLabel("Enter an account");
        title.setBounds(150, 100, 100, 50);
        add(title);

        JButton LogInBtn = new JButton("Log In");
        LogInBtn.setBounds(50, 300, 150, 70);
        add(LogInBtn);

        JButton RegisterBtn = new JButton("Register");
        RegisterBtn.setBounds(250, 300, 150, 70);
        RegisterBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                register cosa = new register();
            }
        });

        add(RegisterBtn);

        setLayout(null);
        setVisible(true);
    }

}
