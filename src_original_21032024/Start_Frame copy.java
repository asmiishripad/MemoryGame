// Libraries to import for implementing image frame
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;
import javax.swing.Timer;
import javax.swing.JTextArea;

public class Start_Frame extends JFrame implements ActionListener{

    int input_var = 0;
    JButton play, start, mango, apple, banana, pomegranate, orange, papaya, guava, strawberry, litchi, try_again, play_again;
    JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8, tf9, instr;
    String[] random_fruits = new String[9];
    JFrame frame, image, correct, wrong;
    JLabel counterLabel, w_box, c_box;
    JPanel panel_w, panel_c;

    String[] fruits = {"apple", "banana", "strawberry", "litchi","guava", "litchi", "mango", "pomegranate", "guava" };
    Timer timer;
    int second;
    JFrame g = new JFrame();

    String[] User_Answer = new String[9];

    public static void main(String[]args){

        new Start_Frame();
    }

    public Start_Frame() {
        play = new JButton("Play");
        play.setBounds(200,200,200,200);
        play.setHorizontalAlignment(JButton.CENTER);

        start = new JButton("Start");
        start.setBounds(200,100,200,200);
        start.setHorizontalAlignment(JButton.CENTER);

        // To make the button listen for an action of clicking and if clicked perform the action defined in actionPerformed method which is overriden
        play.addActionListener(this);
        play.setBounds(500, 300, 100, 100);

        start.addActionListener(this);


        instr = new JTextField("Click on the play button to receive a list of fruits containing 9 fruits.Keep in mind that your time starts as soon as you click the play button. Memorise the list in 10 seconds and click their images in the right order when you click on start. GoodLuck!");
        instr.setBounds(200, 400, 500, 50);
        instr.setHorizontalAlignment(JTextField.CENTER);
        instr.setEditable(false);

        // Object Declaration for the Image_Frame class which invokes the Image_Frame class's constructor
        GridBagLayout grid_bag = new GridBagLayout();
        g.setLayout(new GridBagLayout());

        g.add(play);
        g.add(start);
        g.add(instr);

        // Setting the parameters for the grid
        g.setLayout(grid_bag);
        g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //To make sure the window closes when the cross button is clicked
        g.setResizable(false);
        g.setSize(1900,1300);

        g.setVisible(true);


        g.setVisible(true); // To make the frame visible

    }

