import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Timer_1 {
    JFrame window;
    JLabel counterLabel;
    Timer timer;
    int second;

    public static void main(String[]args){
        new Timer_1();
    }
    public Timer_1()
    {
        window = new JFrame();
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(null);

        counterLabel = new JLabel();
        counterLabel.setBounds(300, 230, 200, 100);
        counterLabel.setHorizontalAlignment(JLabel.CENTER);

        window.add(counterLabel);
        window.setVisible(true);

        second = 0;
        SimpleTimer();
        timer.start();
    }

    public void SimpleTimer()
    {
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                second++;
                counterLabel.setText(""+second);
            }
        });
    }

}
