import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Timer_2 {

    JFrame window;
    JLabel counterLabel;
    Timer timer;
    int second;

    public static void main(String[]args){
        new Timer_2();
    }
    public Timer_2()
    {
        window = new JFrame();
        window.setSize(1900, 1300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(null);

        counterLabel = new JLabel();
        counterLabel.setBounds(1800, 10, 100, 100);
        counterLabel.setHorizontalAlignment(JLabel.CENTER);

        window.add(counterLabel);
        window.setVisible(true);

        counterLabel.setText("10");
        second = 10;
        countDownTimer();
        timer.start();
    }

    public void countDownTimer()
    {
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                second--;
                if(second == 0)
                {
                    timer.stop();
                }
                counterLabel.setText(""+second);
            }
        });
    }
}
