//import java.awt.*;                            Can't move the ChoicePanel to the middle of the screen!
//import java.awt.event.*;
//import java.util.*;
//import javax.swing.*;
//
//public class TacToeRobot implements ActionListener{
//
//    JFrame frame = new JFrame();
//    Random random = new Random();
//    JPanel title = new JPanel();
//    JPanel button = new JPanel();
//    JLabel textfield = new JLabel();
//    //JPanel ChoiceLabel = new JPanel();
//    
//    JButton ChoiceX = new JButton("X");
//    JButton Choice0 = new JButton("0");
//
//    JButton[] buttons = new JButton[9];
//    boolean player1;
//    boolean player2;
//
//    TacToeRobot()
//    {
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(800,800);
//        frame.getContentPane().setBackground(new Color(50, 50 , 50));
//        frame.setLayout(new BorderLayout());
//        frame.setResizable(false);
//        frame.setVisible(true);
//
//        // =============================================================
//
//        textfield.setBackground(new Color(25, 25, 25));
//        textfield.setForeground(new Color(25,255,0));
//        textfield.setFont(new Font("Ink Free", Font.BOLD, 75));
//        textfield.setHorizontalAlignment(JLabel.CENTER);
//        textfield.setVerticalAlignment(JLabel.TOP);
//        textfield.setText("Tic-Tac-Toe");
//        textfield.setOpaque(true);
//
//        // ===============================================================
//
//        textfield.setBorder(BorderFactory.createLineBorder(Color.green, 3));
//
//        //textfield.setBorder(BorderFactory.createEmptyBorder(75, 0, 0, 0));
//
//        // =================================================================
//
//        //ChoiceFriend.setLayout(new FlowLayout()); // FlowLayout
//        
//        //ChoiceFriend.setHorizontalAlignment(JButton.CENTER);
//        
//        //ChoiceFriend.setBounds(100, 100, 50, 50);
//
//        //Choice.setBackground(new Color(25, 25, 25));
//        //Choice.setForeground(new Color(25,255,0));
//        //Choice.setFont(new Font("Ink Free", Font.BOLD, 75));
//        //Choice.setHorizontalAlignment(JLabel.CENTER);
//        //Choice.setVerticalAlignment(JLabel.CENTER);
//        //Choice.setOpaque(true);
//        
//        // ==================================================================================
//        JLabel Text = new JLabel("Choose your player");
//        Text.setFont(new Font("Ink Free", Font.BOLD, 75));
//        Text.setBackground(new Color(25, 25, 25));
//        Text.setForeground(new Color(25,255,0));
//        Text.setHorizontalAlignment(JLabel.CENTER);
//        Text.setVerticalAlignment(JLabel.CENTER);
//        // ==================================================================================
//
//        JPanel ChoicePanel = new JPanel();
//        ChoicePanel.setLayout(new FlowLayout());
//        //ChoicePanel.setBounds(300, 300, 300, 300);
//        //ChoiceX.setBounds(300, 300, 100, 50);
//        //ChoicePanel.add(ChoiceX);
//        //ChoicePanel.add(Choice0);
//        //Choice0.setBounds(300, 400, 100, 50);
//        ChoicePanel.setFont(new Font("Ink Free", Font.BOLD, 75));
//        ChoicePanel.setBackground(new Color(25, 25, 25));
//        ChoicePanel.setForeground(new Color(25,255,0));
//        ChoicePanel.add(Text);
//        ChoicePanel.add(ChoiceX);
//        ChoicePanel.add(Choice0);
//        ChoicePanel.setOpaque(true);
//        
//        // ==================================================================================
//
//        title.setLayout(new BorderLayout()); // FlowLayout
//        //title.setBounds(0, 0, 800, 100);
//
//        //title.add(ChoicePanel);
//        title.add(ChoicePanel, BorderLayout.CENTER);
//        title.add(textfield, BorderLayout.NORTH);
//        // ==================================================================================
//
//        
//        //frame.add(ChoicePanel,BorderLayout.CENTER);
//        frame.add(title, BorderLayout.CENTER);
//        //frame.add(ChoicePanel);
//    }
//        
//
//    @Override
//    public void actionPerformed(ActionEvent e)
//    {
//
//    }
//}

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class TacToe implements ActionListener {

    JFrame frame = new JFrame();
    Random random = new Random();
    JPanel title = new JPanel();
    JPanel button = new JPanel();
    JLabel textfield = new JLabel();

    JButton[] buttons = new JButton[9];
    boolean currentPlayerX;
    boolean PlayerX;
    boolean Player0;
    boolean robot;
    boolean player1;
    boolean player2;
    JPanel ChoicePanel = new JPanel(new GridBagLayout()); // Use GridBagLayout
    JButton ChoiceX = new JButton();
    JButton Choice0 = new JButton();

    JLabel Score = new JLabel();
    JLabel X = new JLabel();
    JLabel Y = new JLabel();
    private static int countX = 0;
    private static int count0 = 0;

    JLabel countY = new JLabel(countX+"  :  "+count0);

    JPanel scorePanel = new JPanel(new BorderLayout()); /*  Works with BorderLayout if i want to see only in the left and right corners
                                                        if i want to have something placed in the middle must be GridLayout , 
                                                        or using only one Label !!!*/
    TacToe()
    {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.getContentPane().setBackground(new Color(50, 50, 50));
        frame.setLayout(new BorderLayout());
        frame.setResizable(false);
        frame.setVisible(true);
        // ============================================================================

        textfield.setBackground(new Color(25, 25, 25));
        textfield.setForeground(new Color(25, 255, 0));
        textfield.setFont(new Font("Ink Free", Font.BOLD, 75));
        textfield.setHorizontalAlignment(JLabel.CENTER);
        textfield.setVerticalAlignment(JLabel.TOP);
        textfield.setText("Tic-Tac-Toe");
        textfield.setOpaque(true);
        textfield.setBorder(BorderFactory.createLineBorder(Color.green, 3));
        // ============================================================================

        JLabel Text = new JLabel("Choose your player");
        Text.setFont(new Font("Ink Free", Font.BOLD, 75));
        Text.setBackground(new Color(25, 25, 25));
        Text.setForeground(new Color(25, 255, 0));
        Text.setHorizontalAlignment(JLabel.CENTER);
        Text.setVerticalAlignment(JLabel.CENTER);

        ImageIcon iconX = new ImageIcon("x1.png");
        ImageIcon iconY = new ImageIcon("playO.png");

        

        ChoiceX.setIcon(iconX);
        Choice0.setIcon(iconY);
        ChoiceX.addActionListener(this);
        Choice0.addActionListener(this);
        ChoiceX.setPreferredSize(new Dimension(200, 130));
        Choice0.setPreferredSize(new Dimension(200, 130));
        //Text.setBorder(BorderFactory.createLineBorder(Color.RED, 3));

        
        //ChoicePanel.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
        GridBagConstraints gbc = new GridBagConstraints();
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(0, 0, 20, 0); // Add vertical spacing between components
        //gbc.fill = GridBagConstraints.CENTER; // Center the components
        ChoicePanel.add(Text, gbc);

        gbc.gridy++;
        ChoicePanel.add(ChoiceX, gbc);

        gbc.gridy++;
        ChoicePanel.add(Choice0, gbc);

        ChoicePanel.setBackground(new Color(25, 25, 25));
        ChoicePanel.setForeground(new Color(25, 255, 0));
        ChoicePanel.setOpaque(true);
        // ============================================================================
        
        



        title.setLayout(new BorderLayout());
        title.add(ChoicePanel, BorderLayout.CENTER); // Add ChoicePanel to the center
        title.add(textfield, BorderLayout.NORTH);

        frame.add(title, BorderLayout.CENTER);
        
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {   
        if (e.getSource() == ChoiceX) {
            PlayerX = true;
            robot = false;
            X.setBackground(new Color(25, 25, 25));
            //X.setLayout(new FlowLayout());
            X.setForeground(new Color(25, 255, 0));
            X.setFont(new Font("Ink Free", Font.BOLD, 75));
            X.setHorizontalAlignment(JLabel.LEFT);
            X.setVerticalAlignment(JLabel.TOP);
            X.setText("X");
            
            //X.setHorizontalTextPosition(JLabel.LEFT);

            X.setOpaque(true);

            Y.setBackground(new Color(25, 25, 25));
            //Y.setLayout(new FlowLayout());
            Y.setForeground(new Color(25, 255, 0));
            Y.setFont(new Font("Ink Free", Font.BOLD, 75));
            Y.setHorizontalAlignment(JLabel.RIGHT);
            Y.setVerticalAlignment(JLabel.TOP);
            Y.setText("0");
            
            //Y.setHorizontalTextPosition(JLabel.LEFT);

            Y.setOpaque(true);

            countY.setBackground(new Color(25, 25, 25));
            countY.setForeground(new Color(25, 255, 0));
            countY.setFont(new Font("Ink Free", Font.BOLD, 50)); // Adjust the font size for the counts
            countY.setHorizontalAlignment(JLabel.CENTER);
            countY.setVerticalAlignment(JLabel.CENTER);
            countY.setOpaque(true);

            
            /*scorePanel.add(countX,FlowLayout.CENTER);       
            I can do it with only one Label using countX + ":" + countY
            or using GridLayout!!!                                                
            */
            scorePanel.add(X, BorderLayout.WEST);
            scorePanel.add(Y, BorderLayout.EAST); 
            scorePanel.add(countY,FlowLayout.CENTER);
            scorePanel.setBackground(new Color(25, 25, 25));
            scorePanel.setForeground(new Color(25, 255, 0));
            scorePanel.setOpaque(true);

            Score.setBackground(new Color(25, 25, 25));
            Score.setForeground(new Color(25, 255, 0));
            Score.setFont(new Font("Ink Free", Font.BOLD, 75));
            Score.setHorizontalAlignment(JLabel.CENTER);
            Score.setVerticalAlignment(JLabel.TOP);
            Score.setText("Score");
            //Score.add(X,FlowLayout.LEFT);

            //Score.setHorizontalTextPosition(JLabel.LEFT);

            Score.setOpaque(true);

            //title.add(Score);
            //title.add(X);
            //title.add(Y);

            title.add(scorePanel, BorderLayout.CENTER);
            title.add(Score, BorderLayout.SOUTH);

            ChoicePanel.setVisible(false);
            button.setLayout(new GridLayout(3, 3));
            button.setBackground(new Color(150, 150, 150));
            for(int i = 0 ; i < 9; i++)
            {
                buttons[i] = new JButton();
                button.add(buttons[i]);
                buttons[i].setFont(new Font("MV Boli", Font.BOLD, 120));
                buttons[i].setFocusable(false);
                buttons[i].addActionListener(this);
            }
            frame.setResizable(true);
            frame.add(title, BorderLayout.NORTH);
            frame.add(button);
            firstTurn();
            
        }
        for(int i = 0 ; i < 9; i++)
        {
            if(e.getSource() == buttons[i])
            {
                int emptyButtons = 0;

                // Count the number of empty buttons
                if (buttons[i].getText().equals("")) {
                    emptyButtons++;
                }
            
                if (emptyButtons == 0) {
                    Timer timer = new Timer(2000, new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                resetGame();
                            }
                        });
                        timer.setRepeats(false);
                        timer.start();
                }

                if(PlayerX)
                {
                    if(buttons[i].getText() == "")
                    {
                        buttons[i].setForeground(new Color(255,0,0));
                        buttons[i].setText("X");
                        PlayerX=false;
                        textfield.setText("0 turn");
                        check();
                        robot0Turn();
                    }
                }
                else if (!PlayerX)
                {
                     {
                        buttons[i].setForeground(new Color(255, 0, 0));
                        buttons[i].setText("0");
                        PlayerX = true; // Toggle back to X's turn
                        textfield.setText("X turn");
                        check();
                        robotXTurn();
                    }
                }
            }
        }
        // ==========================================================
        
    }
