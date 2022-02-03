package Projects.GUI;
import  javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test1 {
    public static void main(String[] args) {
        JFrame j = new JFrame(){};
        JPanel jpanel = new JPanel();
        j.add(jpanel);
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit t = Toolkit.getDefaultToolkit();
        Dimension d = t.getScreenSize();
        j.setBounds((d.width/2)-132,(d.height/2)-200,265,400);
        JButton jButton = new JButton("1");
        JButton jButton1 = new JButton("2");
        JButton jButton3 = new JButton("3");
        jpanel.add(jButton);
        jpanel.add(jButton1);
        jpanel.add(jButton3);
        j.add(jpanel,BorderLayout.SOUTH);







    }
}