    @Override
    public void actionPerformed(ActionEvent e) {


        if(e.getSource() == play)
        {
            for (int i = 0; i<9; i++)
            {
                String fruit = random_fruit();
                String result = String.valueOf(fruit);
                random_fruits[i] = result;
            }
            tf1 = new JTextField();
            tf1.setText(random_fruits[0]);
            tf1.setEditable(false);
            tf1.setBounds(300,550,100,20);

            tf2 = new JTextField();
            tf2.setText(random_fruits[1]);
            tf2.setEditable(false);
            tf2.setBounds(450,550,100,20);

            tf3 = new JTextField();
            tf3.setText(random_fruits[2]);
            tf3.setEditable(false);
            tf3.setBounds(600,550,100,20);

            tf4  = new JTextField();
            tf4.setText(random_fruits[3]);
            tf4.setEditable(false);
            tf4.setBounds(750,550,100,20);

            tf5 = new JTextField();
            tf5.setText(random_fruits[4]);
            tf5.setEditable(false);
            tf5.setBounds(900,550,100,20);

            tf6 = new JTextField();
            tf6.setText(random_fruits[5]);
            tf6.setEditable(false);
            tf6.setBounds(1050,550,100,20);

            tf7 = new JTextField();
            tf7.setText(random_fruits[6]);
            tf7.setEditable(false);
            tf7.setBounds(1200,550,100,20);

            tf8 = new JTextField();
            tf8.setText(random_fruits[7]);
            tf8.setEditable(false);
            tf8.setBounds(1350,550,100,20);

            tf9 = new JTextField();
            tf9.setText(random_fruits[8]);
            tf9.setEditable(false);
            tf9.setBounds(1500,550,100,20);

            g.setLayout(new GridBagLayout());
            g.add(tf1);
            g.add(tf2);
            g.add(tf3);
            g.add(tf4);
            g.add(tf5);
            g.add(tf6);
            g.add(tf7);
            g.add(tf8);
            g.add(tf9);

            frame = new JFrame("Timer");
            frame.setSize(200, 200);
            frame.setResizable(false);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(null);

            counterLabel = new JLabel();
            counterLabel.setBounds(70 ,40, 50, 50);
            counterLabel.setHorizontalAlignment(JLabel.CENTER);
            counterLabel.setFont(new Font("Serif", Font.PLAIN, 40));

            frame.add(counterLabel);
            frame.setVisible(true);

            counterLabel.setText("10");
            second = 10;
            countDownTimer();
            timer.start();
        }

        if (e.getSource() == start)
        {
            g.setVisible(false);
            // Object Declaration for the Image_Frame class which invokes the Image_Frame class's constructor
            image = new JFrame();

            // Setting the parameters for the grid
            image.setLayout(new GridLayout(3, 3)); // To set the layout of the frame as grid
            image.setSize(1000,1000); // dimensions of the frame
            image.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //To make sure the window closes when the cross button is clicked
             // To make the frame visible

            ImageIcon iconMango = new ImageIcon("/Users/asmiirashi/Documents/Asmii School work/Game/Mango.jpeg");
            ImageIcon iconApple = new ImageIcon("/Users/asmiirashi/Documents/Asmii School work/Game/Apple.png");
            ImageIcon iconBanana = new ImageIcon("/Users/asmiirashi/Documents/Asmii School work/Game/Banana.jpeg");
            ImageIcon iconPomegranate = new ImageIcon("/Users/asmiirashi/Documents/Asmii School work/Game/Pomegranate.jpeg");
            ImageIcon iconOrange = new ImageIcon("/Users/asmiirashi/Documents/Asmii School work/Game/Orange.jpeg");
            ImageIcon iconPapaya = new ImageIcon("/Users/asmiirashi/Documents/Asmii School work/Game/Papaya.jpeg");
            ImageIcon iconGuava = new ImageIcon("/Users/asmiirashi/Documents/Asmii School work/Game/Guava.jpeg");
            ImageIcon iconStrawberry = new ImageIcon("/Users/asmiirashi/Documents/Asmii School work/Game/Strawberry.jpeg");
            ImageIcon iconLitchi = new ImageIcon("/Users/asmiirashi/Documents/Asmii School work/Game/Litchi.jpeg");

            //Setting the values of the buttons created to the icon images created above
            mango = new JButton(iconMango);
            apple = new JButton(iconApple);
            banana = new JButton(iconBanana);
            pomegranate = new JButton(iconPomegranate);
            orange = new JButton(iconOrange);
            papaya = new JButton(iconPapaya);
            guava = new JButton(iconGuava);
            strawberry = new JButton(iconStrawberry);
            litchi = new JButton(iconLitchi);

            mango.addActionListener(this);
            apple.addActionListener(this);
            banana.addActionListener(this);
            pomegranate.addActionListener(this);
            orange.addActionListener(this);
            papaya.addActionListener(this);
            guava.addActionListener(this);
            strawberry.addActionListener(this);
            litchi.addActionListener(this);

            image.add(mango);
            image.add(apple);
            image.add(banana);
            image.add(pomegranate);
            image.add(orange);
            image.add(papaya);
            image.add(guava);
            image.add(strawberry);
            image.add(litchi);

            image.setVisible(true);
        }


        if( e.getSource() == mango)
        {
            User_Answer[input_var] =  "mango";
            System.out.println(input_var + "\t " + User_Answer[input_var]);

            input_var++;
        }

        if( e.getSource() == apple)
        {
            User_Answer[input_var] =  "apple";
            System.out.println(input_var + "\t " + User_Answer[input_var]);

            input_var++;
        }

        if( e.getSource() == banana)
        {
            User_Answer[input_var] =  "banana";
            System.out.println(input_var + "\t " + User_Answer[input_var]);

            input_var++;


        }

        if( e.getSource() == pomegranate)
        {
            User_Answer[input_var] =  "pomegranate";
            System.out.println(input_var + "\t " + User_Answer[input_var]);

            input_var++;

        }

        if( e.getSource() == orange)
        {
            User_Answer[input_var] =  "orange";
            System.out.println(input_var + "\t " + User_Answer[input_var]);

            input_var++;

        }

        if( e.getSource() == papaya)
        {
            User_Answer[input_var] =  "papaya";
            System.out.println(input_var + "\t " + User_Answer[input_var]);

            input_var++;

        }

        if( e.getSource() == guava)
        {
            User_Answer[input_var] =  "guava";
            System.out.println(input_var + "\t " + User_Answer[input_var]);

            input_var++;
        }

        if( e.getSource() == strawberry)
        {
            User_Answer[input_var] =  "strawberry";
            System.out.println(input_var + "\t " + User_Answer[input_var]);

            input_var++;
        }

        if( e.getSource() == litchi)
        {
            User_Answer[input_var] =  "litchi";
            System.out.println(input_var + "\t " + User_Answer[input_var]);

            input_var++;

        }

        if( input_var >= 9)
        {
            Timer timer = new Timer(500, new ActionListener(){
                public void actionPerformed(ActionEvent evt) {
                    image.dispose();
                }
            });
            timer.setRepeats(false);
            timer.start();

            //Wrong Answer Frame
            wrong = new JFrame();
            wrong.setTitle("Wrong Answer");
            wrong.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            wrong.setSize(800,500);
            wrong.setLocationRelativeTo(null);

            panel_w = new JPanel();
            panel_w.setBounds(200, 400, 500, 500);
            panel_w.setAlignmentX(panel_w.CENTER_ALIGNMENT);

            try_again = new JButton("Try Again!");
            wrong.add(try_again);
            try_again.setBounds(350, 270, 100, 50);
            try_again.setFocusable(false);
            try_again.setMargin(new Insets(10,10,10,10));

            wrong.add(panel_w, BorderLayout.CENTER);

            //Label - Wrong Frame
            w_box = new JLabel("Sorry! The order of the fruits clicked is wrong");
            w_box.setHorizontalAlignment(JLabel.CENTER);
            w_box.setBounds(200, 200, 200, 200);
            wrong.add(w_box);

            wrong.setVisible(true);

            try_again.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    wrong.dispose();
                    new Start_Frame();
                }
            });

            // Correct Answer Frame
            correct = new JFrame();
            correct.setTitle("Correct Answer");
            correct.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            correct.setSize(800,500);
            correct.setLocationRelativeTo(null);

            panel_c = new JPanel();
            panel_c.setBounds(200, 400, 500, 500);
            panel_c.setAlignmentX(panel_c.CENTER_ALIGNMENT);

            play_again = new JButton("Play Again!");
            correct.add(play_again);
            play_again.setBounds(350, 270, 100, 50);
            play_again.setFocusable(false);
            play_again.setMargin(new Insets(10,10,10,10));

            correct.add(panel_c, BorderLayout.CENTER);

            //Label - Correct Frame
            c_box = new JLabel("Congratulations the order of fruits is right! You have a really good memory !");
            c_box.setHorizontalAlignment(JLabel.CENTER);
            c_box.setBounds(200, 200, 200, 200);
            correct.add(c_box);

            correct.setVisible(true);

            play_again.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    correct.setVisible(true);
                    new Start_Frame();
                }
            });

            // To check if the order of fruits clicked by the user is same
            for(int i =0; i<9; i++)
            {
                if( random_fruits[i].compareToIgnoreCase(User_Answer[i]) == 0 && i==8)
                {
                    System.out.println("Fruit Array :" + "\t" + fruits[i] + "User_Answer Array" + "\t" + User_Answer[i]);
                    correct.setVisible(true);
                }
                else if (random_fruits[i].compareToIgnoreCase(User_Answer[i]) != 0)
                {
                    wrong.setVisible(true);
                    break;
                }
            }

        }


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
                    tf1.setText("");
                    tf2.setText("");
                    tf3.setText("");
                    tf4.setText("");
                    tf5.setText("");
                    tf6.setText("");
                    tf7.setText("");
                    tf8.setText("");
                    tf9.setText("");
                    frame.dispose();
                }
                counterLabel.setText(""+second);
            }
        });
    }

    public String random_fruit()
    {
        String[] fruits = new String[]{"apple", "mango", "banana", "pomegranate", "orange", "papaya", "guava", "strawberry", "litchi"};
        Random r = new Random();

        int a;
        String word;
        a = r.nextInt(9);
        word = fruits[a];
        return word;
    }




}