// =============================================================== 
    public void firstTurn()
    {
        if(random.nextInt(2) == 0)
        {
            PlayerX = true;
        }
        else
        {
            PlayerX = false;
        }
    }
// ====================================================================

public void robotXTurn() {
    int emptyButtons = 0;

    // Count the number of empty buttons
    for (int i = 0; i < 9; i++) {
        if (buttons[i].getText().equals("")) {
            emptyButtons++;
        }
    }

    if (emptyButtons == 0) {
        return; // All buttons are already filled
    }

    int rand;
    boolean validMove = false;

    while (!validMove) {
        rand = random.nextInt(9);
        if (buttons[rand].getText().equals("")) {
            if (!PlayerX) {
                buttons[rand].setForeground(new Color(255, 0, 0));
                buttons[rand].setText("X");
                Player0 = true;
            }
        }
            textfield.setText(PlayerX ? "X turn" : "0 turn");
            check();
            validMove = true;
    }
}

public void robot0Turn() {
    int emptyButtons = 0;

    // Count the number of empty buttons
    for (int i = 0; i < 9; i++) {
        if (buttons[i].getText().equals("")) {
            emptyButtons++;
        }
    }

    if (emptyButtons == 0) {
        return; // All buttons are already filled
    }

    int rand;
    boolean validMove = false;

    while (!validMove) {
        rand = random.nextInt(9);
        if (buttons[rand].getText().equals("")) {
            if (!PlayerX) {
                buttons[rand].setForeground(new Color(0, 0, 255));
                buttons[rand].setText("0");
                PlayerX = true;
            }
        }
            textfield.setText(PlayerX ? "X turn" : "0 turn");
            check();
            validMove = true;
    }
}
// ================================================================

