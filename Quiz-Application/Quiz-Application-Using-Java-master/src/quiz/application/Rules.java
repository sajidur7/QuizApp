package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{

    String name;
    JButton start, back;
    
    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome " + name + " to Brain Buster");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(new Color(106, 90, 205));
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
            "<html>"+ 
                "1. You're here to code, not craft stories. Answer directly and to the point." + "<br><br>" +
                "2. Avoid unnecessary glances at your neighbor. They might be as puzzled as you are." + "<br><br>" +
                "3. Unlike life, every question here is mandatory." + "<br><br>" +
                "4. It's okay to feel overwhelmed, but keep the tears quiet." + "<br><br>" +
                "5. Only the wise provide answers, so aim to be wise, not otherwise.)" + "<br><br>" +
                "6. Don't fret if your friend is breezing through. They might just be on a lucky streak." + "<br><br>" +
                "7. This quiz isn't for the faint-hearted. Brace yourself." + "<br><br>" +
                "8. Aim to know more than Jon Snow. Good luck!" + "<br><br>" +
            "<html>"
        );
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(106, 90, 205));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(106, 90, 205));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args) {
        new Rules("User");
    }
}
