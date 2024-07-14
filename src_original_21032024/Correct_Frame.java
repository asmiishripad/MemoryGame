import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;
import javax.swing.Timer;
import javax.swing.JTextArea;
public class Correct_Frame extends JFrame  {

    public static void main(String[]args){
        new Correct_Frame();
    }

    public Correct_Frame()
    {
        JFrame correct = new JFrame();
        correct.setTitle("Correct Answer");
        correct.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        correct.setSize(800,500);
        correct.setLocationRelativeTo(null);

        JPanel panel_c = new JPanel();
        panel_c.setBounds(200, 400, 500, 500);
        panel_c.setAlignmentX(panel_c.CENTER_ALIGNMENT);

        JButton play_again = new JButton("Play Again!");
        correct.add(play_again);
        play_again.setBounds(350, 270, 100, 50);
        play_again.setFocusable(false);
        play_again.setMargin(new Insets(10,10,10,10));

        correct.add(panel_c, BorderLayout.CENTER);

        //Label
         JLabel c_box = new JLabel("Congratulations the order of fruits is right! You have a really good memory !");
         c_box.setHorizontalAlignment(JLabel.CENTER);
         c_box.setBounds(200, 200, 200, 200);
         correct.add(c_box);

        correct.setVisible(true);



    }

}
