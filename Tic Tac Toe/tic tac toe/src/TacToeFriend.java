import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class TacToeFriend implements ActionListener{ // Working perfect

    JFrame frame = new JFrame();
    Random random = new Random();
    JPanel title = new JPanel();
    JPanel button = new JPanel();
    JLabel textfield = new JLabel();
    
    JButton[] buttons = new JButton[9];
    boolean player1;
    boolean player2;
    
    JTextField playerNameInput = new JTextField(20); // 20 is the preferred width of the text input field
    JLabel player1Label = new JLabel("Player 1's name: ");

    JTextField player2NameInput = new JTextField(20);
    JLabel player2Label = new JLabel("Player 2's name: ");

    JButton startGameButton = new JButton("Start Game");
    boolean GameStart = false;

    boolean currentPlayerX;
    boolean PlayerX;
    boolean Player0;
    JPanel ChoicePanel = new JPanel(new GridBagLayout()); // Use GridBagLayout

    JPanel Score = new JPanel(new BorderLayout());
    JLabel P1 = new JLabel();
    JLabel P2 = new JLabel();

    JLabel X = new JLabel();
    JLabel Y = new JLabel();
    private static int countX = 0;
    private static int count0 = 0;

    JLabel countY = new JLabel(countX+"  :  "+count0);

    JPanel scorePanel = new JPanel(new BorderLayout());

    TacToeFriend()
    {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.getContentPane().setBackground(new Color(50, 50 , 50));
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

        JLabel Text = new JLabel("Player1's name: ");
        Text.setFont(new Font("Ink Free", Font.BOLD, 75));
        Text.setBackground(new Color(25, 25, 25));
        Text.setForeground(new Color(25, 255, 0));
        Text.setHorizontalAlignment(JLabel.CENTER);
        Text.setVerticalAlignment(JLabel.TOP);

    
        //Text.setBorder(BorderFactory.createLineBorder(Color.RED, 3));

        
        //ChoicePanel.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(0, 0, 10, 0); // Add vertical spacing between components
        ChoicePanel.add(player1Label, gbc);

        gbc.gridy++;
        ChoicePanel.add(playerNameInput, gbc);

        gbc.gridy++;
        ChoicePanel.add(player2Label, gbc);

        gbc.gridy++;
        ChoicePanel.add(player2NameInput, gbc);

        gbc.gridy++;
        startGameButton.addActionListener(this);
        ChoicePanel.add(startGameButton, gbc);

        //gbc.fill = GridBagConstraints.CENTER; // Center the components
        //ChoicePanel.add(Text, gbc);

        ChoicePanel.setBackground(new Color(255, 50, 50));
        ChoicePanel.setForeground(new Color(255, 50, 50));
        ChoicePanel.setOpaque(true);
        // ============================================================================


        title.setLayout(new BorderLayout());
        title.add(ChoicePanel, BorderLayout.CENTER); // Add ChoicePanel to the center
        title.add(textfield, BorderLayout.NORTH);

        frame.add(title, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == startGameButton)
        {
            String player1Name = playerNameInput.getText();
            String player2Name = player2NameInput.getText();
            // You can do something with player1Name, like setting it as a label text
            // or using it in your game logic.
            if (!player1Name.isEmpty() && !player2Name.isEmpty()) {
                // Both names are entered, you can start the game here
                // You can store the player names or use them in your game logic
                // For example, set the text of labels X and Y to the player names.
                X.setText(player1Name);
                Y.setText(player2Name);
                GameStart = true;
                X.setBackground(new Color(25, 25, 25));
                //X.setLayout(new FlowLayout());
                X.setForeground(new Color(25, 255, 0));
                X.setFont(new Font("Ink Free", Font.BOLD, 75));
                X.setHorizontalAlignment(JLabel.LEFT);
                X.setVerticalAlignment(JLabel.TOP);
                X.setText(player1Name);

                //X.setHorizontalTextPosition(JLabel.LEFT);
                X.setOpaque(true);
                Y.setBackground(new Color(25, 25, 25));
                //Y.setLayout(new FlowLayout());
                Y.setForeground(new Color(25, 255, 0));
                Y.setFont(new Font("Ink Free", Font.BOLD, 75));
                Y.setHorizontalAlignment(JLabel.RIGHT);
                Y.setVerticalAlignment(JLabel.TOP);
                Y.setText(player2Name);

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
                //scorePanel.add(countY,FlowLayout.CENTER);
                scorePanel.setBackground(new Color(25, 25, 25));
                scorePanel.setForeground(new Color(25, 255, 0));
                scorePanel.setOpaque(true);

                P1.setBackground(new Color(25, 25, 25));
                //P1.setLayout(new FlowLayout());
                P1.setForeground(new Color(25, 255, 0));
                P1.setFont(new Font("Ink Free", Font.BOLD, 75));
                P1.setHorizontalAlignment(JLabel.LEFT);
                P1.setVerticalAlignment(JLabel.TOP);
                P1.setText("   X");

                P2.setBackground(new Color(25, 25, 25));
                //P2.setLayout(new FlowLayout());
                P2.setForeground(new Color(25, 255, 0));
                P2.setFont(new Font("Ink Free", Font.BOLD, 75));
                P2.setHorizontalAlignment(JLabel.LEFT);
                P2.setVerticalAlignment(JLabel.TOP);
                P2.setText("0   ");

                Score.add(P1, BorderLayout.WEST);
                Score.add(P2, BorderLayout.EAST);
                Score.add(countY,FlowLayout.CENTER);
                Score.setBackground(new Color(25, 25, 25));
                Score.setForeground(new Color(25, 255, 0));
                Score.setFont(new Font("Ink Free", Font.BOLD, 75));
                Score.setOpaque(true);
                
                //Score.add(X,FlowLayout.LEFT);
                //Score.setHorizontalTextPosition(JLabel.LEFT);
                
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
                    // Now, you can start the game logic.
            } else {
                // Display an error message or prompt the user to enter both names
                JOptionPane.showMessageDialog(frame, "Please enter both player names.");
            }
        }
                
        for(int i = 0 ; i < 9; i++)
        {
            if(e.getSource() == buttons[i])
            {
                int emptyButtons = 0;

                // Count the number of empty buttons
                if (buttons[i].getText().equals("")) {
                    emptyButtons++;
                    if(PlayerX)
                    {

                        buttons[i].setForeground(new Color(255,0,0));
                        buttons[i].setText("X");
                        PlayerX=false;
                        textfield.setText("0 turn");
                        check();
                    }
                else // or (robot && ...)
                    {
                        buttons[i].setForeground(new Color(0, 0, 255));
                        buttons[i].setText("0");
                        PlayerX = true; // Toggle back to X's turn
                        textfield.setText("X turn");
                        check();
                    }
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
                
            }
        }
    }
public void firstTurn()
{
    if(random.nextInt(2) == 0)
    {
        PlayerX = true;
        textfield.setText("X Turn");
    }
    else
    {
        PlayerX = false;
        textfield.setText("0 Turn");
    }
}


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
