import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class TicTacToe implements ActionListener{
    
    JFrame frame = new JFrame();
    JPanel title = new JPanel();
    JLabel textfield = new JLabel();
    JButton ChoiceFriend = new JButton();
    JButton ChoiceRobot = new JButton();
    TicTacToe()
    {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.getContentPane().setBackground(new Color(50, 50 , 50));
        frame.setLayout(new BorderLayout());
        frame.setResizable(false);
        frame.setVisible(true);

        // ========================================================

        ChoiceFriend.setLayout(new BorderLayout());
        ChoiceFriend.setText("Play with friend");
        ChoiceFriend.setBounds(315, 250, 150,100);
        //ChoiceFriend.setBounds(335, 450, 150, 100);
        ChoiceFriend.setFocusable(false);
        ChoiceFriend.addActionListener(this);

        // ========================================================

        ChoiceRobot.setLayout(new BorderLayout()); // GridLayout
        ChoiceRobot.setText("Play with robot");
        ChoiceRobot.setBounds(315, 370, 150, 100);
        ChoiceRobot.setFocusable(false);
        ChoiceRobot.addActionListener(this);

        // ========================================================

        textfield.setBackground(new Color(25, 25, 25));
        textfield.setForeground(new Color(25,255,0));
        textfield.setFont(new Font("Ink Free", Font.BOLD, 75));
        textfield.setHorizontalAlignment(JLabel.CENTER);
        textfield.setVerticalAlignment(JLabel.TOP);
        textfield.add(ChoiceFriend);
        //textfield.setHorizontalAlignment(JButton.CENTER);
        textfield.setText("Tic-Tac-Toe");
        textfield.setOpaque(true);

        // ==========================================

        //textfield.setBorder(BorderFactory.createLineBorder(Color.green, 3));

        textfield.setBorder(BorderFactory.createEmptyBorder(75, 0, 0, 0));

        // ========================================================

        //ChoiceFriend.setLayout(new FlowLayout()); // FlowLayout
        
        //ChoiceFriend.setHorizontalAlignment(JButton.CENTER);
        
        //ChoiceFriend.setBounds(100, 100, 50, 50);

        title.setLayout(new BorderLayout()); // FlowLayout
        title.setBounds(0, 0, 800, 100);
        
        title.add(ChoiceFriend);
        title.add(ChoiceRobot);
        title.add(textfield);
        
        //frame.add(ChoiceFriend);
        frame.add(title);
        //frame.add(ChoiceFriend);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == ChoiceFriend)
        {
            
            frame.setVisible(false);
            TacToeFriend friend = new TacToeFriend();
        }
        else if(e.getSource() == ChoiceRobot)
        {
            frame.setVisible(false);
            //TacToe robot = new TacToe();
            TacToeRobot robot = new TacToeRobot();
        }
    }
}