public void updateCountLabel()
{
    countY.setText(countX+"  :  "+count0);
}

public void resetGame() {
    for (int i = 0; i < 9; i++) {
        buttons[i].setText("");
        buttons[i].setEnabled(true);
        buttons[i].setBackground(UIManager.getColor("Button.background")); // Reset button background color
    }

    // Reset the player turns
    PlayerX = !PlayerX; // Switch to the other player
    textfield.setText(PlayerX ? "X Turn" : "0 Turn");
}


// =================================================================================

    public void check()
    {
        if((buttons[0].getText() == "X") &&
           (buttons[1].getText() == "X") &&
           (buttons[2].getText() == "X"))
           {
            xWins(0, 1, 2);
           }
        if((buttons[3].getText() == "X") &&
           (buttons[4].getText() == "X") &&
           (buttons[5].getText() == "X"))
           {
            xWins(3, 4, 5);
           }
        if((buttons[6].getText() == "X") &&
           (buttons[7].getText() == "X") &&
           (buttons[8].getText() == "X"))
           {
            xWins(6, 7, 8);
           }
        if((buttons[0].getText() == "X") &&
           (buttons[3].getText() == "X") &&
           (buttons[6].getText() == "X"))
           {
            xWins(0, 3, 6);
           }
        if((buttons[1].getText() == "X") &&
           (buttons[4].getText() == "X") &&
           (buttons[7].getText() == "X"))
           {
            xWins(1, 4, 7);
           }
        if((buttons[2].getText() == "X") &&
           (buttons[5].getText() == "X") &&
           (buttons[8].getText() == "X"))
           {
            xWins(2, 5, 8);
           }
        if((buttons[0].getText() == "X") &&
           (buttons[4].getText() == "X") &&
           (buttons[8].getText() == "X"))
           {
            xWins(0, 4, 8);
           }
        if((buttons[2].getText() == "X") &&
           (buttons[4].getText() == "X") &&
           (buttons[6].getText() == "X"))
           {
            xWins(2, 4, 6);
           }
           // ================================================================
        if((buttons[0].getText() == "0") &&
           (buttons[1].getText() == "0") &&
           (buttons[2].getText() == "0"))
           {
            yWins(0, 1, 2);
           }
        if((buttons[3].getText() == "0") &&
           (buttons[4].getText() == "0") &&
           (buttons[5].getText() == "0"))
           {
            yWins(3, 4, 5);
           }
        if((buttons[6].getText() == "0") &&
           (buttons[7].getText() == "0") &&
           (buttons[8].getText() == "0"))
           {
            yWins(6, 7, 8);
           }
        if((buttons[0].getText() == "0") &&
           (buttons[3].getText() == "0") &&
           (buttons[6].getText() == "0"))
           {
            yWins(0, 3, 6);
           }
        if((buttons[1].getText() == "0") &&
           (buttons[4].getText() == "0") &&
           (buttons[7].getText() == "0"))
           {
            yWins(1, 4, 7);
           }
        if((buttons[2].getText() == "0") &&
           (buttons[5].getText() == "0") &&
           (buttons[8].getText() == "0"))
           {
            yWins(2, 5, 8);
           }
        if((buttons[0].getText() == "0") &&
           (buttons[4].getText() == "0") &&
           (buttons[8].getText() == "0"))
           {
            yWins(0, 4, 8);
           }
        if((buttons[2].getText() == "0") &&
           (buttons[4].getText() == "0") &&
           (buttons[6].getText() == "0"))
           {
            yWins(2, 4, 6);
           }
    }

    public void xWins(int a, int b, int c)
    {
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);
        for(int i = 0; i < 9; i++)
        {
            buttons[i].setEnabled(false);
        }
        textfield.setText("X wins!");
        
        Timer timer = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetGame();
            }
        });
        countX++;
        updateCountLabel();
        timer.setRepeats(false);
        timer.start();
        //try {                      
        //    Thread.sleep(2000);
        //} catch (InterruptedException e) {
        //    // TODO: handle exception
        //    e.printStackTrace();
        //}
        //updateCountLabel();
        //
        //resetGame();
    }

    public void yWins(int a, int b, int c)
    {
        
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);
        for(int i = 0; i < 9; i++)
        {
            buttons[i].setEnabled(false);
        }
        textfield.setText("0 wins!");
        count0++;
        Timer timer = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateCountLabel();
                resetGame();
            }
        });
        timer.setRepeats(false);
        timer.start();
        //try {
        //    Thread.sleep(2000);
        //} catch (InterruptedException e) {
        //    // TODO: handle exception
        //    e.printStackTrace();
        //}
        //updateCountLabel();
        //
        //resetGame();
        
    }

}
