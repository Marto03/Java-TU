import java.awt.*;
import javax.swing.*;

public class smth {

    JFrame frame = new JFrame();
    JPanel titlePanel = new JPanel(new GridBagLayout());
    JLabel textfield = new JLabel("Tic-Tac-Toe", JLabel.CENTER);
    JButton choiceButton = new JButton("Choice");

    smth() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.setLayout(new BorderLayout());

        // Set the title label properties
        textfield.setBackground(new Color(25, 25, 25));
        textfield.setForeground(new Color(25, 255, 0));
        textfield.setFont(new Font("Ink Free", Font.BOLD, 75));
        textfield.setOpaque(true);

        // Create GridBagConstraints to center components
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH; // Fill both horizontally and vertically
        gbc.insets = new Insets(10, 10, 10, 10);

        // Add the title label to titlePanel and expand it to fill the available space
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        titlePanel.add(textfield, gbc);

        // Center-align the button within titlePanel
        gbc.gridy = 1; // Move to the next row
        gbc.weighty = 0.0; // Do not expand vertically
        titlePanel.add(choiceButton, gbc);

        // Add titlePanel to the frame's center
        frame.add(titlePanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new smth();
        });
    }
}
